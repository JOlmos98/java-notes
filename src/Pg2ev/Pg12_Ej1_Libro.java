package Pg2ev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * Desarrolle la clase Libro, según su criterio. 
 * En un programa principal desarrolle un método 
 * que reciba datos completos de dos libros, e 
 * indique si son el mismo libro o no. Pruebe el 
 * método. Razone la utilidad o conveniencia de este método.
 */
public class Pg12_Ej1_Libro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Libro libro1=new Libro("Fundacion", "Isaac Asimov", 320, 1982);
		Libro libro2=new Libro("Rebelión en la Granja", "George Orwell", 187, 1945);
		Libro libro3=new Libro("Cumbres Borrascosas", "Emily Bronte", 320, 1847);
		Libro libro4=new Libro("Fundacion", "Isaac Asimov", 320, 1982);
		
		System.out.println(libro2.same(libro4)); //Esto debe dar fasle.
		System.out.println(libro1.same(libro4)); //Esto debe dar true.
	}
}

///////////////////////////////////////////////////////////////////////////////////////////

class Libro implements Comparable<Libro> {
	
	public Libro(String nom, String aut, int pags, int anyo) {
		nombre=nom;
		autor=aut;
		paginas=pags;
		anyopublicacion=anyo;
	}
	
	//Métodos:
	
	public static void sortAL(ArrayList ar) {
    	for (int i=0;i<ar.size();i++) {
    		for (int a=0;a<ar.size()-i-1;a++) {
    			if (((Libro)ar.get(a)).getNombre().compareTo(((Libro) ar.get(a+1)).getNombre())>0){
    				Libro aux=(Libro) ar.get(a);
    				ar.set(a, ar.get(a+1));
    				ar.set(a+1, aux);
    			}
    		}
    	}
	}
	/*
	 * Este método (sortALcollections) funciona gracias a la implementación del método
	 * compareTo redefinido más abajo, y ese a su vez existe por 
	 * la implementación de la interfaz Comparable o Comparator la llaman a veces.
	 */
	public static void sortALcollections(ArrayList ar) {
		Collections.sort(ar);
	}
	
	public boolean same(Libro lib) {
		if (this.getNombre()==lib.getNombre()&&this.getPaginas()==lib.getPaginas()) return true;
		else return false;
	}
	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	//Variables:
	
	private String autor;
	private String nombre;
	private int paginas;
	private int anyopublicacion;
	
	@Override //Este método redefinido usa compareTo de la clase String para comparar el nombre de cada libro con el resto.
	public int compareTo(Libro otroLibro) {
	    return this.nombre.compareTo(otroLibro.getNombre());
	}


}