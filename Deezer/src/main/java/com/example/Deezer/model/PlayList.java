package com.example.Deezer.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PlayList {
	
	private int id;
	private String title;
	private String description;
	private int duration;
	
	@JsonProperty(value = "public")
	private boolean publicc;
	@JsonProperty(value = "is_loved_track")
	private boolean is_loved_track;
	private boolean collaborative;
	
	private int raiting;
	@JsonProperty(value = "nb_tracks")
	private int nb_tracks;
	private int unseen_tack_count;
	private int fans;
	
	private String link;
	private String share;
	private String picture;
	private String picture_small;
	private String picture_medium;
	private String picture_big;
	private String picture_xl;
	
	private User creator;
	private TrackList tracks;
	private String type;
	private String checksum;
	private String tracklist;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date creation_date;
	
	
	
	
	public Date getCreation_date() {
		return creation_date;
	}
	public void setCreation_date(Date creation_dat) {
		this.creation_date = creation_dat;
	}
	public String getTracklist() {
		return tracklist;
	}
	public void setTracklist(String tracklist) {
		this.tracklist = tracklist;
	}
	public boolean isIs_loved_track() {
		return is_loved_track;
	}
	public void setIs_loved_track(boolean is_loved_track) {
		this.is_loved_track = is_loved_track;
	}
	public int getNb_tracks() {
		return nb_tracks;
	}
	public void setNb_tracks(int nb_tracks) {
		this.nb_tracks = nb_tracks;
	}
	public TrackList getTracks() {
		return tracks;
	}
	public void setTracks(TrackList tracks) {
		this.tracks = tracks;
	}
	public String getChecksum() {
		return checksum;
	}
	public void setChecksum(String checksum) {
		this.checksum = checksum;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public boolean isIs_loved_tack() {
		return is_loved_track;
	}
	public void setIs_loved_tack(boolean is_loved_tack) {
		this.is_loved_track = is_loved_tack;
	}
	public boolean isCollaborative() {
		return collaborative;
	}
	public void setCollaborative(boolean collaborative) {
		this.collaborative = collaborative;
	}
	public int getRaiting() {
		return raiting;
	}
	public void setRaiting(int raiting) {
		this.raiting = raiting;
	}
	public int getNb_tacks() {
		return nb_tracks;
	}
	public void setNb_tacks(int nb_tacks) {
		this.nb_tracks = nb_tacks;
	}
	public int getUnseen_tack_count() {
		return unseen_tack_count;
	}
	public void setUnseen_tack_count(int unseen_tack_count) {
		this.unseen_tack_count = unseen_tack_count;
	}
	public int getFans() {
		return fans;
	}
	public void setFans(int fans) {
		this.fans = fans;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getShare() {
		return share;
	}
	public void setShare(String share) {
		this.share = share;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getPicture_small() {
		return picture_small;
	}
	public void setPicture_small(String picture_small) {
		this.picture_small = picture_small;
	}
	public String getPicture_medium() {
		return picture_medium;
	}
	public void setPicture_medium(String picture_medium) {
		this.picture_medium = picture_medium;
	}
	public String getPicture_big() {
		return picture_big;
	}
	public void setPicture_big(String picture_big) {
		this.picture_big = picture_big;
	}
	public String getPicture_xl() {
		return picture_xl;
	}
	public void setPicture_xl(String picture_xl) {
		this.picture_xl = picture_xl;
	}
	public User getCreator() {
		return creator;
	}
	public void setCreator(User creator) {
		this.creator = creator;
	}
	public TrackList getTacks() {
		return tracks;
	}
	public void setTacks(TrackList tacks) {
		this.tracks = tacks;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	

}
