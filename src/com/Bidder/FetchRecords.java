package com.Bidder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class FetchRecords {

	ArrayList<AddBidderAction> list = new ArrayList<AddBidderAction>();

	public ArrayList<AddBidderAction> getList() {
		return list;
	}

	public void setList(ArrayList<AddBidderAction> list) {
		this.list = list;
	}

public String execute()
{
	

try{
  Class.forName("com.mysql.jdbc.Driver");
  Connection con=DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/webauction", "root", "admin");

//  PreparedStatement ps=con.prepareStatement("select * from product1");
  PreparedStatement ps=con.prepareStatement("select * from auc_bid_details");
// PreparedStatement ps=con.prepareStatement("select * from product1");
  ResultSet rs=ps.executeQuery();

// int count = rs.getInt(1);
     // System.out.println("Number of records in the cricketers_data table: "+count);

  while(rs.next()){
	  while(rs.next()){  
		  AddBidderAction items =new AddBidderAction(); 
			//bean = new Bidbean();
		  items.setB_id(rs.getInt(1));
		  items.setB_auction_price(rs.getInt(2));
		  items.setB_name(rs.getString(3));
		  items.setB_email(rs.getString(4));
		  items.setB_phone(rs.getString(5));
		  items.setB_postal_address(rs.getString(6));
		  items.setB_item_name(rs.getString(7));
		  items.setB_item_model(rs.getString(8));
				  
		 
	   list.add(items);  
  
  }

  con.close();
}
}catch(Exception e)

{e.printStackTrace();}

return "success";
}
}


