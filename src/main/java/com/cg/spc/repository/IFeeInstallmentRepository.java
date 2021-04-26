package com.cg.spc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.spc.entities.Fee;
import com.cg.spc.entities.FeeInstallment;
import com.cg.spc.entities.Student;
import com.cg.spc.entities.User;
@Repository
public interface IFeeInstallmentRepository  extends JpaRepository<FeeInstallment,String>{
//	public FeeInstallment makePayment(FeeInstallment feeInstallment);
//	public List<FeeInstallment> pendingInstallments(Student student);
//	public FeeInstallment retrieveFeeInstallmentById(int id);
//	public List<FeeInstallment> retrieveAllFeeInstallmentsByFee(Fee fee);
//	
}
