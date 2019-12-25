package com.example.Deezer.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Deezer.dto.TrackDto;
import com.example.Deezer.service.TrackService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@RestController
@RequestMapping("/track")
public class TrackApi {
	
	private TrackService service;
	
	@Autowired
	public TrackApi(TrackService service) {
		super();
		this.service = service;
	}
	 @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	 public @ResponseBody TrackDto getQuote(@PathVariable("id") String id) throws JsonMappingException, JsonProcessingException {
		 	System.out.println(id);
			return service.getTrack(id);
		}
	
	

}
