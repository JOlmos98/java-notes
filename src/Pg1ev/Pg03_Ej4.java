package Pg1ev;

import javax.swing.JOptionPane;

/*
 * Programa que lea números enteros 
 * hasta la introducción de un 0 e 
 * indique cuántos positivos y negativos ha leído.
 */
public class Pg03_Ej4 {

	public static void main(String[] args) {
		
		int tamaño=1;
		
		int [] array1=new int[tamaño];
		
		int contadorPositivos=0;
		int contadorNegativos=0;
		boolean cero=false;
		
		do {
			array1[tamaño-1]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));
			if (array1[tamaño-1]==0) cero=true;
			else {
				if (array1[tamaño-1]>0) contadorPositivos++;
				else if (array1[tamaño-1]<0) contadorNegativos++;
				tamaño++;
				array1=new int[tamaño];
			}
		} while (cero==false);
		
		System.out.println("Has introducido "+contadorPositivos+" números positivos y "+contadorNegativos+" números negativos.");
		
	}
}