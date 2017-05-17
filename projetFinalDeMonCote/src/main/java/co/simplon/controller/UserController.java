package co.simplon.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.domain.User;
import co.simplon.service.UserService;

@RestController
@RequestMapping(value = "api/users")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public List<User> findByRoleName(@RequestParam Optional<String> roleName){
		if(roleName.isPresent()){
			return service.findByRoleName(roleName.get());
		}
		else{
			return service.findAll();
		}
	}
	
	@PostMapping(value="/add")
	public User save(@RequestBody User user){
		return service.save(user);
	}
	
	@PutMapping(value="/update")
	public User update(@RequestBody User user){
		return service.save(user);
	}
	
}
