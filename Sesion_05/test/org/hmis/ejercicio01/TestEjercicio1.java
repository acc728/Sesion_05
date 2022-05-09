package org.hmis.ejercicio01;

import static org.junit.jupiter.api.Assertions.*;

import org.hmis.sesion05.ej1.Ejercicio1;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TestEjercicio1 {

	@ParameterizedTest(name = "{index} => transformar {0} sale {1}")
	@CsvSource({ "4, 1", "9, 1", "35, 7" })
	void testEjercicio01(int numero, int resto) {
		// 1. Arrange
		Ejercicio1 e1 = new Ejercicio1();

		// 2. Act
		int resultado = e1.transformar(numero);

		// 3. Assert
		assertEquals(resto, resultado);
	}
}
