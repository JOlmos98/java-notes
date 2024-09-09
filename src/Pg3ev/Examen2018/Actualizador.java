package Pg3ev.Examen2018;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Actualizador {
	
	public static void Actualizar(String directorioarchivoaleer) {
		try {
		
		BufferedReader txtactualizar=new BufferedReader(new FileReader(directorioarchivoaleer));
		BufferedReader txtdiccionario=new BufferedReader(new FileReader(".\\diccionario.txt"));
		
		String lector1=txtactualizar.readLine();
		String lector2=txtdiccionario.readLine();
		boolean actualizado=false;
	while (lector1!=null) {
		while (lector2!=null||actualizado==false) {
			String aleman=lector2.substring(0, lector2.indexOf(" "));
			String espanyol=lector2.substring(lector2.lastIndexOf(" ")+1);
			
			if (aleman.equalsIgnoreCase(lector1)) {
				BufferedWriter txtescritor= new BufferedWriter(new FileWriter(directorioarchivoaleer));
				txtescritor.write(espanyol);
				System.out.println(espanyol);
				txtescritor.newLine();
				actualizado=true;
				txtescritor.close();
			}
			lector2=txtdiccionario.readLine(); 
		}
		lector1=txtactualizar.readLine();
	}
		txtactualizar.close();
		txtdiccionario.close();
		} catch (NullPointerException e) {
			System.err.println("El lector2 es null, probablemente en termino.txt haya una palabra en español.");
		} catch (Exception e) {
			System.err.println("Ha ocurrido un error general.");
			e.printStackTrace();
		}
	
	}
	
}
