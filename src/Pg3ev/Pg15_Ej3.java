package Pg3ev;

import java.util.Scanner;

public class Pg15_Ej3 {
	
	/*
	 * En este ejercicio 3 tampoco hay que resolver nada,
	 * sencillamente muestra lo mismo que el ejercicio 2
	 * pero desarrollado en un método, el método es leeEntero();.
	 * Declara un int que es igual al método, y después, fuera
	 * del méttodo, si todo ha ido bien y no hay excepciones, 
	 * lo transforma en positivo si no lo es y lo muestra como
	 * valor absoluto. 
	 * 
	 * Es decir, el método es solo el control de la excepción, el resto
	 * del programa es fuera del método.
	 */
	public static void main (String[] args) {

		   int a=leeEntero();

		   if (a<0) a=-a;
		   System.out.println("El valor absoluto es "+a);
		 }
	
	public static int leeEntero() {
				
			Scanner sc = new Scanner(System.in);

			int a;

			System.out.print("Introduzca un n�mero y yo le indicar� su valor absoluto ");

			try {
				a = sc.nextInt();
			}
			catch (Exception ex) {
				System.out.println();
				System.out.println("Problemas. Probablemente no se introdujo un valor num�rico");
				System.out.println("Se considerar� introducido valor 1");
				System.out.println("Informacion t�cnica: " + ex.getMessage());
				System.out.println();
				a = 1;
			}
			return a;

		}

}
