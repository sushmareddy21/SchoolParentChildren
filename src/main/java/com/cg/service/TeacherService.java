package com.cg.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spc.entities.Attendance;
import com.cg.spc.entities.ClassId;
import com.cg.spc.entities.Exam;
import com.cg.spc.entities.Student;
import com.cg.spc.exception.ExamIdNotFoundException;
import com.cg.spc.repository.IAttendanceRepository;
import com.cg.spc.repository.IExamRepository;
import com.cg.spc.service.IAttendanceService;
import com.cg.spc.service.IExamService;

@Service
@Transactional
public class TeacherService implements IAttendanceService,IExamService
{

	
	@Autowired
	private IAttendanceRepository sDao;
	private IExamRepository sDao1;
	private Logger logger = LoggerFactory.getLogger(TeacherService.class);
	
	public Attendance addAttendance(Attendance attendance)
	{
		
		Attendance atd=sDao.save(attendance);
		logger.info("***Adding Attendance by Teacher: " +  atd.getAttendanceId() + "***");
		return atd;
		
	}

	@Override
	public List<Attendance> listAttendanceByStudent(Student student)
	{
		List<Attendance> atds = new ArrayList<>();
		sDao.findAll().forEach(atds::add);
		return atds;
	}

	@Override
	public Attendance updateAttendance(Attendance attendance)
	{
		Attendance atd=sDao.save(attendance);
		return atd;
	}

	@Override
	public List<Attendance> listAttendanceByMonth(LocalDate month)
	{
	
//		List<Attendance> atds = new ArrayList<>();
//		sDao.findAll().forEach(atds::add);
//		return atds;
		return null;
	}

	@Override
	public Exam addExam(Exam exam)
	{
		Exam exm =sDao1.save(exam);
		return exm;
	}

	@Override
	public Exam deleteExam(int id)
	{
		//Exam exm = sDao1.deleteExam(id);
		//return exm;
		return null;
	}

	@Override
	public Exam updateExam(Exam exam) 
	{
		Exam exm =sDao1.save(exam);
		return exm;
	}

	@Override
	public List<Exam> listAllExamsByDate(LocalDate date)
	{
//		List<Exam> exambydate = new ArrayList<>();
//		sDao1.findAll().forEach(exambydate::add);
//		return exambydate;
		return null;
		
	}

	@Override
	public List<Exam> listAllExamsByClass(ClassId classId) 
	{
		
		List<Exam> exambyclass = new ArrayList<>();
		sDao1.findAll().forEach(exambyclass::add);
		return exambyclass;
	}

	@Override
	public List<Exam> listAllExamsByStudent(Student student) {
		
//		List<Exam> exambystudent = new ArrayList<>();
//		sDao1.findAll().forEach(exambystudent::add);
//		return exambystudent;
		return null;
	}

	@Override
	public Exam listExamById(int id) 
	{
		
		Optional<Exam> opt = sDao1.findById(id);
		if(!opt.isPresent()) 
		{
			throw new ExamIdNotFoundException("Exam Id not found : " +id);
		}
		Exam exm = opt.get();
		return exm;
	}

}
