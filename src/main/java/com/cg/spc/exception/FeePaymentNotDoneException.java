package com.cg.spc.exception;

public class FeePaymentNotDoneException  extends RuntimeException
{
	public FeePaymentNotDoneException(String msg)
	{
		super(msg);
	}
}
