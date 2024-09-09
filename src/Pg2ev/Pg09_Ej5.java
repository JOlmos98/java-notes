package Pg2ev;

import java.time.LocalDate;
/*
 * Utilizando GregorianCalendar obtenga qué día de 
 * la semana fue el 1 de enero de 1970.
 */
public class Pg09_Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate fechadiadelasemana=LocalDate.of(1970, 1, 1);
		System.out.println(fechadiadelasemana.getDayOfWeek());
		
	}
}
