package com.log;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;


public class logaction extends ActionSupport {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static final Logger LOGGER = Logger.getLogger("logaction.class");
     
	    public String execute() {
	         
	        LOGGER.info("This is a debug log message from Struts2");
	         
	        return SUCCESS;
	    }
	}