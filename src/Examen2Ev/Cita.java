package Examen2Ev;

import java.time.LocalDate;
import java.util.Objects;

public class Cita {

	//Variables:
	
	int id;
	LocalDate fecha;
	String estado;
	String observaciones;
	
	//Constructor:
	
	public Cita() {}
	
	public Cita(int id, LocalDate fecha, String estado, String observaciones) {
		this.id=id;
		this.fecha=fecha;
		this.estado=estado;
		this.observaciones=observaciones;
	}
	
	public Cita(int id, LocalDate fecha, String estado) {
		this.id=id;
		this.fecha=fecha;
		this.estado=estado;
	}

	//Métodos:
	
	@Override
	public int hashCode() {
		return Objects.hash(estado, fecha, id, observaciones);
	}

	public boolean equals(Cita c) {
		if (this.getId()==c.getId()&&this.getFecha().isEqual(c.getFecha())) return true;
		else return false;
	}
	
	public int compareTo(Cita c) {
		return this.fecha.compareTo(c.getFecha());
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
}
