package com.cg.spc.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "fee")
public class Fee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int FeeId;
	@OneToOne
	@JoinColumn(name = "userId")
	private Student student;
	private double totalFeesDue;
	private double totalFeesReceived;
	private LocalDate startMonthYear;
	private LocalDate endMonthYear;
	public Fee(int feeId, Student student, double totalFeesDue, double totalFeesReceived, LocalDate startMonthYear,
			LocalDate endMonthYear) {
		super();
		FeeId = feeId;
		this.student = student;
		this.totalFeesDue = totalFeesDue;
		this.totalFeesReceived = totalFeesReceived;
		this.startMonthYear = startMonthYear;
		this.endMonthYear = endMonthYear;
	}
	public Fee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getFeeId() {
		return FeeId;
	}
	public void setFeeId(int feeId) {
		FeeId = feeId;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public double getTotalFeesDue() {
		return totalFeesDue;
	}
	public void setTotalFeesDue(double totalFeesDue) {
		this.totalFeesDue = totalFeesDue;
	}
	public double getTotalFeesReceived() {
		return totalFeesReceived;
	}
	public void setTotalFeesReceived(double totalFeesReceived) {
		this.totalFeesReceived = totalFeesReceived;
	}
	public LocalDate getStartMonthYear() {
		return startMonthYear;
	}
	public void setStartMonthYear(LocalDate startMonthYear) {
		this.startMonthYear = startMonthYear;
	}
	public LocalDate getEndMonthYear() {
		return endMonthYear;
	}
	public void setEndMonthYear(LocalDate endMonthYear) {
		this.endMonthYear = endMonthYear;
	}
	@Override
	public String toString() {
		return "Fee [FeeId=" + FeeId + ", student=" + student + ", totalFeesDue=" + totalFeesDue
				+ ", totalFeesReceived=" + totalFeesReceived + ", startMonthYear=" + startMonthYear + ", endMonthYear="
				+ endMonthYear + "]";
	}
	
	
	
	//incomplete
	
	

	
}
