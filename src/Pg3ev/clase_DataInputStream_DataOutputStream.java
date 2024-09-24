package Pg3ev;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class clase_DataInputStream_DataOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			//Escribimos:
			DataOutputStream dos=new DataOutputStream(new FileOutputStream("C:\\Users\\soler\\Downloads\\pruebaDataOutputStream.ddr"));
			//Escribimos un número
			dos.writeInt(856);
			//Escribimos una cadena
			dos.writeUTF(" - Archivo creado con DataOutputStream - ");
			//Escribimos un número again
			dos.writeInt(34);
			
			//Leemos:
			DataInputStream dis=new DataInputStream(new FileInputStream("C:\\Users\\soler\\Downloads\\pruebaDataOutputStream.ddr"));
			//Leemos un número e imprimimos:
			System.out.println(dis.readInt());
			//Leemos la cadena:
			System.out.println(dis.readUTF());
			//Leemos el segundo número:
			System.out.println(dis.readInt());
			
		}catch(Exception e) {
			System.err.println("Vaya, error.");
		}
		System.out.println("El programa ha terminado.");
	}	
}