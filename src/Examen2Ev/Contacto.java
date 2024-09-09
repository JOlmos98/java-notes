package Examen2Ev;

import java.util.Objects;

public class Contacto {

	private String ape1;
	private String ape2;
	private String nombre;
	private String dni;
	
	public Contacto() {}
	
	public Contacto (String ape1, String ape2, String  nombre, String dni) {
		this.ape1=ape1;
		this.ape2=ape2;
		this.nombre=nombre;
		this.dni=dni;
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return ape1 + " " + ape2 + ", " + nombre + ", DNI: " + dni;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(ape1, ape2, dni, nombre);
	}
	//Asigna un código único a cada instancia de la clase Contacto.
	public boolean equals(Contacto c) {
		if (this.getDni().equals(c.getDni())) return true;
		else return false;
	}
	//El equals dice si son iguales o no (devuelve true o false).
	public int compareTo(Contacto c) {
		return this.getApe1().compareTo(c.getApe1());
	}
	//El compareTo los clasifica y les da un orden, en este caso por el primer apellido.
}
