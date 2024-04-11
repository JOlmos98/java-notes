package Pg2ev;

import java.time.LocalDate;

public class Cita {
	
	private int id;
	private LocalDate fecha;
	private String estado; //Pendiente, Realizada, Cancelada.
	private String observaciones;
	
	//Constructor con observaciones:
	public Cita(int id, LocalDate fecha, String estado, String observaciones) {
		this.id=id;
		this.fecha=fecha;
		this.estado=estado;
		this.observaciones=observaciones;
	}
	//Constructor sin observaciones:
	public Cita(int id, LocalDate fecha, String estado) {
		this.id=id;
		this.fecha=fecha;
		this.estado=estado;
	}
	
	
	
	public int compareTo(Cita c) { //Me dice si this es más antigua que c.
	    return this.fecha.compareTo(c.getFecha());
	}
	public boolean equals(Cita c) {
		if (this.id==c.getId()) return true;
		else return false;
	}
	public String toString() {
		return "Cita: " + id + ", Fecha: " + fecha + ", Estado: " + estado + ", Observaciones: " + observaciones + ".";
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
