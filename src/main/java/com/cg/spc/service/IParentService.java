package com.cg.spc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.spc.entities.ClassId;
import com.cg.spc.entities.Parent;
import com.cg.spc.entities.Student;
public interface IParentService 
{
	public Parent addParent(Parent parent);
	public Parent updateParent(Parent parent);
	public List<Parent> retrieveParentListByClass(ClassId classId);
	public Parent retrieveParentByStudent(Student student);
	public Parent retrieveParentById(int id);
	
}
