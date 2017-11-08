package com.example;

import com.opensymphony.xwork2.ActionSupport;

public class EmployeeAction extends ActionSupport {
	
	private String ename;
	private String email;
	private int age;
    private boolean postBack=false;
	
	public String execute() {
		return "success";

	}

	@Override
	public void validate() {
		
		
		if(age<=20)
		{
			addFieldError("age", "Age must be greater than 20");
		}
		
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isPostBack() {
		return postBack;
	}

	public void setPostBack(boolean postBack) {
		this.postBack = postBack;
	}
	
	
}
