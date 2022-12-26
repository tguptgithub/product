package com.product.product;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {
	private static final Log LOGGER=LogFactory.getLog(ExceptionControllerAdvice.class);
	private ResponseEntity<ErrorInfo> productServiceExceptionHandler(ProductServiceException exception){
		LOGGER.error(exception.getMessage(), exception);
		ErrorInfo error=new ErrorInfo();
		error.setErrorCode(HttpStatus.BAD_GATEWAY.value());
		error.setErrorMessage(exception.getMessage());
		
		return new ResponseEntity<>(error,HttpStatus.OK);
		
	}
	

}
