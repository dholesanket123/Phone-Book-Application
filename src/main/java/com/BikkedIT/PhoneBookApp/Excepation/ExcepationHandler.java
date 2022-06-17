package com.BikkedIT.PhoneBookApp.Excepation;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class ExcepationHandler {
	@ExceptionHandler
	public ResponseEntity<ExcepationMassage> NoDataFound(DataNotFoundExcepation e){
		ExcepationMassage exc=new ExcepationMassage();
		exc.setErrorCode("PHNO0001");
		exc.setMsg(e.getMessage());
		exc.setLocalDate(exc.getLocalDate());
		return new ResponseEntity<ExcepationMassage>(exc,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}

}
