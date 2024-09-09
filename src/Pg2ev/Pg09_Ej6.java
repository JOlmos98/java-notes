package Pg2ev;

import java.time.LocalDate;

/*
 * Varíe la solución de clase utilizando 
 * ahora la sentencia condicional switch.
 */
public class Pg09_Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate fechaswitch=LocalDate.of(1971, 4, 8);
		
		switch (fechaswitch.getDayOfWeek()) {
			
		case MONDAY:
			System.out.println("El 8 de abril de 1971 fue un LUNES.");
			break;
		case TUESDAY:
			System.out.println("El 8 de abril de 1971 fue un MARTES.");
			break;
		case WEDNESDAY:
			System.out.println("El 8 de abril de 1971 fue un MIÉRCOLES.");
			break;
		case THURSDAY:
			System.out.println("El 8 de abril de 1971 fue un JUEVES.");
			break;
		case FRIDAY:
			System.out.println("El 8 de abril de 1971 fue un VIERNES.");
			break;
		case SATURDAY:
			System.out.println("El 8 de abril de 1971 fue un SÁBADO.");
			break;
		case SUNDAY:
			System.out.println("El 8 de abril de 1971 fue un DOMINGO.");
			break;

		}
	}
}
