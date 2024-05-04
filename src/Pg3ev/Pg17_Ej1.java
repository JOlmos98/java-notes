package Pg3ev;

import java.io.FileReader;
import java.io.IOException;

/*
 * Atienda al uso de FileReader y FileWriter, clases 
 * básicas para trabajar con archivos de texto.
 */
public class Pg17_Ej1 {

	  public static void main (String[] args) {
		  /*
		   * Habría que modificar el directorio del archivo para que funcione.
		   * 
		   * miEntero representa los caráceteres que va a leer, mientras sea distinto de -1
		   * seguirá leyendo, si es -1 significará que ha leido un espacio sin ningún carácter,
		   * ni siquiera un espacio en blanco, no hay carácter. Entonces deja de leer.
		   * 
		   * miCaracter se usa para, dentro del while, interpretar cada carácter casteándolo
		   * a char, es decir, si devuelve un int de 68 lo traduce a Unicode que seria el char 'D'.
		   * 
		   */
	    int  miEntero;
	    char miCaracter;

	    try
	    {
	       FileReader miArchivo = new FileReader(".\\src\\ejercicio01\\pepe.txt");

	       miEntero = miArchivo.read();
	       while ( miEntero != -1 ) 
	       {
	         miCaracter = (char) miEntero;
	         System.out.print(miCaracter);
	         miEntero = miArchivo.read();
	       }
	       miArchivo.close();

	    } catch (IOException ex) {}

	  }

}
