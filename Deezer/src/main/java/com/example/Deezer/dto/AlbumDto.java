package com.example.Deezer.dto;

import java.util.ArrayList;
import java.util.Date;

import com.example.Deezer.model.Artist;

public class AlbumDto {

	private String title;
	private String link;
	private String picture;
	private int duration;
	private int rating;
	private Date relese_date;
	private boolean explicite;
	private Artist artist;
	private ArrayList<TrackDto> tracks;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Date getRelese_date() {
		return relese_date;
	}
	public void setRelese_date(Date relese_date) {
		this.relese_date = relese_date;
	}
	public boolean isExplicite() {
		return explicite;
	}
	public void setExplicite(boolean explicite) {
		this.explicite = explicite;
	}
	public Artist getArtist() {
		return artist;
	}
	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	public ArrayList<TrackDto> getTracks() {
		return tracks;
	}
	public void setTracks(ArrayList<TrackDto> tracks) {
		this.tracks = tracks;
	}
	
	
	
	
}
