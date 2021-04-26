package com.cg.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spc.entities.Fee;
import com.cg.spc.entities.Student;
import com.cg.spc.exception.FeePaymentNotDoneException;
import com.cg.spc.repository.IFeeRepository;
import com.cg.spc.service.IFeeService;
@Service
@Transactional
public class AccountantService implements IFeeService
   {
		@Autowired
		private IFeeRepository ifeeRepository;
		private Logger logger = LoggerFactory.getLogger(AccountantService.class);
		
		@Override
		public List<Fee> retrieveAllFeeByMonth(int month)
		{
//			List<Fee> feebymonth = new ArrayList<>();
//			ifeeRepository.findAll().forEach(feebymonth::add);
//			logger.info("***Retrieving FeeList by month: " +  ((IFeeRepository) feebymonth).retrieveAllFeeByMonth(month) + "***");
//			return feebymonth;
			return null;
		}

		@Override
		public Fee addFee(Fee fee) 
		{
			Fee fees = ifeeRepository.save(fee);
			return fees;
		}
		
		@Override
		public Fee deleteFee(int id) 
		{
			//return ifeeRepository.deleteFee(id);
			return null;
		}

		@Override
		public Fee updateFee(Fee fee) 
		{
			return ifeeRepository.save(fee) ;
		}

		@Override
		public Fee retrieveFee(int id)
		{
			Optional<Fee> opt = ifeeRepository.findById(id);
			if(!opt.isPresent()) {
				throw new FeePaymentNotDoneException("Student not paid fee : " +id);
			}
			Fee stud = opt.get();
			return stud;
		}

		@Override
		public Fee retrieveFeeByStudent(Student student) 
		{
//			Optional<Fee> opt = ifeeRepository.find(student);
//			Fee stud = opt.get();
//			return stud;
			return null;
		}

   }
