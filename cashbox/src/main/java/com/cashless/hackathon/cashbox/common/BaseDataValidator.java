/**
 * 
 */
package com.cashless.hackathon.cashbox.common;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * @author danie
 * base abstract class for validations
 */
public abstract class BaseDataValidator implements Validator {

	/* (non-Javadoc)
	 * @see org.springframework.validation.Validator#supports(java.lang.Class)
	 */
	@Override
	public abstract boolean supports(Class<?> arg0);

	/* (non-Javadoc)
	 * @see org.springframework.validation.Validator#validate(java.lang.Object, org.springframework.validation.Errors)
	 */
	@Override
	public abstract void validate(Object arg0, Errors arg1);


}
