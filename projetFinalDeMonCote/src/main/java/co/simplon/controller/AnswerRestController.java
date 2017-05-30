package co.simplon.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.domain.Answer;
import co.simplon.domain.Question;
import co.simplon.service.AnswerService;


@RestController
@RequestMapping("api/question")
public class AnswerRestController {
	
	@PostMapping
	public void createUser(@RequestBody List<Answer> answers, List<Question> questions, int studentId) {
		AnswerService.saveAnswers(answers);
	}
}
