package com.estudando.curso.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudando.curso.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	
}
