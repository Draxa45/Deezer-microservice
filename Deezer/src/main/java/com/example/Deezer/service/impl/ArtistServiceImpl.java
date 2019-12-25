package com.example.Deezer.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.Deezer.dto.ArtistDto;
import com.example.Deezer.dto.TrackDto;
import com.example.Deezer.model.Artist;
import com.example.Deezer.model.Track;
import com.example.Deezer.model.TrackList;
import com.example.Deezer.service.ArtistService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
public class ArtistServiceImpl implements ArtistService
{

	@Override
	public ArtistDto getArtist(String id) throws JsonMappingException, JsonProcessingException  {
		
		RestTemplate restTemplate = new RestTemplate();
		String url = "https://api.deezer.com/artist/"+id;
		
		System.out.println(url);
		
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
		
		ObjectMapper mapper = new ObjectMapper();
		
		JsonNode root = mapper.readTree(response.getBody());
		
		Artist artist = mapper.treeToValue(root, Artist.class);
		
		System.out.println(artist.getName());
		
		ArtistDto dto = new ArtistDto();
		dto.setLink(artist.getLink());
		dto.setName(artist.getName());
		dto.setNb_album(artist.getNb_album());
		dto.setNb_fan(artist.getNb_fan());
		dto.setPicture(artist.getPicture_medium());
		
		
		
		List<Track>dataTemp;
		
		url = artist.getTracklist();
		
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
			dtoTemp.setAlbum_title(track.getAlbum().getTitle());
			dtoTemp.setArtis_name(track.getArtist().getName());
			
			
			data.add(dtoTemp);
		
		}
		dto.setTracklist(data);

		
		return dto;
	}

}
