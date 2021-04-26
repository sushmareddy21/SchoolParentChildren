package com.cg.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.service.TeacherService;
import com.cg.spc.entities.Attendance;
import com.cg.spc.entities.ClassId;
import com.cg.spc.entities.Exam;
import com.cg.spc.entities.Student;
import com.cg.util.TeacherUtil;

@RestController
public class TeacherController {

	@Autowired
	private TeacherService teacherService;
	
	@Autowired
	private TeacherUtil teacherUtil;
	
	@RequestMapping(method = RequestMethod.POST, value = "/attendance")
	public Attendance addAttendance(@RequestBody Attendance attendance) 
	{
		
		 return teacherService.addAttendance(attendance);
		
	}
	
	@GetMapping("/attendance/{student}")
	public List<Attendance> listAttendanceByStudent(@PathVariable Student student) 
	{
		
	    return teacherService.listAttendanceByStudent(student);
	   
	}
	
	@GetMapping("/attendance/{month}")
	public List<Attendance> listAttendanceByMonth(@PathVariable LocalDate month) 
	{
		
	    return teacherService.listAttendanceByMonth(month);
	   
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/attendance")
	public Attendance updateAttendance(@RequestBody Attendance attendance) 
	{
		
		 return teacherService.updateAttendance(attendance);
		
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/exam")
	public Exam addExam(@RequestBody Exam exam) 
	{
		
		 return teacherService.addExam(exam);
		
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/exam")
	public Exam updateExam(@RequestBody Exam exam) 
	{
		
		 return teacherService.updateExam(exam);
		
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/exam/{Id}")
	public Exam deleteEam(@RequestBody Exam exam, @PathVariable int id)
	{
		return teacherService.deleteExam(id);
	}
	
	
	@GetMapping("/exam/{date}")
	public List<Exam> listAllExamsByDate(LocalDate date) 
	{
		
	    return teacherService.listAllExamsByDate(date);
	   
	}
	@GetMapping("/exam/{classId}")
	public List<Exam> listAllExamsByClass(ClassId classId) 
	{
		
	    return teacherService.listAllExamsByClass(classId);
	   
	}
	
	@GetMapping("/exam/{student}")
	public List<Exam> listAllExamsByStudent(Student student) 
	{
		
	    return teacherService.listAllExamsByStudent(student);
	   
	}
}
