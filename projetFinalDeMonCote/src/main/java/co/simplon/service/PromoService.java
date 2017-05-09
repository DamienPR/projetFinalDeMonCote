package co.simplon.service;

import java.util.HashMap;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.dao.PromoDAO;
import co.simplon.domain.Promo;

@Service
@Transactional
public class PromoService {

	@Autowired
	private PromoDAO dao;
	
	public Map<Long, String> findAll(){
		Iterable<Promo> result = dao.findAll();
		Map<Long, String> map = new HashMap<>();
		for(Promo promo : result){
			map.put(promo.getId(), promo.getName());
		}
		return map;
	}
	
	public Promo savePromo(Promo promo){
		return dao.save(promo);
	}
	
	public Promo updatePromo(Promo promo){
		return dao.save(promo);
	}
}
