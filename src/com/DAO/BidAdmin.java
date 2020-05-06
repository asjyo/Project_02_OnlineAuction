package com.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BidAdmin {
	
				
			// method for create connection
			public static Connection getConnection() throws Exception {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					return DriverManager.getConnection("jdbc:mysql://localhost:3306/webauction", "root", "admin");
				} catch (Exception e) {
					e.printStackTrace();
					return null;
				}
			}
			
			// method for save user data in database
			public int registerUser(String b_name,String b_email,String b_phone,String b_postal_address,int b_auction_price,String b_item_name, String b_item_model) throws Exception {
				int i = 0;
				try {
					String sql = "insert into auc_bid_details (b_name,b_email,b_phone,b_postal_address,b_auction_price,b_item_name,b_item_model) values (?,?,?,?,?,?,?)";
					PreparedStatement ps = getConnection().prepareStatement(sql);
									
					ps.setString(1, b_name);
					ps.setString(2, b_email);
					ps.setString(3, b_phone);
					ps.setString(4, b_postal_address);
					ps.setInt(5, b_auction_price);
					ps.setString(6, b_item_name);
					ps.setString(7, b_item_model);
				//	ps.setString(8, ai.getB_status());
					i = ps.executeUpdate();
					return i;
				} catch (Exception e) {
					e.printStackTrace();
					return i;
				} finally {
					if (getConnection() != null) {
						getConnection().close();
					}
				}
			}

					// method for fetch saved user data
			public ResultSet report() throws SQLException, Exception {
				ResultSet rs = null;
				try {
					String sql = "SELECT * from auc_bid_details";
					PreparedStatement ps = getConnection().prepareStatement(sql);
					rs = ps.executeQuery();
					return rs;
				} catch (Exception e) {
					e.printStackTrace();
					return null;
				} finally {
					if (getConnection() != null) {
						getConnection().close();
					}
				}
			}

			// method for fetch highest value amount
			public ResultSet reportmax() throws SQLException, Exception {
				ResultSet rs = null;
				try {
					String sql = "SELECT MAX(b_auction_price) FROM auc_bid_details)";
		//			String sql = "SELECT b_name, b_email, b_item_name, MAX(b_auction_price) FROM auc_bid_details";
					PreparedStatement ps = getConnection().prepareStatement(sql);
					rs = ps.executeQuery();
					
					return rs;
				} catch (Exception e) {
					e.printStackTrace();
					return null;
				} finally {
					if (getConnection() != null) {
						getConnection().close();
					}
				}
			}

			
		}



