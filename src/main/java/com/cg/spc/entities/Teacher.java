package com.cg.spc.entities;

//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;

//import javax.persistence.CollectionTable;
//import javax.persistence.Column;
//import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.MapKeyColumn;
import javax.persistence.Table;
@Entity
@Table(name = "teacher")
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int teacherId;
	private String name;

	//@ElementCollection
	//@MapKeyColumn(name="classId")
	//@Column(name="read")
	//@CollectionTable(name="notes", joinColumns=@JoinColumn(name="exam_examId"))
	//private Map<Subject,ClassId> subjectClasses = new HashMap<>();
	public Teacher(int teacherId, String name) {
		super();
		this.teacherId = teacherId;
		this.name = name;
		//this.subjectClasses = subjectClasses;
	}
	public Teacher() {
		super();
	}
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//public Map<Subject,ClassId> getSubjectClasses() {
		//return subjectClasses;
	//}
	//public void setSubjectClasses(Map<Subject,ClassId> subjectClasses) {
		//this.subjectClasses = subjectClasses;
	//}
	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", name=" + name + "]";
	}
	
	
}
