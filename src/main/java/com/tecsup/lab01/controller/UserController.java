package com.tecsup.lab01.controller;

import com.tecsup.lab01.model.User;

public class UserController {
	
	User usuario=new User();
	
	public String insertarnombre(String nombres) {
        return("El nombre es: "+nombres);
	}
	public String insertarapellido(String apellido) {
        return("Su apellido paterno es: "+apellido);
	}
	public String insertaredad(int edad) {
        return("Su edad es: "+edad);
	}
}
