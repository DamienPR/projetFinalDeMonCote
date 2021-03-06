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
		
		public List<Diary> findAll(String promoId, String userRole, String userId){
			List<Diary> diaryDTO = new ArrayList<>();
			Iterable<Diary> inter = diaryDao.findAll();
			for (Diary diary : inter){
				diaryDTO.add(diary);
			}
			return sortForFindAll(diaryDTO, promoId, userRole, userId);
		}
		
		private List<Diary> sortForFindAll(List<Diary> diaryDTO, String promoId, String userRole, String userId){
			List<Diary> result = new ArrayList<>();
			for (Diary property : diaryDTO) {
				if (("formateur").equals(userRole)||("apprenant").equals(userRole)|| ("tuteur").equals(userRole)){
					addNewDiaryToResultListFromProperties(result, property);
				}
			}
			return result;
		}

		private void addNewDiaryToResultListFromProperties(List<Diary> result, Diary property) {
			Diary diary = new Diary();
			diary.setId(property.getId());
			diary.setName(property.getName());
			diary.setStartDate(property.getStartDate());
			diary.setEndDate(property.getEndDate());
			diary.setIntroduction(property.getIntroduction());
			result.add(diary);
		}
		
		public Diary save(Diary diary){
			return diaryDao.save(diary);
		}
}
