package com.save;

import com.DAO.BidAdmin;
import com.opensymphony.xwork2.ActionSupport;


public class RegisterBeanAction extends ActionSupport {
	
		private static final long serialVersionUID = 2139116285823340125L;
		private String b_name,b_email,b_phone,b_postal_address,b_item_name,b_item_model;
		int b_auction_price;
		private String msg = "";
		BidAdmin admin = null;
		int ctr = 0;

		@Override
		public String execute() throws Exception {
			admin = new BidAdmin();

			try {
				ctr = admin.registerUser(b_name,b_email,b_phone,b_postal_address,b_auction_price,b_item_name,b_item_model);
				if (ctr > 0) {
					msg = "Registration Successfull";
				} else {
					msg = "Some error";
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return "REGISTER";
		}

		
		public String getB_name() {
			return b_name;
		}


		public void setB_name(String b_name) {
			this.b_name = b_name;
		}


		public String getB_email() {
			return b_email;
		}


		public void setB_email(String b_email) {
			this.b_email = b_email;
		}


		public String getB_phone() {
			return b_phone;
		}


		public void setB_phone(String b_phone) {
			this.b_phone = b_phone;
		}


		public String getB_postal_address() {
			return b_postal_address;
		}


		public void setB_postal_address(String b_postal_address) {
			this.b_postal_address = b_postal_address;
		}


		public String getB_item_name() {
			return b_item_name;
		}


		public void setB_item_name(String b_item_name) {
			this.b_item_name = b_item_name;
		}


		public String getB_item_model() {
			return b_item_model;
		}


		public void setB_item_model(String b_item_model) {
			this.b_item_model = b_item_model;
		}


		public int getB_auction_price() {
			return b_auction_price;
		}


		public void setB_auction_price(int b_auction_price) {
			this.b_auction_price = b_auction_price;
		}


		public BidAdmin getAdmin() {
			return admin;
		}


		public void setAdmin(BidAdmin admin) {
			this.admin = admin;
		}


		public String getMsg() {
			return msg;
		}

		public void setMsg(String msg) {
			this.msg = msg;
		}

		public int getCtr() {
			return ctr;
		}

		public void setCtr(int ctr) {
			this.ctr = ctr;
		}
	}

