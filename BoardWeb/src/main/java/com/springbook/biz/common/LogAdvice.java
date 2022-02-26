package com.springbook.biz.common;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service //LogAdvice클래스의 객체를 생성하기 위해 사용
@Aspect // LogAdvice객체를 Aspect(Pointcut + Advice)객체로 인식 
public class LogAdvice {
	
	//PointCut : 비즈니스 로직 메소드중 필터링 된 메소드를 말한다.
	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
	public void allPointcut(){}
	
	//@Pointcut("execution(* com.springbook.biz..*Impl.get*(..))")
	public void getPointcut(){}
	
	//@Before("allPointcut()")
	//Advice : 횡단 관점 로직
	public void printLog(){
		System.out.println("[공통로그] 비즈니스 로직 수행 전 동작한다.");
	}
	
}
