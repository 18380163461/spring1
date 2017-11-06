package com.example.aop;

import org.aspectj.lang.JoinPoint;

import java.util.Arrays;


public class LoggingAspect2 {

	public void beforeMethod(JoinPoint joinPoint){
		String methodName = joinPoint.getSignature().getName();
		Object [] args = joinPoint.getArgs();

		System.out.println("------11111111111------The method " + methodName + " begins with " + Arrays.asList(args));
	}

	public void afterMethod(JoinPoint joinPoint){
		String methodName = joinPoint.getSignature().getName();
		System.out.println("-------11111111111111------The method " + methodName + " ends");
	}

}
