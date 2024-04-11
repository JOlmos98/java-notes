package Pg1ev;

import javax.swing.JOptionPane;

public class Pg00_Ex3_Ej1 {

	public static void main(String[] args) {
		
		char[][] MatrizLetras= {
				{'A','M','A','R'},
				{'L','E','E','R'},
				{'S','A','P','O'},
				{'U','S','A','R'},
		};
		
		String[] ArrayPalabras=new String[4];
		ArrayPalabras[0]=JOptionPane.showInputDialog("Introduce en mayúsculas una palabra de cuatro letras(1):");
		ArrayPalabras[1]=JOptionPane.showInputDialog("Introduce en mayúsculas una palabra de cuatro letras(2):");
		ArrayPalabras[2]=JOptionPane.showInputDialog("Introduce en mayúsculas una palabra de cuatro letras(3):");
		ArrayPalabras[3]=JOptionPane.showInputDialog("Introduce en mayúsculas una palabra de cuatro letras(4):");
		
		System.out.println("Coinciden "+Palabras.palabrasMatriz(MatrizLetras, ArrayPalabras)+"/4 palabras.");
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////////

class Palabras{
	
	private static int contador=0;
	
	public static int palabrasMatriz(char[][] matriz, String[] palabras) {
		for (int i=0;i<matriz.length;i++) {
			for (int a=0;a<palabras.length;a++) {
				if (matriz[i][0]==palabras[a].charAt(0)&&matriz[i][1]==palabras[a].charAt(1)&&matriz[i][2]==palabras[a].charAt(2)&&matriz[i][3]==palabras[a].charAt(3)) contador++; 
			}
		}
		return contador;
	}
}
