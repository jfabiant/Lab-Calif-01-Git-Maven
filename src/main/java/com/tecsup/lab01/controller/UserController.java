package com.tecsup.lab01.controller;

import com.tecsup.lab01.model.User;

public class UserController {
	
	User usuario = new User();
	
	public String insertarnombre(String nombres) {
		usuario.setNombres(nombres);
        return("El nombre es: "+usuario.getNombres());
	}
	public String insertarapellido(String apellido) {
		usuario.setApelldioPaterno(apellido);
        return("Su apellido paterno es: "+usuario.getApelldioPaterno());
	}
	public String insertaredad(int edad) {
		usuario.setEdad(edad);
        return("Su edad es: "+usuario.getEdad());
	}
}
