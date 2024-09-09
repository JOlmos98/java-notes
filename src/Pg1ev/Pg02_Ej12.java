package Pg1ev;
/*
 * Realice un programa que lea un número entero correspondiente a una 
 * calificación y la muestre con el formato Insuficiente, Suficiente, ... Utilice 
 * switch.
 */
import javax.swing.JOptionPane;

public class Pg02_Ej12 {

	public static void main(String[] args) {
		
		int notamedia=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu nota media: "));
		switch (notamedia) {
		case 1: 
			System.out.println("Insuficiente bajo.");
			break;
		case 2: 
			System.out.println("Insuficiente.");
			break;
		case 3: 
			System.out.println("Insuficiente");
			break;
		case 4: 
			System.out.println("Insuficiente alto");
			break;
		case 5: 
			System.out.println("Suficiente.");
			break;
		case 6: 
			System.out.println("Bien.");
			break;
		case 7: 
			System.out.println("Notable.");
			break;
		case 8: 
			System.out.println("Notable alto.");
			break;
		case 9: 
			System.out.println("Sobresaliente.");
			break;
		case 10: 
			System.out.println("Sobresaliente alto.");
			break;
		}
	}

}
