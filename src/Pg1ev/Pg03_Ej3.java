package Pg1ev;

import javax.swing.JOptionPane;

/*
 * Programa que lea una secuencia 
 * de 10 números y obtenga cuántos hay 
 * positivos, negativos y nulos. 
 */
public class Pg03_Ej3 {

	public static void main(String[] args) {
		
		int [] array1=new int[10];
		
		array1[0]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número(1): "));
		array1[1]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número(2): "));
		array1[2]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número(3): "));
		array1[3]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número(4): "));
		array1[4]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número(5): "));
		array1[5]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número(6): "));
		array1[6]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número(7): "));
		array1[7]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número(8): "));
		array1[8]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número(9): "));
		array1[9]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número(10): "));
		
		int contadorPositivos=0;
		int contadorNegativos=0;
		int contadorCeros=0;
		
		for (int i=0;i<array1.length;i++) {
			if (array1[i]>0) contadorPositivos++;
			else if (array1[i]==0) contadorCeros++;
			else if (array1[i]<0) contadorNegativos++;
		}
		System.out.println("Los números del array son: \nPositivos: "+contadorPositivos+"\nNegativos: "+contadorNegativos+"\nCeros: "+contadorCeros);
	}
}