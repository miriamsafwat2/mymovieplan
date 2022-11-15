package com.mymovieplan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mymovieplan.entity.Movie;
import com.mymovieplan.entity.User;
import com.mymovieplan.service.MovieService;
import com.mymovieplan.service.UserService;

@SpringBootApplication
public class MyMoviePlanApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MyMoviePlanApplication.class, args);
	}

	@Autowired
	private UserService userService;
	@Autowired
	private MovieService movieService;
	@Override
	public void run(String... args) throws Exception {
		userService.addUser(new User(1,"Adam","adam@google.com"));
		userService.addUser(new User(2,"Sam","sam@google.com"));
		
		movieService.addMovie(new Movie(1,"Baby's day out", "Comedy"));
		movieService.addMovie(new Movie(1,"Batman", "Action"));
		movieService.addMovie(new Movie(1,"Superman", "Action"));
	}

}
