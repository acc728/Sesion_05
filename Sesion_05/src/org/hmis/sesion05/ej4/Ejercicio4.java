package org.hmis.sesion05.ej4;

public class Ejercicio4 {
	private double[] notas;
	private String[] calificaciones;

	public void calculaCalificaciones(double[] notas) {
		String calificacion = "";
		int i = 0;
		this.notas = notas;
		this.calificaciones = new String[notas.length];
		for (double nota : notas) {
			calificacion = obtenerCalificacion(nota);
			this.calificaciones[i] = calificacion;
			i++;
		}
	}
	
	public static String obtenerCalificacion(double nota) {
		if (nota >= 0.0 && nota < 5.0)
			return "Suspenso";
		else if (nota >= 5.0 && nota < 7.0)
			return "Aprobado";
		else if (nota >= 7.0 && nota < 9.0)
			return "Notable";
		else if (nota >= 9.0 && nota < 10.0)
			return "Sobresaliente";
		else if (nota == 10.0)
			return "Matricula";
		else
			return "Error en la nota";
	}

	public String[] getCalificaciones() {
		return calificaciones;
	}
	
	public double[] getNotas() {
		return notas;
	}

	
}
