package com.demoapp.model;

import java.util.List;

public class EventModel {

	private Long id;
	private String name;
	private String date;
	private String time;
	private LocationModel location;
	private String imageUrl;
	private double price;
	private List<SessionModel> sessions;
	
	public EventModel() {}
	
	public EventModel(Long id, String name, String date, String time, LocationModel location, String imageUrl, double price, List<SessionModel> sessions) {
		this.id = id;
		this.name = name;
		this.date = date;
		this.time = time;
		this.location = location;
		this.imageUrl = imageUrl;
		this.price = price;
		this.setSessions(sessions);
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

	public List<SessionModel> getSessions() {
		return sessions;
	}

	public void setSessions(List<SessionModel> sessions) {
		this.sessions = sessions;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
