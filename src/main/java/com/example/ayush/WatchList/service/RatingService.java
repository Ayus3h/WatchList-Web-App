package com.example.ayush.WatchList.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.node.ObjectNode;

@Service
public class RatingService {
	
	String apiUrl = "http://www.omdbapi.com/?i=tt3896198&apikey=d5647f07&t=";
	
	public String getMovieRating(String title) {
		// TODO Auto-generated method stub
		try {
			//try to fetch the rating by calling OMDB API
			RestTemplate template = new RestTemplate();
			//apiUrl + title
			ResponseEntity<ObjectNode> response = template.getForEntity(apiUrl + title, ObjectNode.class);
			
			ObjectNode jsonObject = response.getBody();
			
			String imdbRating = jsonObject.path("imdbRating").asText();
			System.out.println(imdbRating);
			

            // Check if the rating is "N/A"
            if ("N/A".equals(imdbRating)) {
                return null; // Return null if rating is "N/A"
            } else {
                return imdbRating; // Return the rating string if it's a number
            }
			//return jsonObject.path("imdbRating").asText();
		} catch (Exception e) {
			//to user entered rating will be taken
			System.out.println("Either Movie name not available or API is down" + e.getMessage());
			return null;
		}
	}
	
}
