package org.hmis.ejercicio01;

import static org.junit.jupiter.api.Assertions.*;

import org.hmis.sesion05.ej1.Ejercicio1;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TestEjercicio1 {

//	@Test
//	void test1() {
//		// Arrange
//		Ejercicio01 e1 = new Ejercicio01();
//		// Act
//		int resultado = e1.transformar(210); //Es multiplo de 2, 3 y 5 por lo que cubre los tres casos de una vez
//		// Assert
//		assertEquals(7,resultado); //expected, actual

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
