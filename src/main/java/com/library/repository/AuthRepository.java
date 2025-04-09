package com.library.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.library.model.User;

public interface AuthRepository extends JpaRepository<User, Integer>{

	User findByUsername(String username); 
}