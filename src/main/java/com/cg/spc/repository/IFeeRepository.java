package com.cg.spc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.spc.entities.Fee;
import com.cg.spc.entities.Student;
@Repository
public interface IFeeRepository extends JpaRepository<Fee,Integer> 
{
		//public Fee addFee(Fee fee);
		//public Fee deleteFee(int id);
		//@Modifying(clearAutomatically = true)
		//@Query("")
		//public Fee updateFee(Fee fee);
		//public Fee retrieveFee(int id);
		//public Fee retrieveFeeByStudent(Student student);
//		@Query("select * from Fee  ")
//		public List<Fee> retrieveAllFeeByMonth(int month);
		
}
