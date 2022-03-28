package com.estudando.curso.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudando.curso.Repositories.UserRepository;
import com.estudando.curso.entities.User;

@Service
public class UserServices {

	@Autowired
	private UserRepository userRespository;
	
	public List<User> findAll(){	
		return userRespository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = userRespository.findById(id);
		
		return  obj.get();
	}
	
	public User insert(User obj) {
		return userRespository.save(obj); 
	}
}


