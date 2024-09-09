package Pg2ev;
/*
 * Considere los métodos siguientes. El propósito de todos ellos es comparar dos fechas e 
indican si una de ellas es posterior a la otra (f2); en ese caso devuelven true y en caso 
contrario false.
public boolean isPosterior(Fecha f2);
public boolean isPosterior(Fecha f1, Fecha f2);
public static boolean isPosterior(Fecha f2);
public static boolean isPosterior(Fecha f1, Fecha f2);
Indique cuál cuales le resultaría natural incluir en la clase Fecha.
 */
public class Pg10_Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Lo suyo es usar los dos primeros métodos porque al no ser static
		 * puedes usar como parámetro inicial fecha1.isPosterior(fecha2);, en
		 * los dos métodos static no podrías tomar como referencia fecha1 si 
		 * sólo introduces como parámetro fecha2.
		 */

	}
}
