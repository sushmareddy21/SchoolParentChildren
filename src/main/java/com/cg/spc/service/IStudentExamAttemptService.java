package com.cg.spc.service;

import java.util.List;

import com.cg.spc.entities.Student;
import com.cg.spc.entities.StudentExamAttempt;

public interface IStudentExamAttemptService {
	public StudentExamAttempt addStudentExamAttempt(StudentExamAttempt attempt);
	public StudentExamAttempt updateStudentExamAttempt(StudentExamAttempt attempt);
	public StudentExamAttempt deleteStudentExamAttempt(StudentExamAttempt attempt);
	public List<StudentExamAttempt> retrieveAllStudentExamAttemptByStudent(Student student);
	public StudentExamAttempt retrieveStudentExamAttemptById(int id);
	
	
}
