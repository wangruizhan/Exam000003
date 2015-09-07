package com.hand.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AddressMapper implements RowMapper<Address> {

	public Address mapRow(ResultSet rs, int rowNum) throws SQLException {
		Address ad = new Address();
		//cs.setStore_id(1);
		ad.setAdress(rs.getString("address"));
		ad.setAdress_id(rs.getInt("address_id"));
		
		return ad;
	}

}
