package com.tecsup.lab01.view;

import com.tecsup.lab01.controller.UserController;

public class UserView {
	
	public static void main( String[] args )
    {
		UserController usrController = new UserController();
		System.out.println(usrController.insertarnombre("Julio Carlos"));
		System.out.println(usrController.insertarapellido("Barranco Torres"));
		System.out.println(usrController.insertaredad(18));
    }
	
}
