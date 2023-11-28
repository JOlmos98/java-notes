package Pg1ev;
/*
 * Realice un programa que lea el día, mes y año de una fecha (d.C.) e 
 * indique si la fecha es correcta. Suponga meses de 28, 30 y 31 días. No 
 * considere años bisiestos.
 */
import javax.swing.JOptionPane;

public class Pg02_Ej10 {

	public static void main(String[] args) {
		
		
        int dia=Integer.parseInt(JOptionPane.showInputDialog("Introduce el día actual: "));
        int mes=Integer.parseInt(JOptionPane.showInputDialog("Introduce el mes actual: "));
        int año=Integer.parseInt(JOptionPane.showInputDialog("Introduce el año actual: "));
        /*
         * Debería añadir if para que el día de final de mes vuelva a 1 el mes
         * y sea (mes+1), pero lo haré en el siguiente ejercicio bien.
         */
        if (dia>0&&dia<=30&&mes>0&&mes<=12)  System.out.println("El día siguiente será el: "+(dia+1)+"/"+mes+"/"+año);
        else System.out.println("La fecha introducida no es válida.");
    
	}

}
