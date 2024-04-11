package Pg1ev;

import javax.swing.JOptionPane;

/*
 * Programa que a partir de una matriz de enteros 
 * de 4 filas y 5 columnas que almacene los números 
 * 1-20 de manera desordenada, le pida al usuario un 
 * dato (valor numérico entero entre 1 y 20) y le 
 * indique en qué posición (fila y columna) de la 
 * matriz se encuentra el valor. Desarrolle un algoritmo eficiente. 
 */
public class Pg04_Ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matriz= {
				{3,11,2,16,1},
				{4,13,5,15,17},
				{7,12,8,18,20},
				{9,14,6,19,10}
		};
		
		int seleccion=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entre el 1 y el 20:"));
		
		if (seleccion<=20&&seleccion>=1) {
			for (int i=0;i<matriz.length;i++) {
				for (int a=0;a<matriz[i].length;a++) {
					if (seleccion==matriz[i][a]) System.out.println("El número seleccionado se encuentra en la fila "+i+" columna "+a+".");
				}
			}
		} else System.out.println("El número seleccionado NO es válido.");
	} 	
}
