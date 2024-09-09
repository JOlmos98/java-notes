package Pg1ev;

import javax.swing.JOptionPane;

/*
 * Desarrollar método
 * private static boolean contenidoHorizontal(char[][] m, char[] v);
 * que indica si la palabra contenida en horizontalmente en el array
 * se lee de izquierda a derecha o de D a I.
 */
public class Pg00_Ex2_Ej1 {

	public static void main(String[] args) {
		
		String [] vector=new String[5];
		
		vector[0]=JOptionPane.showInputDialog("Introduce la primera letra.");
		vector[1]=JOptionPane.showInputDialog("Introduce la segunda letra.");
		vector[2]=JOptionPane.showInputDialog("Introduce la tercera letra.");
		vector[3]=JOptionPane.showInputDialog("Introduce la cuarta letra.");
		vector[4]=JOptionPane.showInputDialog("Introduce la quinta letra.");
		
		String [][] sopa= {
				{"M","E","M","E","S"},
				{"H","A","C","H","E"},
				{"L","E","M","U","R"},
				{"V","E","N","T","A"},
				{"S","O","B","A","R"},
		};
		PalabraHorizontal.CheckPalabraNORMAL(sopa, vector);
		PalabraHorizontal.CheckPalabraALREVES(sopa, vector);
	}
}

///////////////////////////////////////////////////////////////////////////////////

class PalabraHorizontal{
	
	public static void CheckPalabraNORMAL(String [][] sopa, String [] palabra) {
		boolean contenida=false;
		for (int i=0;i<sopa.length;i++) {
			for (int h=0;h<sopa[i].length;h++) {
				if (sopa[i][0].equalsIgnoreCase(palabra[0])&&sopa[i][1].equalsIgnoreCase(palabra[1])&&sopa[i][2].equalsIgnoreCase(palabra[2])&&sopa[i][3].equalsIgnoreCase(palabra[3])&&sopa[i][4].equalsIgnoreCase(palabra[4])) {
					contenida=true;
				}
			}
		}
		if (contenida) JOptionPane.showMessageDialog(null, "La palabra SI está contenida NORMAL.");
		else JOptionPane.showMessageDialog(null, "La palabra NO está contenida NORMAL.");
	}
	
	public static void CheckPalabraALREVES(String [][] sopa, String [] palabra) {
		boolean contenida=false;
		for (int i=4;i>0;i--) {
			for (int h=4;h>0;h--) {
				if (sopa[i][0].equalsIgnoreCase(palabra[4])&&sopa[i][3].equalsIgnoreCase(palabra[3])&&sopa[i][2].equalsIgnoreCase(palabra[2])&&sopa[i][1].equalsIgnoreCase(palabra[1])&&sopa[i][0].equalsIgnoreCase(palabra[0])) {
					contenida=true;
				}
			}
		}
		if (contenida) JOptionPane.showMessageDialog(null, "La palabra SI está contenida AL REVÉS.");
		else JOptionPane.showMessageDialog(null, "La palabra NO está contenida AL REVÉS.");
	}
}