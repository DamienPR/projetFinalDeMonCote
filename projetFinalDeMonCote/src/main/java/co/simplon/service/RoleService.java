package co.simplon.service;

import java.util.ArrayList;
import java.util.List;

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
	
	public List<Role> findAll() {
		List<Role> result = new ArrayList<Role>();
		Iterable<Role> inter = dao.findAll();		
		for (Role role : inter) {
			result.add(role);			
		}
		return result;
	}

}
