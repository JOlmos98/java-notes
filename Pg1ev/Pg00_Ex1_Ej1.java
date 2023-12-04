package Pg1ev;

import javax.swing.JOptionPane;

public class Pg00_Ex1_Ej1 {

	public static void main(String[] args) {
		
		//Matriz de ejemplo:
		
		int[][] MatrizGr={
				{1,2,3,4,5}, 
				{5,4,3,2,1},
				{6,7,8,9,0},
				{0,9,8,7,6},
				{1,3,5,7,9}
		};
		
		int[][] MatrizPq=new int[2][2];
			MatrizPq[0][0]=Integer.parseInt(JOptionPane.showInputDialog("Almacena un número en la posición [0][0]:"));
			MatrizPq[0][1]=Integer.parseInt(JOptionPane.showInputDialog("Almacena un número en la posición [0][1]:"));
			MatrizPq[1][0]=Integer.parseInt(JOptionPane.showInputDialog("Almacena un número en la posición [1][0]:"));
			MatrizPq[1][1]=Integer.parseInt(JOptionPane.showInputDialog("Almacena un número en la posición [1][1]:"));
		
		for (int i=0;i<MatrizPq.length;i++) {
			for (int a=0;a<MatrizPq.length;a++) {
				System.out.print(MatrizPq[i][a]+" ");
			} System.out.println();
		}
		System.out.println();
		
		for (int i=0;i<MatrizGr.length;i++) {
			for (int a=0;a<MatrizGr.length;a++) {
				System.out.print(MatrizGr[i][a]+" ");
			} System.out.println();
		}
		
		if (Matriz.MatrizContenida(MatrizGr, MatrizPq)==true) System.out.println("La matriz peqeña SI está contenida en la grande.");
		else System.out.println("La matriz pequeña NO está en la grande.");
		
	}
}

class Matriz{
	/*
	public static boolean MatrizContenida(int[][] mgrande, int[][] mpequeña) {
		boolean booleanfor=true;
		for (int i=0;i<mgrande.length-mpequeña.length;i++) {
			for (int a=0;a<mgrande[i].length-mpequeña[0].length;a++) {
				for (int b=0;b<mpequeña.length;b++) {
					for (int c=0;c<mpequeña[b].length;c++) {
						if (mgrande[i][a]==mpequeña[b][c]&&mgrande[i][a+1]==mpequeña[b][c+1]&&mgrande[i+1][a]==mpequeña[b+1][c]&&mgrande[i+1][a+1]==mpequeña[b+1][c+1]) {
							booleanfor=true;
						}
					}
				}
			}
		}
		return booleanfor;
	}
	*/
	
	public static boolean MatrizContenida(int[][] mgrande, int[][] mpequeña) {
	    for (int i = 0; i <= mgrande.length - mpequeña.length; i++) {
	        for (int j = 0; j <= mgrande[0].length - mpequeña[0].length; j++) {
	            boolean encontrada = true;
	            for (int k = 0; k < mpequeña.length && encontrada; k++) {
	                for (int l = 0; l < mpequeña[0].length && encontrada; l++) {
	                    if (mgrande[i + k][j + l] != mpequeña[k][l]) {
	                        encontrada = false;
	                    }
	                }
	            }
	            if (encontrada) {
	                return true; // Se encontró la submatriz pequeña en la posición (i, j)
	            }
	        }
	    }
	    return false; // La submatriz pequeña no se encontró en la matriz grande
	}
}

