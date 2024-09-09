package Pg1ev;

import javax.swing.JOptionPane;

public class Pg00_Ex3_Ej3 {

	public static void main(String[] args) {
		
		char [][] TableroTerminado= {
				{'X','O','X'},
				{'O','X',' '},
				{'O','O',' '}
		};
		
		String caracterString=JOptionPane.showInputDialog("Introduce el carácter en la posición [2][2] del tablero:");
		char caracter=caracterString.charAt(0);
		
		if (Comprobacion.haGanado(TableroTerminado, 2, 2, caracter)==true) {
			if (caracter=='X') System.out.println("Ha ganado el jugador X.");
			if (caracter=='O') System.out.println("Ha ganado el jugador O.");
		} 
		/*
		 * Si se cambia el tablero y se ingresa el char en otro lugar,
		 * también comprueba si ha ganado X u O, pero he puesto el ejemplo
		 * para que puedan ganar ambos. 
		 * También creo que hay un par de cosas redundantes en el código.
		 */
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////////

class Comprobacion{
	
	//Variables:
	private static boolean GanadorX=false;
	private static boolean GanadorO=false;
	private static boolean NadieGana=false;
	
	//Método:
	public static boolean haGanado(char[][] tablero, int fila, int columna, char caracter) {
		
		if (caracter=='X'||caracter=='O') {
		for (int i=0;i<tablero.length;i++) {
				tablero[fila][columna]=caracter;
				for (int a=0;a<tablero[i].length;a++) {
					if (tablero[i][0]==caracter&&tablero[i][1]==caracter&&tablero[i][2]==caracter) {
						if (caracter=='X') GanadorX=true;
						if (caracter=='O') GanadorO=true;
						//Comprobación de ganador por filas.
					}
					else if (tablero[0][a]==caracter&&tablero[1][a]==caracter&&tablero[2][a]==caracter) {
						if (caracter=='X') GanadorX=true;
						if (caracter=='O') GanadorO=true;
						//Comprobación de ganador por columnas.
					}
					else if (tablero[0][0]==caracter&&tablero[1][1]==caracter&&tablero[2][2]==caracter||tablero[0][2]==caracter&&tablero[1][1]==caracter&&tablero[2][0]==caracter) {
						if (caracter=='X') GanadorX=true;
						if (caracter=='O') GanadorO=true;
						//Comprobación de ganador por diagonales.
					}
				}
			} 
		} else System.out.println("El carácter introducido NO es válido.");
		if (GanadorX) {
			return GanadorX;
		} else if (GanadorO) {
			return GanadorO;
		} return NadieGana;
		
	}
}