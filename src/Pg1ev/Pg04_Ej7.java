package Pg1ev;
/*
 * Programa que lea una matriz de 2 filas 
 * y 3 columnas con números enteros, imprimiendo 
 * los valores máximo y mínimo y sus posiciones 
 * dentro de la tabla.
 */
public class Pg04_Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] tabla1= {
				{23,54,65},
				{61,26,83},
		}; 
		int mayor=Integer.MIN_VALUE;
		int menor=Integer.MAX_VALUE;
		for (int i=0;i<tabla1.length;i++) {
			for (int a=0;a<tabla1[i].length;a++) {
				if (tabla1[i][a]<menor) menor=tabla1[i][a];
				if (tabla1[i][a]>mayor) mayor=tabla1[i][a];
			}
		}
		for (int i=0;i<tabla1.length;i++) {
			for (int a=0;a<tabla1[i].length;a++) {
				if (mayor==tabla1[i][a]) System.out.println("El número mayor es "+mayor+" y se encuentra en la fila "+(i+1)+" columna "+(a+1)+".");
				if (menor==tabla1[i][a]) System.out.println("El número menor es "+menor+" y se encuentra en la fila "+(i+1)+" columna "+(a+1)+".");
			}
		}
	}
}
