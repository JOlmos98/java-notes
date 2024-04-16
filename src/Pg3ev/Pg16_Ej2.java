package Pg3ev;

import java.util.Scanner;

public class Pg16_Ej2 {
	/*
	 * Copy paste del ejercicio 2, no hay que resolverlo,
	 * sencillamente nos muestra como se resuelve el 1,
	 * que ya lo he resuelto yo previamente de otra forma en 
	 * el 1, pero aquí lo hace más correctamente.
	 * 
	 * Aquí modifica el valor para que se reproduzca todo el codigo y 
	 * además nos aporta información sobre el error en la linea
	 * que imprime "Información técnica". Corrijo, no aporta ninguna
	 * información extra porque el método e.getMessage() nos devuelve
	 * null, pongamos un String o pongamos un double sigue devolviendo
	 * null.
	 * 
	 * Parece que poner NumberFormatException y Exception hace lo mismo.
	 */
	 public static void main (String[] args)
	 {
	   Scanner sc = new Scanner(System.in);

	   int    a;

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

	   if (a<0) a=-a;
	   System.out.println("El valor absoluto es "+a);
	   
	   sc.close();
	 }

}
