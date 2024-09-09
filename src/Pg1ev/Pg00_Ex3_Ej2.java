package Pg1ev;

public class Pg00_Ex3_Ej2 {

	public static void main(String[] args) {
		
		int[] array1= {-5,6,2,0,-4,2,-6,2,-6,1,8};
		
		int[] SoloLosPositivos=ArrayPositivos.datosPositivos(array1);
		
		for (int i=0;i<SoloLosPositivos.length;i++) {
			System.out.print(SoloLosPositivos[i]+" ");
		}
		
	}
}

//////////////////////////////////////////////////////////////////////////////////////////////

class ArrayPositivos{
		
		private static int numPositivos=0;
		private static int posicion=0;
		private static int [] arrayPositivos=new int[numPositivos];
		
	public static int[] datosPositivos(int[] datos) {
		for (int a=0;a<datos.length;a++) {
			if (datos[a]>0) numPositivos++;
		}
		
		arrayPositivos=new int[numPositivos];
		
		for (int i=0;i<datos.length;i++) {
			if (datos[i]>0) {
				arrayPositivos[posicion]=datos[i];
				posicion++;
			}
		}
		return arrayPositivos;
	}
}