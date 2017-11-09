package com.test;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.struts2.StrutsTestCase;
import org.junit.Test;

import com.opensymphony.xwork2.ActionProxy;

public class TestAction  extends StrutsTestCase {
	
	final Logger logger = Logger.getLogger("TestAction");
    
	@Test
    public void testSuccessfulLogin() {
    
        
        ActionProxy proxy = getActionProxy("/hello");
       try {
		assertEquals("success", proxy.execute());
	} catch (Exception e) {
		logger.log(Level.SEVERE, e.getMessage());
	}
 
        
    }
}