package com.cashless.hackathon.cashbox.common;

import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
@Component
public class BaseErrorUtil {
	
	public Map<String, String> getBaseErrorUtil(BindingResult result){
		return (Map<String, String>) result
		.getFieldErrors()
		.stream()
		.collect(
        Collectors.toMap(f->f.getField(), f->f.getDefaultMessage()));
	}
	
}
