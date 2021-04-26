package com.cg.spc.service;

import java.util.List;

import com.cg.spc.entities.Fee;
import com.cg.spc.entities.Student;

public interface IFeeService
{
		public Fee addFee(Fee fee);
		public Fee deleteFee(int id);
		public Fee updateFee(Fee fee);
		public Fee retrieveFee(int id);
		public Fee retrieveFeeByStudent(Student student);
		public List<Fee> retrieveAllFeeByMonth(int month);
		
		

}
