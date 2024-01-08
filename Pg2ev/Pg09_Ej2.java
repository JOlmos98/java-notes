package Pg2ev;
/*
 * Atienda al comentario sobre el método equals() 
 * de la clase String. En la clase Fechadesarrolle 
 * un método equals() y el método public boolean 
 * isposterior(Fecha f). Utilice ambos desde un 
 * programa principal.
 */
public class Pg09_Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ver si comparando con .equlas un String y un array de char, funciona.
		
		String ejemplo="casa";
		char [] array= {'c','a','s','a'};
		
		System.out.println(ejemplo.equals(array)+"\n");
		//Vaya, da false.
		
		// ...
		
		Fecha fecha2=new Fecha(15,4,1999);
		
		System.out.println(fecha2.Equals(new Fecha(13,2,2005)));
		System.out.println(fecha2.Equals(new Fecha(15,4,1999)));
		System.out.println(fecha2.isposterior(new Fecha(20,12,1995)));
		System.out.println(fecha2.isposterior(new Fecha(20,12,2016)));
	}
}
