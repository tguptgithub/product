package com.product.product;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	private static final Log LOGGER=LogFactory.getLog(LoggingAspect.class);
	public void logServiceException(ProductServiceException exception) {
		LOGGER.error(exception.getMessage(), exception);
	}
	

}
