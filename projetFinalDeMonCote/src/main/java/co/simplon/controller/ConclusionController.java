package co.simplon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.domain.Conclusion;
import co.simplon.service.ConclusionService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value="api/conclusion")
public class ConclusionController {
	
	@Autowired
	private ConclusionService service;

	@PostMapping(value="/add")
	public Conclusion save(@RequestBody Conclusion conclusion){
		return service.save(conclusion);
	}
}
