package com.cg.details;

import java.time.LocalDate;
import java.util.List;

import com.cg.spc.entities.Address;
import com.cg.spc.entities.ClassDiary;
import com.cg.spc.entities.ClassId;
//import com.cg.spc.entities.Student;
import com.cg.spc.entities.Subject;

public class SubjectDetails
{
	private int subjectId;
	private String title;
	//private Student student;
	public SubjectDetails() {
	}
	
	public SubjectDetails(int subjectId, String title) {
		super();
		this.subjectId = subjectId;
		this.title = title;
	}

	public SubjectDetails(Subject subject) {
		this.subjectId = subject.getSubjectId();
		this.title = subject.getTitle();
		//this.student = subject.getStudent();
		
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}
	