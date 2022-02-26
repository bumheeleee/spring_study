package com.springbook.biz.common;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service //LogAdviceŬ������ ��ü�� �����ϱ� ���� ���
@Aspect // LogAdvice��ü�� Aspect(Pointcut + Advice)��ü�� �ν� 
public class LogAdvice {
	
	//PointCut : ����Ͻ� ���� �޼ҵ��� ���͸� �� �޼ҵ带 ���Ѵ�.
	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
	public void allPointcut(){}
	
	//@Pointcut("execution(* com.springbook.biz..*Impl.get*(..))")
	public void getPointcut(){}
	
	//@Before("allPointcut()")
	//Advice : Ⱦ�� ���� ����
	public void printLog(){
		System.out.println("[����α�] ����Ͻ� ���� ���� �� �����Ѵ�.");
	}
	
}
