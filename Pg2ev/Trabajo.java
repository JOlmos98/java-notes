package Pg2ev;

import java.time.LocalDate;
import java.util.ArrayList;

public class Trabajo {
	
	private LocalDate fechainicio;
	private LocalDate fechafinprevista;
	private LocalDate fechafinreal;
	private double importe;
	private String descripcion;
	
	public Trabajo(LocalDate fechainicio , LocalDate fechafinprevista, LocalDate fechafinreal, double importe, String descripcion) {
		
		this.fechainicio=fechainicio;
		this.fechafinprevista=fechafinprevista;
		this.fechafinreal=fechafinreal;
		this.importe=importe;
		this.descripcion=descripcion;		
	}

	
	
	public void sumarTrabajo(Empresa e) {
		/*
		 * Este método hace que aumente una de las dos variables
		 * de la empresa en cuestión, dependiendo de las fechas
		 * aumentará trabajostarde o trabajosatiempo.
		 */
		
		if (this.getFechafinprevista().compareTo(this.getFechafinreal())==1) e.addTrabajoTarde();
		else e.addTrabajoATiempo();
	}
	
	public LocalDate getFechainicio() {
		return fechainicio;
	}

	public void setFechainicio(LocalDate fechainicio) {
		this.fechainicio = fechainicio;
	}

	public LocalDate getFechafinprevista() {
		return fechafinprevista;
	}

	public void setFechafinprevista(LocalDate fechafinprevista) {
		this.fechafinprevista = fechafinprevista;
	}

	public LocalDate getFechafinreal() {
		return fechafinreal;
	}

	public void setFechafinreal(LocalDate fechafinreal) {
		this.fechafinreal = fechafinreal;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
