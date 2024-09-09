package Pg2ev;

import java.util.ArrayList;
/*
 * Desarrolle un programa que construya un 
 * ArrayList<Fecha> Añádale tres elementos. 
 */
public class Pg11_Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Fecha> fechas=new ArrayList();
		
		fechas.add(new Fecha("12/11/2009"));
		fechas.add(new Fecha("1/4/2132"));
		fechas.add(new Fecha("18/09/1998"));
		
		System.out.println(fechas.get(0));
		System.out.println(fechas.get(1));
		System.out.println(fechas.get(2));

	}
}
