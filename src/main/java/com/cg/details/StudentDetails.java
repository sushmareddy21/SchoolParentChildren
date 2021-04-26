package com.cg.details;

import java.time.LocalDate;
import java.util.List;
import com.cg.spc.entities.Address;
import com.cg.spc.entities.ClassDiary;
import com.cg.spc.entities.ClassId;

public class StudentDetails 
{
	private long userId;
	private LocalDate dateOfBirth;
	private ClassId currentClass;
	private List<SubjectDetails> subjects;
	private String name;
	private Address address;
	private ClassDiary classDiary;
	private String emailId;
	private String mobileNumber;
	public StudentDetails() {
	}
	
	public StudentDetails(long userId, LocalDate dateOfBirth, String name, String emailId, String mobileNumber) {
		super();
		this.userId = userId;
		this.dateOfBirth = dateOfBirth;
		this.name = name;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
	}
    
	public StudentDetails(long userId, LocalDate dateOfBirth, String mobileNumber, String name, String emailId,
			List<SubjectDetails> subjects) {
		super();
		this.userId = userId;
		this.dateOfBirth = dateOfBirth;
		this.mobileNumber = mobileNumber;
		this.name = name;
		this.emailId = emailId;
		this.subjects = subjects;
	}

	public StudentDetails(long userId, LocalDate dateOfBirth, ClassId currentClass, List<SubjectDetails> subjects, String name,
			Address address, ClassDiary classDiary, String emailId, String mobileNumber) {
		super();
		this.userId = userId;
		this.dateOfBirth = dateOfBirth;
		this.currentClass = currentClass;
		this.subjects = subjects;
		this.name = name;
		this.address = address;
		this.classDiary = classDiary;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
	}
     
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public ClassId getCurrentClass() {
		return currentClass;
	}

	public void setCurrentClass(ClassId currentClass) {
		this.currentClass = currentClass;
	}

	public List<SubjectDetails> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<SubjectDetails> subjects) {
		this.subjects = subjects;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public ClassDiary getClassDiary() {
		return classDiary;
	}

	public void setClassDiary(ClassDiary classDiary) {
		this.classDiary = classDiary;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "StudentDetails [userId=" + userId + ", dateOfBirth=" + dateOfBirth + ", currentClass=" + currentClass
				+ ", subjects=" + subjects + ", name=" + name + ", address=" + address + ", classDiary=" + classDiary
				+ ", emailId=" + emailId + ", mobileNumber=" + mobileNumber + "]";
	}

}
