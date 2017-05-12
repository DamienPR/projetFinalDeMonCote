package co.simplon.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.simplon.domain.User;

@Repository
public interface UserDAO extends CrudRepository<User, Long> {
	
	//findByEmail pour springsecurity
}
