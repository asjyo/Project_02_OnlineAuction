package com.report;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.DAO.Admin;
import com.bean.productbean;

import com.opensymphony.xwork2.ActionSupport;

public class ProdList extends ActionSupport {
	
	private static final long serialVersionUID = 6329394260276112660L;
		ResultSet rs = null;
		productbean bean = null;
		List<productbean> beanList = null;
		Admin admin = new Admin();
		private boolean noData = false;

		@Override
		public String execute() throws Exception {
			try {
				beanList = new ArrayList<productbean>();
				rs = admin.report();
				int i = 0;
				if (rs != null) {
					while (rs.next()) {
						i++;
						bean = new productbean();
						bean.setItem_model(rs.getString("item_model"));
						bean.setItem_name(rs.getString("item_name"));

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

		public List<productbean> getBeanList() {
			return beanList;
		}

		public void setBeanList(List<productbean> beanList) {
			this.beanList = beanList;
		}
	}

