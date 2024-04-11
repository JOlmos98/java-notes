package Pg2ev;

import java.util.ArrayList;
/*
 * Desarrolle un programa que construya un ArrayList<Personaej5>. Añádale tres elementos.
 */
public class Pg11_Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Personaej5> alp5=new ArrayList();
		
		Fecha[] fechaej6=new Fecha[3];
		fechaej6[0]=new Fecha("17/9/1999");
		fechaej6[1]=new Fecha("8/9/2039");
		fechaej6[2]=new Fecha("1/6/2022");
		alp5.add(new Personaej5("Raúl", fechaej6));
		
		Fecha[] fecha2ej6=new Fecha[3];
		fecha2ej6[0]=new Fecha("19/9/1989");
		fecha2ej6[1]=new Fecha("19/9/2015");
		fecha2ej6[2]=new Fecha("12/2/2000");
		alp5.add(new Personaej5("Luís", fecha2ej6));
		
		System.out.println(alp5.get(0).getFechas());
		System.out.println(fechaej6[1]);
		System.out.println(alp5.get(0).getNombre());
		System.out.println(alp5.get(1).getFechas()[0]);
		System.out.println(alp5.get(1).getFechas()[2].getAnyo());
		
		Fecha[] fecha3ej6=new Fecha[3];
		fecha3ej6[0]=new Fecha("1/2/1955");
		fecha3ej6[1]=new Fecha("8/3/1980");
		fecha3ej6[2]=new Fecha("18/8/1969");
		alp5.add(new Personaej5("Juan", fecha3ej6));
	}
}
