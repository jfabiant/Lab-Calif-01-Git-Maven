package com.tecsup.lab01.view;

import com.tecsup.lab01.controller.UserController;

public class UserView {
	
	public static void main( String[] args )
    {
		UserController usrController = new UserController();
		System.out.println(usrController.insertarnombre("Juan Marcos"));
    }
	
}
