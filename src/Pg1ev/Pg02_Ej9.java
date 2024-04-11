package Pg1ev;
//Realice un programa que lea el día, mes y año de una fecha (d.C.) e indique si la fecha es correcta. Suponga meses de 28, 30 y 31 días. No considere años bisiestos.
import javax.swing.JOptionPane;

public class Pg02_Ej9 {

	public static void main(String[] args) {
		
		int dia=Integer.parseInt(JOptionPane.showInputDialog("Introduce el día actual: "));
        int mes=Integer.parseInt(JOptionPane.showInputDialog("Introduce el mes actual: "));
        int año=Integer.parseInt(JOptionPane.showInputDialog("Introduce el año actual: "));
        
		if (mes==1||mes==3||mes==5||mes==1||mes==7||mes==8||mes==10||mes==12) {
			if (dia>0&&dia<=31) System.out.println("La fecha actual es: "+dia+"/"+mes+"/"+año);
			else System.out.println("La fecha introducida no es válida.");
		}
		else if (mes==4||mes==6||mes==9||mes==11) {
			if (dia>0&&dia<=30) System.out.println("La fecha actual es: "+dia+"/"+mes+"/"+año);
			else System.out.println("La fecha introducida no es válida.");
		}
		else if (mes==2) {
			if (dia>0&&dia<=28) System.out.println("La fecha actual es: "+dia+"/"+mes+"/"+año);
			else System.out.println("La fecha introducida no es válida.");
		}
		else System.out.println("La fecha introducida no es válida.");
		
	}
}