package Pg2ev;

import java.time.LocalDate;

/*
 * Desarrolle en la clase Fecha el 
 * método public void plusDias(int dias) ç
 * que varíe la fecha incrementándola los días indicados.
 */
public class Pg09_Ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate fecha10LD=LocalDate.of(2023, 12, 15);
		System.out.println(fecha10LD);
		System.out.println(fecha10LD.plusDays(5));
		
		Fecha fecha10F=new Fecha(15, 12, 2023);
		System.out.println(fecha10F); //Esto llama al método toString.
		System.out.println(fecha10F.plusDias(5));
		
	}
}
