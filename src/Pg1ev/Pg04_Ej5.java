package Pg1ev;

import javax.swing.JOptionPane;

/*
 * Programa que almacene en un array los valores 
 * enteros 1-10 de manera desordenada. El programa 
 * debe pedir al usuario un dato (valor numérico 
 * entre 1 y 10) e indicarle en qué posición del 
 * array se encuentra el valor. Desarrolle un algoritmo eficiente.
 */
public class Pg04_Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array1= {1,5,4,7,6,9,8,10,2,3};
		
		int eleccion=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número del 1 al 10:"));
		
		for (int i=0;i<array1.length;i++) {
			if (eleccion==array1[i]) System.out.println("El número introducido se encuentra en la posición "+(i+1)+".");
		}
	}
}