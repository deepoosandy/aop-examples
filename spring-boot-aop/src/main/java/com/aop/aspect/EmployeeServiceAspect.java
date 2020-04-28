package com.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceAspect {

	@Before(value = "execution(* com.aop.service.*.*(..)) and args(name,empId) && "
			+" !@annotation(com.aop.model.NoLogging)"
			+ "&&"
			+ " !@target(com.aop.model.NoLogging)")
	public void beforeAdvice(JoinPoint joinPoint, String name, String empId) {
		System.out.println("Before method:" + joinPoint.getSignature());

		System.out.println("Creating Employee with name - " + name + " and id - " + empId);
	}

	/*@After(value = "execution(* com.javainuse.service.*.*(..)) and args(name,empId)")
	public void afterAdvice(JoinPoint joinPoint, String name, String empId) {
		
		System.out.println("After method:" + joinPoint.getSignature());

		System.out.println("Successfully created Employee with name - " + name + " and id - " + empId);
	}*/
	
/*	@Around(value = "execution(* com.javainuse.service.EmployeeService.*(..))")
	public void afterAround(ProceedingJoinPoint joinPoint) {
		System.out.println("After method:" + joinPoint.getSignature());

		//System.out.println("Successfully created Employee with name - " + name + " and id - " + empId);
	}*/
}
