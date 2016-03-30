package com.demoapp.model;

public class EventModel {

	private String name;
	private String date;
	private String time;
	private LocationModel location;
	private String imageUrl;
	
	public EventModel() {}
	
	public EventModel( String name, String date, String time, LocationModel location, String imageUrl) {
		this.name = name;
		this.date = date;
		this.time = time;
		this.location = location;
		this.imageUrl = imageUrl;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public LocationModel getLocation() {
		return location;
	}
	public void setLocation(LocationModel location) {
		this.location = location;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	
}
