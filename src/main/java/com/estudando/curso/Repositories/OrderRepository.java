package com.estudando.curso.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudando.curso.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {
	
	
}
