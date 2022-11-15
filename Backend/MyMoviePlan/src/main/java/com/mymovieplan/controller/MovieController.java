package com.mymovieplan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mymovieplan.entity.Movie;
import com.mymovieplan.service.MovieService;

@CrossOrigin(origins="http://localhost:3001")
@RestController
public class MovieController {
	@Autowired
	private MovieService movieService;

	@GetMapping("movies")
	public List<Movie> getAllMovies(Model model) {
		return movieService.getAllMovies();
	}
}
