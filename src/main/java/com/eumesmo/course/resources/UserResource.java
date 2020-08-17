package com.eumesmo.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eumesmo.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {		
		User u = new User(1L, "Teste", "t@t.com", "3192585448", "123");
		return ResponseEntity.ok().body(u);		
	}
}
