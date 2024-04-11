package Pg1ev;

import javax.swing.JOptionPane;

/*
 * Programa que lea diez números e indique 
 * cuántos de ellos pertenecen al rango 1-10 
 * y cuántos son mayores que 10. El programa 
 * sólo debe aceptar enteros positivos.
 */
public class Pg03_Ej5 {

	public static void main(String[] args) {
		
		int [] array1=new int[10];
		int contadorMayor=0;
		int contadorRango=0;
			for (int i=0;i<array1.length;i++) {
				array1[i]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número("+i+"): "));
				if (array1[i]>10) contadorMayor++;
				else if (array1[i]>0&&array1[i]<=10) contadorRango++;
			}
			
		System.out.println("Has introducido "+contadorRango+" números dentro del rango y "+contadorMayor+" mayores que 10.");
	}
}
