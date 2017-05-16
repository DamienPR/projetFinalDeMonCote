package co.simplon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.domain.Question;
import co.simplon.service.QuestionService;

@RestController
@RequestMapping(value="api/question")
public class QuestionController {
	
	@Autowired
	private QuestionService service;
	
	@PostMapping(value="/add")
	public List<Question> save(@RequestBody List<Question> questions){
		return service.save(questions);
	}
}
