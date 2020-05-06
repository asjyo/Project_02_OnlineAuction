package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

	public class Admin {
		
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

			// method for fetch saved user data
		public ResultSet report() throws SQLException, Exception {
			ResultSet rs = null;
			try {
				String sql = "SELECT * FROM product where item_display='yes'";
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
		// method for save user data in database
		public int registerUser(String item_name, String item_model, String item_display) throws Exception {
			int i = 0;
			try {
				String sql = "INSERT INTO product VALUES (?,?,?)";
				PreparedStatement ps = getConnection().prepareStatement(sql);
				ps.setString(1, item_name);
				ps.setString(2, item_model);
				ps.setString(3, item_display);
				
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
	}

