package org.hmis.ejercicio05;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.stream.Stream;

import org.hmis.sesion05.ej5.Ejercicio5;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TestEjercicio5_AmbasListasVacias {

	@ParameterizedTest(name = "{index} => Test de mezclar el array {0} y {1}")
	@MethodSource("proveedorDatosArray3")

	void TestEjercicio5(ArrayList<String> A1, ArrayList<String> A2) {
		// 1. Arrange
		Ejercicio5 e5Vacia = new Ejercicio5();

		// 2. Act
		e5Vacia.listaOrdenadaEstudiantes(A1, A2);
		TreeSet<String> resultadoMetodo = e5Vacia.getLista();
		
		// 3. Assert
		
		//SI SE EJECUTA JUNTO A TODOS LOS DEMAS NO FUNCIONA
		assertEquals(new TreeSet<String>(), resultadoMetodo);

	}

	private static Stream<Arguments> proveedorDatosArray3() {
		ArrayList<String> A1 = new ArrayList<String>();
		
		ArrayList<String> A2 = new ArrayList<String>();

		return Stream.of(Arguments.of(A1, A2));
	}
}