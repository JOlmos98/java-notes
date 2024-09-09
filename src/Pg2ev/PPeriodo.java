package Pg2ev;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PPeriodo {

	//Variables:
	
	private LocalDate fechainicio;
	private LocalDate fechafin;
	private int dias;
	
	//Constructor:
	
	public PPeriodo(LocalDate fechainicio, LocalDate fechafin) {
		
		this.fechainicio=fechainicio;
		this.fechafin=fechafin;
		this.dias=(int)ChronoUnit.DAYS.between(fechainicio, fechafin);
	}

	//Métodos:
	
	@Override
	public String toString() {
		return "PPeriodo: FI: " + fechainicio + ", FF: " + fechafin;
	}

	public LocalDate getFechainicio() {
		return fechainicio;
	}

	public void setFechainicio(LocalDate fechainicio) {
		this.fechainicio = fechainicio;
	}

	public LocalDate getFechafin() {
		return fechafin;
	}

	public void setFechafin(LocalDate fechafin) {
		this.fechafin = fechafin;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}
	
}
