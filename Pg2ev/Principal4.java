package Pg2ev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Principal4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * En este ejercicio uso tres variables que he añadido a la clase Empresa
		 * del ejercicio 2, las variables son trabajosatiempo, trabajostarde y 
		 * porcentajecumplimiento junto con los métodos addTrabajoATiempo, 
		 * addTrabajoTarde y CalcularPorcentajeCumplimiento.
		 * 
		 * En la clase Trabajo está el método sumarTrabajo que recibe
		 * un objeto Empresa como parámetro y suma a esa empresa a una 
		 * variable u otra dependiendo de las fechas.
		 */
	}

	private static void ordenarPorCumplimiento(ArrayList<Empresa> empresas) {

        Collections.sort(empresas, (e1, e2) -> e2.getPorcentajeCumplimiento()-e1.getPorcentajeCumplimiento());
		
	}
}
