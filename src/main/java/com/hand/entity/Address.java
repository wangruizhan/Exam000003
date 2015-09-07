package com.hand.entity;

public class Address {
	private Integer adress_id;
	private String adress;
	public Integer getAdress_id() {
		return adress_id;
	}
	public void setAdress_id(Integer adress_id) {
		this.adress_id = adress_id;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Address [adress_id=" + adress_id + ", adress=" + adress + "]";
	}
	

}
