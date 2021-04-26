package com.cg.spc.service;

import java.util.List;

import com.cg.spc.entities.Fee;
import com.cg.spc.entities.FeeInstallment;
import com.cg.spc.entities.Student;

public interface IFeeInstallmentService {
	public FeeInstallment makePayment(FeeInstallment feeInstallment);
	public List<FeeInstallment> pendingInstallments(Student student);
	public FeeInstallment retrieveFeeInstallmentById(int id);
	public List<FeeInstallment> retrieveAllFeeInstallmentsByFee(Fee fee);
	
}
