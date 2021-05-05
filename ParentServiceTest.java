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

import com.cg.spc.entities.Parent;
import com.cg.spc.entities.Student;

@ExtendWith({SpringExtension.class})
@DataJpaTest
@Import(ParentService.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ParentServiceTest {
	
	@Autowired
	private ParentService service;
	@Autowired
	private EntityManager em;
	@Test
	void testAddParent() {
		Parent stud = new Parent(125,null,"9022112453","sai.com@gmail");
		Parent studSaved = service.addParent(stud);
		Assertions.assertEquals(studSaved.getMobileNumber(), stud.getMobileNumber());
	}

}
