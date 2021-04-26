package com.cg.spc.entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "attendance")
public class Attendance {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int attendanceId;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student")
	private Student student;
	private LocalDate dateOfClass;
	private boolean present;
	public Attendance(int attendanceId, Student student, LocalDate dateOfClass, boolean present) {
		super();
		this.attendanceId = attendanceId;
		this.student = student;
		this.dateOfClass = dateOfClass;
		this.present = present;
	}
	public Attendance() {
		super();
	}
	public int getAttendanceId() {
		return attendanceId;
	}
	public void setAttendanceId(int attendanceId) {
		this.attendanceId = attendanceId;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public LocalDate getDateOfClass() {
		return dateOfClass;
	}
	public void setDateOfClass(LocalDate dateOfClass) {
		this.dateOfClass = dateOfClass;
	}
	public boolean isPresent() {
		return present;
	}
	public void setPresent(boolean present) {
		this.present = present;
	}
	@Override
	public String toString() {
		return "Attendance [attendanceId=" + attendanceId + ", student=" + student + ", dateOfClass=" + dateOfClass
				+ ", present=" + present + "]";
	}
	
	
	
}
