package com.cg.spc.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "parent")
public class Parent {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int parentId;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userId")
	private Student student;
	private String mobileNumber;
	private String emailId;
	public Parent(int parentId, Student student, String mobileNumber, String emailId) {
		super();
		this.parentId = parentId;
		this.student = student;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
	}
	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "Parent [parentId=" + parentId + ", student=" + student + ", mobileNumber=" + mobileNumber + ", emailId="
				+ emailId + "]";
	}
	
}
