package Pg2ev;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Candidato {

	//Variables:
	
	private String apellido1;
	private String apellido2;
	private String nombre;
	private LocalDate fechaSolicitud;
	
	//Constructor:
	
	Candidato(String apellido1, String apellido2, String nombre, LocalDate fechaSolicitud){
		
		this.nombre=nombre;
		this.apellido1=apellido1;
		this.apellido2=apellido2;
		this.fechaSolicitud=fechaSolicitud;
		
	}
	
	//Métodos:
	
	public int getDiasDesdeIns() {
		
		/*
		 * Este método nos devuelve los días que han pasado
		 * desde que el candidato se inscribió hasta la actualidad.
		 */
		
		long diasdesdeins=0;
		diasdesdeins=this.getFechaSolicitud().until(LocalDate.now(), ChronoUnit.DAYS);
		int INTdiasdesdeins=(int)diasdesdeins;

		return INTdiasdesdeins;
	}
	
	@Override
	public String toString() {
		return apellido1+" "+apellido2+" "+nombre + ". Fecha solicitud: "+fechaSolicitud;
	}
	
	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaSolicitud() {
		return fechaSolicitud;
	}

	public void setFechaSolicitud(LocalDate fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

}
