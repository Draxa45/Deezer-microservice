package com.example.Deezer.model;

import java.util.List;

public class TrackList {
		
	private List<Track> data;
	private int total;
	private String next;
	private String checksum;
	
	
	
	public String getChecksum() {
		return checksum;
	}

	public void setChecksum(String checksum) {
		this.checksum = checksum;
	}

	public List<Track> getData() {
		return data;
	}

	public void setData(List<Track> data) {
		this.data = data;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}
	
	
	
}
