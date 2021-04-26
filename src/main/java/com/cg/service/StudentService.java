package com.cg.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spc.entities.Student;
import com.cg.spc.exception.StudentIDNotFoundException;
import com.cg.spc.repository.IStudentRepository;
import com.cg.spc.service.IStudentService;


@Service
@Transactional
public class StudentService implements IStudentService {
	@Autowired
	private IStudentRepository sDao;
	private Logger logger = LoggerFactory.getLogger(StudentService.class);

	@Override
	public Student addStudent(Student student) 
	{
		Student stud = sDao.save(student);
		return stud;
		
	}

	@Override
	public Student updateStudent(Student student) 
	{
		Student stud = sDao.save(student);
		return stud;
	}

	@Override
	public Student deleteStudent(Student student)
	{
//		Student stud = sDao.delete(student);
//		sDao.delete(student);
//		return student;
		return null;
	}

	@Override
	public List<Student> retrieveAllStudents() 
	{
//		List<Student> studList = sDao.retrieveAllStudents();
		List<Student> studList = sDao.findAll();
		return studList;
	}

	@Override
	public Student retrieveStudentById(int Id) 
	{
		Optional<Student> opt = sDao.findById(Id);
		if(!opt.isPresent()) 
		{
			throw new StudentIDNotFoundException("Student not found for id: "+Id);
		}
		Student stud = opt.get();
		logger.info("***Retrieving Student by Id: " +  Id + "***");
		return stud;
	}

}
