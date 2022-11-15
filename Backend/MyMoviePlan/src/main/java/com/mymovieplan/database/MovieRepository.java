package com.mymovieplan.database;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mymovieplan.entity.Movie;


public interface MovieRepository extends CrudRepository<Movie, Integer>{
	public List<Movie> findByName(String name);
	public List<Movie> findByCategory(String category);
}