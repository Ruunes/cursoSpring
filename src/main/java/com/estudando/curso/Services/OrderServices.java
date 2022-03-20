package com.estudando.curso.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudando.curso.Repositories.OrderRepository;
import com.estudando.curso.entities.Order;

@Service
public class OrderServices {

	@Autowired
	private OrderRepository userRespository;
	
	public List<Order> findAll(){	
		return userRespository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = userRespository.findById(id);
		
		return  obj.get();
	}
}
