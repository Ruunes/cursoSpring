package com.estudando.curso.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudando.curso.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
}
