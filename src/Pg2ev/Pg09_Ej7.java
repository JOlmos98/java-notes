package Pg2ev;

import java.time.LocalDate;

/*
 * En la clase Fecha desarrolle el método 
 * String diaSemana() que devuelva el nombre 
 * del día correspondiente, en español y en mayúsculas. 
 */
public class Pg09_Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate fechadsld=LocalDate.of(1998, 9, 18);
		System.out.println(fechadsld.getDayOfWeek());
		
		Fecha fechadsf=new Fecha(18,9,1998);
		System.out.println(fechadsf.diaSemana());
		
		System.out.println(LocalDate.of(1996, 9, 27).getDayOfWeek());
		System.out.println(new Fecha(27, 9, 1996).diaSemana());
		
		System.out.println(LocalDate.of(2006, 9, 19).getDayOfWeek());
		System.out.println(new Fecha(19, 9, 2006).diaSemana()+"\n");
		
		Fecha fechalunes=new Fecha(18,9,2006);
		Fecha fechamartes=new Fecha(19,9,2006);
		Fecha fechamiercoles=new Fecha(20,9,2006);
		Fecha fechajueves=new Fecha(21,9,2006);
		Fecha fechaviernes=new Fecha(22,9,2006);
		Fecha fechasabado=new Fecha(23,9,2006);
		Fecha fechadomingos=new Fecha(24,9,2006);
		System.out.print(fechalunes.diaSemana()+"-");
		System.out.print(fechamartes.diaSemana()+"-");
		System.out.print(fechamiercoles.diaSemana()+"-");
		System.out.print(fechajueves.diaSemana()+"-");
		System.out.print(fechaviernes.diaSemana()+"-");
		System.out.print(fechasabado.diaSemana()+"-");
		System.out.print(fechadomingos.diaSemana());
		
		
	}
}
