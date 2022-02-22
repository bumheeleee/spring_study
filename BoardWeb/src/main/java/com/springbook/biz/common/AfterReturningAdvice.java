package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;

import com.springbook.biz.user.UserVO;

public class AfterReturningAdvice {
	
	public void AfterLog(JoinPoint jp, Object returnObj){
		String method = jp.getSignature().getName();
		if(returnObj instanceof UserVO){
			UserVO user =  (UserVO)returnObj;
			if(user.getRole().equals("Admin")){
				System.out.println(user.getName()+ "�α���(Admin)");
			}
		}
		
		System.out.println("[���� ó��]" + method +
				"()�޼ҵ� ���ϰ� : " + returnObj.toString());
	}

}
