package com.example.Deezer.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Deezer.dto.ArtistDto;
import com.example.Deezer.service.ArtistService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;


@RestController
@RequestMapping("/artist")
public class ArtistApi {
	
	private ArtistService service;

	@Autowired
	public ArtistApi(ArtistService service) {
		super();
		this.service = service;
	}
	 @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	 public @ResponseBody ArtistDto getQuote(@PathVariable("id") String id) throws JsonMappingException, JsonProcessingException {
		 	System.out.println(id);
			return service.getArtist(id);
		}
	 // track list vraca list Track a ne TrackDto konvertuj listu u dto 
}
