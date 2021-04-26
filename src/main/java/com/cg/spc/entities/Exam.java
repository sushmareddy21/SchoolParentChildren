package com.cg.spc.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "exam")
public class Exam {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int examId;
	@ManyToOne
	@JoinColumn(name = "class_id_classId")
	private ClassId classId;
	private LocalDateTime dateTimeOfExam;
	@OneToOne
	private Subject subject;
	//@OneToOne
	private ExamType  examType;
	private int maxMarks;
	public Exam() {
		super();
	}
	public Exam(int examId, ClassId classId, LocalDateTime dateTimeOfExam, Subject subject, ExamType examType,
			int maxMarks) {
		super();
		this.examId = examId;
		this.classId = classId;
		this.dateTimeOfExam = dateTimeOfExam;
		this.subject = subject;
		this.examType = examType;
		this.maxMarks = maxMarks;
	}
	public int getExamId() {
		return examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}
	public ClassId getClassId() {
		return classId;
	}
	public void setClassId(ClassId classId) {
		this.classId = classId;
	}
	public LocalDateTime getDateTimeOfExam() {
		return dateTimeOfExam;
	}
	public void setDateTimeOfExam(LocalDateTime dateTimeOfExam) {
		this.dateTimeOfExam = dateTimeOfExam;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public ExamType getExamType() {
		return examType;
	}
	public void setExamType(ExamType examType) {
		this.examType = examType;
	}
	public int getMaxMarks() {
		return maxMarks;
	}
	public void setMaxMarks(int maxMarks) {
		this.maxMarks = maxMarks;
	}
	@Override
	public String toString() {
		return "Exam [examId=" + examId + ", classId=" + classId + ", dateTimeOfExam=" + dateTimeOfExam + ", subject="
				+ subject + ", examType=" + examType + ", maxMarks=" + maxMarks + "]";
	}
	
	
	
	
}
