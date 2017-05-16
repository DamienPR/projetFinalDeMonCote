package co.simplon.service;

import java.util.ArrayList;
import java.util.List;

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

	 public List<User> findAll() {
	 Iterable<User> inter = userDao.findAll();
	 List<User> result = new ArrayList<User>();
	 for (User user : inter){
		 result.add(user);
	 }
	 return result;
	 }

	public User update(User user) {
		return userDao.save(user);
	}
}
