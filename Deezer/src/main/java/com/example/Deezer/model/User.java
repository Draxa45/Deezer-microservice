package com.example.Deezer.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
	
	private int id;
	private String name;
	
	@JsonProperty("tracklist")
	private String tracklist;
	
	private String type;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTacklist() {
		return tracklist;
	}
	public void setTacklist(String tacklist) {
		this.tracklist = tacklist;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	

}
