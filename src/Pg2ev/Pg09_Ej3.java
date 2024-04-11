package Pg2ev;
import java.time.LocalDate;
/*
 * En la clase Fecha y a semejanza del método compareTo() 
 * de la clase String, desarrolle un método con el mismo 
 * nombre que compare dos objetos de la clase Fecha, la 
 * propia instancia de la clase Fecha y otra recibida como parámetro.
 */
import java.time.LocalDateTime;

public class Pg09_Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(LocalDateTime.now());
		
		Fecha fecha3=new Fecha(14,6,2001);
		LocalDate fechaLD=LocalDate.of(2005,12,12);
		
		System.out.println(fecha3.compareTo(new Fecha(21,3,2008)));
		System.out.println(fecha3.compareTo(new Fecha(29,4,1990)));
		
		System.out.println(fechaLD.compareTo(LocalDate.of(2017, 1, 1)));
		System.out.println(fechaLD.compareTo(LocalDate.of(1874, 1, 1)));
		
		LocalDate fechaLD2=LocalDate.of(2005, 12, 12);
		System.out.println(fechaLD2.compareTo(LocalDate.of(2005, 12, 12)));
		System.out.println(fechaLD2.compareTo(LocalDate.of(2005, 2, 12)));
		System.out.println(fechaLD2.compareTo(LocalDate.of(1994, 12, 12)));
		
		Fecha fecha4=new Fecha(12,12,2005);
		System.out.println(fecha4.compareTo(new Fecha(12,12,2005)));
		System.out.println(fecha4.compareTo(new Fecha(12,2,2005)));
		System.out.println(fecha4.compareTo(new Fecha(12,12,1994)));
		//El método compareTo de LocalDate y Fecha hacen exactamente lo mismo.
		
	}

}
