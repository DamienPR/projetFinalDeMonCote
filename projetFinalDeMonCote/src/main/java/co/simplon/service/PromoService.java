package co.simplon.service;

import java.util.ArrayList;
import java.util.List;

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
	
	public List<Promo> findAll(){
		List<Promo> result = new ArrayList<Promo>();
		Iterable<Promo> inter = dao.findAll();
		for(Promo promo : inter){
			result.add(promo);;
		}
		return result;
	}
	
	public Promo savePromo(Promo promo){
		return dao.save(promo);
	}
	
	public Promo updatePromo(Promo promo){
		return dao.save(promo);
	}
}
