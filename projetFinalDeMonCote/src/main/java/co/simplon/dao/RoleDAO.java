package co.simplon.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.simplon.domain.Role;

@Repository
public interface RoleDAO  extends CrudRepository<Role, Long>{

}
