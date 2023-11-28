package Pg1ev;
//Realice un programa que lea el día, mes y año de una fecha (d.C.) e indique si la fecha es correcta. Suponga que todos los meses tienen 30 días. 
import javax.swing.JOptionPane;

public class Pg02_Ej8 {

	public static void main(String[] args) {
		
        
        int dia=Integer.parseInt(JOptionPane.showInputDialog("Introduce el día actual: "));
        int mes=Integer.parseInt(JOptionPane.showInputDialog("Introduce el mes actual: "));
        int año=Integer.parseInt(JOptionPane.showInputDialog("Introduce el año actual: "));
        
        if (dia>0&&dia<=30&&mes>0&&mes<=12)  System.out.println("La fecha actual es: "+dia+"/"+mes+"/"+año);
        else System.out.println("La fecha introducida no es válida.");
    
	}
}