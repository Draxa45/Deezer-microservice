package com.example.Deezer.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.Deezer.dto.AlbumDto;
import com.example.Deezer.dto.TrackDto;
import com.example.Deezer.model.Album;
import com.example.Deezer.model.Track;
import com.example.Deezer.model.TrackList;
import com.example.Deezer.service.AlbumService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class AlbumServiceImpl implements AlbumService
{

	@Override
	public AlbumDto getAlbum(String id) throws JsonMappingException, JsonProcessingException {
		RestTemplate restTemplate = new RestTemplate();
		String url = "https://api.deezer.com/album/"+id;
		
		System.out.println(url);
		
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
		
		ObjectMapper mapper = new ObjectMapper();
		
		JsonNode root = mapper.readTree(response.getBody());
		
		Album album = mapper.treeToValue(root, Album.class);
		
		List<Track>dataTemp;
		
		url = album.getTracklist();
		
		ResponseEntity<String> response1 = restTemplate.getForEntity(url, String.class);
		
		ObjectMapper mapper1 = new ObjectMapper();
		
		JsonNode root1 = mapper.readTree(response1.getBody());
		
		dataTemp = mapper.treeToValue(root1, TrackList.class).getData();
		
		ArrayList<TrackDto>data = new ArrayList<TrackDto>();
		
		
		for (Track track : dataTemp)
		{
			
			TrackDto dtoTemp = new TrackDto();
			
			dtoTemp.setTitle(track.getTitle());
			dtoTemp.setLink(track.getLink());
			dtoTemp.setExplicit_lyrics(track.isExplicit_lyrics());
			dtoTemp.setDuration(track.getDuration());
			dtoTemp.setAlbum_title(album.getTitle());
			dtoTemp.setArtis_name(track.getArtist().getName());
			
			
			data.add(dtoTemp);
		
		}
		AlbumDto dto = new AlbumDto();
		
		dto.setArtist(album.getArtist());
		dto.setDuration(album.getDuration());
		dto.setExplicite(album.isExplicit_lyrics());
		dto.setLink(album.getLink());
		dto.setPicture(album.getCover_big());
		dto.setRating(album.getRating());
		dto.setRelese_date(album.getRelease_date());
		dto.setTitle(album.getTitle());
		dto.setTracks(data);
		
		
		
		return dto;
	}
	
}
