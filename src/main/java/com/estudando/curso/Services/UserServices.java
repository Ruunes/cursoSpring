package com.estudando.curso.Services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.estudando.curso.Repositories.UserRepository;
import com.estudando.curso.Services.exception.DatabaseException;
import com.estudando.curso.Services.exception.ResourceNotFoundException;
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
		
		return  obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User obj) {
		return userRespository.save(obj); 
	}
	
	public void delete(Long id) {
		try {
		userRespository.deleteById(id);
		}catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		}catch(DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	
	public User update(Long id, User user) {
		try {
		User entity = userRespository.getOne(id);
		updateData(entity, user);
		return userRespository.save(entity);
		}catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
	}

	private void updateData(User entity, User user) {
		entity.setName(user.getName());
		entity.setEmail(user.getEmail());
		entity.setFone(user.getFone());
		
	}
}


