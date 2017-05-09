package co.simplon.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import co.simplon.dao.ConclusionDAO;
import co.simplon.domain.Conclusion;

@Service
@Transactional
public class ConclusionService {
	private ConclusionDAO dao;
	
	public Conclusion save(Conclusion conclusion){
		return dao.save(conclusion);
	}
}
