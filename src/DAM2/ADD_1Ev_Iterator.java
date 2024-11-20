package DAM2;

import java.util.ArrayList;
import java.util.Iterator;

public class ADD_1Ev_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list=new ArrayList();
		
		list.add("Antonio");
		list.add("Jesús");
		list.add("Pedro");
		list.add("Alberto");
		list.add("Manuel");
		list.add("María");
		list.add("Marlon");
		list.add("Beatriz");
		list.add("Enrique");
		
		//Recorremos el Arraylist con Iterator:
		Iterator<String> iter=list.iterator();
		
		while (iter.hasNext()) { 
		//hasNext comprueba si hay más eementos en el ArrayList.
			System.out.println(iter.next()); 
			//Obtiene el elemento de la colección y avanza el puntero del iterador al siguiente elemento.
		}
		
		//Otras formas de recorrer e imprimir el AL:
		
		//for
		for (int i=0;i<list.size();i++) {System.out.println(list.get(i));}
		
		//forEach
		for (String nombre:list) {System.out.println(nombre);}
		
		/*
		 * La ventaja es que en tiempo real, es decir,
		 * a la vez que se recorre el ArrayList, con el Iterator
		 * podemos eliminar elementos sobre la marcha sin que de
		 * ningún error.
		 */
	}

}
