package com.hand.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.dao.impl.CustomerDaoImpl;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteCustomer extends ActionSupport {
	private Integer customer_id;
	@Override
	public String execute() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		CustomerDaoImpl customerDaoImpl = 
			(CustomerDaoImpl)context.getBean("customerDaoImpl");
		customerDaoImpl.delete(customer_id);
		return SUCCESS;
		
	}
	public Integer getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
	}
	
}
