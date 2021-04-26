package com.cg.spc.service;

import java.time.LocalDate;
import java.util.List;

import com.cg.spc.entities.ClassId;
import com.cg.spc.entities.Exam;
import com.cg.spc.entities.Student;

public interface IExamService {
	public Exam addExam(Exam exam);
	public Exam deleteExam(int id);
	public Exam updateExam(Exam exam);
	public List<Exam> listAllExamsByDate(LocalDate date);
	public List<Exam> listAllExamsByClass(ClassId classId);
	public List<Exam> listAllExamsByStudent(Student student);
	public Exam listExamById(int id);
	

}
