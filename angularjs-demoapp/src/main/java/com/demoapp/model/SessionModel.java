package com.demoapp.model;

public class SessionModel {

	private int id;
	private String name;
	private String creatorName;
	private int duration;
	private String durationString;
	private String level;
	private String sessionAbstract;
	private int upVoteCount;
	
	public SessionModel() {}
	
	public SessionModel(int id, String name, String creatorName, int duration, 
			String level, String sessionAbstract) {
		
		this.id = id;
		this.name = name;
		this.creatorName = creatorName;
		this.duration = duration;
		this.level = level;
		this.sessionAbstract = sessionAbstract;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreatorName() {
		return creatorName;
	}

	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getSessionAbstract() {
		return sessionAbstract;
	}

	public void setSessionAbstract(String sessionAbstract) {
		this.sessionAbstract = sessionAbstract;
	}

	public int getUpVoteCount() {
		return upVoteCount;
	}

	public void setUpVoteCount(int upVoteCount) {
		this.upVoteCount = upVoteCount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void upSessionVote() {
		++upVoteCount;		
	}
	
	public void resetVoteCount() {
		upVoteCount = 0;		
	}

	public void downSessionVote() {
		--upVoteCount;			
	}

	public String getDurationString() {
		return durationString;
	}

	public void setDurationString(String durationString) {
		this.durationString = durationString;
	}
	
}
