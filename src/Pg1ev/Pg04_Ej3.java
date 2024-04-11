package Pg1ev;

import javax.swing.JOptionPane;

/*
 * Programa que lea una secuencia de 10 
 * números y los muestre en orden inverso 
 * al de entrada. 
 */
public class Pg04_Ej3 {

	public static void main(String[] args) {
		
		int[] array1=new int[10];
		array1[0]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));
		array1[1]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));
		array1[2]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));
		array1[3]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));
		array1[4]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));
		array1[5]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));
		array1[6]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));
		array1[7]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));
		array1[8]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));
		array1[9]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));
		
		for (int i=0;i<array1.length;i++) System.out.print(array1[i]+" ");
		System.out.println();
		for (int i=9;i!=-1;i--) System.out.print(array1[i]+" ");
	}
}
