package Pg2ev;

import java.util.ArrayList;
/*
 * Desarrolle un programa que lea datos de cinco 
 * libros y los liste ordenados por título. Ordene 
 * adaptando el método desarrollado a tal efecto 
 * en el ejercicio Pg11·07, lo que implicará que 
 * desarrolle el método isMenor() en la clase Libro.
 */
public class Pg12_Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Libro> ALl=new ArrayList();
		
		ALl.add(new Libro("Fundación", "Isaac Asimov", 320, 1984));
		ALl.add(new Libro("Fuego Y Sangre", "G. R. R. Martin", 846, 2018));
		ALl.add(new Libro("Carrie", "Stephen King", 286, 1956));
		ALl.add(new Libro("IT", "Stephen King", 1275, 1991));
		ALl.add(new Libro("Los Héroes", "Joe Abercrombie", 677, 2012));

		for (int i=0;i<ALl.size();i++) {
			System.out.println((i+1)+". "+ALl.get(i).getNombre());
		}
		System.out.println();
		//Ordenamos el AL.
		Libro.sortAL(ALl);
		System.out.println("Ordenado alfabéticamente:");
		for (int i=0;i<ALl.size();i++) {
			System.out.println((i+1)+". "+ALl.get(i).getNombre());
		}
	}
}
