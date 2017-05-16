package co.simplon.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.simplon.domain.Conclusion;

@Repository
public interface ConclusionDAO extends CrudRepository<Conclusion, Integer>{

}
