package co.simplon.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.dao.QuestionDAO;
import co.simplon.domain.Question;

@Service
@Transactional
public class QuestionService {

	@Autowired
	private QuestionDAO questionDao;
	
	public Question save(Question question) {
		return questionDao.save(question);
	}
}
