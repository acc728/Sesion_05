package org.hmis.sesion05.ej2;

public class Ejercicio2 {
	
	public boolean login(String username, String password) {
		// comprobar que sean distintos de vacio
		if(username=="" || password=="") return false;
		
		// comprobar que la longitud sea < 30
		if(username.length() >= 30 || password.length() >= 30) return false;
		
		//comprobar que password contiene al menos una mayuscula, una minuscula y un numero
		if(password.toLowerCase().equals(password)) return false;
		
		boolean digito = false;
		for(char caracter : password.toCharArray()) {
			if(Character.isDigit(caracter)) 
				digito = true;
		}
		
		if(digito == false) return false;
		
		// llamar al metodo de la bbdd
		return compruebaLoginEnBD(username, password);
	}

	public boolean compruebaLoginEnBD(String username, String password) {
		// metodo mock (simulado)
		if (username.equals("user") && password.equals("Pass1"))
			return true;
		else
			return false;
	}
}
