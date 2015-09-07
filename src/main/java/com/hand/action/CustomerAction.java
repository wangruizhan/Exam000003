package com.hand.action;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.dao.impl.CustomerDaoImpl;
import com.hand.entity.Address;
import com.hand.entity.Customer;
import com.opensymphony.xwork2.ActionSupport;

public class CustomerAction extends ActionSupport{
	private Integer customer_id;
	private String first_name;
	private String last_name;
	private String email;
	private Customer customer;
	private Address address;
	private List<Customer> customers;
	ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	CustomerDaoImpl customerDaoImpl = 
		(CustomerDaoImpl)context.getBean("customerDaoImpl");
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
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
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	public String add(){
		return "success";
	}
	public String remove(){
		customerDaoImpl.delete(customer_id);
		return SUCCESS;
			
	}
	
	public String load() {
		customers = customerDaoImpl.listCustomers();
        if(null != customers)
            return SUCCESS;
        else
     	   return ERROR;
     }
	public String modify(){
		customerDaoImpl.update(customer_id, first_name, last_name, email);
		return SUCCESS;
	}
	
}
