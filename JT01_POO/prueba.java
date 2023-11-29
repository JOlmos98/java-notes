package JT01_POO;

import javax.swing.JOptionPane;

public class prueba {

	public static void main(String[] args) {
		String contraseña="";
		int longitud=5;
		String[] arraygenerador=new String[longitud];
		for (int i=0;i<longitud;i++) {
			int numrandom=(int)(Math.random()*3+1);
			if (numrandom==1) {
				int randomCASE=(int)(Math.random()*100);
				if (randomCASE>=0&&randomCASE<=25) arraygenerador[i]="H";
				if (randomCASE>=26&&randomCASE<=50) arraygenerador[i]="X";
				if (randomCASE>=51&&randomCASE<=75) arraygenerador[i]="Z";
				if (randomCASE>=76&&randomCASE<=99) arraygenerador[i]="Y";
			}
			if (numrandom==2) {
				int randomCASE=(int)(Math.random()*100);
				if (randomCASE>=0&&randomCASE<=25) arraygenerador[i]="1";
				if (randomCASE>=26&&randomCASE<=50) arraygenerador[i]="2";
				if (randomCASE>=51&&randomCASE<=75) arraygenerador[i]="3";
				if (randomCASE>=76&&randomCASE<=99) arraygenerador[i]="4";
			}
			if (numrandom==3) {
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
		System.out.println(contraseña);
	}

}
