package com.mymovieplan.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "movie")
public class Movie {
	@Id
	int id;
	String name;
	String category;
	
	public Movie() {
		
	}
	
	public Movie(int id, String name, String category) {
		this.id = id;
		this.name = name;
		this.category = category;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
}
