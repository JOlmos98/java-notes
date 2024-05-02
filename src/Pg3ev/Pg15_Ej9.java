package Pg3ev;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 * Intente hacer el tratamiento de la excepción, no en el método copiaFichero() sino en 
main(). Arregle errores de compilación hasta que sólo le queden unos cuantos diciendo 
cosas como “Unreported Exception”. En clase se le explicará cómo lanzar la excepción 
para informar al método llamador de que está pendiente de ser tratada.

Si en el método copiaFichero() dejó el bloque try{} y eliminó el bloque catch{} 
necesitará poner un bloque finally{}. (Siempre tendrá que usar uno o ambos) .Tras 
mostrarle la versión final, razone por qué en este caso hemos puesto, o no, los 
bloques try{}, catch{} y finally{} y si se puede hacer de modo alternativo.
Este ejercicio (Ejercicio 9) servirá para introducir el concepto jerarquía de excepciones
en Java. A continuación, rehaga Ejercicio04.java, no capture Exception sino una 
excepción más concreta (Ejercicio 10). 
 */
public class Pg15_Ej9 {

	/*
	 * Parece que aquí esta todo resuelto pero el objetivo es
	 * aprender que hay gerarquía de excepciones y se pueden usar
	 * varios catch, por ejemplo, el primer catch con NumberFormatException,
	 * el segundo con IOException y el tercero con Exception, que es el más general.
	 * 
	 * Es decir, se empieza por el más concreto y específica y se van poniendo 
	 * después los que son menos precisos en orden.
	 */
	public static void main ( String[] args ) {
		   try {
		     copiaFichero("original.txt","copia.txt");
		   }
		   catch (NumberFormatException e) {
				 e.printStackTrace();  
			     System.out.println();
			     System.out.println("Parece que algunas excepcioes hay que tratarlas por fuerza.");
			     System.out.println("El compilador obliga.");
			     System.out.println("Luego hace falta un try{} catch{}.");
			     System.out.println("Algo ha pasado. Puede que el archivo original.txt no se encuentre.");
		   } catch (IOException e) {
				 e.printStackTrace();  
			     System.out.println();
			     System.out.println("Parece que algunas excepcioes hay que tratarlas por fuerza.");
			     System.out.println("El compilador obliga.");
			     System.out.println("Luego hace falta un try{} catch{}.");
			     System.out.println("Algo ha pasado. Puede que el archivo original.txt no se encuentre.");
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
