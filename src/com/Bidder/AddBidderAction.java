package com.Bidder;



public class AddBidderAction {
	
	private String b_name, b_email,b_phone,b_postal_address, b_status,b_item_name,b_item_model;
	int b_auction_price,b_id;

	

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



	public String getB_status() {
		return b_status;
	}



	public void setB_status(String b_status) {
		this.b_status = b_status;
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



	public int getB_id() {
		return b_id;
	}



	public void setB_id(int b_id) {
		this.b_id = b_id;
	}



	public String execute() {
		int var1 = AddBidderDAO.register(this);
		if (var1 > 0) {
			return "success";
		} else {
			return "error";
		}
	}
	
}