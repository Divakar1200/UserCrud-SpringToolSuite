package org.jsp.springbootuser.controller;

import java.util.List;

import org.jsp.springbootuser.dto.ResponseStructure;
import org.jsp.springbootuser.dto.User;
import org.jsp.springbootuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	private UserService service;

	@PostMapping(value = "/users")
	public ResponseEntity<ResponseStructure<User>> saveUser(@RequestBody User user) {
		return service.saveUser(user);
	}

	@PutMapping(value = "/users")
	public ResponseEntity<ResponseStructure<User>> updateUser(@RequestBody User user) {
		return service.updateUser(user);
	}

	@GetMapping("/users/{id}")
	public ResponseEntity<ResponseStructure<User>> findUserById(@PathVariable int id) {
		return service.findUserById(id);
	}

	@GetMapping("/users")
	public ResponseEntity<ResponseStructure<List<User>>> findAllUsers() {
		return service.findAllUsers();
	}

	@DeleteMapping("/users/{id}")
	public ResponseEntity<ResponseStructure<String>> deleteUser(@PathVariable int id) {
		return service.deleteUser(id);
	}
	
	@GetMapping("/users/verifybyphone")
	public ResponseEntity<ResponseStructure<User>> verifyUser(@RequestParam long phone, @RequestParam String password){
		return service.verifyUser(phone, password);
	}
	
	@GetMapping("/users/verifybyid")
	public ResponseEntity<ResponseStructure<User>> verifyUser(@RequestParam int id, @RequestParam String password){
		return service.verifyUser(id, password);
	}
	
	@GetMapping("/users/verifybyemail")
	public ResponseEntity<ResponseStructure<User>> verifyUser(@RequestParam String email, @RequestParam String password){
		return service.verifyUser(email, password);
	}
	
	@GetMapping("/users/findbyname")
	public ResponseEntity<ResponseStructure<List<User>>> findbyname(@RequestParam String name) {
		return service.findUserByName(name);
	}
}
