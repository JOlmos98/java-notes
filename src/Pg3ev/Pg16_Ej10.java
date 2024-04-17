package Pg3ev;

public class Pg16_Ej10 {

	public static void main ( String[] args )
	 {

	   int a;

	   try {
	     a=LeeEntero();
	   }
	   //   catch (RuntimeException ex)
	   catch (NumberFormatException ex) {
	     System.out.println(); 
	     System.out.println("Problemas. Probablemente no se introdujo un valor numerico");    
	     System.out.println("Se considerara introducido valor 1"); 
	     System.out.println("Informacion tecnica: " + ex.getMessage());
	     System.out.println();
	     a=1;
	   } 

	   if (a<0) a=-a;
	   System.out.println("El valor absoluto es "+a);
	 }


	public static int  LeeEntero() {
		int    a;
		String s;

		System.out.print("Introduzca un numero y yo le indicare su valor absoluto ");
		s=System.console().readLine();
		a=Integer.parseInt(s);          
		return a;
	}

}
