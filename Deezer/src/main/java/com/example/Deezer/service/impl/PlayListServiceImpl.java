package com.example.Deezer.service.impl;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.Deezer.dto.PlayListDto;
import com.example.Deezer.dto.TrackDto;
import com.example.Deezer.model.PlayList;
import com.example.Deezer.model.Track;
import com.example.Deezer.service.PlayListService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
public class PlayListServiceImpl implements PlayListService{

	@Override
	public PlayListDto getPlayList(String id) throws JsonMappingException, JsonProcessingException {
		
		
		
		RestTemplate restTemplate = new RestTemplate();
		String url = "https://api.deezer.com/playlist/"+id;
		
		System.out.println(url);
		
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
		
		ObjectMapper mapper = new ObjectMapper();
		
		JsonNode root = mapper.readTree(response.getBody());
		
		PlayList playList = mapper.treeToValue(root, PlayList.class);
		
		PlayListDto dto = new PlayListDto();
		
		ArrayList<TrackDto> data = new ArrayList<TrackDto>();
		
		for(Track track : playList.getTacks().getData())
		{
			TrackDto dtoTemp = new TrackDto();
			
			dtoTemp.setTitle(track.getTitle());
			dtoTemp.setLink(track.getLink());
			dtoTemp.setExplicit_lyrics(track.isExplicit_lyrics());
			dtoTemp.setDuration(track.getDuration());
			dtoTemp.setAlbum_title(track.getAlbum().getTitle());
			dtoTemp.setArtis_name(track.getArtist().getName());
			
			data.add(dtoTemp);
			
		}
		
		dto.setDescription(playList.getDescription());
		dto.setDuration(playList.getDuration());
		dto.setLink(playList.getLink());
		dto.setPicture(playList.getPicture_medium());
		dto.setPublicc(playList.isPublicc());
		dto.setRaiting(playList.getRaiting());
		dto.setTitle(playList.getTitle());
		dto.setTracks(data);
		dto.setUser(playList.getCreator());
		
		
		
		return dto;
	}
	
	

}
