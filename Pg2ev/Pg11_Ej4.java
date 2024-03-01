package Pg2ev;

import java.util.ArrayList;

/*
 * Desarrolle un programa que construya un ArrayList<FechasPersona>. Añádale tres elementos. 
 */
public class Pg11_Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<FechasPersona> fechaspersonas=new ArrayList(10);
		
		fechaspersonas.add(new FechasPersona(new Fecha("18/09/1998"), new Fecha("23/12/2028"), new Fecha("23/12/2020")));
		Fecha p2fn=new Fecha("12/2/2001");
		Fecha p2fb=new Fecha("12/2/2025");
		Fecha p2ft=new Fecha("12/2/2017");
		FechasPersona persona2=new FechasPersona(p2fn, p2fb, p2ft);
		fechaspersonas.add(persona2);
		fechaspersonas.add(new FechasPersona(new Fecha("12/11/1967"), new Fecha("12/12/1989"), new Fecha("23/12/1979")));

		System.out.println(fechaspersonas.get(0).getFechaBoda()+"\n"+fechaspersonas.get(0).getFechaNacimiento());
	}
}
