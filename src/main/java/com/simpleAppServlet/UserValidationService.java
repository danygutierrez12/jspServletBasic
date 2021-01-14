package com.simpleAppServlet;

public class UserValidationService {

	public boolean isValidUser(String user) {
		if(user.equals("dgutierrez"))
			return true;
		return false;
	}
}
