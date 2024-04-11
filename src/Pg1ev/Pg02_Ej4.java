package Pg1ev;
//Realice un programa que lea tres números enteros y obtenga el mayor.
public class Pg02_Ej4 {

	public static void main(String[] args) {
		int a=2;
		int b=0;
		int c=-3;
		
		if (a>b&&a>c) System.out.println("El número mayor es: "+a);
		else if (b>a&&b>c) System.out.println("El número mayor es: "+b);
		else System.out.println("El número mayor es: "+c);
	}

}
