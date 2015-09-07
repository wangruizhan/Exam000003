package com.hand.dao;

import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import com.hand.entity.Address;
import com.hand.entity.Customer;

public interface ICustomerDao {
	/** 
	    * This is the method to be used to initialize
	    * database resources ie. connection.
	    */
	   public void setDataSource(DataSource ds);
	   /** 
	    * This is the method to be used to create
	    * a record in the Customer table.
	    */
	   public void create(Integer store_id,String first_name,String last_name,String email,String address);
	   /** 
	    * This is the method to be used to list down
	    * a record from the Customer table corresponding
	    * to a passed student id.
	    */
	   public Customer getCustomer(Integer customer_id);
	   /** 
	    * This is the method to be used to list down
	    * all the records from the Customer table.
	    */
	   public List<Customer> listCustomers();
	   /** 
	    * This is the method to be used to delete
	    * a record from the Customer table corresponding
	    * to a passed student id.
	    */
	   public void delete(Integer id);
	   /** 
	    * This is the method to be used to update
	    * a record into the Customer table.
	    */
	   public void update(Integer customer_id, String first_name,String last_name,String email);
	   
	   
	   public Customer find(String first_name);
	   
	   public Address query(Integer address_id);
	   
}
