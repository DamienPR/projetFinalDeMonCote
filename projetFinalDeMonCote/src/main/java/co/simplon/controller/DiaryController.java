package co.simplon.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.domain.Diary;
import co.simplon.service.DiaryService;

@RestController
@RequestMapping(value="api/diaries")
public class DiaryController {

	@Autowired
	private DiaryService service;
	
	@GetMapping
	public List<Diary> findForReading(@RequestParam Optional<String> promoId, 
											@RequestParam Optional<String> userRole, 
												@RequestParam Optional<String> userId){
//	if (promoId.isPresent() && userRole.isPresent()){
			return service.findAll(promoId.get(), userRole.get(), userId.get());
//		}		
//		return result:
	}
	
	@PostMapping(value="/add")
	public Diary save(@RequestBody Diary diary){
		return service.save(diary);
	}
	
	
}
