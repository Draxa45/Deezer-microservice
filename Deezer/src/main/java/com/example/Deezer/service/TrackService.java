package com.example.Deezer.service;

import com.example.Deezer.dto.TrackDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

public interface TrackService {

	public TrackDto getTrack(String id) throws JsonMappingException, JsonProcessingException;
	
}
