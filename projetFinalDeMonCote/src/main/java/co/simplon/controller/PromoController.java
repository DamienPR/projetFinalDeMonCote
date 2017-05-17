package co.simplon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.domain.Promo;
import co.simplon.service.PromoService;

@RestController
@RequestMapping(value = "api/promos")
public class PromoController {

	@Autowired
	PromoService service;

	@GetMapping
	public List<Promo> findAll() {
		return service.findAll();
	}
	
	@PostMapping(value="/add")
	public Promo save(@RequestBody Promo promo){
		return service.savePromo(promo);
	}
	
	@PutMapping(value="/update")
	public Promo update(@RequestBody Promo promo){
		return service.updatePromo(promo);
	}
}
