package com.save;

import com.DAO.Admin;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterProdAction extends ActionSupport {

	private static final long serialVersionUID = 2139116285823340125L;
	private String item_name,item_model, item_display;
	private String msg = "";
	Admin admin = null;
	int ctr = 0;

	@Override
	public String execute() throws Exception {
		admin = new Admin();

		try {
			ctr = admin.registerUser(item_name,item_model,item_display);
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

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public String getItem_model() {
		return item_model;
	}

	public void setItem_model(String item_model) {
		this.item_model = item_model;
	}

	public String getItem_display() {
		return item_display;
	}

	public void setItem_display(String item_display) {
		this.item_display = item_display;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public int getCtr() {
		return ctr;
	}

	public void setCtr(int ctr) {
		this.ctr = ctr;
	}

	
}