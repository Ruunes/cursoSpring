package com.estudando.curso.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudando.curso.Repositories.CategoryRepository;
import com.estudando.curso.entities.Category;

@Service
public class CategoryServices {

	@Autowired
	private CategoryRepository categoryRespository;
	
	public List<Category> findAll(){	
		return categoryRespository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = categoryRespository.findById(id);
		
		return  obj.get();
	}
}
