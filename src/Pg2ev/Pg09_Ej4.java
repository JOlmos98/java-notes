package Pg2ev;

import java.time.LocalDate;
/*
 * Atienda a los comentarios sobre la clase GregorianCalendar. 
 * A continuación cree un objeto de la clase GregorianCalendar 
 * con la fecha del día actual y compruebe, imprimiendo los 
 * valores, que lo ha hecho correctamente. 
 */
public class Pg09_Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate fecha01=LocalDate.of(2001, 9, 11); //Ejemplo.
		
		LocalDate fechaactual=LocalDate.of(2024, 1, 8);
		LocalDate fechaactualmetodo=LocalDate.now();
		System.out.println(fecha01+"\n\n"+fechaactual+"\n"+fechaactualmetodo);
		
	}

}
