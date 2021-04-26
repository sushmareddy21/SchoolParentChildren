package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.service.AccountantService;
import com.cg.spc.entities.Fee;
import com.cg.spc.entities.Student;
import com.cg.util.AccountantUtil;


@RestController
@RequestMapping("/accountants")
@Validated
public class AccountantController {
	
	@Autowired
	private AccountantService accountantService;
	
	@Autowired
	private AccountantUtil accountantUtil;
	
	@RequestMapping("/acccountants/{classId}")
	public List<Fee> retrieveAllFeeByMonth(@PathVariable int month)
	{
		return accountantService.retrieveAllFeeByMonth(month);
	}
	
	
	/*@RequestMapping(method = RequestMethod.POST, value = "/accountants")
	public Fee addFee(@RequestBody Fee fee)
	{
		return accountantService.addFee(fee);

	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/accountants/{Id}")
	public Fee deleteFee(@RequestBody Fee fee, @PathVariable int id)
	{
		return accountantService.deleteFee(id);
	}
	
	
	/*@RequestMapping(method = RequestMethod.PUT, value = "/accountants")
	public Fee updateFee(@RequestBody Fee fee)
	{
		return accountantService.updateFee(fee);

	}
	
	@GetMapping("/by/id/{id}")
     public Fee retrieveFee(@PathVariable("id") Integer id) 
	{
		Fee fee = accountantService.retrieveFee(id);
		return fee;
    }
	
	@GetMapping("/by/student/{student}")
    public Fee retrieveFeeByStudent(@PathVariable("student") Student student) 
	{
		Fee fee = accountantService.retrieveFeeByStudent(student);
		return fee;
   }
	*/
	
}
