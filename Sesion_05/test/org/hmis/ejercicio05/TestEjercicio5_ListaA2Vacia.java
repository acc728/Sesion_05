package org.hmis.ejercicio05;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.stream.Stream;

import org.hmis.sesion05.ej5.Ejercicio5;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TestEjercicio5_ListaA2Vacia {

	@ParameterizedTest(name = "{index} => Test de mezclar el array {0} y {1}")
	@MethodSource("proveedorDatosArray1")

	void TestEjercicio5(ArrayList<String> A1, ArrayList<String> A2) {
		// 1. Arrange
		Ejercicio5 e5 = new Ejercicio5();

		// 2. Act
		e5.listaOrdenadaEstudiantes(A1, A2);
		TreeSet<String> resultadoMetodo = e5.getLista();

		TreeSet<String> resultadoEsperado = new TreeSet<String>();
		resultadoEsperado.addAll(A1);
		
		// 3. Assert
		assertEquals(resultadoEsperado, resultadoMetodo);

	}

	private static Stream<Arguments> proveedorDatosArray1() {
		ArrayList<String> A1 = new ArrayList<String>();
		A1.add("Pepe Gonzalez");
		A1.add("Maria Lopez");
		A1.add("Jorge Rubio");
		A1.add("Martin Hernandez");
		
		ArrayList<String> A2 = new ArrayList<String>();

		return Stream.of(Arguments.of(A1, A2));
	}
}