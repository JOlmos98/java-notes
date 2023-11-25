package Pg1ev;
//Realice un programa que lea tres números enteros y los muestre ordenados de mayor a menor. 
public class Pg02_Ej6 {

	public static void main(String[] args) {
		int a=2;
		int b=0;
		int c=-3;
		
		int mayor=Math.max(Math.max(a, b), Math.max(c, b));
		int menor=Math.min(Math.min(a, b), Math.min(c, b));
		int medio;
		if (a!=mayor&&a!=menor) medio=a;
		else if (b!=mayor&&b!=menor) medio=b;
		else medio=c;
		System.out.println("El número mayor es: "+mayor+"\nEl número medio es: "+medio+"\nEl número menor es: "+menor);
	}

}
