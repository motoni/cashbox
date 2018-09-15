package com.cashless.hackathon.cashbox.cashBoxTransaction;

import org.springframework.validation.Errors;

import com.cashless.hackathon.cashbox.common.BaseDataValidator;


public class CashBoxTransactionValidator extends BaseDataValidator {
	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return CashBoxTransaction.class.equals(arg0);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		// TODO Auto-generated method stub

	}


}
