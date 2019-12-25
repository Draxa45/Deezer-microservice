package com.example.Deezer.service;

import org.springframework.web.client.RestClientException;

import com.example.Deezer.dto.ArtistDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

public interface ArtistService {
	
	public ArtistDto getArtist(String id) throws JsonMappingException, JsonProcessingException;

}
