package co.simplon.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.domain.Promo;
import co.simplon.service.PromoService;

@RestController
@RequestMapping(value = "api/promo")
public class PromoController {

	@Autowired
	PromoService service;

	@GetMapping(value="promoList")
	public Map<Long, String> findAll() {
		return service.findAll();
	}
	
	@PostMapping(value="createPromo")
	@ResponseBody
	public Promo save(@RequestBody Promo promo){
		return service.savePromo(promo);
	}
	
	@PutMapping(value="updatePromo")
	public Promo update(Promo promo){
		return service.updatePromo(promo);
	}
}
