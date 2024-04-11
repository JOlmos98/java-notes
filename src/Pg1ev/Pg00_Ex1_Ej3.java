package Pg1ev;

import javax.swing.JOptionPane;

public class Pg00_Ex1_Ej3 {

	public static void main(String[] args) {
		
		Juego2080.IniciarJuego2080();
	}
}

///////////////////////////////////////////////////////////////////////////////////////////////

class Juego2080 {
	//Variables:
	private static int num=0;
	private static int vidas=6;
	private static int numIntroducido=0;
	
	//Método principal:
	public static void IniciarJuego2080() {
		Juego2080.Bienvenida();
		Juego2080.GenerarNumero();
		Juego2080.Iniciar();
	}
	//Métodos:
	public static void GenerarNumero() {
		while (num>80||num<20) num=(int)(Math.random()*100);
	}
	public static void Bienvenida() {
		JOptionPane.showMessageDialog(null, "Bienvenido al juego 20-80.\nTienes que adivinar un número generado aleatoriamente entre el 20 y el 80.\nTienes 6 intentos.");
	}
	
	public static void Iniciar() {
		do {
			numIntroducido=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número:"));
			if (numIntroducido!=num) {
				vidas--;
				if (num<numIntroducido) {
					JOptionPane.showMessageDialog(null, "El número que has introducido es MAYOR al objetivo.\nTe quedan "+vidas+" vidas.");
				} else if (num>numIntroducido) JOptionPane.showMessageDialog(null, "El número que has introducido es MENOR al objetivo.\nTe quedan "+vidas+" vidas.");
			}
			else {
				JOptionPane.showMessageDialog(null, "¡HAS ACERTADO EL NÚMERO!\nTe quedaban "+vidas+" vidas.");
				System.exit(0);
			}
		} while (vidas!=0);
		if (vidas==0) JOptionPane.showMessageDialog(null, "¡HAS PERDIDO!\nTe has quedado sin vidas.");
	}
}