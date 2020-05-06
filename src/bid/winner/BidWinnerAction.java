package bid.winner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.DAO.BidAdmin;
import com.bean.Bidbean;
import com.opensymphony.xwork2.ActionSupport;

public class BidWinnerAction extends ActionSupport {
	
private static final long serialVersionUID = 6329394260276112660L;
ResultSet rs = null;
Bidbean bean = null;
List<Bidbean> beanList = null;
BidAdmin admin = new BidAdmin();
private boolean noData = false;

@Override
public String execute() throws Exception {
	try {
		beanList = new ArrayList<Bidbean>();
		rs = admin.reportmax();
		int i = 0;
		if (rs != null) {
			while (rs.next()) {
			//	i++;
				bean = new Bidbean();
			//	bean.setB_id(rs.getInt("b_id"));
				bean.setB_auction_price(rs.getInt("b_auction_price"));
				bean.setB_name(rs.getString("b_name"));
				bean.setB_email(rs.getString("b_email"));
			//	bean.setB_phone(rs.getString("b_phone"));
			//	bean.setB_postal_address(rs.getString("b_postal_address"));
			//	bean.setB_item_name(rs.getString("b_item_name"));
			//	bean.setB_item_model(rs.getString("b_item_model"));
				
				beanList.add(bean);
			}
		}
		if (i == 0) {
			noData = false;
		} else {
			noData = true;
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return "REPORT";
}

public boolean isNoData() {
	return noData;
}

public void setNoData(boolean noData) {
	this.noData = noData;
}

public List<Bidbean> getBeanList() {
	return beanList;
}

public void setBeanList(List<Bidbean> beanList) {
	this.beanList = beanList;
}

	
}













 
/*	public class BidWinnerAction extends ActionSupport {
		
	    List<Bidbean> beanList;
		
		
	  /**
		 * 
		 */
/*		private static final long serialVersionUID = 1L;

	public String execute()
	  {
	    String result="error";
	    Connection connection=null;
	    
	   try
	   {
	    //String URL = "jdbc:mysql://localhost:3306/webauction", "root", "admin";
	    Class.forName("com.mysql.jdbc.Driver");
	    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/webauction", "root", "admin");
	  //  String sql = "SELECT b_name,b_email, b_item_name, max(b_auction_price) FROM auc_bid_details";
	    String sql = "SELECT * max(b_auction_price) FROM auc_bid_details";
	     
	    PreparedStatement preparedStatement = connection.prepareStatement(sql);
	            preparedStatement.setString(1, b_name);
	            preparedStatement.setString(2, b_email);
	            preparedStatement.setString(3, b_item_name);
	            preparedStatement.setInt(4, b_auction_price);
	            System.out.println(b_name);
	    ResultSet resultset = preparedStatement.executeQuery();
	    while(resultset.next())
	      {
	    	b_name = resultset.getString(1);
	    //	bean.setB_id(rs.getInt("b_id"))
	    	b_email = resultset.getString(2);
	    	b_auction_price = resultset.getInt(4);
	      result="success";
	      
	      }//while
	     } //try
	     catch (Exception e)
	     {
	      result ="error";
	      } //catch
	    finally
	    {
	     if (connection != null)
	      {
	       try
	        {
	    	   connection.close();
	          } //try
	       catch (Exception e)
	       {
	        System.out.println(e);
	        }//catch
	      }//if
	    }//finally
	   return result;
	  }//execute()

	
	} */
