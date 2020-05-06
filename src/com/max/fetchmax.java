package com.max;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import bid.entity.AddBidDetailsAction;
public class fetchmax {
	
	public class FetchRecordsWinner  {
	  ArrayList<AddBidDetailsAction> list=new ArrayList<AddBidDetailsAction>();

	 public ArrayList<AddBidDetailsAction> getList() {
	     return list;
	 }
	 public void setList(ArrayList<AddBidDetailsAction> list) {
	     this.list = list;
	 }

	 public String execute()
	 {

	  try{
	    Class.forName("com.mysql.jdbc.Driver");
	    Connection con=DriverManager.getConnection(
	      "jdbc:mysql://localhost:3306/webapp", "root", "admin");

	  //  PreparedStatement ps=con.prepareStatement("select * from product1");
	    //PreparedStatement ps=con.prepareStatement("SELECT * FROM bidder
	//ORDER BY auction_prize DESC LIMIT 1");
	    PreparedStatement ps=con.prepareStatement("SELECT * MAX(b_auction_price) from auc_bid_details");
	    //SELECT b_name, b_email, b_item_name, MAX(b_auction_price) FROM auc_bid_details
	      //("select  from bidder");
	   // PreparedStatement ps=con.prepareStatement("select * from product1");
	    ResultSet rs=ps.executeQuery();

	   // int count = rs.getInt(1);
	      // System.out.println("Number of records in the cricketers_data table: "+count);

	    while(rs.next()){
	    	AddBidDetailsAction items =new AddBidDetailsAction();
	     items.setB_name(rs.getString(1));
	     items.setB_email(rs.getString(2));
	     items.setB_auction_price(rs.getInt(3));
	  //   items.setEmail(rs.getString(4));
	 //    items.setPhone(rs.getString(5));
	 //    items.setAddress(rs.getString(6));
	     //items.setItem_display(rs.getString(3));
	     // items.setAmount(rs.getInt(3));
	     list.add(items);
	    }

	    con.close();
	   }catch(Exception e){e.printStackTrace();}

	   return "success";
	//  }
	  }
	 }
}
