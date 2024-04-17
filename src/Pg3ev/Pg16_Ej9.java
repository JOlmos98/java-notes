package Pg3ev;

import java.io.FileReader;
import java.io.FileWriter;

public class Pg16_Ej9 {

	/*
	 * Parece que aquí esta todo resuelto pero el objetivo es
	 * aprender que hay gerarquía de excepciones y se pueden usar
	 * varios catch, por ejemplo, el primer catch con NumberFormatException,
	 * el segundo con IOException y el tercero con Exception.
	 * 
	 * Es decir, se empieza por el más concreto y específica y se van poniendo 
	 * después los que son menos precisos en orden.
	 */
	public static void main ( String[] args ) {
		   try {
		     copiaFichero("original.txt","copia.txt");
		   }
		   catch (Exception ex) {
			 ex.printStackTrace();  
		     System.out.println();
		     System.out.println("Parece que algunas excepcioes hay que tratarlas por fuerza.");
		     System.out.println("El compilador obliga.");
		     System.out.println("Luego hace falta un try{} catch{}.");
		     System.out.println("Algo ha pasado. Puede que el archivo original.txt no se encuentre.");
		   }
		   finally {
			   
		   }
		}
		
		public static void copiaFichero(String f1, String f2) throws Exception {

			FileReader fr = new FileReader(f1);
			FileWriter fw = new FileWriter(f2);

			int c = fr.read();
			while (c != -1) {
				fw.write(c);
				c = fr.read();
			}

			fw.close();
			fr.close();
		}

}
