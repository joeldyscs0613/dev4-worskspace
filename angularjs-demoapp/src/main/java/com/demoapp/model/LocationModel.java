package com.demoapp.model;

public class LocationModel {
	
	private String address;
	private String city;
	private String province;
	
	public LocationModel() {}
	
	public LocationModel( String address, String city, String province) {
		this.address = address;
		this.city = city;
		this.province = province;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	
}
