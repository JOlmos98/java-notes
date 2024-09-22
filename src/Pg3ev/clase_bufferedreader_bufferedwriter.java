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
//Todo el código explciado por chatGPT:

/*
public static void main(String[] args) {
// El método 'main' es el punto de entrada de la aplicación. Se ejecuta cuando inicias el programa.

try (
    // Se crea un BufferedWriter para escribir en el archivo "buffered.txt" en modo de anexado (true).
    BufferedWriter bw1 = new BufferedWriter(new FileWriter("C:\\Users\\soler\\Downloads\\buffered.txt", true));
    
    // Se crea un BufferedReader para leer desde el archivo "buffered.txt".
    BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\soler\\Downloads\\buffered.txt"));
) {
    // Escribimos una línea de texto en el archivo "buffered.txt".
    bw1.write("Escribimos con buffered.");
    
    // Insertamos una nueva línea en el archivo.
    bw1.newLine();
    
    // Mostramos un cuadro de diálogo para que el usuario introduzca un texto,
    // y lo escribimos en el archivo en la siguiente línea.
    bw1.write(JOptionPane.showInputDialog("Escribe lo que quieras en la segunda línea del buffered.txt: "));
    
    // Vaciamos el búfer y forzamos la escritura de los datos en el archivo.
    bw1.flush();
    
    // Variable para almacenar cada línea que leemos del archivo.
    String leerlinea;
    
    // Bucle que lee línea por línea del archivo hasta que no haya más líneas (null).
    while ((leerlinea = br1.readLine()) != null) {
        // Mostramos en consola cada línea leída.
        System.out.println(leerlinea);
    }
    
} catch (IOException e) {
    // Si ocurre algún error de entrada/salida, lo capturamos y mostramos el mensaje de error en consola.
    System.out.println("Algo ha ido mal, probablemente la E/S: " + e);
}

}
*/