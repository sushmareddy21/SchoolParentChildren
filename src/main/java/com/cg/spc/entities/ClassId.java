package com.cg.spc.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name  = "classid")
public class ClassId {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String classId;
	private int grade;
	private char division;
	//@OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL)
	//private Teacher classTeacher;
	@OneToMany
	private List<Teacher> subjectTeachers = new ArrayList();
	
	
	ClassId(int grade,char division){
		this.grade =  grade;
		this.division = division;
		this.classId =  ""+this.grade+this.division;
		
	}
	
	
	
	public String getClassId() {
		return classId;
	}



	public void setClassId(String classId) {
		this.classId = classId;
	}



	public int getGrade() {
		return grade;
	}



	public void setGrade(int grade) {
		this.grade = grade;
	}



	public char getDivision() {
		return division;
	}



	public void setDivision(char division) {
		this.division = division;
	}



	/*public Teacher getClassTeacher() {
		return classTeacher;
	}*/



	//public void setClassTeacher(Teacher classTeacher) {
		//this.classTeacher = classTeacher;
	//}



	public List<Teacher> getSubjectTeachers() {
		return subjectTeachers;
	}



	public void setSubjectTeachers(List<Teacher> subjectTeachers) {
		this.subjectTeachers = subjectTeachers;
	}



	public ClassId() {
		super();
	}



	public ClassId(String classId, int grade, char division, List<Teacher> subjectTeachers) {
		super();
		this.classId = classId;
		this.grade = grade;
		this.division = division;
		//this.classTeacher = classTeacher;
		this.subjectTeachers = subjectTeachers;
	}



	@Override
	public String toString() {
		return "ClassesAlloted [classId=" + classId + "]";
	}



	public static void main(String[] args) {
		
		ClassId ca = new ClassId(3, 'a');
		System.out.println(ca);
	}
}
