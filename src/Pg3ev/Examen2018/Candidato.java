package Pg3ev.Examen2018;

import java.time.LocalDate;

public class Candidato {

	//Variables:
	
	private String ape1;
	private String ape2;
	private String nombre;
	private LocalDate fechasolicitud;
	
	//Constructor:
	
	public Candidato() {}
	
	public Candidato(String ape1, String ape2, String nombre, LocalDate fechasolicitud) {
		this.ape1=ape1;
		this.ape2=ape2;
		this.nombre=nombre;
		this.fechasolicitud=fechasolicitud;
	}


	
	//Métodos:

	@Override
	public String toString() {
		return ape1 +" "+  ape2 + ", " + nombre + ", F. Solicitud: "
				+ fechasolicitud + ".";
	}
	
	public int compareToApe1(Candidato c) {
	    int comparacion = this.getApe1().compareTo(c.getApe1());
	    
	    if (comparacion == 0) { //0 significa que son iguales los ape1.
	        if (this.getApe2() == null && c.getApe2() != null) { //Si el primero (this) es null, lo da como primero alfabéticamente.
	            comparacion = -1; //-1 significa menor, es decir, A es menor que Z, va antes.
	        } else if (this.getApe2() != null && c.getApe2() == null) {
	            comparacion = 1; //Si es mayor el this, irá después alfabéticamente.
	        }
	    }
	    
	    return comparacion;
	}
	
	/*public int compareToApe1(Candidato c) {
		return this.getApe1().compareTo(c.getApe1());
	}*/
	
	public int compareToFechasolicitud(Candidato c) {
		return this.getFechasolicitud().compareTo(c.getFechasolicitud());
	}
	
	
	
	public String getApe1() {
		return ape1;
	}

	public void setApe1(String ape1) {
		this.ape1 = ape1;
	}

	public String getApe2() {
		return ape2;
	}

	public void setApe2(String ape2) {
		this.ape2 = ape2;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechasolicitud() {
		return fechasolicitud;
	}

	public void setFechasolicitud(LocalDate fechasolicitud) {
		this.fechasolicitud = fechasolicitud;
	}
}
