package org.hmis.sesion05.ej3;

public class Ejercicio3 {
	
	public String ocultarPassword(String password) {
		if(password.length()<5) return "password demasiado corto";
		if(5<= password.length() &&  password.length()<=8) return "********";
		
		//No se dice nada de contraseñas entre 8 y 12 caracteres por lo que doy por supuesto que es a partir de 9
		if(9<= password.length() &&  password.length()<=40) return "************";
		else
			return "password demasiado largo";
	}
}
