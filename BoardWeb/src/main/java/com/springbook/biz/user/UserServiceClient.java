package com.springbook.biz.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class UserServiceClient {

	public static void main(String[] args) {
		//1. spring �����̳ʸ� �����Ѵ�.
		AbstractApplicationContext container = 
				new GenericXmlApplicationContext("applicationContext.xml");
				
		//2. spring �����̳ʷκ���  UserServiceImpl��ü�� lookUp�Ѵ�.
		UserService userService = (UserService)container.getBean("userService");
		
		//3. �α��� ��� �׽�Ʈ
		//4. ������ ���̽��� �ִ� ���̵�� ��й�ȣ�� �α����� �ؾߵȴ�.
		UserVO vo = new UserVO();
		vo.setId("test");
		vo.setPassword("test123");
		
		UserVO user = userService.getUser(vo);
		
		if(user != null){
			System.out.println(user.getName()+"�� ȯ���մϴ�.");
		}else{
			System.out.println("�α��� ����");
		}
		
		//4. spring �����̳� ����
		container.close();
	}

}
