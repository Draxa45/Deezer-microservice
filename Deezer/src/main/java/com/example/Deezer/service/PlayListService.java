package com.example.Deezer.service;

import com.example.Deezer.dto.PlayListDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

public interface PlayListService {
	
	public PlayListDto getPlayList(String id) throws JsonMappingException, JsonProcessingException;

}
