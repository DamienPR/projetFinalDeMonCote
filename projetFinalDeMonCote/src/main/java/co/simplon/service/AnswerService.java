package co.simplon.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.simplon.dao.AnswerDAO;
import co.simplon.domain.Answer;

@Service
@Transactional
public class AnswerService {

	@Autowired
	private AnswerDAO answerDAO;
	
	public List<Answer> findAll() {
		List<Answer> result = new ArrayList<Answer>();
		Iterable<Answer> inter = answerDAO.findAll();
		for (Answer role : inter) {
			result.add(role);			
		}
		return result;
	}
}
