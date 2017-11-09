package com.example;


import org.apache.struts2.StrutsTestCase;
import org.junit.Test;

import com.opensymphony.xwork2.ActionProxy;

public class TestEmployeeAction  extends StrutsTestCase {
	    
	@Test   
	public void testSuccessfulRegistration() {
	    	request.setParameter("age", "25");
	        
	        ActionProxy proxy = getActionProxy("/addEmployee");
	        EmployeeAction numberAction = (EmployeeAction) proxy.getAction();
	       try {
			assertEquals("success", proxy.execute());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	        
	    }
	}


