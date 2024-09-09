package Pg2ev;
/*
 * Escriba una versión alternativa del constructor incorporado en el ejercicio 1 sin usar los 
métodos indicados de la clase String, en su lugar puede usar charAt(). Deberá analizar 
el String carácter a carácter para lo que le será útil conocer que:

· El código ASCII (y UNICODE) del carácter '0' es 48
· El código siguiente asigna a numero el valor 7 (el operador (int) es innecesario en
este caso) 
 char caracter='7';
 int numero = (int)caracter-48;
 */
public class Pg10_Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   /*public Fecha(String fechaString) {
			   int indexOfDia=-1;
			   int indexOfMes=-1; //Se puede poner 0 en las dos variables perfectamente.
			   
			   for (int i=0;i<fechaString.length(); i++) {
				   if (fechaString.charAt(i)=='/') indexOfDia=i;
			   }
			   for (int i=fechaString.length()-1;i>=0;i--) {
				   if (fechaString.charAt(i)=='/') indexOfMes=1;
			   }
			   
			   dia=Integer.parseInt(fechaString.substring(0, indexOfDia));
			   mes=Integer.parseInt(fechaString.substring(indexOfDia+1, indexOfMes));
			   anyo=Integer.parseInt(fechaString.substring(indexOfMes+1));
			   }*/
		
		/*
		 * Este constructor lee carácter a carácter el String introducido,
		 * en el primer bucle lee el String hacia delante para identificar
		 * la primera '/' y el segundo bucle lo lee desde el final hacia atrás
		 * para identificar la segunda '/', y después pasa el String a Integer
		 * con los substring empezando en el carácter adecuado y terminando en
		 * la ubicación de la barra.
		 */
	}
}
