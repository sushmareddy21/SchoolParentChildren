package com.cg.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cg.details.StudentDetails;
import com.cg.service.StudentService;
//import com.cg.service.StudentService;
import com.cg.spc.entities.Student;
import com.cg.spc.entities.Subject;
import com.cg.util.StudentUtil;

//@RestController
//@RequestMapping("/students")
//@Validated
//public class StudentController
//{
	//@Autowired
	//private IStudentRepository studentRepository;
	
	//@Autowired
	//private StudentUtil studentUtil;
	
    //@PostMapping("/addstudent")                   
    //public Student addStudent(@RequestBody Student student) 
    //{
    	//System.out.println(student+ "student");
		//Student student1=studentRepository.save(student);
		//System.out.println(student1+ "student1");
		//return student1;
	//}
    
 
//}
@RestController
public class StudentController 
{
	//private static final Student  = null;

	@Autowired
	private StudentService studentService;
	
	@Autowired
	private StudentUtil studentUtil;
	
	
	
	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping("/add")
	public StudentDetails addStudent(@RequestBody @Valid CreateStudentRequest requestData) 
	{
		System.out.println("req data: " + requestData);
		Student student = new Student(requestData.getUserId(), 
				    requestData.getDateOfBirth(),requestData.getName(),requestData.getEmailId(),requestData.getMobileNumber());
		List<Subject> subjectSet = requestData.getSubjects();
		if(subjectSet!=null) 
		{
			for (Subject subject : subjectSet)
			{
				student.addSubject(subject);
			}
	    }
		System.out.println("stud came: " + student);
		Student stud = studentService.addStudent(student);
		StudentDetails details = studentUtil.toDetails(student);
		return details;
				
    }
	
	
	@RequestMapping(method = RequestMethod.PUT, value = "/student")
	public Student updateStudent(@RequestBody @Valid Student student) 
	{
		
		return studentService.updateStudent(student);
				
    }
	
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/accountants/{Id}")
	public Student deleteStudent(@RequestBody @Valid Student student) 
	{
		return studentService.deleteStudent(student);
				
    }
}
