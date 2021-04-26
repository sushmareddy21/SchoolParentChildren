package com.cg.spc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class CentralizedExceptionHandler
{
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	@ExceptionHandler(StudentIDNotFoundException.class)
	public String handleStudentIDNotFound(StudentIDNotFoundException e) 
	{
		return e.getMessage();
	}
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	@ExceptionHandler(FeePaymentNotDoneException.class)
	public String handleFeePaymentNotDone(FeePaymentNotDoneException e)
	{
		return e.getMessage();
	}
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	@ExceptionHandler(ExamIdNotFoundException.class)
	public String handleExamIdNotFound(ExamIdNotFoundException e) 
	{
		return e.getMessage();
	}
}
