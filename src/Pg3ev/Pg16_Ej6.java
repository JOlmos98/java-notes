package Pg3ev;

import java.util.Scanner;

public class Pg16_Ej6 {

	/*
	 * Vale, en el ejercicio anterior no tenia sentido el .leeEnteroIntermediario()
	 * porque no hacía absolutamente nada, solo albergaba el método .leeEntero(), pero
	 * aquí el main solo tiene la resolución del programa (transofmrar el int e imprimir),
	 * el leeEntero() tiene el trozo de código de scanner y el leeEnteroIntermediario() esta 
	 * vez alberga el método leeEntero() con el manejo de excepciones, entonces tiene sentido.
	 */
	 public static void main (String[] args) {

		   int a;
		   a=leeEnteroIntermediario();
		   
		   if (a<0) a=-a;
		   System.out.println("El valor absoluto es "+a);
		 }
		 
		 // ...
		 
		 public static int leeEnteroIntermediario() {
		  try {
		     return leeEntero();
		   }
		   catch (Exception ex) {
		     System.out.println(); 
		     System.out.println("Problemas. Probablemente no se introdujo un valor numerico");    
		     System.out.println("Se considerara introducido valor 1"); 
		     System.out.println("Informacion tecnica: " + ex.getMessage());
		     System.out.println();
		     return 1;
		   } 
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
