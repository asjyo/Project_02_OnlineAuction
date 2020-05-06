package com.report;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.DAO.BidAdmin;
import com.bean.Bidbean;
import com.opensymphony.xwork2.ActionSupport;

public class AuctionReport extends ActionSupport {
	
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
				rs = admin.report();
				int i = 0;
				if (rs != null) {
					while (rs.next()) {
						i++;
						bean = new Bidbean();
						bean.setB_id(rs.getInt("b_id"));
						bean.setB_auction_price(rs.getInt("b_auction_price"));
						bean.setB_name(rs.getString("b_name"));
						bean.setB_email(rs.getString("b_email"));
						bean.setB_phone(rs.getString("b_phone"));
						bean.setB_postal_address(rs.getString("b_postal_address"));
						bean.setB_item_name(rs.getString("b_item_name"));
						bean.setB_item_model(rs.getString("b_item_model"));
						
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

