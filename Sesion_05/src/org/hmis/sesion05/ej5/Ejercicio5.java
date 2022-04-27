package org.hmis.sesion05.ej5;

import java.util.ArrayList;
import java.util.TreeSet;

public class Ejercicio5 {
	
	private TreeSet<String> lista = new TreeSet<String>();
	
	public void listaOrdenadaEstudiantes (ArrayList<String> A1, ArrayList<String> A2) {
		if(!A1.isEmpty())
			this.lista.addAll(A1);
		if(!A2.isEmpty())
			this.lista.addAll(A2);
	}

	public TreeSet<String> getLista() {
		return this.lista;
	}	
}
