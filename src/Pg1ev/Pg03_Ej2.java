package Pg1ev;

import javax.swing.JOptionPane;

/*
 * Programa que lea 5 números y cuente cuántos
 * de ellos son positivos. 
 */
public class Pg03_Ej2 {

	public static void main(String[] args) {
		
		int [] array1=new int[5];
		
		array1[0]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número(1): "));
		array1[1]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número(2): "));
		array1[2]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número(3): "));
		array1[3]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número(4): "));
		array1[4]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número(5): "));

		int contadorPositivos=0;
		
		for (int i=0;i<array1.length;i++) {
			if (array1[i]>0) contadorPositivos++;
		}
		System.out.println("El array tiene "+contadorPositivos+" números positivos.");
	}
}
