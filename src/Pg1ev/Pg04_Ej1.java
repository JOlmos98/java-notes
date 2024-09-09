package Pg1ev;

import javax.swing.JOptionPane;
/*
 * Programa que lea 5 números enteros 
 * e indique cuántos de ellos son 
 * superiores a la media.
 */
public class Pg04_Ej1 {

	public static void main(String[] args) {
		
		int media=0;
		int superiores=0;
		int[] array1=new int[5];
		array1[0]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));
		array1[1]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));
		array1[2]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));
		array1[3]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));
		array1[4]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));
		
		for (int i=0;i<array1.length;i++) {
			media=media+array1[i];
		}
		media=media/5;
		for (int a=0;a<array1.length;a++) if (array1[a]>media) superiores++;
		
		System.out.print("Hay "+superiores+" números superiores a la media.\nNúmeros: ");
		for (int i=0;i<array1.length;i++) System.out.print(array1[i]+" ");
		System.out.println("\nMedia: "+media);
	}
}
