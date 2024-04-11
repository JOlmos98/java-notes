package Pg1ev;

import java.util.Arrays;
import java.util.Comparator;

//Ejercicio ordenar matriz.
public class Pg00_Ex1_Ej2 {

	public static void main(String[] args) {
		
		String[][] matriz1= {
				{"M","A","M","A"},
				{"B","O","L","A"},
				{"V","A","R","A"},
				{"P","A","S","A"},
				{"H","I","T","O"}
		};
		for (int i=0;i<matriz1.length;i++) {
			System.out.print("|");
			for (int a=0;a<matriz1[i].length;a++) {
				System.out.print(matriz1[i][a]+"|");
			}
			System.out.println();
		}
		//Invocamos el método de ordenar.
		Ordenar.OrdenarFilas(matriz1);
		//Imprimimos otra vez:
		System.out.println();
		for (int i=0;i<matriz1.length;i++) {
			System.out.print("|");
			for (int a=0;a<matriz1[i].length;a++) {
				System.out.print(matriz1[i][a]+"|");
			}
			System.out.println();
		}
	}
}


class Ordenar{
	
	public static void OrdenarFilas(String[][] matriz) {
        Arrays.sort(matriz, Comparator.comparing(arr -> arr[0]));
    }
	/*
	public static void OrdenarFilas(String [][] matriz) {
		for (int i=0;i<matriz.length;i++) {
			for (int h=0;h<matriz[i].length;h++) {
				if (matriz[i][h].equals("A")) Ordenar.IntercambiarFila(matriz, i, 0); 
				if ()
			}
		}
	}
	
	public static void IntercambiarFila (String [][] matriz, int f1, int f2) {
		Ordenar.IntercambiarStrings(matriz, f1, 0, f2, 0);
		Ordenar.IntercambiarStrings(matriz, f1, 1, f2, 1);
		Ordenar.IntercambiarStrings(matriz, f1, 2, f2, 2);
		Ordenar.IntercambiarStrings(matriz, f1, 3, f2, 3);
	}
	public static void IntercambiarStrings(String [][] matriz, int f1, int c1, int f2, int c2) {
		String aux="";
		aux=matriz[f1][c1];
		matriz[f1][c1]=matriz[f2][c2];
		matriz[f2][c2]=aux;
	}
	*/
}
