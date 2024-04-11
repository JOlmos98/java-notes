package Pg1ev;
/*
 * Programa que lea el nombre y sueldo 
 * neto mensual de 5 personas y obtenga 
 * e imprima el nombre y sueldo de la 
 * persona que más cobra y de la que menos. 
 * En caso de empate se imprimirá el primero 
 * de ellos en la secuencia de entrada. 
 */
public class Pg03_Ej7 {

	public static void main(String[] args) {
		
		String em1="Jesús";
		String em2="Alberto";
		String em3="Raúl";
		String em4="María";
		String em5="Eladio";
		
		int suelem1=2314;
		int suelem2=2132;
		int suelem3=1234;
		int suelem4=1987;
		int suelem5=1876;
		
		int mayor=Integer.max(suelem4, Integer.max(suelem5, Integer.max(suelem3, Integer.max(suelem1, suelem2))));
		
		System.out.println("¿Cuál es el empleado que más cobra?");
		
		if (suelem1==mayor) System.out.println("El sueldo mayor es el de "+em1+" que cobra "+suelem1+" euros mensuales.");
		else if (suelem2==mayor) System.out.println("El sueldo mayor es el de "+em2+" que cobra "+suelem2+" euros mensuales.");
		else if (suelem3==mayor) System.out.println("El sueldo mayor es el de "+em3+" que cobra "+suelem3+" euros mensuales.");
		else if (suelem4==mayor) System.out.println("El sueldo mayor es el de "+em4+" que cobra "+suelem4+" euros mensuales.");
		else System.out.println("El sueldo mayor es el de "+em5+" que cobra "+suelem5+" euros mensuales.");

	}
}
