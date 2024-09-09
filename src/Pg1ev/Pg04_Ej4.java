package Pg1ev;

import javax.swing.JOptionPane;

/*
 * Programa que obtenga las 10 notas numéricas 
 * enteras (de 0 a 10) correspondientes a la 
 * calificación de cada uno de los miembros de 
 * un tribunal de oposición. El programa debe 
 * obtener e imprimir la nota media. Considere 
 * que si la mejor calificación y la peor difieren 
 * en 3 o más puntos ambas se eliminan del cálculo de la media. 
 */
public class Pg04_Ej4 {

	public static void main(String[] args) {
		
		int[] notas=new int[10];
		notas[0]=Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota(1):"));
		notas[1]=Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota(2):"));
		notas[2]=Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota(3):"));
		notas[3]=Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota(4):"));
		notas[4]=Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota(5):"));
		notas[5]=Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota(6):"));
		notas[6]=Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota(7):"));
		notas[7]=Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota(8):"));
		notas[8]=Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota(9):"));
		notas[9]=Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota(10):"));
		
		int mayor=Integer.MIN_VALUE;
		int menor=Integer.MAX_VALUE;
		int media=0;
		
		for (int ternario:notas) {
			if (notas[ternario]>mayor) mayor=notas[ternario];
			if (notas[ternario]<menor) menor=notas[ternario];
			media=media+notas[ternario];
		}
		if ((mayor-menor)>=3) {
			media=media-mayor-menor;
			media=media/8;
			System.out.println("Se eliminan el menor ("+menor+") y el mayor ("+mayor+") por diferenciarse en 3 o más.");
		} else media=media/10;
		
		System.out.println("La media, teniendo en cuenta los requisitos, es: "+media+"\nLas notas han sido: ");
		for (int i:notas) System.out.print(notas[i]+" ");
		
	}
}