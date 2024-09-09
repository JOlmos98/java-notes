package Pg2ev;
/*
 * Se le proporciona el método boolean bisiesto(int year). 
 * Desarrolle de nuevo el ejercicio anterior, ahora int 
 * diasHastav2(Fecha f), pero sin usar la clase GregorianCalendar. 
 */
public class Pg09_Ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fecha fechaejemplo=new Fecha(18,9,2013);
		System.out.println(fechaejemplo.getMes());
		System.out.println(fechaejemplo.getDiaDelAnyo());
		Fecha fechadiafinal1=new Fecha(31,12,2023);
		System.out.println(fechadiafinal1.getDiaDelAnyo());
		Fecha fechadiafinal2=new Fecha(31,12,2022);
		System.out.println(fechadiafinal2.getDiaDelAnyo());
		Fecha fechadiafinal3=new Fecha(31,12,2021);
		System.out.println(fechadiafinal3.getDiaDelAnyo());
		Fecha fechadiafinal4=new Fecha(31,12,2020);
		System.out.println(fechadiafinal4.getDiaDelAnyo());
		Fecha fechadiafinal0=new Fecha(31,12,2024);
		System.out.println(fechadiafinal0.getDiaDelAnyo()); //Funciona bien.
		
		int diashasta0=fechaejemplo.diasHastav2(new Fecha(20,9,2013)); //Debe dar 2.
		System.out.println(diashasta0);
		diashasta0=fechaejemplo.diasHastav2(new Fecha(15,9,2013)); //Debe dar -3.
		System.out.println(diashasta0);
		
		//Ejemplos del ejercicio anterior que está bien 100%.
		System.out.println(fechaejemplo.diasHastav1(new Fecha(12,12,1999)));
		System.out.println(fechaejemplo.diasHastav2(new Fecha(12,12,1999)));
		//Vaya, no da lo mismo.
		System.out.println(fechaejemplo.diasHastav1(new Fecha(1,9,2013)));
		System.out.println(fechaejemplo.diasHastav2(new Fecha(1,9,2013)));
		//Aquí va bien. Fecha referencia: 18/9/13
		System.out.println();
		System.out.println(fechaejemplo.diasHastav1(new Fecha(24,9,2010)));
		System.out.println(fechaejemplo.diasHastav2(new Fecha(24,9,2010)));
		
		
	}
}
