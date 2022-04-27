package org.hmis.ejercicio04;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.hmis.sesion05.ej4.Ejercicio4;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TestEjercicio4 {

		@ParameterizedTest (name = "{index} => Calificar el array {0} sale {1}")
		@MethodSource("proveedorDatosArray")

		void testEjericio04(double[] notas, String[] calificaciones){
			// 1. Arrange 
			Ejercicio4 e4 = new Ejercicio4();

			// 2. Act
			e4.calculaCalificaciones(notas);

			// 3. Assert
			for(int i = 0; i < calificaciones.length; i++) {
				assertEquals(e4.getNotas()[i], notas[i]);
				assertEquals(e4.getCalificaciones()[i], calificaciones[i]);
			}

		}
		
		private static Stream<Arguments> proveedorDatosArray() {
		    return Stream.of(
		    		Arguments.of(new double[]{-2.5, 3, 5.5, 8.8, 9.8, 10.0}, 
		    		new String[]{"Error en la nota", "Suspenso", "Aprobado", "Notable", "Sobresaliente","Matricula"})
		   );
		}
	}

