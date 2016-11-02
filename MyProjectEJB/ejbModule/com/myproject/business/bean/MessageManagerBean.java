package com.myproject.business.bean;

import javax.ejb.Stateless;

import com.myproject.business.MessageManager;

@Stateless
public class MessageManagerBean implements MessageManager{

	@Override
	public String writeMessage() {
		 return "Ciao Mond!";
		
	}

}
