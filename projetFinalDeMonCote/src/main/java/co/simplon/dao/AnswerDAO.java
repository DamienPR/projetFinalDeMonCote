package co.simplon.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.simplon.domain.Answer;

@Repository
public interface AnswerDAO extends CrudRepository<Answer, Long>{

}
