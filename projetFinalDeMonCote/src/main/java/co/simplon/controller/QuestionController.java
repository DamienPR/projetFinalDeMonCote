package co.simplon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.domain.Question;
import co.simplon.service.QuestionService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value="api/question")
public class QuestionController {
	
	@Autowired
	private QuestionService service;
	
	@PostMapping(value="/add")
	public Question save(@RequestBody Question question){
		return service.save(question);
	}
}
