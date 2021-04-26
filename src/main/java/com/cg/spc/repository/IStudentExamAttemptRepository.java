package com.cg.spc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.spc.entities.Student;
import com.cg.spc.entities.StudentExamAttempt;
import com.cg.spc.entities.User;
@Repository
public interface IStudentExamAttemptRepository extends JpaRepository<StudentExamAttempt,String> 
{
//	public StudentExamAttempt addStudentExamAttempt(StudentExamAttempt attempt);
//	public StudentExamAttempt updateStudentExamAttempt(StudentExamAttempt attempt);
//	public StudentExamAttempt deleteStudentExamAttempt(StudentExamAttempt attempt);
//	public List<StudentExamAttempt> retrieveAllStudentExamAttemptByStudent(Student student);
//	public StudentExamAttempt retrieveStudentExamAttemptById(int id);
	
	
}
