package ar.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.modelo.User;
import ar.com.repositori.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController {
	
	UserRepository userRepository;
	
	@GetMapping("/user")
	public List<User> getUsers(){
		return userRepository.findAll();
	}
	
	
	
}
