package co.simplon.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.domain.User;
import co.simplon.service.UserService;

@RestController
@RequestMapping(value = "api/user")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping(value="createUser")
	@ResponseBody
	public User save(@RequestBody User user){
		return service.save(user);
	}
	
	@GetMapping(value="listUser")
	public Map<Long, String> findAll() {
		return service.findAll();
	}
	
	@PutMapping(value="updateUser")
	public User update(@RequestBody User user){
		return service.save(user);
	}
	
}
