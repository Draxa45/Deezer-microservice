package com.example.Deezer.model;

import java.util.Date;
import java.util.List;

public class Album {
	
	private int id;
	
	private String title;
	private String upc;
	private String link;
	private String share;
	private String cover;
	private String cover_small;
	private String cover_medium;
	private String cover_big;
	private String cover_xl;
	
	private int genre_id;
	private GenreList genres;
	private String label;
	private int nb_tracks;
	private int duration;
	private int fans;
	private int rating;
	private Date release_date;
	private String record_type;
	private boolean available;
	private Album alternative;
	private String tracklist;
	
	private boolean explicit_lyrics;
	private int explicit_content_lyrics;
	private int explicit_content_cover;
	
	private List<Artist> contributors;
	private Artist artist;
	private TrackList tracks;
	private String type;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	public String getUpc() {
		return upc;
	}
	public void setUpc(String upc) {
		this.upc = upc;
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
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public String getCover_small() {
		return cover_small;
	}
	public void setCover_small(String cover_small) {
		this.cover_small = cover_small;
	}
	public String getCover_medium() {
		return cover_medium;
	}
	public void setCover_medium(String cover_medium) {
		this.cover_medium = cover_medium;
	}
	public String getCover_big() {
		return cover_big;
	}
	public void setCover_big(String cover_big) {
		this.cover_big = cover_big;
	}
	public String getCover_xl() {
		return cover_xl;
	}
	public void setCover_xl(String cover_xl) {
		this.cover_xl = cover_xl;
	}
	public int getGenre_id() {
		return genre_id;
	}
	public void setGenre_id(int genre_id) {
		this.genre_id = genre_id;
	}
	
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public int getNb_tracks() {
		return nb_tracks;
	}
	public void setNb_tracks(int nb_tracks) {
		this.nb_tracks = nb_tracks;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getFans() {
		return fans;
	}
	public void setFans(int fans) {
		this.fans = fans;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int raiting) {
		this.rating = raiting;
	}
	public Date getRelease_date() {
		return release_date;
	}
	public void setRelease_date(Date release_date) {
		this.release_date = release_date;
	}
	public String getRecord_type() {
		return record_type;
	}
	public void setRecord_type(String record_type) {
		this.record_type = record_type;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public Album getAlternative() {
		return alternative;
	}
	public void setAlternative(Album alternative) {
		this.alternative = alternative;
	}
	public String getTracklist() {
		return tracklist;
	}
	public void setTracklist(String tracklist) {
		this.tracklist = tracklist;
	}
	public boolean isExplicit_lyrics() {
		return explicit_lyrics;
	}
	public void setExplicit_lyrics(boolean explicit_lyrics) {
		this.explicit_lyrics = explicit_lyrics;
	}
	public int getExplicit_content_lyrics() {
		return explicit_content_lyrics;
	}
	public void setExplicit_content_lyrics(int explicit_content_lyrics) {
		this.explicit_content_lyrics = explicit_content_lyrics;
	}
	public int getExplicit_content_cover() {
		return explicit_content_cover;
	}
	public void setExplicit_content_cover(int explicit_content_cover) {
		this.explicit_content_cover = explicit_content_cover;
	}
	public List<Artist> getContributors() {
		return contributors;
	}
	public void setContributors(List<Artist> contributors) {
		this.contributors = contributors;
	}
	public Artist getArtist() {
		return artist;
	}
	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	public TrackList getTracks() {
		return tracks;
	}
	public void setTracks(TrackList tracks) {
		this.tracks = tracks;
	}
	public GenreList getGenres() {
		return genres;
	}
	public void setGenres(GenreList genres) {
		this.genres = genres;
	}
	
	
	
	
	

}
