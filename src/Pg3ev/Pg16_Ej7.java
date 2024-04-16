package Pg3ev;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Pg16_Ej7 {

	public static void main(String[] args) {
		copiaFichero("original.txt", "copia.txt");
	}

	public static void copiaFichero(String f1, String f2) {

		
		
		  
		  FileWriter fw = null;
		try {
			fw = new FileWriter(f2);
		    fw.write("Hola, mundo! Esto debería grabarse en la copia, pero no en el original.");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		  FileReader fr = null;
		try {
			fr = new FileReader(f1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  int c = 0;
		try {
			c = fr.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		  while ( c!= -1 ) {
			  try {
				fw.write(c);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			  try {
				c=fr.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		  }
		  
		  try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		  try {
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
	}

}
