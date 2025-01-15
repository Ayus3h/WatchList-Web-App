package com.example.ayush.WatchList.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.example.ayush.WatchList.entity.Movie;
import com.example.ayush.WatchList.service.DatabaseService;

import jakarta.validation.Valid;

@RestController
public class MovieController {
	
	@Autowired
	DatabaseService databaseService;
	
	@GetMapping("/index")
	public ModelAndView homePage() {
	    return new ModelAndView("index");
	}
	
	@GetMapping("/watchlistItemForm")
	public ModelAndView showWatchListForm(@RequestParam(required = false) Integer id) {
		
		System.out.println(id);
		String viewname = "watchlistItemForm";
		
		Map<String, Object> model = new HashMap<>();
		
		if(id == null){
			model.put("watchlistItem",  new Movie());
		}
		else {
			model.put("watchlistItem",  databaseService.getMovieById(id));
		}
		
//		red line error-mssg
//		Mapping variable aur backend command object reference different ho to you have to explicitly tell spring to map both 
//		if(id == null){
//			model.put("movie",  new Movie());
//		}
//		else {
//			model.put("movie",  databaseService.getMovieById(id));
//		}
		
//		Movie dummyMovie = new Movie();
//		dummyMovie.setTitle("dummy");
//		dummyMovie.setRating(0);
//		dummyMovie.setPriority("Low");
//		dummyMovie.setComments("John Doe");
//
//		model.put("watchlistItem",  dummyMovie);
		
		
		return new ModelAndView(viewname, model);
	}
	
	@PostMapping("/watchlistItemForm")
	public ModelAndView submitWatchListForm(@Valid @ModelAttribute("watchlistItem") Movie movie, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			//if errors are there, re-display the form and let user enter again
			return new ModelAndView("watchlistItemForm");
		}
		
		/*
		 if(id == null){
		 create new movie
		 } else{
		 update
		 }
		 */
		
		Integer id = movie.getId();
		if(id == null) {
			databaseService.create(movie);
		}
		else {
			databaseService.update(movie,id);
		}
		
		RedirectView rd = new RedirectView();
		rd.setUrl("/watchlist");
		
		return new ModelAndView(rd);
	}
	
	@GetMapping("/watchlist")
	public ModelAndView getWatchList() {
		// TODO Auto-generated method stub
		String viewname = "watchlist";
		Map<String, Object> model = new HashMap<>();
		List<Movie> movieList = databaseService.getAllMovies();
		model.put("watchlistrows", movieList);
		model.put("noofmovies", movieList.size());
		return new ModelAndView(viewname,model);
	}
}
