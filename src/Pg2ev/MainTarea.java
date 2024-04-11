package Pg2ev;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainTarea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Los métodos están después del main.
		
		//Creamos el AL con los candidatos:
		ArrayList<Candidato> candidatos=new ArrayList();
		/*0*/candidatos.add(new Candidato("OLMOS", "SOLER", "JESUS", LocalDate.of(2014, 4, 8)));
		candidatos.add(new Candidato("RODRIGUEZ", "GOMEZ", "MARIA", LocalDate.of(2012, 9, 15)));
		candidatos.add(new Candidato("GARCIA", "LOPEZ", "CARLOS", LocalDate.of(2019, 6, 25)));
		candidatos.add(new Candidato("MARTINEZ", "MARTIN", "LAURA", LocalDate.of(2017, 11, 30)));
		candidatos.add(new Candidato("FERNANDEZ", null, "ANA", LocalDate.of(2015, 3, 12)));
		/*5*/candidatos.add(new Candidato("SANCHEZ", "DIAZ", "PEDRO", LocalDate.of(2018, 7, 3)));
		candidatos.add(new Candidato("LOPEZ", "GUTIERREZ", "LUCIA", LocalDate.of(2013, 5, 18)));
		candidatos.add(new Candidato("GONZALEZ", "RUIZ", "DAVID", LocalDate.of(2016, 8, 22)));
		candidatos.add(new Candidato("ROMERO", "HERNANDEZ", "CARMEN", LocalDate.of(2011, 10, 9)));
		candidatos.add(new Candidato("DIAZ", "SANCHEZ", "SARA", LocalDate.of(2019, 1, 5)));
		/*10*/candidatos.add(new Candidato("PEREZ", "MARTINEZ", "MANUEL", LocalDate.of(2014, 12, 20)));
		candidatos.add(new Candidato("MARTINEZ", null, "ELENA", LocalDate.of(2017, 11, 25)));
		candidatos.add(new Candidato("MOLINA", "RODRIGUEZ", "FRANCISCO", LocalDate.of(2010, 7, 11)));
		candidatos.add(new Candidato("SUAREZ", null, "ISABEL", LocalDate.of(2013, 8, 6)));
		candidatos.add(new Candidato("MARTINEZ", "PEREZ", "DIEGO", LocalDate.of(2018, 11, 14)));
		/*15*/candidatos.add(new Candidato("BLANCO", "NAVARRO", "EVA", LocalDate.of(2015, 4, 29)));
		candidatos.add(new Candidato("RAMIREZ", "SANTOS", "JAVIER", LocalDate.of(2012, 6, 7)));
		candidatos.add(new Candidato("NAVARRO", "SUAREZ", "PATRICIA", LocalDate.of(2016, 10, 17)));
		candidatos.add(new Candidato("VIDAL", "MOLINA", "OSCAR", LocalDate.of(2019, 3, 24)));
		candidatos.add(new Candidato("IGLESIAS", "GOMEZ", "NURIA", LocalDate.of(2011, 12, 3)));
		candidatos.add(new Candidato("MORENO", "HERRERA", "ANTONIO", LocalDate.of(2014, 2, 10)));
		candidatos.add(new Candidato("GIMENEZ", "MUNOZ", "CRISTINA", LocalDate.of(2017, 5, 1)));
		candidatos.add(new Candidato("MARTINEZ", "HERNANDEZ", "ALVARO", LocalDate.of(2011, 10, 9)));
		/*23*/candidatos.add(new Candidato("SUAREZ", "VALVERDE", "ISABEL", LocalDate.of(2024, 3, 3)));

		for (int i=0;i<candidatos.size();i++) {
			System.out.println((i+1)+". "+candidatos.get(i));
		} System.err.println("FIN DE LECTURA.\n");
		//Ya tenemos el AL de 24 candidatos.
		
		//Usamos el método Candidato.ordenar();
		System.err.println("LOS ORDENA POR APELLIDOS:");
		for (int i=0;i<MainTarea.ordenar(candidatos).size();i++) {
			System.out.println(MainTarea.ordenar(candidatos).get(i));
		} System.err.println("FIN DE LECTURA.\n");
		
		/*
		 * Podría usar el método en una linea y seguir usando en el bucle el objeto 
		 * candidatos, pero me gusta más así.
		 * 
		 * Después de unas horas buscando por qué no funcionaba bien el nullsFirst,
		 * parece que ya funciona, podemos verlo en los MARTINEZ o en los SUAREZ.
		 */
		
		//Usamos el método Candidato.admitidos(); donde vemos que las fechas tienen sentido.
		ArrayList<Candidato> descartados=new ArrayList();
		MainTarea.admitidos(candidatos, descartados);
		System.err.println("LEEMOS LA LISTA DE ADMITIDOS:");
		for (int i=0;i<MainTarea.admitidos(candidatos, descartados).size();i++) {
			System.out.println(MainTarea.admitidos(candidatos, descartados).get(i));
		} System.err.println("FIN DE LECTURA.\n");
		
		//Leemos la lista de descartados.
		System.err.println("LEEMOS LA LISTA DE DESCARTADOS:");
		for (int i=0;i<descartados.size();i++) {
			System.out.println(descartados.get(i));
		} System.err.println("FIN DE LECTURA.\n");
	}

	//Métodos:
	
public static ArrayList<Candidato> admitidos(ArrayList<Candidato> candidatos, ArrayList<Candidato> descartados){
	ArrayList<Candidato> admitidos=new ArrayList();
	
	/*
	 * Básicamente el AL "admitidos" tiene que almacenar
	 * la resta de candidatos-descartados.
	 * Si son más de 20, almacenará sólo los 20 que antes
	 * se hayan inscrito, ordenados por fecha ascendente,
	 * es decir, el primero en escribirse es el primero de la lista.
	 * Para eso creamos el método getDiasDesdeIns (el método
	 * está en la clase Candidato).
	 */
	
	admitidos=candidatos;
	
	Collections.sort(admitidos, Comparator.comparingInt(Candidato::getDiasDesdeIns).reversed());
	
	for (int i=20;i<admitidos.size();i++) {
		descartados.add(admitidos.get(i));
		admitidos.remove(i);
	}
	
	return admitidos;
}

public static ArrayList<Candidato> ordenar(ArrayList<Candidato> candidatos){
	ArrayList<Candidato> ALordenado=new ArrayList(candidatos);
	ALordenado=candidatos;
	
	/*
	 * Este método ordena los candidatos alfabéticamente según
	 * los apellidos y en caso de no tener segundo apellido,
	 * sencillamente se tomará en cuenta sólo el primero,
	 * es decir, irá antes que otro con el que tenga el
	 * mismo primer apellido y un segundo, como si el inexistente
	 * segundo apellido fuese AAA.
	 */
	
	Collections.sort(ALordenado, Comparator.comparing(Candidato::getApellido1).thenComparing(Comparator.nullsFirst(Comparator.comparing(Candidato::getApellido2, Comparator.nullsFirst(String::compareTo)))));
	/*
	 * Aquí podría haber almacenado la línea absurdamente larga
	 * en un objeto de tipo Comparator<Candidato>, pero me gusta más así.
	 */
	
	return ALordenado;
}
}