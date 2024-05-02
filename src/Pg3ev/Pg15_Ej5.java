package Pg3ev;

import java.util.Scanner;

public class Pg15_Ej5 {

	/*
	 * En este caso el método sigue siendo el tema de scanner y
	 * el main maneja las excepcionesy resuelve el programa transformando
	 * el int en positivo si no lo es e imprimiendo la respuesta, pero esta
	 * vez, no se por qjué motivo, un método intermediario contiene el método
	 * leeEntero, aparentemente no hace nada, es como si en vez de poner 
	 * directamente a=leeEntero() ponemos a=leeEnteroIntermediario() que
	 * no hace nada más sencillamente un método contiene otro.
	 * 
	 * No termino de entender la finalidad de contener al método dentro del otro.
	 */
	 public static void main ( String[] args ) {

		   int a;

		   try {
		     a=leeEnteroIntermediario();
		   }
		   catch (Exception ex) {
		     System.out.println(); 
		     System.out.println("Problemas. Probablemente no se introdujo un valor numerico");    
		     System.out.println("Se considerara introducido valor 1"); 
		     System.out.println("Informacion tecnica: " + ex.getMessage());
		     System.out.println();
		     a=1;
		   } 

		   if (a<0) a=-a;
		   System.out.println("El valor absoluto es "+a);
		 }
		 
		 // ...
		 
		 public static int leeEnteroIntermediario() {
			   return leeEntero();
		 }

		 // ...

		 public static int  leeEntero() {
		   Scanner sc = new Scanner(System.in); 
			 
		   int    a;
		   String s;

		   System.out.print("Introduzca un numero y yo le indicare su valor absooluto ");
		   s=sc.next();
		   a=Integer.parseInt(s);          
		   return a;
		 } 

}
