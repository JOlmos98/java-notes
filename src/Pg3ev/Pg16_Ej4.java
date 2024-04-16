package Pg3ev;

import java.util.Scanner;

public class Pg16_Ej4 {

	/*
	 * Esto es más de lo mismo, no hay nada que resolver, sencillamente
	 * ahora el main es el manejo de excepciones, el método solo incluye
	 * el tema de scanner (en el 3 incluye el scanner y la excepcion)
	 * y de introducir el número y fuera del método también
	 * está al final del main la transformación del int en positivo si no lo está
	 * e imprimirlo por consola.
	 * 
	 * Una de las diferencias es también que esta vez, en vez de Exception, se usa
	 * NumberFormatException y a su vez el método de las excepciones .getMessage() 
	 * sí imprime algo interesante, si metemos un String imprime 
	 * "For input string: (el string en cuestión)", cosa que antes no funcionaba.
	 */
	 public static void main ( String[] args ) {

		   int a;

		   try {
		     a=leeEntero();
		   }
		   catch (NumberFormatException ex) {
			//   ex.printStackTrace();
		     System.out.println(); 
		     System.out.println("Problemas. Probablemente no se introdujo un valor num�rico");    
		     System.out.println("Se considerar� introducido valor 1"); 
		     System.out.println("Informaci�n t�cnica: " + ex.getMessage());
		     System.out.println();
		     a=1;
		   } 

		   if (a<0) a=-a;
		   System.out.println("El valor absoluto es "+a);
		 }
		 
		// ...
		 
		public static int leeEntero() {
			Scanner sc = new Scanner(System.in);

			int a;
			String s;

			System.out.print("Introduzca un numero y yo le indicare su valor absoluto ");
			s = sc.next();
			a = Integer.parseInt(s);
			sc.close(); 

			return a;
		}

}
