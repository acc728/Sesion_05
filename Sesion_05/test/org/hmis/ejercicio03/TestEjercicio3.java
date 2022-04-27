package org.hmis.ejercicio03;

import static org.junit.jupiter.api.Assertions.*;

import org.hmis.sesion05.ej3.Ejercicio3;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class TestEjercicio3 {

		@ParameterizedTest (name = "{index} => Ocultar la password {0} sale {1}")
		@CsvFileSource(resources="/datosEjercicio03.csv")

		void testEjercicio03(String password, String resultado){
			// 1. Arrange 
			Ejercicio3 e3 = new Ejercicio3();

			// 2. Act
			String comprobacion = e3.ocultarPassword(password);

			// 3. Assert
			assertEquals(comprobacion, resultado);
		}
	}

