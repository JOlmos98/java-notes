package Pg1ev;

import javax.swing.JOptionPane;

/*
 * Programa que lea cinco números enteros 
 * y obtenga e imprima el mayor de ellos.
 */
public class Pg03_Ej6 {

	public static void main(String[] args) {
		
		int [] array1=new int[5];
		
		array1[0]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número(1): "));
		array1[1]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número(2): "));
		array1[2]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número(3): "));
		array1[3]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número(4): "));
		array1[4]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número(5): "));
		
		int Mayor=0;
		
		for (int i=0;i<array1.length;i++) {
			if (array1[i]>Mayor) Mayor=array1[i];
		}
		System.out.println("El número mayor es: "+Mayor+".");
	}
}
