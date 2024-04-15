package Examen2Ev;

import java.time.LocalDate;

public class Trabajo {

	/*
	 * Hay que hacer un método que coja los trabajos y los sume a un AL de
	 * una empresa, esa empresa
	 */
	
	//Variables:
	
	EmpresaTrabajo empresa;
	LocalDate fechainicio;
	LocalDate fechafinprevista;
	LocalDate fechafinreal;
	double importe;
	String descripcion;
	
	//Constructor:
	
	public Trabajo() {}
	
	public Trabajo(EmpresaTrabajo empresa, LocalDate fechainicio, LocalDate fechafinprevista, LocalDate fechafinreal, double importe, String descripcion) {
		this.empresa=empresa;
		this.fechainicio=fechainicio;
		this.fechafinprevista=fechafinprevista;
		this.fechafinreal=fechafinreal;
		this.importe=importe;
		this.descripcion=descripcion;
	}
	
	//Métodos:
	
	
	
	public EmpresaTrabajo getEmpresa() {
		return empresa;
	}

	public void setEmpresa(EmpresaTrabajo empresa) {
		this.empresa = empresa;
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
