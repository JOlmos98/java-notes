package Pg3ev;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
/*
 * Atienda al uso de BufferedReader y BufferedWriter, 
 * clases habituales para trabajar con archivos de texto. 
 */
public class Pg17_Ej4_Buffered {

	 public static void main (String[] args) throws Exception  {
		  
		 /*
		  * En este código cogemos el archivo lineas.txt que tiene escritas tres lineas en
		  * él y escribimos su contenido en renglones.txt, que no existe, por lo que se crea.
		  * 
		  * El String que vamos a escribir se obtiene mediante el método .readLine que lee 
		  * las lineas de lineas.txt. Entonces con el while sobreescribimos con los métodos
		  * .write y .newLine y actualizamos miString=fOrigen.readLine(); para que lea la
		  * siguiente linea y la sobreescriba también en la siguiente (gracias al método
		  * newLine()).
		  * 
		  * En el último trozo de código sencillamente se lee el archivo creado.
		  */
		BufferedReader fOrigen;
		BufferedWriter fDestino;
		
		// ...
		
	    fOrigen  = new BufferedReader( new FileReader("C:\\Users\\soler\\eclipse-workspace\\Java\\lineas.txt"));
	    fDestino = new BufferedWriter( new FileWriter("C:\\Users\\soler\\eclipse-workspace\\Java\\renglones.txt"));
	    
	    String miString = fOrigen.readLine();
	    while (miString!=null )
	    {
	        fDestino.write(miString);
	        fDestino.newLine();
	        miString = fOrigen.readLine();
	    }
		
	    fDestino.close();
	    fOrigen.close();

	    // ...
	    
	    				//Aquí, como el directorio pro defecto es el del propio proyecto, podemos poner el directorio así.
	    fOrigen  = new BufferedReader( new FileReader(".\\renglones.txt") );
	    
	    miString = fOrigen.readLine();
	    while ( miString != null ) {
		System.out.println(miString);
	        miString = fOrigen.readLine();
	    }
	    
	    fOrigen.close();

	   }

}
