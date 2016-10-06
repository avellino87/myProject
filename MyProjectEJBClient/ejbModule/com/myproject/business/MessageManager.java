package com.myproject.business;

import javax.ejb.Local;

@Local
public interface MessageManager {
	
	void writeMessage();

}
