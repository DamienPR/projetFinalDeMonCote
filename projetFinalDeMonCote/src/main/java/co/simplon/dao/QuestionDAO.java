package co.simplon.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.simplon.domain.Question;

@Repository
public interface QuestionDAO extends CrudRepository<Question, Long>{

}
