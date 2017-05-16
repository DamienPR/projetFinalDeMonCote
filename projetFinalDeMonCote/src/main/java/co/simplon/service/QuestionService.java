package co.simplon.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.dao.QuestionDAO;
import co.simplon.domain.Question;

@Service
@Transactional
public class QuestionService {

	@Autowired
	private QuestionDAO dao;
	
	//a modifier
	public List<Question> save(List<Question> questions) {		
		Iterable<Question> request = dao.save(questions);
		List<Question> result = new ArrayList<>();
		for (Question question : request) {
			result.add(question);
		}
		return result;
	}

}
