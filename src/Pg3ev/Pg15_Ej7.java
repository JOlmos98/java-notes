package Pg3ev;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 * Intente compilar el archivo Ejercicio07.java. Asegúrese de tener el archivo original.txt 
en el directorio del proyecto. Un montón de errores relacionados con excepciones en 
el método copiaFichero(). Resulta que el método puede provocar algún tipo de 
excepción que forzosamente hay que tener en cuenta. Resuélvalo (Ejercicio8.java) 
agregando en copiaFichero() los bloques try{} catch{}. Después, compruebe también el 
funcionamiento en ausencia del archivo original.txt
 */
public class Pg15_Ej7 {

	/*
	 * En este ejercicio se nos proporciona un bloque de código en comentario,
	 * al quitar el comentario el código da error, sencillamente hay que meter 
	 * todo el bloque en un try y escribir el catch.
	 */
	public static void main(String[] args) {
		copiaFichero("original.txt", "copia.txt");
	}
	
	public static void copiaFichero(String f1, String f2) {
		
		try {
		  FileReader fr = new FileReader(f1);
		  FileWriter fw = new FileWriter(f2);
		  
		  int c=fr.read(); 
		  while ( c!= -1 ) {
			  fw.write(c); 
			  c=fr.read(); 
		  }
		  
		  fw.close(); 
		  fr.close();
		} catch (IOException e) {
			System.out.println("ERROR probablemente en el tema de la E/S: "+e);
		}
		 
	}

}
