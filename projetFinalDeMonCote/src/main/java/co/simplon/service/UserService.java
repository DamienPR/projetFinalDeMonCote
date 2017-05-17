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

	 public List<User> findAll() {
	 Iterable<User> inter = userDao.findAll();
	 List<User> userDTO = new ArrayList<User>();
	 for (User user : inter){
		 userDTO.add(user);
	 }
	 List<User> result = SortForFindAll(userDTO);
	 return result;
	 }
	 
	private List<User> SortForFindAll(List<User> userDTO) {
		 List<User> result = new ArrayList<User>();
		 for(User property : userDTO) {
			 User user = new User();
			 user.setId(property.getId());
			 user.setFirstname(property.getFirstname());
			 user.setLastname(property.getLastname());
			 user.setEmail(property.getEmail());
			 user.setPassword(property.getPassword());
			 user.setRole(property.getRole());
			 result.add(user);
		 }
		return result;
	}
	 
	 public List<User> findByRoleName(String roleName){
		Iterable<User> inter = userDao.findByRoleName(roleName);
		List<User> userDTO = new ArrayList<User>();
		for(User user : inter) {
			userDTO.add(user);
		}
		List<User> result= SortForFindByRole(userDTO);
		return result;
	 }
	 
	 private List<User> SortForFindByRole(List<User> userDTO){
		 List<User> result = new ArrayList<User>();
		 for(User property : userDTO) {
			 User user = new User();
			 user.setId(property.getId());
			 user.setFirstname(property.getFirstname());
			 user.setLastname(property.getLastname());
			 user.setEmail(property.getEmail());
			 user.setRole(property.getRole());
			 result.add(user);
		 }
		 return result;
	 }

	public User update(User user) {
		return userDao.save(user);
	}
	
	public User save(User user) {
		return userDao.save(user);
	}
}
