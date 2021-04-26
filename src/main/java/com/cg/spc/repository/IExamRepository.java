package com.cg.spc.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.spc.entities.ClassId;
import com.cg.spc.entities.Exam;
import com.cg.spc.entities.Student;
@Repository
public interface IExamRepository extends JpaRepository<Exam,Integer>, CrudRepository<Exam, Integer>
{
   // public Exam addExam(Exam exam);
	//public Exam deleteExam(int id);
//	public Exam updateExam(Exam exam);
//	public List<Exam> listAllExamsByDate(LocalDate date);
//	public List<Exam> listAllExamsByClass(ClassId classId);
//	public List<Exam> listAllExamsByStudent(Student student);
//	public Exam listExamById(int id);
	

}
