package com.estudando.curso.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudando.curso.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	
}
