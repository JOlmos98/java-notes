package JT01_POO;

import javax.swing.JOptionPane;

public class POO06ejercicio3contraseñas {
	public static void main(String[] args) {

	int longitudcontraseña=Integer.parseInt(JOptionPane.showInputDialog("introduce la longitud de las contraseñas:"));
	int cantidadcontraseñas=Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de contraseñas:"));
	Contraseñas c1=new Contraseñas(longitudcontraseña);
	//System.out.println(c1.getContraseña()+"\n");
	Contraseñas [] arrayContraseñas=new Contraseñas[cantidadcontraseñas];
	for (int i=0;i<cantidadcontraseñas;i++) {
		arrayContraseñas[i]=new Contraseñas(longitudcontraseña);
		}
	for (int j=0;j<arrayContraseñas.length;j++) {
		System.out.println(arrayContraseñas[j].getContraseña()+": "+arrayContraseñas[j].EsSegura());
		}
	
	}
}

////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////

class Contraseñas {
	
	//Constructor:
	public Contraseñas(int longitud) {
		
		this.longitud=longitud;
		this.generacontraseña();
	}
	
	//Variables:

	private static int longitud;
	private String contraseña;
	
	//Setters/normales:
	
	public String generacontraseña() {
		contraseña="";
		String[] arraygenerador=new String[longitud];
		for (int i=0;i<longitud;i++) {
			int numrandom=(int)(Math.random()*4+1);
			if (numrandom==1) {
				int randomCASE=(int)(Math.random()*100);
				if (randomCASE>=0&&randomCASE<=25) arraygenerador[i]="H";
				if (randomCASE>=26&&randomCASE<=50) arraygenerador[i]="X";
				if (randomCASE>=51&&randomCASE<=75) arraygenerador[i]="Z";
				if (randomCASE>=76&&randomCASE<=99) arraygenerador[i]="Y";
			}
			if (numrandom==2||numrandom==3) {
				int randomCASE=(int)(Math.random()*100);
				if (randomCASE>=0&&randomCASE<=25) arraygenerador[i]="1";
				if (randomCASE>=26&&randomCASE<=50) arraygenerador[i]="2";
				if (randomCASE>=51&&randomCASE<=75) arraygenerador[i]="3";
				if (randomCASE>=76&&randomCASE<=99) arraygenerador[i]="4";
			}
			if (numrandom==4) {
				int randomCASE=(int)(Math.random()*100);
				if (randomCASE>=0&&randomCASE<=25) arraygenerador[i]="a";
				if (randomCASE>=26&&randomCASE<=50) arraygenerador[i]="b";
				if (randomCASE>=51&&randomCASE<=75) arraygenerador[i]="c";
				if (randomCASE>=76&&randomCASE<=99) arraygenerador[i]="d";
			}
		}
		for (int j=0;j<longitud;j++) { //Esto debe unir la contraseña.
			contraseña+=arraygenerador[j];
		}
		return contraseña;
	}
	
	
	//Getters:
	public String getContraseña() {
		return contraseña;
	}
	public int getContraseñaLength() {
		return contraseña.length();
	}
	//Valoración de contraseñas: 
	public String EsSegura() {
		int minus=0;
		int mayus=0;
		int number=0;
		for (int h=0;h<contraseña.length();h++) {
			if (Character.isLowerCase(contraseña.charAt(h))) minus+=1;
			else if (Character.isUpperCase(contraseña.charAt(h))) mayus+=1;
			else number+=1;	
		}
		if (number>=5&&minus>=1&&mayus>=2) return "Contraseña segura.";
		else return "Contraseña débil.";
	}
}