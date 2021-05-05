package com.cg.service;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.cg.spc.entities.Student;


@ExtendWith({SpringExtension.class})
@DataJpaTest
@Import(StudentService.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class StudentServiceTest {

	@Autowired
	private StudentService service;
	@Autowired
	private EntityManager em;

	@Test
	public void testAddStudent() {
		Student stud = new Student(125,LocalDate.of(1979, 7, 14),"Deepti", "sai.com@gmail", "9022112453");
		Student studSaved = service.addStudent(stud);
		Assertions.assertEquals(studSaved.getName(), stud.getName());	}

}
