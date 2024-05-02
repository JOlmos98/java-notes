package Pg3ev;

import javax.swing.JOptionPane;

/*
 * Desarrolle un juego basado en adivinar un número entre 20 y 80 elegido al azar por el 
programa. El usuario dispondrá de un máximo de diez intentos. Si el usuario introduce 
un número fuera del rango, el programa le permitirá rectificar sin contar ese intento. El 
programa acabará cuando el usuario agote sus intentos o acierte el número. A cada 
fallo del usuario, el programa indicará si el número a adivinar es mayor o menor que el 
introducido. Al finalizar, el programa informará al usuario del resultado del juego.
 */
public class Pg16_Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int RandomNum=generarNumero2080();
		bienvenidaJuego2080();
		juego2080EnEjecucion(RandomNum);
		/*
		 * Estas tres lineas de arriba también podrían
		 * ser un método en sí.
		 * De hecho, nos podríamos ahorrar una línea
		 * poniendo directamente como parametro el
		 * método generarNumero2080() así:
		 * juego2080EnEjecucion(generarNumero2080());
		 */
	}
	
	////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////

	public static int generarNumero2080() {
		int a=0;
		while (a<20||a>80) {
			a=(int)(Math.random()*100);
		}
		return a;
	}
	
	public static void bienvenidaJuego2080() {
		JOptionPane.showMessageDialog(null, "Bienvenido al juego 20-80\n\nEstas son las reglas:\n1. Debes adivinar un número generado aleatoriamente entre 20 y 80.\n\n2. Tienes diez intentos para introducir un número dentro del rango.\n\n3. En cada fallo se indicará si el número a adivinar es mayor o menor que el introducido.\n\n4. Si se introduce un carácter fuera del rango 20-80 o que no sea un número entero\npositivo, no contará como un intento consumido.");
	}
	
	public static void juego2080EnEjecucion(int RandomNum) {
		int vidas=10;
		int a=0;
		do {
			a=Integer.parseInt(JOptionPane.showInputDialog("(Tienes "+vidas+" vidas)"+"\nINTRODUCE UN NUMERO: "));
			if (a==RandomNum) JOptionPane.showMessageDialog(null, "(Tienes "+vidas+" vidas)\n¡¡¡FELICIDADES!!!\nHas acertado el número generado aleatoriamente.\nEl número es: "+RandomNum);
			else if (a<20||a>80) JOptionPane.showMessageDialog(null, "Has introducido un número fuera del rango 20-80.");
			else if (a<RandomNum) {
				vidas--;
				JOptionPane.showMessageDialog(null, "(Tienes "+vidas+" vidas)\nEl número introducido es MENOR que el generado.");
			}
			else if (a>RandomNum) {
				vidas--;
				JOptionPane.showMessageDialog(null, "(Tienes "+vidas+" vidas)\nEl número introducido es MAYOR que el generado.");
			}
			else JOptionPane.showMessageDialog(null, "(Tienes "+vidas+" vidas)\nError al introducir el número."); 
		} while (a!=RandomNum&&vidas!=0);
		if (vidas==0) JOptionPane.showMessageDialog(null, "HAS PERDIDO.\nTe has quedado sin vidas.");
	}
}
