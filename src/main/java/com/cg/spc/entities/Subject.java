package com.cg.spc.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "subject")
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int subjectId;
	private String title;
	@ManyToOne
	@JoinColumn(name = "userId")
	private Student student;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Subject(int subjectId, String title) {
		super();
		this.subjectId = subjectId;
		this.title = title;
	}
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
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
	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", title=" + title + "]";
	}
	
}
