package co.simplon.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.simplon.domain.Promo;

@Repository
public interface PromoDAO extends CrudRepository<Promo, Long> {
	public Promo findByName(String name);
}
