package Pg3ev;

import java.io.BufferedReader;
import java.io.FileReader;
/*
 * Atienda al uso de BufferedReader y BufferedWriter, 
 * clases habituales para trabajar con archivos de texto. 
 */
public class Pg17_Ej3 {

	public static void main (String[] args) throws Exception {
	    
		/*
		 * Básicamente este código hace lo mismo que los anteriores, leer el archivo
		 * de texto pero con BufferedReader que es como una versión mejorada de FileReader,
		 * pero que también usa esta segunda clase. BufferedReader lee línea por línea en vez 
		 * de carácter por carácter.
		 * 
		 * Entonces, cuando el while lee una línea que es null, termina el while, mientras la 
		 * línea tenga algún carácter, leerá la línea, el mismo funcionamiento que en los
		 * códigos anteriores pero antes era !=-1 y ahora es !=null.
		 */
	    String miString;
	    BufferedReader fOrigen  = new BufferedReader(new FileReader(".\\src\\ejercicio03\\lineas.txt"));
	    
	    miString = fOrigen.readLine();
	    while (miString != null) {
	    	System.out.println(miString);
	        miString = fOrigen.readLine();
	    }
	    fOrigen.close();
	    
	  }

}
