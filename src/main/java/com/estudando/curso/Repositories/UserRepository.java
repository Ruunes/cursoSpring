package com.estudando.curso.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudando.curso.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
	
	
}
