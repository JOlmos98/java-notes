package Pg1ev;
/*
 * Programa que lea el nombre y sueldo neto 
 * mensual de 5 personas y obtenga e imprima 
 * el nombre y sueldo de las dos personas que 
 * más cobran. 
 */
public class Pg03_Ej08 {

	public static void main(String[] args) {
		
		//Este ejercicio está hecho muy a lo bruto.
		
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
		
		int segundomayor=0;
		
		if (suelem1==mayor) {
			if (suelem2>suelem3&&suelem2>suelem4&&suelem2>suelem5) segundomayor=suelem2;
			else if (suelem3>suelem2&&suelem3>suelem4&&suelem3>suelem5) segundomayor=suelem3;
			else if (suelem4>suelem2&&suelem4>suelem3&&suelem4>suelem5) segundomayor=suelem4;
			else if (suelem5>suelem2&&suelem5>suelem4&&suelem5>suelem3) segundomayor=suelem5;
		} else if (suelem2==mayor) {
			if (suelem1>suelem3&&suelem1>suelem4&&suelem1>suelem5) segundomayor=suelem1;
			else if (suelem3>suelem1&&suelem3>suelem4&&suelem3>suelem5) segundomayor=suelem3;
			else if (suelem4>suelem1&&suelem4>suelem3&&suelem4>suelem5) segundomayor=suelem4;
			else if (suelem5>suelem1&&suelem5>suelem4&&suelem5>suelem3) segundomayor=suelem5;
		} else if (suelem3==mayor) {
			if (suelem1>suelem2&&suelem1>suelem4&&suelem1>suelem5) segundomayor=suelem1;
			else if (suelem2>suelem1&&suelem2>suelem4&&suelem2>suelem5) segundomayor=suelem2;
			else if (suelem4>suelem1&&suelem4>suelem2&&suelem4>suelem5) segundomayor=suelem4;
			else if (suelem5>suelem1&&suelem5>suelem4&&suelem5>suelem2) segundomayor=suelem5;
		} else if (suelem4==mayor) {
			if (suelem1>suelem2&&suelem1>suelem3&&suelem1>suelem5) segundomayor=suelem1;
			else if (suelem2>suelem1&&suelem2>suelem3&&suelem2>suelem5) segundomayor=suelem2;
			else if (suelem3>suelem1&&suelem3>suelem2&&suelem3>suelem5) segundomayor=suelem3;
			else if (suelem5>suelem1&&suelem5>suelem3&&suelem5>suelem2) segundomayor=suelem5;
		} else if (suelem5==mayor) {
			if (suelem1>suelem2&&suelem1>suelem4&&suelem1>suelem3) segundomayor=suelem1;
			else if (suelem2>suelem1&&suelem2>suelem4&&suelem2>suelem3) segundomayor=suelem2;
			else if (suelem4>suelem1&&suelem4>suelem2&&suelem4>suelem3) segundomayor=suelem4;
			else if (suelem3>suelem1&&suelem3>suelem4&&suelem3>suelem2) segundomayor=suelem3;
		} 
		if (suelem1==segundomayor) System.out.println("El segundo sueldo mayor es el de "+em1+" que cobra "+suelem1+" euros mensuales.");
		else if (suelem2==segundomayor) System.out.println("El segundo sueldo mayor es el de "+em2+" que cobra "+suelem2+" euros mensuales.");
		else if (suelem3==segundomayor) System.out.println("El segundo sueldo mayor es el de "+em3+" que cobra "+suelem3+" euros mensuales.");
		else if (suelem4==segundomayor) System.out.println("El segundo sueldo mayor es el de "+em4+" que cobra "+suelem4+" euros mensuales.");
		else System.out.println("El segundo sueldo mayor es el de "+em5+" que cobra "+suelem5+" euros mensuales.");
	}
}
