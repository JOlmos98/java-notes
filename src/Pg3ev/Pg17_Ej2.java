package Pg3ev;

import java.io.FileReader;
import java.io.FileWriter;
/*
 * Atienda al uso de FileReader y FileWriter, clases 
 * básicas para trabajar con archivos de texto.
 */
public class Pg17_Ej2 {

	 public static void main (String[] args) throws Exception{
		  
		 /*
		  * Habría que cambiar los directorios para que funcionase.
		  * 
		  * En este código escribimos la frase "Archivo mitexto.txt" dentro de mitexto.txt
		  * con un bucle for, el String miFrase contiene lo que vamos a escribir,
		  * el bucle for recorre el String y lo castea a int, escribiéndolo con el
		  * método .write de FileWriter, más abajo leemos con un while los int escritos 
		  * y los casteamos a char para que los vaya imprimiendo y así lo logramos leer
		  * por consolar, lo mismo que en el ejercicio 1.
		  */
	    FileWriter fDestino = new FileWriter(".\\src\\ejercicio02\\mitexto.txt");
	    
	    String miFrase = "Archivo mitexto.txt";
	    for ( int i=0; i< miFrase.length(); i++) fDestino.write((int)miFrase.charAt(i));

	    fDestino.close();

	    // ...

	    int miEntero = 0;
	    FileReader fOrigen = new FileReader(".\\src\\ejercicio02\\mitexto.txt");

	    miEntero = fOrigen.read();
	    while  ( miEntero != -1 )
	    {
	       System.out.print((char)miEntero);
	       miEntero = fOrigen.read();  
	    }

	    fOrigen.close();

	  }

}
