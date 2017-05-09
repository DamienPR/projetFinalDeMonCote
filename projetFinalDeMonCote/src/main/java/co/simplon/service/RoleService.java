package co.simplon.service;

import java.util.HashMap;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.dao.RoleDAO;
import co.simplon.domain.Role;

@Service
@Transactional
public class RoleService {

	@Autowired
	private RoleDAO dao;
	
	public Map<Long, String> findAll() {
		Iterable<Role> result = dao.findAll();
		Map<Long, String> map = new HashMap<>();
		for (Role role : result) {
			map.put(role.getId(), role.getName());			
		}
		return map;
	}

}
