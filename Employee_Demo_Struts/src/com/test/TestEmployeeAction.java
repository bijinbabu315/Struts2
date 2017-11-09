package com.test;


import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.struts2.StrutsTestCase;
import org.junit.Test;
import com.example.EmployeeAction;

import com.opensymphony.xwork2.ActionProxy;

public class TestEmployeeAction  extends StrutsTestCase {
	    
	final Logger logger = Logger.getLogger("TestEmployeeAction");
	
	@Test   
	public void testSuccessfulRegistration() {
	    	request.setParameter("age", "15");
	        
	        ActionProxy proxy = getActionProxy("/addEmployee");
	        EmployeeAction numberAction = (EmployeeAction) proxy.getAction();
	       try {
			assertEquals("success", numberAction.execute());
		} catch (Exception e) {
			
			logger.log(Level.SEVERE, e.getMessage());
		}
	 
	        
	    }
	}


