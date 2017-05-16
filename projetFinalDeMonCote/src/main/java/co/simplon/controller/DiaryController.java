package co.simplon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.domain.Diary;
import co.simplon.service.DiaryService;

@RestController
@RequestMapping(value="api/diary")
public class DiaryController {

	@Autowired
	private DiaryService service;
	
	@PostMapping(value="/add")
	public Diary save(@RequestBody Diary diary){
		return service.save(diary);
	}
	
	
}
