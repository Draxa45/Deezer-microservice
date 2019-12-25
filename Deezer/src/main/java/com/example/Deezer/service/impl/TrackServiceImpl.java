package com.example.Deezer.service.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.Deezer.dto.TrackDto;
import com.example.Deezer.model.Track;
import com.example.Deezer.service.TrackService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class TrackServiceImpl implements TrackService{

	@Override
	public TrackDto getTrack(String id) throws JsonMappingException, JsonProcessingException {
		
		
		RestTemplate restTemplate = new RestTemplate();
		String url = "https://api.deezer.com/track/"+id;
		
		System.out.println(url);
		
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
		
		ObjectMapper mapper = new ObjectMapper();
		
		JsonNode root = mapper.readTree(response.getBody());
		
		Track track = mapper.treeToValue(root, Track.class);
		
		TrackDto dto = new TrackDto();
		
		dto.setTitle(track.getTitle());
		dto.setRealse_date(track.getRelease_date());
		dto.setLink(track.getLink());
		dto.setExplicit_lyrics(track.isExplicit_lyrics());
		dto.setDuration(track.getDuration());
		dto.setAlbum_link(track.getAlbum().getLink());
		dto.setAlbum_title(track.getAlbum().getTitle());
		dto.setArtis_name(track.getArtist().getName());
		dto.setArtist_link(track.getArtist().getLink());
		
		return dto;
	}

}
