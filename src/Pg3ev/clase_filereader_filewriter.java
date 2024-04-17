package Pg3ev;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class clase_filereader_filewriter {

	/*
	 * El directorio del archivo por defecto donde lo lee es
	 * la propia carpeta del proyecto, es decir, sin entrar 
	 * a la carpeta src.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileWriter fw1=new FileWriter("C:\\Users\\soler\\Downloads\\archivo50.txt", true); //Especificamos directorio del nuevo .txt, si existe lo sobreescribe, si no, lo crea.
			//Si ponemos true como segundo parámetro al crear el FileWriter, escribirá a partir del final de lo que ya hay escrito.
			fw1.write("Escribimos dentro del archivo. Patat");
			fw1.write(97); //Escribimos una a en ASCII para completar "Patata".
			fw1.write("\r\n"); //Salto de línea.
			fw1.write(JOptionPane.showInputDialog("Escribe lo que quieres insertar en la segunda línea del archivo50.txt:"));
			fw1.flush(); //Vacía el búfer y fuerza la escritura en el archivo.
			fw1.close(); //Cerramos para que se guarden los cambios.
			
			FileReader fr1=new FileReader("C:\\Users\\soler\\Downloads\\archivo50.txt");
			int n=fr1.read(); //Hay que declarar la variable porque si usamos directamente la función, imprime saltandose letras, idk why.
			while(n!=-1) {
				System.out.print((char)n);
				n=fr1.read();
			}
			fr1.close();
		} catch (IOException e) {
			System.out.println("Error de E/S o I/O: "+e);
		}
		
		
	}

}
