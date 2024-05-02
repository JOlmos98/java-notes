package Pg3ev;

import java.util.Scanner;
/*
 * Observe el código y ejecute el archivo Ejercicio01.java . 
 * Introduzca, maliciosamente, como dato una cadena de 
 * caracteres y compruebe el error de ejecución. A 
 * continuación observe el archivo Ejercicio02.java y repita 
 * el mismo proceso con este programa. Observe Ejercicio03, 
 * idéntico al anterior, pero incorporando un método. 
 */
public class Pg15_Ej1 {

	//Copy paste del ejercicio que se proporciona.
	 public static void main (String[] args) {
	   Scanner sc = new Scanner(System.in);
	   
	   int    a;
	   String s;
	   
	   try {
	   System.out.print("Introduzca un n�mero y yo le indicar� su valor absoluto ");
	   s = sc.next();
	   a = Integer.parseInt(s);
	   
	   // si s no es una cadena integrada s�lo por caracteres '0' a '9',
	   // convertible a entero, dar� error de ejecucci�n

	   if (a<0) a=-a;
	   System.out.println("El valor absoluto es "+a);
	   } catch (NumberFormatException e) {
		   System.out.println("Error en el valor introducido. Debes introducir un int.");
	   } finally {
		   System.out.println("El programa ha terminado.");
	   }
	 }
}
