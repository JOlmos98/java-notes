package Pg2ev;
/*
 * En la clase Fecha desarrolle un constructor 
 * capaz de recibir como argumento una cadena 
 * del tipo d(d)/m(m)/aaaa como “18/10/1967”, 
 * “7/03/1746” o “06/1/2014”. Necesitará investigar 
 * el uso métodos de la clase String tales como 
 * indexOf(), lastIndexOf() y substring().
 */
public class Pg10_Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ejemplo="Esto es un ejemplo";
		//Como los String son arrays se empieza a contar desde la posición 0.
		System.out.println(ejemplo.substring(5)); //Empieza a leer desde el 5 y lee el resto.
		System.out.println(ejemplo.substring(2, 6)); //Empieza a leer desde el 2 y lee hasta el 6
		System.out.println(ejemplo.indexOf("e")); //Devuelve la posición del primer "e".
		System.out.println(ejemplo.lastIndexOf("e")); //Devuelve la posición del último "e"
		
		Fecha ejemploindex=new Fecha("01/02/1999");
		System.out.println(ejemploindex);
		Fecha ejemploindex2=new Fecha("2/2/1998");
		System.out.println(ejemploindex2);
	}
}
