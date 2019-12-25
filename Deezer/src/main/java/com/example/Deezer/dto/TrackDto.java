package com.example.Deezer.dto;

import java.util.Date;

public class TrackDto {
	
	
	private String title;
	private String link ;
	private int duration;
	private Date realse_date;
	private boolean explicit_lyrics;
	private String artis_name;
	private String artist_link;
	private String album_title;
	private String album_link;
	
	
	
	
	public TrackDto(String title, String link, int duration, Date realse_date, boolean explicit_lyrics,
			String artis_name, String artist_link, String album_title, String album_link) {
		super();
		this.title = title;
		this.link = link;
		this.duration = duration;
		this.realse_date = realse_date;
		this.explicit_lyrics = explicit_lyrics;
		this.artis_name = artis_name;
		this.artist_link = artist_link;
		this.album_title = album_title;
		this.album_link = album_link;
	}
	
	
	public TrackDto() {
		super();
	}


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
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Date getRealse_date() {
		return realse_date;
	}
	public void setRealse_date(Date realse_date) {
		this.realse_date = realse_date;
	}
	public boolean isExplicit_lyrics() {
		return explicit_lyrics;
	}
	public void setExplicit_lyrics(boolean explicit_lyrics) {
		this.explicit_lyrics = explicit_lyrics;
	}
	public String getArtis_name() {
		return artis_name;
	}
	public void setArtis_name(String artis_name) {
		this.artis_name = artis_name;
	}
	public String getArtist_link() {
		return artist_link;
	}
	public void setArtist_link(String artist_link) {
		this.artist_link = artist_link;
	}
	public String getAlbum_title() {
		return album_title;
	}
	public void setAlbum_title(String album_title) {
		this.album_title = album_title;
	}
	public String getAlbum_link() {
		return album_link;
	}
	public void setAlbum_link(String album_link) {
		this.album_link = album_link;
	}
	
	
	
	
}
