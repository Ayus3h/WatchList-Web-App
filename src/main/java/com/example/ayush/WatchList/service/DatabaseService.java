package com.example.ayush.WatchList.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ayush.WatchList.entity.Movie;
import com.example.ayush.WatchList.repository.MovieRepository;

@Service
public class DatabaseService {
	
	@Autowired
	MovieRepository movieRepository;
	
	@Autowired
	RatingService ratingService;
	
	public void create(Movie movie) {
		
		String rating = ratingService.getMovieRating(movie.getTitle());
		if(rating != null){
			movie.setRating(Float.parseFloat(rating));
		}
		movieRepository.save(movie);
	}
	
	public List<Movie> getAllMovies() {	
		
		return movieRepository.findAll();
	}
	
	public Movie getMovieById(Integer id) {
		return movieRepository.findById(id).get();
	}

	public void update(Movie movie, Integer id) {
		// TODO Auto-generated method stub
		Movie toBeUpdated = getMovieById(id);
		toBeUpdated.setTitle(movie.getTitle());
		toBeUpdated.setRating(movie.getRating());
		toBeUpdated.setComment(movie.getComment());
		toBeUpdated.setPriority(movie.getPriority());
		
		movieRepository.save(toBeUpdated);
		
	}
}
