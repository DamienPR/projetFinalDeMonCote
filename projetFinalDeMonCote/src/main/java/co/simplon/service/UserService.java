package co.simplon.service;

import java.util.HashMap;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.dao.UserDAO;
import co.simplon.domain.User;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserDAO dao;
	
	public User save(User user){
		return dao.save(user);
	}
	
	public Map<Long, String> findAll() {
		Iterable<User> result = dao.findAll();
		Map<Long, String> map = new HashMap<>();
		for (User promo : result) {
			map.put(promo.getId(), promo.getFirstName());			
		}
		return map;
	}
	
	public User update(User user){
		return dao.save(user);
	}
}
