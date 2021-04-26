package com.cg.spc.entities;

import java.time.LocalDate;
import java.util.Map;

//import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
//import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "classdiary")
public class ClassDiary {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int classDiaryId;
	//@OneToMany(mappedBy = "classdiary", cascade = CascadeType.ALL)

	@ElementCollection
	@MapKeyColumn(name="subjects")
	@Column(name="read")
	@CollectionTable(name="notes", joinColumns=@JoinColumn(name="diarynotes_diaryNotesId"))
	private Map<LocalDate,DiaryNotes> diaryNotes;
	public ClassDiary(int classDiaryId, Map<LocalDate, DiaryNotes> diaryNotes) {
		super();
		this.classDiaryId = classDiaryId;
		this.diaryNotes = diaryNotes;
	}
	public ClassDiary() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getClassDiaryId() {
		return classDiaryId;
	}
	public void setClassDiaryId(int classDiaryId) {
		this.classDiaryId = classDiaryId;
	}
	public Map<LocalDate, DiaryNotes> getDiaryNotes() {
		return diaryNotes;
	}
	public void setDiaryNotes(Map<LocalDate, DiaryNotes> diaryNotes) {
		this.diaryNotes = diaryNotes;
	}
	@Override
	public String toString() {
		return "ClassDiary [classDiaryId=" + classDiaryId + ", diaryNotes=" + diaryNotes + "]";
	}
	
	
}
