package com.springbook.view.controller;

import java.util.HashMap;
import java.util.Map;

import com.springbook.view.user.LoginController;

public class HandlerMapping {
	//map�� <key, value>�� ���� �����Ѵ�.
	private Map<String, Controller> mappings;
	
	
	public HandlerMapping(){
		mappings = new HashMap<String, Controller>();
		mappings.put("/login.do", new LoginController());
	}
	
	public Controller getController(String path){
		return mappings.get(path);
		
	}

	
}
