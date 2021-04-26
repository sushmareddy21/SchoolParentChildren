package com.cg.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cg.details.StudentDetails;
import com.cg.details.SubjectDetails;
import com.cg.spc.entities.Student;
import com.cg.spc.entities.Subject;
@Component
public class StudentUtil 
{
public StudentDetails toDetails(Student stud) {
				List<Subject> subjects = stud.getSubjects();
				List<SubjectDetails> details = new ArrayList<>();
				for (Subject subject : subjects) {
					details.add(new SubjectDetails(subject));
				}
				StudentDetails studDetails = new StudentDetails(stud.getUserId(), 
						  stud.getDateOfBirth() ,stud.getName(), stud.getEmailId(),stud.getMobileNumber(),details);
				return studDetails;
	}

}
