package com.mymovieplan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mymovieplan.database.MovieRepository;
import com.mymovieplan.entity.Movie;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepo;
	
	public List<Movie> getAllMovies(){
		return (List<Movie>) this.movieRepo.findAll();
	}
	
	public List<Movie> findMovieByName(String name){
		return this.movieRepo.findByName(name);
	}
	
	public List<Movie> findByCategory(String category){
		return this.movieRepo.findByCategory(category);
	}
	
	public void addMovie(Movie movie) {
		this.movieRepo.save(movie);
	}
}
