package com.report;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.DAO.BidAdmin;
import com.bean.Bidbean;
import com.opensymphony.xwork2.ActionSupport;

public class WinnerReport extends ActionSupport{
	
	private static final long serialVersionUID = 6329394260276112660L;
	ResultSet rs = null;
	Bidbean bean = null;
	List<Bidbean> beanList = null;
	BidAdmin admin = new BidAdmin();
	private boolean noData = false;
	String name, email;
	
	public String execute() throws Exception {
	try {	
		
		beanList = new ArrayList<Bidbean>();
		rs = admin.report();
		int i = 0;
		if (rs != null) {
			while (rs.next()) {
		              
		  	  System.out.println(rs.getInt("b_auction_price"));
		//  	  name = rs.getString("b_name");
		 // 	email = rs.getString("b_email");
		  	
		  	//System.out.println(name);
		  	
			  System.out.println(rs.getString("b_name"));
			  System.out.println(rs.getString("b_email"));
			  System.out.println(rs.getString("b_item_name"));
			  beanList.add(bean);
			  }
		    
		//  System.out.println(name);
		//close ResultSet rs
		}
			if (i == 0) {
				setNoData(false);
			} else {
				setNoData(true);
			} 
			}
		 catch (Exception e) {
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
}