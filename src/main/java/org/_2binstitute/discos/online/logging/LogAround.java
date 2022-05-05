package org._2binstitute.discos.online.logging;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAround {
	
	private static final Logger LOG = LoggerFactory.getLogger(LogAround.class);
	
	@Pointcut("execution(public * org._2binstitute.discos.online.repository.*.*(..))")
	private void anyRepository() {	}
	
	@Before("anyRepository() && args(domainObject)")
	public void logRepositoryInput(Object domainObject) {
		LOG.info("input: " + domainObject);
	}
	
	@AfterReturning(pointcut="anyRepository()", returning ="output")
	public void logRepositoryOutput(Object output) {
		LOG.info("Output: " + output);
	}
	
}
