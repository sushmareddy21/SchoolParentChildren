package com.cg.spc.service;

import java.util.List;

import com.cg.spc.entities.Student;

public interface IStudentService  {
	public Student addStudent(Student student);
	public Student updateStudent(Student student);
	public Student deleteStudent(Student student);
	public List<Student> retrieveAllStudents();
	public Student retrieveStudentById(int id);
	

}
