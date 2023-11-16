package Pg1ev;

import javax.swing.JOptionPane;

public class Pg08 {

	public static void main(String[] args) {
		//Esto de las vidas también podría ser método.
		int vidas=1; //Minas en 1.1/4.2/7.3/1.3/3.4/2.6
		buscaminas.gettablero();
		buscaminas.bienvenida();
		do {
			//hacer estos dos de abajo métodos también
			int f=Integer.parseInt(JOptionPane.showInputDialog("Introduce la fila de la casilla:\n(Del 0 al 7)"));
			int c=Integer.parseInt(JOptionPane.showInputDialog("Introduce la columna de la casilla:\n(Del 0 al 7)"));
			if (f==1&&c==1||f==4&&c==2||f==7&&c==3||f==1&&c==3||f==3&&c==4||f==2&&c==6) {
				
				buscaminas.bomba(f, c);
				vidas--;
			}
			//poner aqui los if de descubrimiento, si descubre el espacio de arriba, una de las tres casillas, descubrir las tres casillas, y así con todas. Pero con método.
			buscaminas.interaccion();
			if (vidas==1) buscaminas.gettablero(); else buscaminas.gettablerox();
			buscaminas.comprobacionvictoria();
			buscaminas.victoria();
		} while (vidas==1);
		if (vidas==0) buscaminas.hasperdido();
		
	}
}

//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////

//Clase y métodos:
class buscaminas{
	
	//Variables:
	private static String [][] tablero={
			{"O","O","O","O","O","O","O","O",},
			{"O","O","O","O","O","O","O","O",},
			{"O","O","O","O","O","O","O","O",},
			{"O","O","O","O","O","O","O","O",},
			{"O","O","O","O","O","O","O","O",},
			{"O","O","O","O","O","O","O","O",},
			{"O","O","O","O","O","O","O","O",},
			{"O","O","O","O","O","O","O","O",}
	};
	private static int interacciones=0;
	private static boolean victoria=false;
	
	//Métodos:
	public static String [][] gettablero(){
		
		for (int i=0;i<tablero.length;i++) {
			for (int j=0;j<tablero.length;j++) {
				System.out.print("|"+tablero[i][j]);
			}
			System.out.println("|");
		}
		return tablero;
	}
	public static String [][] gettablerox(){
		
		for (int i=0;i<tablero.length;i++) {
			for (int j=0;j<tablero.length;j++) {
				System.err.print("|"+tablero[i][j]);
			}
			System.err.println("|");
		}
		return tablero;
	}
	public static void bomba(int fila, int columna) {
		tablero[fila][columna]="X";
	}
	public static void bienvenida() {
		JOptionPane.showMessageDialog(null, "Bienvenido al Buscaminas.\nGanarás cuando descubras todas las casillas sin minas. \nSólo tienes una vida, elige bien las casillas.\n¡Buena suerte!");
	}
	public static void hasperdido() {
		JOptionPane.showMessageDialog(null, "¡Has destapado una mina!\nHas perdido.");
	}
	public static void interaccion() {
		interacciones++;
		System.out.println("\n\n\nInteracciones: "+interacciones);
	}
	public static void comprobacionvictoria() {
		if (tablero[0][5].equals(" ")&&tablero[0][6].equals(" ")&&tablero[0][7].equals(" ")&&tablero[3][0].equals(" ")&&tablero[4][0].equals(" ")&&tablero[5][0].equals(" ")&&tablero[6][0].equals(" ")&&tablero[6][1].equals(" ")&&tablero[7][0].equals(" ")&&tablero[7][1].equals(" ")&&tablero[4][5].equals(" ")&&tablero[4][6].equals(" ")&&tablero[4][7].equals(" ")&&tablero[5][4].equals(" ")&&tablero[5][5].equals(" ")&&tablero[5][6].equals(" ")&&tablero[5][7].equals(" ")&&tablero[6][5].equals(" ")&&tablero[6][6].equals(" ")&&tablero[6][7].equals(" ")&&tablero[7][5].equals(" ")&&tablero[7][6].equals(" ")&&tablero[7][7].equals(" ")&&
			tablero[0][0].equals("1")&&tablero[0][1].equals("1")&&tablero[0][3].equals("1")&&tablero[0][4].equals("1")&&tablero[1][0].equals("1")&&tablero[1][4].equals("1")&&tablero[1][5].equals("1")&&tablero[1][6].equals("1")&&tablero[1][7].equals("1")&&tablero[2][0].equals("1")&&tablero[2][1].equals("1")&&tablero[2][7].equals("1")&&tablero[3][1].equals("1")&&tablero[3][2].equals("1")&&tablero[3][6].equals("1")&&tablero[3][7].equals("1")&&tablero[4][1].equals("1")&&tablero[4][4].equals("1")&&tablero[5][1].equals("1")&&tablero[5][2].equals("1")&&tablero[5][3].equals("1")&&tablero[6][2].equals("1")&&tablero[6][3].equals("1")&&tablero[6][4].equals("1")&&tablero[7][2].equals("1")&&tablero[7][4].equals("1")&&
			tablero[0][2].equals("2")&&tablero[1][2].equals("2")&&tablero[2][2].equals("2")&&tablero[2][3].equals("2")&&tablero[2][4].equals("2")&&tablero[2][5].equals("2")&&tablero[3][3].equals("2")&&tablero[3][5].equals("2")&&tablero[4][3].equals("2")) victoria=true;
	}
	public static void victoria() {
		if (victoria==true) {
			JOptionPane.showMessageDialog(null, "¡HAS GANADO!");
			System.exit(0);
		}
	}
	
	
	
	
	
	
	
	
}