package com.Bidder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class AddBidderDAO {
	public static Connection conn() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/webauction", "root", "admin");
	}

	public static int register(AddBidderAction ai) {
		int flag = 0;
		try {
			PreparedStatement ps = conn().prepareStatement("INSERT INTO auc_bid_details VALUES(?,?,?,?,?,?,?)");
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
