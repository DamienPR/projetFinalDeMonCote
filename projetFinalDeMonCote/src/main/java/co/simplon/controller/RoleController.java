package co.simplon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.domain.Role;
import co.simplon.service.RoleService;

@RestController
@RequestMapping(value="api/roles")
public class RoleController {
	 @Autowired RoleService service;
	 
	 @GetMapping
	 public List<Role> findAll() {
			return service.findAll();
		}
}
