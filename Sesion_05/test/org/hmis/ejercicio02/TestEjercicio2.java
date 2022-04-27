/**
 * 
 */
package org.hmis.ejercicio02;

import static org.junit.jupiter.api.Assertions.*;

import org.hmis.sesion05.ej2.Ejercicio2;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TestEjercicio2 {

	@ParameterizedTest (name = "{index} => Hacer login con ({0},{1}) sale {2}")
	@CsvSource({"user, Pass1, true",
				"usuario, Pass1, false",
				"user, pass, false",
				"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa,aaa,false",
				"aaaa, aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa,false",
				"user2, Pass, false",
				"user, Pass2, false",
				"User1, Pass1, false"})
	
	void testEjercicio02(String usuario, String password, Boolean resultado){
		// 1. Arrange 
		Ejercicio2 e2 = new Ejercicio2();

		// 2. Act
		Boolean comprobacion = e2.login(usuario, password);
		Boolean comprobacion2 = e2.login("","");
		// 3. Assert
		assertEquals(comprobacion, resultado);
		assertEquals(comprobacion2,false);
	}

}
