package Pg1ev;
/*
 * Realice un programa lea el día, mes y año de una fecha (d.C.) e indique la 
 * fecha del día siguiente. Suponga meses de 28, 30 y 31 días. No considere 
 * años bisiestos.
 */
import javax.swing.JOptionPane;


public class Pg02_Ej11 {

	public static void main(String[] args) {
		
		int dia=Integer.parseInt(JOptionPane.showInputDialog("Introduce el día actual: "));
        int mes=Integer.parseInt(JOptionPane.showInputDialog("Introduce el mes actual: "));
        int año=Integer.parseInt(JOptionPane.showInputDialog("Introduce el año actual: "));
        
        if (mes<0||mes>12) {
        	System.out.println("La fecha introducida no es válida.");
        	System.exit(0);
        }
		if (mes==1||mes==3||mes==5||mes==1||mes==7||mes==8||mes==10||mes==12) {
			if (dia>0&&dia<=31) {
				if (dia==31) {
					dia=1;
					if (mes==12) {
						mes=1;
						año+=1;
					} else mes+=1;
					System.out.println("El día siguiente será: "+dia+"/"+mes+"/"+año);
				}
				else System.out.println("El día siguiente será: "+(dia+1)+"/"+mes+"/"+año);
			}
			else System.out.println("La fecha introducida no es válida.");
		}
		else if (mes==4||mes==6||mes==9||mes==11) {
			if (dia>0&&dia<=30) {
				if (dia==30) {
					dia=1;
					mes+=1;
					System.out.println("El día siguiente será: "+dia+"/"+mes+"/"+año);
				}
				else System.out.println("El día siguiente será: "+(dia+1)+"/"+mes+"/"+año);
			}
			else System.out.println("La fecha introducida no es válida.");
		}
		else if (mes==2) {
			if (dia>0&&dia<=28) {
				if (dia==28) {
					dia=1;
					mes+=1;
					System.out.println("El día siguiente será: "+dia+"/"+mes+"/"+año);
				}
				else System.out.println("El día siguiente será: "+(dia+1)+"/"+mes+"/"+año);
			}
			else System.out.println("La fecha introducida no es válida.");
		}
		
	}

}
