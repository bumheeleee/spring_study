package com.springbook.biz.common;

import org.aopalliance.intercept.Joinpoint;

public class LogAdvice {
	
	public void printLog(Joinpoint jp){
		System.out.println("[���� �α�] ����Ͻ� ���� ���� �� ����!!!");
	}
	
}
