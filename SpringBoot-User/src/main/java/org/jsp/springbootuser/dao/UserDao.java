package org.jsp.springbootuser.dao;

import java.util.List;
import java.util.Optional;

import org.jsp.springbootuser.dto.User;
import org.jsp.springbootuser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	@Autowired
	private UserRepository repository;
	
	public User saveUser(User user) {
		return repository.save(user);
	}

	public User updateUser(User user) {
		return repository.save(user);
	}

	public Optional<User> findById(int id) {
		return repository.findById(id);
	}
	
	public List<User> findByName(String name){
		return repository.findbyname(name);
	}

	public boolean delete(int id) {
		Optional<User> dBUser = findById(id);
		if (dBUser.isPresent()) {
			repository.delete(dBUser.get());
			return true;
		}
		return false;
	}

	public List<User> findAll() {
		return repository.findAll();
	}
	
	public Optional<User> verifyPhone(long phone, String password){
		return repository.verifyUser(phone, password);
		
	}
	
	public Optional<User> verifyId(int id, String password){
		return repository.verifyUser(id, password);
		
	}
	
	public Optional<User> verifyEmail(String email, String password){
		return repository.verifyUser(email, password);
		
	}
}
