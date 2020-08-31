package com.yashow.restful2;

import java.net.UnknownHostException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZackController {
	
	@Autowired
	private UserDaoService usd;
	
	@GetMapping("/users")
	public List<User> reads(@RequestBody User user) {
		return usd.findAll();
	}
	@GetMapping("/users/{id}")
	public User readOne(@PathVariable int id) {
		return usd.findOne(id);
	}
	
	@PostMapping("/users")
	public void create(@RequestBody User user) throws UnknownHostException
	{
		User savedUser = usd.save(user);
	}
	@DeleteMapping("/users/{id}")
	public User deleeteOne(@PathVariable int id) throws UnknownHostException {
		
		return usd.deleteOne(id);
	}
	
}

