package com.example.Deezer.dto;

import java.util.ArrayList;
import java.util.List;

import com.example.Deezer.model.Track;

public class ArtistDto {
	
	private String name;
	private String link;
	private String picture;
	
	private int nb_album;
	private int nb_fan;
	
	List<TrackDto> tracklist;
	public ArtistDto(String name, String link, String picture, int nb_album, int nb_fan) {
		super();
		this.name = name;
		this.link = link;
		this.picture = picture;
		this.nb_album = nb_album;
		this.nb_fan = nb_fan;
		
	}
	public ArtistDto () {
		
	}
	

	public List<TrackDto> getTracklist() {
		return tracklist;
	}
	public void setTracklist(ArrayList<TrackDto> data) {
		this.tracklist = data;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getNb_album() {
		return nb_album;
	}

	public void setNb_album(int nb_album) {
		this.nb_album = nb_album;
	}

	public int getNb_fan() {
		return nb_fan;
	}

	public void setNb_fan(int nb_fan) {
		this.nb_fan = nb_fan;
	}



	
	

}
