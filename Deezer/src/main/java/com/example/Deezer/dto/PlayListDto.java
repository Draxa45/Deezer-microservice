package com.example.Deezer.dto;

import java.util.List;

import com.example.Deezer.model.User;

public class PlayListDto {
	
	private String title;
	private String description;
	private int duration;
	private boolean publicc;
	private int raiting;
	private String link;
	private List<TrackDto>tracks;
	private String Picture;
	private User user;
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public boolean isPublicc() {
		return publicc;
	}
	public void setPublicc(boolean publicc) {
		this.publicc = publicc;
	}
	public int getRaiting() {
		return raiting;
	}
	public void setRaiting(int raiting) {
		this.raiting = raiting;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public List<TrackDto> getTracks() {
		return tracks;
	}
	public void setTracks(List<TrackDto> tracks) {
		this.tracks = tracks;
	}
	public String getPicture() {
		return Picture;
	}
	public void setPicture(String picture) {
		Picture = picture;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	

}
