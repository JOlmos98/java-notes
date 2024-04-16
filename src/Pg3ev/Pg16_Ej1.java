package Pg3ev;

import java.util.Scanner;

public class Pg16_Ej1 {

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
