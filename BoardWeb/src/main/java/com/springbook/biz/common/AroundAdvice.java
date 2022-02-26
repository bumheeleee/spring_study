package com.springbook.biz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class AroundAdvice {

	public Object aroundLog(ProceedingJoinPoint pjp)throws Throwable{
		
		String method = pjp.getSignature().getName();
		
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		
		Object Obj = pjp.proceed();
		
		stopWatch.stop();
		
		System.out.println(method + "() �޼ҵ� ���࿡ �ɸ� �ð�  : " 
								+ stopWatch.getTotalTimeMillis() + "(ms)��");
		
		
		return Obj;
	}
	
}
