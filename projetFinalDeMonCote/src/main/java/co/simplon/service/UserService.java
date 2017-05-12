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
	private UserDAO userDao;

	public User save(User user) {
		return userDao.save(user);
	}

	//manque le rôle
	 public Map<Long, String> findAll() {
	 Iterable<User> result = userDao.findAll();
	 Map<Long, String> map = new HashMap<>();
	 for (User promo : result) {
	 map.put(promo.getId(), promo.getFirstName());
	 }
	 return map;
	 }

//	public Map<Long, String> findAll() {
//		Iterable<User> result = userDao.findAll();
//		List<User> result = new ArrayList<>();
//		User user = new User();
//		Promo promo = new Promo();
//		for (User field : result) {
//			
//		}
//		return result;
//	}

	public User update(User user) {
		return userDao.save(user);
	}
}
