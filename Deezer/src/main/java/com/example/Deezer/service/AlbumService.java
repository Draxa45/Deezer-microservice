package com.example.Deezer.service;

import com.example.Deezer.dto.AlbumDto;
import com.example.Deezer.dto.ArtistDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

public interface AlbumService {

	public AlbumDto getAlbum(String id) throws JsonMappingException, JsonProcessingException;
	
}
