package com.mymovieplan.database;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mymovieplan.entity.User;


public interface UserRepository extends CrudRepository<User, Integer>{
	public List<User> findByName(String name);
	public List<User> findByEmail(String email);
}