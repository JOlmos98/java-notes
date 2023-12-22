package Pg1ev;

import javax.swing.JOptionPane;

/*
 * Programa que almacene en un array valores 
 * enteros (en el rango 1-10) de manera desordenada. 
 * El programa debe pedir al usuario un dato (valor 
 * numérico) e indicarle si está en el array o no, 
 * y en caso afirmativo indicar su posición.
 */
public class Pg04_Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array1= {1,5,4,7,6,9,8,10,2,3};
		
		int eleccion=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número del 1 al 10:"));
		
		if (eleccion>=1&&eleccion<=10) {
		for (int i=0;i<array1.length;i++) {
			if (eleccion==array1[i]) System.out.println("El número introducido se encuentra en la posición "+(i+1)+".");
		} 
		} else JOptionPane.showMessageDialog(null, "El número introducido no está en el array.");
	}
}
