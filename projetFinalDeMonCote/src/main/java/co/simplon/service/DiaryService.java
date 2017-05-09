package co.simplon.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.simplon.dao.DiaryDAO;
import co.simplon.domain.Diary;

@Service
@Transactional
public class DiaryService {

		@Autowired
		private DiaryDAO dao;
		
		public Diary save(Diary diary){
			return dao.save(diary);
		}
}
