package Pg2ev;
/*
 * Se le proporciona una versión de la clase Fecha. 
 * Desarrolle un programa que construya un array de 
 * 10 elementos de la clase Fecha. Asigne valor a tres de ellos.
 */
public class Pg11_Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha [] array1fecha=new Fecha[10];
		array1fecha[0]=new Fecha("01/01/2000");
		array1fecha[1]=new Fecha("11/09/2001");
		array1fecha[2]=new Fecha("8/9/2023");
		
		System.out.println(array1fecha[2].toString());
	}
}
