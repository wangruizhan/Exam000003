package com.hand.action;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.dao.impl.CustomerDaoImpl;
import com.hand.entity.Address;
import com.hand.entity.Customer;
import com.opensymphony.xwork2.ActionSupport;


public class ViewCustomer extends ActionSupport{
	
	private List<Customer> customers ;
	private List<Address> address;
	private Integer address_id;
	public String execute(){
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		CustomerDaoImpl customerDaoImpl = 
			(CustomerDaoImpl)context.getBean("customerDaoImpl");
		
		try {
			
			 customers = customerDaoImpl.listCustomers();
			 if(customers!=null && !customers.isEmpty()){
					
					for(int i=0;i<customers.size();i++){
						
						Customer c = customers.get(i);
						//System.out.println(c);
						Integer id = c.getAddress_id();
						//System.out.println(id);
						Address  address1 = customerDaoImpl.query(id);
						String address = address1.getAdress();
						//System.out.println(address);
						c.setAddress(address);
						
						
					}
			 }	 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	public List<Customer> getCustomers() {
		Iterator<Customer> it = customers.iterator();
		while(it.hasNext()){
			Customer c = it.next();
		}
		
		return customers;
	}
	
}
