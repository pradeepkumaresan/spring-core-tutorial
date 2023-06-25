package com.javadevsguide.springframework.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAnnotationAspect {

	@Before("@annotation(com.javadevsguide.springframework.aop.aspect.Loggable)")
	public void myAdvice(JoinPoint joinPoint){
		System.out.println("Executing annotation advice in: "
				+ joinPoint.getSignature().getName() + "()");
	}
}
