package co.simplon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.domain.Conclusion;
import co.simplon.service.ConclusionService;

@RestController
@RequestMapping(value="api/createConclusion")
public class ConclustionController {
	@Autowired
	private ConclusionService service;
	
	@PostMapping(value="createConclusion")
	@ResponseBody
	public Conclusion conclusion(@RequestBody Conclusion conclusion){
		return service.save(conclusion);
	}
}
