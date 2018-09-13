package com.tecsup.lab01.controller;

import com.tecsup.lab01.model.User;

public class UserController {
	User usuario=new User();
	String nombres="Marco Antonio";
	public String insertarnombre(String nombres) {
        
        nombres=this.nombres;
        return("El nombre es:"+nombres);  	
		
	}
}
