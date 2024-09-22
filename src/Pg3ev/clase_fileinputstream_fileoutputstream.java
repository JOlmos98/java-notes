package Pg3ev;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class clase_fileinputstream_fileoutputstream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileOutputStream fos=new FileOutputStream("C:\\Users\\soler\\Downloads\\fichero_binario.ddr");
			FileInputStream fis=new FileInputStream("C:\\Users\\soler\\Downloads\\fichero_binario.ddr");
			
			//Esto graba o crea el archivo:
			String textoAMeter="Esto se graba (creando el documento) en el archivo ddr."; //Creamos el String a introducir.
			byte codBinarioDelText[]=textoAMeter.getBytes(); //Transformamos el String en un array de bytes para poder interpretarlo y grabarlo.
			fos.write(codBinarioDelText); 
			
			//Esto lee el archivo para imprimir:
			int valor=fis.read();
			while (valor!=-1) {
				System.out.print((char)valor);
				valor=fis.read();
				//Parece que funciona igual que el BufferedReader.
			}
			
			System.out.println(); //Un salto de línea para el "El progrmaa ha terminado."
			
		} catch (Exception e){
			System.out.println("Excepción.");
		}
		System.out.println("El programa ha terminado.");
	}
}
