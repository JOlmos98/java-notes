package Examen2Ev;

import java.util.ArrayList;

public class Principal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Contacto> ALC=new ArrayList();
		ALC.add(new Contacto("Olmos", "Soler", "Jesús", "49338225M"));
		ALC.add(new Contacto("Rodríguez", "Suárez", "Víctor", "47338116B"));
		ALC.add(new Contacto("Gómez", "Pérez", "María", "52431598X"));
		ALC.add(new Contacto("Martínez", "López", "Pedro", "43871234Y"));
		ALC.add(new Contacto("Sánchez", "García", "Ana", "32987456Z"));
		ALC.add(new Contacto("Fernández", "González", "Juan", "67451239A"));
		ALC.add(new Contacto("Pérez", "López", "Laura", "78654321C"));
		ALC.add(new Contacto("González", "Martínez", "Carlos", "91234567D"));
		ALC.add(new Contacto("Rodríguez", "Martínez", "Elena", "64523187E"));
		ALC.add(new Contacto("López", "González", "David", "56321478F"));
		/*10*/ALC.add(new Contacto("Olmos", "Soler", "Jesús", "49338225M"));
		ALC.add(new Contacto("Rodríguez", "Suárez", "Víctor", "47338116B"));
		ALC.add(new Contacto("Gómez", "Pérez", "María", "52431598X"));
		
		System.out.println(ALC.get(0).equals(ALC.get(10)));
		System.out.println(ALC.get(1).equals(ALC.get(3)));
		
		for (int i=0;i<ALC.size();i++) System.out.println((i+1)+". "+ALC.get(i));
		System.out.println();
		Principal1.filtrar(ALC);
		for (int i=0;i<Principal1.filtrar(ALC).size();i++) System.out.println((i+1)+". "+Principal1.filtrar(ALC).get(i));
		
		
	}

	public static ArrayList<Contacto> filtrar(ArrayList<Contacto> contactos){
		/*
		 * Devuelve los contactos del array instroducido pero
		 * eliminando los repetidos.
		 */
		ArrayList<Contacto> ALFiltrado=new ArrayList();
		int contador;
		for (int i=0;i<contactos.size();i++) {
			contador=0;
			for (int a=0;a<contactos.size();a++){
				if (contactos.get(a).getDni().equals(contactos.get(i).getDni())) contador++;		
				if (contador==2) contactos.remove(a);
			}
			if (contador<2) ALFiltrado.add(contactos.get(i));	
		}
		return ALFiltrado;
	}
	
	
}
