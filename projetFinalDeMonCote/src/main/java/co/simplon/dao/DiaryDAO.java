package co.simplon.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.simplon.domain.Diary;

@Repository
public interface DiaryDAO extends CrudRepository<Diary, Integer> {
	public Iterable<Diary> findByPromoId(int promoId);
}
