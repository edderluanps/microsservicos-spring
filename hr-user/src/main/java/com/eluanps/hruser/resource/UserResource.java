package com.eluanps.hruser.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eluanps.hruser.entity.User;
import com.eluanps.hruser.repository.UserRepository;

@RestController
@RequestMapping(value = "/ms/users")
public class UserResource {

	@Autowired
	private UserRepository repository;

	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User user = repository.findById(id).get();
		return ResponseEntity.ok(user);
	}	

	@GetMapping(value = "/search")
	public ResponseEntity<User> findByEmail(@RequestParam String email) {
		User user = repository.findByEmail(email);
		return ResponseEntity.ok(user);
	}
}