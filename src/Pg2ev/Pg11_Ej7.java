package Pg2ev;

import java.util.ArrayList;

/*
 * Desarrolle un método que ordene un ArrayList<Persona> 
 * en base al nombre. Existe una utilidad para ello, la 
 * clase Collections; en este caso, no la utilice.
 */
public class Pg11_Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Personaej5> AL7=new ArrayList();
		
		Fecha[] f7=new Fecha[3];
		f7[0]=new Fecha("17/9/1999");
		f7[1]=new Fecha("8/9/2039");
		f7[2]=new Fecha("1/6/2022");
		AL7.add(new Personaej5("Sebastián", f7));
		
		Fecha[] f8=new Fecha[3];
		f8[0]=new Fecha("19/9/1989");
		f8[1]=new Fecha("19/9/2015");
		f8[2]=new Fecha("12/2/2000");
		AL7.add(new Personaej5("Alberto", f8));
		
		System.out.println(AL7.get(0).getFechas());
		System.out.println(f7[1]);
		System.out.println(AL7.get(0).getNombre());
		System.out.println(AL7.get(1).getFechas()[0]);
		System.out.println(AL7.get(1).getFechas()[2].getAnyo());
		System.out.println();
		
		Fecha[] f9=new Fecha[3];
		f9[0]=new Fecha("1/9/1999");
		f9[1]=new Fecha("13/4/2038");
		f9[2]=new Fecha("11/5/2022");
		AL7.add(new Personaej5("Javier", f9));
		
		Fecha[] f0=new Fecha[3];
		f0[0]=new Fecha("12/9/1997");
		f0[1]=new Fecha("12/4/2035");
		f0[2]=new Fecha("13/5/2024");
		AL7.add(new Personaej5("Víctor", f0));
		
		Fecha[] f01=new Fecha[3];
		f01[0]=new Fecha("1/9/1999");
		f01[1]=new Fecha("13/4/2038");
		f01[2]=new Fecha("11/5/2022");
		AL7.add(new Personaej5("Iker", f01));
		
		Fecha[] f02=new Fecha[3];
		f02[0]=new Fecha("18/9/1998");
		f02[1]=new Fecha("13/4/2031");
		f02[2]=new Fecha("11/5/2020");
		AL7.add(new Personaej5("Jesús", f02));
		
		for (int i=0;i<AL7.size();i++) {
			System.out.println(i+". "+AL7.get(i).getNombre());
		}
		
		Personaej5.sortAL(AL7);
		System.out.println("\nImprimos la lista después de ordenar:\n");
		
		for (int i=0;i<AL7.size();i++) {
			System.out.println(i+". "+AL7.get(i).getNombre());
		}
	}
}
