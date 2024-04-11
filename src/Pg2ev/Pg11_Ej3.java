package Pg2ev;

import java.util.ArrayList;

/*
 * Se le proporciona la clase FechasPersona. 
 * Desarrolle un programa que construya un 
 * array de 10 elementos de la clase FechasPersona. 
 * Asigne valor a tres de ellos.
 */
public class Pg11_Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FechasPersona [] arrayfp=new FechasPersona[10];
		
		arrayfp[0]=new FechasPersona(new Fecha(12, 3, 2009), new Fecha("12/12/2034"), new Fecha("1/4/2026"));
		arrayfp[1]=new FechasPersona(new Fecha(6, 11, 1999), new Fecha("12/12/2022"), new Fecha("1/4/2020"));
		arrayfp[2]=new FechasPersona(new Fecha(2, 5, 1967), new Fecha("4/1/1989"), new Fecha("1/4/1981"));

		System.out.println(arrayfp[1].getFechaNacimiento());
	}
}

////////////////////////////////////////////////////////////////////////////////////////////

class FechasPersona {
	
	   private Fecha fechaNacimiento;
	   private Fecha fechaBoda;
	   private Fecha fechaTrabajo;
	   
	   // ...
	    
	   public FechasPersona(Fecha fn, Fecha fb, Fecha ft) {
	   	fechaNacimiento = fn;
	   	fechaBoda = fb;
	   	fechaTrabajo = ft;
	   }
	   
	   // ...
	   
	    public Fecha getFechaNacimiento() {
			return fechaNacimiento;
		}

		public void setFechaNacimiento(Fecha fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}

		public Fecha getFechaBoda() {
			return fechaBoda;
		}

		public void setFechaBoda(Fecha fechaBoda) {
			this.fechaBoda = fechaBoda;
		}


		public Fecha getFechaTrabajo() {
			return fechaTrabajo;
		}


		public void setFechaTrabajo(Fecha fechaTrabajo) {
			this.fechaTrabajo = fechaTrabajo;
		}
	    
	 }