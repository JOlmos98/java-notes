package Pg3ev;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ejemplo_filereader_filewriter {

	/*
	 * El directorio del archivo por defecto donde lo lee es
	 * la propia carpeta del proyecto, es decir, sin entrar 
	 * a la carpeta src.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (FileWriter fw = new FileWriter("archivo.txt")) {
		    fw.write("Hola, mundo! Esto debe grabarse delante del 'ke' y después leerse.");
		} catch (IOException e) {
		    e.printStackTrace();
		    System.out.println("No se ha escrito bien en el documento.");
		}
		
		////////////////////////////////////////
		
		try (FileReader fr = new FileReader("archivo.txt")) {
		    int c;
		    while ((c = fr.read()) != -1) {
		        System.out.print((char) c);
		    }
		    /*
		     * El método .read de FileReader lee un solo carácter 
		     * del archivo y devuelve su valor numérico, o -1 si 
		     * llega al final del archivo.
		     */
		} catch (IOException e) {
		    e.printStackTrace();
		    System.out.println("El programa no ha funcionado correctamente.");
		}
		
		
	}

}
