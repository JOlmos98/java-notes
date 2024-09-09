package Pg2ev;

import java.util.ArrayList;

/*
 * Atienda al desarrollo del ejercicio anterior 
 * usando ahora la clase Collections y la 
 * interfaz Comparable.
 * Es decir, recrear el método para ordenar el ArrayList
 * pero con la clase Collections.
 */
public class Pg12_Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Libro> ALl=new ArrayList();
		ALl.add(new Libro("Fundación", "Isaac Asimov", 320, 1984));
		ALl.add(new Libro("Fuego Y Sangre", "G. R. R. Martin", 846, 2018));
		ALl.add(new Libro("Carrie", "Stephen King", 286, 1956));
		ALl.add(new Libro("IT", "Stephen King", 1275, 1991));
		ALl.add(new Libro("Los Héroes", "Joe Abercrombie", 677, 2012));
		ALl.add(new Libro("Fundación E Imperio", "Isaac Asimov", 276, 1986));
		ALl.add(new Libro("Segunda Fundación", "Isaac Asimov", 352, 1988));
		
		for (int i=0;i<ALl.size();i++) {
			System.out.println((i+1)+". "+ALl.get(i).getNombre());
		}
		System.out.print("\nAquí ordenamos con el nuevo método:\n");
		
		Libro.sortALcollections(ALl);
		for (int i=0;i<ALl.size();i++) {
			System.out.println((i+1)+". "+ALl.get(i).getNombre());
		}
	}
}
