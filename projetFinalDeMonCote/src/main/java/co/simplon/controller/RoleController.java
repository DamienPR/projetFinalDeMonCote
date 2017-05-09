package co.simplon.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.service.RoleService;

@RestController
@RequestMapping(value="api/role")
public class RoleController {
	 @Autowired RoleService service;
	 
	 @GetMapping(value="listRole")
	 public Map<Long, String> findAll() {
			return service.findAll();
		}
}
