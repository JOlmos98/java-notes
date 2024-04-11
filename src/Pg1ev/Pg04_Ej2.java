package Pg1ev;

import javax.swing.JOptionPane;

/*
 * Programa que lea una secuencia de 10 
 * números enteros e indique cuáles son 
 * el mayor y el menor, y cuántas veces 
 * se repiten ambos. 
 */
public class Pg04_Ej2 {

	public static void main(String[] args) {
		
		int mayor=Integer.MIN_VALUE;
		int menor=Integer.MAX_VALUE;
		int contadormayor=0;
		int contadormenor=0;
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
		
		for (int i=0;i<array1.length;i++) {
			if (array1[i]>mayor) mayor=array1[i];
			if (array1[i]<menor) menor=array1[i];
		}
		for (int i=0;i<array1.length;i++) {
			if (array1[i]==mayor) contadormayor++;
			if (array1[i]==menor) contadormenor++;
			System.out.print(array1[i]+" ");
		}
		System.out.println("\nEl número mayor es el "+mayor+" y el menor es el "+menor+".\nEl mayor se repite "+contadormayor+" veces y el menor "+contadormenor+" veces.");
	}
}
