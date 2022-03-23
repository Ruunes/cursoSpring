package com.estudando.curso.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudando.curso.Repositories.ProductRepository;
import com.estudando.curso.entities.Product;

@Service
public class ProductServices {

	@Autowired
	private ProductRepository productRespository;
	
	public List<Product> findAll(){	
		return productRespository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = productRespository.findById(id);
		
		return  obj.get();
	}
}
