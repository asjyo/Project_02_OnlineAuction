package bid.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import bid.entity.AddBidDetailsAction;

public class Admin {
			public static Connection conn() throws Exception {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/myapp", "root", "admin");
		}

		public static int register(AddBidDetailsAction ai) {
			int flag = 0;
			try {
				PreparedStatement ps = conn().prepareStatement("insert into auc_bid_details (b_name,b_email,b_phone,b_postal_address,b_auction_price,b_item_name,b_item_model) values (?,?,?,?,?,?,?)");
				ps.setString(1, ai.getB_name());
				ps.setString(2, ai.getB_email());
				ps.setString(3, ai.getB_phone());
				ps.setString(4, ai.getB_postal_address());
				ps.setInt(5, ai.getB_auction_price());
				ps.setString(6, ai.getB_item_name());
				ps.setString(7, ai.getB_item_model());
			//	ps.setString(8, ai.getB_status());
				flag = ps.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return flag;
		}
	}


