package Pg2ev;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import javax.swing.JOptionPane;

/*
 * Desarrolle el método int diasHastav1(Fecha f) que 
 * indica los días de distancia a la fecha f (positivo 
 * significará que f es posterior).
 */
public class Pg09_Ej8 {

	public static void main(String [] args) {
		
		Fecha fechadiashasta=new Fecha(18, 9, 1998);
		
		System.out.println(fechadiashasta.compareTo(new Fecha(25,9,1998)));
		
		//fechadiashasta.diasHastav1(new Fecha(25,9,1998));
		System.out.println(fechadiashasta.diasHastav1(new Fecha(25,9,1998)));
		System.out.println(fechadiashasta.diasHastav1(new Fecha(12,12,1999)));
		
		int diasvivo=fechadiashasta.diasHastav1(new Fecha(9,1,2024));
		
		System.out.println("Ha día de hoy, llevo "+diasvivo+" días vivo.");
	
		int dianac=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu día de nacimiento:"));
		int mesnac=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu mes de nacimiento:"));
		int agnonac=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu año de nacimiento:"));
		
		//Fecha fechanac=new Fecha(dianac, mesnac, agnonac);
		LocalDate fechanac=LocalDate.of(agnonac, mesnac, dianac);
		LocalDate fechaactual=LocalDate.now();
		int diasvivoApp=(int)ChronoUnit.DAYS.between(fechanac, fechaactual); 
		
		JOptionPane.showMessageDialog(null, "Llevas "+diasvivoApp+" días vivo hasta el día de hoy.");
	}
}
