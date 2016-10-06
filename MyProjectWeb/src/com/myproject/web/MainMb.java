package com.myproject.web;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.myproject.business.MessageManager;

@ManagedBean(name = "mainMb")
@RequestScoped
public class MainMb {
	
	@EJB
	private MessageManager messageManager;
	
	private String messaggio;
	private String text;
	
	@PostConstruct
	public void init() {
		this.messaggio= messageManager.writeMessage();
	}

	public String getMessaggio() {
		return messaggio;
	}

	public void setMessaggio(String messaggio) {
		this.messaggio = messaggio;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
