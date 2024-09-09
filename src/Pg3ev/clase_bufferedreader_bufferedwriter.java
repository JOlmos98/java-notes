package Pg3ev;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class clase_bufferedreader_bufferedwriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (
			BufferedWriter bw1=new BufferedWriter(new FileWriter("C:\\Users\\soler\\Downloads\\buffered.txt", true));
			BufferedReader br1=new BufferedReader(new FileReader("C:\\Users\\soler\\Downloads\\buffered.txt"));
			) {
			bw1.write("Escribimos con buffered.");
			bw1.newLine();
			bw1.write(JOptionPane.showInputDialog("Escribe lo que quieras en la segunda línea del buffered.txt: "));
			bw1.flush(); //Vaciamos búfer y forzamos la escritura.
			
			String leerlinea;
			while ((leerlinea=br1.readLine())!=null) {
				System.out.println(leerlinea);
			}
			
		} catch (IOException e) {
			System.out.println("Algo ha ido mal, probablemente la E/S: "+e);
		}
		
		
	}

}
