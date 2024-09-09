package Pg3ev;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Pg15_Ej8 {
/*
 * Esto es el 7 medio corregido.
 */
	public static void main(String[] args) {
		copiaFichero("original.txt", "copia.txt");
	}

	public static void copiaFichero(String f1, String f2) {
		try {
			FileReader fr = new FileReader(f1);
			FileWriter fw = new FileWriter(f2, true);
			
			fw.write(JOptionPane.showInputDialog("Escribe lo que deseas insertar en copia.txt:"));
			int c = fr.read();
			while (c != -1) {
				fw.write(c);
				c = fr.read();
			}
			fw.close();
			fr.close();
		}
		// catch (Exception ex)
		catch (IOException ex)
		// catch (FileNotFoundException ex)
		{
			ex.printStackTrace();
			System.out.println("Parece que algunas excepciones hay que tratarlas por fuerza");
			System.out.println("Luego hace falta un try{} catch{}");
			System.out.println("Algo ha pasado. Puede que el archivo original.txt no se encuentre");
		}

	}

}
