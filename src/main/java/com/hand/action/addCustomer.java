package com.hand.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.dao.impl.CustomerDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

public class addCustomer extends ActionSupport{
	private String first_name;
	private String last_name;
	private String email;
	private String address;
	@Override
	public String execute() {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		CustomerDaoImpl customerDaoImpl = 
			(CustomerDaoImpl)context.getBean("customerDaoImpl");
		try{
		customerDaoImpl.create(1, first_name, last_name, email, address);
		
		}catch(Exception e){
			e.printStackTrace();
		}
		return SUCCESS;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
