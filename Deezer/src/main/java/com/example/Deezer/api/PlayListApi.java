package com.example.Deezer.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Deezer.dto.PlayListDto;
import com.example.Deezer.dto.TrackDto;
import com.example.Deezer.service.PlayListService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@RestController
@RequestMapping("/playlist")
public class PlayListApi {
	
	private PlayListService service;
	
	
	@Autowired
	public PlayListApi(PlayListService service) {
		super();
		this.service = service;
	}
	
	 @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	 public @ResponseBody PlayListDto getQuote(@PathVariable("id") String id) throws JsonMappingException, JsonProcessingException {
		 	System.out.println(id);
			return service.getPlayList(id);
		}
	
	

}
