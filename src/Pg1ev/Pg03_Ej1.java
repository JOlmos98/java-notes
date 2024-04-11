package Pg1ev;

import javax.swing.JOptionPane;
/*
 * Programa que lea repetidamente un número 
 * entero hasta recibir un valor 
 * entre 1 y 10. 
 */
public class Pg03_Ej1 {

	public static void main(String[] args) {
		
		int num=0;
		
		do {
			num=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entre 1 y 10:"));
		} while (num<=0||num>10);
		JOptionPane.showMessageDialog(null, "El número seleccionado es: "+num+".");
	}
}
