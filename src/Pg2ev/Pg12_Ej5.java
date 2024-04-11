package Pg2ev;

import java.util.ArrayList;
import java.util.Comparator;

/*
 * Atienda al uso de al interfaz Comparator. 
 * Desarrolle un programa que muestre dos listados 
 * de libros, uno ordenado por título y otro por 
 * autor y título.
 */
public class Pg12_Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Tenemos que desarrollar un método para ordenar el ArrayList por título.
		 * Y otro método que lo ordene por autor y título, en ese orden.
		 * Para ello implementamos la interfaz Comparator y sobreescribimos el método compare().
		 * Parece que vamos a tener que crear una nueva clase, comparatorLibro.
		 */
		
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
		//Ordenamos por nombre con nuestro nuevo método sortALcompareTitulo(ArrayList<Libro> ar).
		comparatorLibro.sortALcompareTitulo(ALl);
		//Imprimimos, esta vez ordenado por título.
		System.out.println("\nLibros ordenados:");
		for (int i=0;i<ALl.size();i++) {
			System.out.println((i+1)+". "+ALl.get(i).getNombre());
		}
		//Ahora están ordenados por título, los imprimimos mostrando primero el autor.
		System.out.println("\nMostramos autor pero siguen ordenados por título:");
		for (int i=0;i<ALl.size();i++) {
			System.out.println((i+1)+". "+ALl.get(i).getAutor()+", "+ALl.get(i).getNombre());
		}
		//Vamos a crear OTRA CLASE, comparatorAutor.
		/*
		 * Para hacer el listado que ordene por autor y después por título tendríamos
		 * que hacer otra clase que ordene por autor, y si el autor es igual en dos objetos,
		 * que los ordene entre sí según el título en esa mini lista (ya que irán de seguido 
		 * esos libros al ser el mismo autor).
		 */
		comparatorAutor.sortALcompareAutor(ALl);
		System.out.println("\nAhora deberían estar ordenados por autor:");
		for (int i=0;i<ALl.size();i++) {
			System.out.println((i+1)+". "+ALl.get(i).getAutor()+", "+ALl.get(i).getNombre());
		}
		/*
		 * Pues si, funciona y como vamos justos de tiempo vamos a dejar el ejercicio así,
		 * porque supongo que por haberla ordenado la lista por título, realmente ahora está
		 * ordenada como se desea, por autor y después por título, podemos observarlo viendo 
		 * las obras de King y Asimov.
		 */
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////

class comparatorLibro implements Comparator<Libro>{

	@Override
	public int compare(Libro o1, Libro o2) {
		// TODO Auto-generated method stub
		return o1.getNombre().compareTo(o2.getNombre());
	}
	public static void sortALcompareTitulo(ArrayList<Libro> ar) {
		comparatorLibro comparador=new comparatorLibro();
    	for (int i=0;i<ar.size();i++) {
    		for (int a=0;a<ar.size()-i-1;a++) {
    			if (comparador.compare(ar.get(a), ar.get(a+1))>0){
    				// ((Libro)ar.compare((Libro)ar.get(a).getNombre(), (Libro)ar.get(a+1).getNombre()>0))
    				// (comparator.compare(ar.get(a), ar.get(a + 1)) > 0)
    				Libro aux=(Libro) ar.get(a);
    				ar.set(a, ar.get(a+1));
    				ar.set(a+1, aux);
    			}
    		}
    	}
	}
}

class comparatorAutor implements Comparator<Libro>{
	
	@Override
	public int compare(Libro o1, Libro o2) {
		// TODO Auto-generated method stub
		return o1.getAutor().compareTo(o2.getAutor());
	}
	public static void sortALcompareAutor(ArrayList<Libro> ar) {
		comparatorAutor comparador=new comparatorAutor();
    	for (int i=0;i<ar.size();i++) {
    		for (int a=0;a<ar.size()-i-1;a++) {
    			if (comparador.compare(ar.get(a), ar.get(a+1))>0){
    				// ((Libro)ar.compare((Libro)ar.get(a).getNombre(), (Libro)ar.get(a+1).getNombre()>0))
    				// (comparator.compare(ar.get(a), ar.get(a + 1)) > 0)
    				Libro aux=(Libro) ar.get(a);
    				ar.set(a, ar.get(a+1));
    				ar.set(a+1, aux);
    			}
    		}
    	}
	}
}