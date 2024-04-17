package Pg3ev;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Pg16_Ej7 {

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
