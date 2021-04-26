package com.cg.spc.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.spc.entities.DiaryNotes;
import com.cg.spc.entities.Subject;
import com.cg.spc.entities.User;
@Repository
public interface IDiaryNotesRepository extends JpaRepository<DiaryNotes,String> {
	//public DiaryNotes addDiaryNotes(DiaryNotes diaryNotes);
	//public DiaryNotes updateDiaryNotes(DiaryNotes diaryNotes);
	//public DiaryNotes deleteDiaryNotes(DiaryNotes diaryNotes);
	//public List<DiaryNotes> retrieveAllDiaryNotes(LocalDate date);
	//public List<DiaryNotes> retrieveAllDiaryNotes(Subject subject);
	
	
}
