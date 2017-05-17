package co.simplon.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.dao.DiaryDAO;
import co.simplon.domain.Diary;

@Service
@Transactional
public class DiaryService {

		@Autowired
		private DiaryDAO diaryDao;
		
		public List<Diary> findAll(){
			List<Diary> result = new ArrayList<Diary>();
			Iterable<Diary> inter = diaryDao.findAll();
			for (Diary diary : inter){
				result.add(diary);
			}
			return result;
		}
		
		public Diary save(Diary diary){
			return diaryDao.save(diary);
		}
}
