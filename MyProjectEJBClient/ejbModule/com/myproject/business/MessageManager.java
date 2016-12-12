package com.myproject.business;

import javax.ejb.Local;
/**This class manages the message displayed **/

@Local
public interface MessageManager {
	
	String writeMessage();

}
