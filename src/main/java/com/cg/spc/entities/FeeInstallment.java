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
@Table(name = "feeInstallment")
public class FeeInstallment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int feeInstallmentId;
private double feeInstallment;
private LocalDate dueDate;
private LocalDate feePaymentDate;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "Fee_Id")
private Fee fee;
public FeeInstallment(int feeInstallmentId, double feeInstallment, LocalDate dueDate, LocalDate feePaymentDate,
		Fee fee) {
	super();
	this.feeInstallmentId = feeInstallmentId;
	this.feeInstallment = feeInstallment;
	this.dueDate = dueDate;
	this.feePaymentDate = feePaymentDate;
	this.fee = fee;
}
public FeeInstallment() {
	super();
	// TODO Auto-generated constructor stub
}
public int getFeeInstallmentId() {
	return feeInstallmentId;
}
public void setFeeInstallmentId(int feeInstallmentId) {
	this.feeInstallmentId = feeInstallmentId;
}
public double getFeeInstallment() {
	return feeInstallment;
}
public void setFeeInstallment(double feeInstallment) {
	this.feeInstallment = feeInstallment;
}
public LocalDate getDueDate() {
	return dueDate;
}
public void setDueDate(LocalDate dueDate) {
	this.dueDate = dueDate;
}
public LocalDate getFeePaymentDate() {
	return feePaymentDate;
}
public void setFeePaymentDate(LocalDate feePaymentDate) {
	this.feePaymentDate = feePaymentDate;
}
public Fee getFee() {
	return fee;
}
public void setFee(Fee fee) {
	this.fee = fee;
}
@Override
public String toString() {
	return "FeeInstallment [feeInstallmentId=" + feeInstallmentId + ", feeInstallment=" + feeInstallment + ", dueDate="
			+ dueDate + ", feePaymentDate=" + feePaymentDate + ", fee=" + fee + "]";
}

}
