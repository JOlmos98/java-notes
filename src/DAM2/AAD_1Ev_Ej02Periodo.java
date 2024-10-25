package DAM2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class AAD_1Ev_Ej02Periodo {
	
	//Variables:
	
	private int dniEmpleado; //8 números.
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	
	//Constructores:
	
	AAD_1Ev_Ej02Periodo(){
		//C. por defecto.
	}
	AAD_1Ev_Ej02Periodo(int dniEmpleado, LocalDate fechaInicio, LocalDate fechaFin){
		this.dniEmpleado=dniEmpleado;
		this.fechaInicio=fechaInicio;
		this.fechaFin=fechaFin;
	}
	
	//Métodos: 
	
	public int getDiasDePeriodo() {
		long dias=0;
		dias=ChronoUnit.DAYS.between(fechaInicio, fechaFin);
		return (int)dias;
	}
	
	public int getDniEmpleado() {
		return dniEmpleado;
	}
	public void setDniEmpleado(int dniEmpleado) {
		this.dniEmpleado = dniEmpleado;
	}
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public LocalDate getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
	@Override
	public String toString() {
		return "AAD_1Ev_Ej02Periodo [dniEmpleado=" + dniEmpleado + ", fechaInicio=" + fechaInicio + ", fechaFin="
				+ fechaFin + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(dniEmpleado, fechaFin, fechaInicio);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AAD_1Ev_Ej02Periodo other = (AAD_1Ev_Ej02Periodo) obj;
		return dniEmpleado == other.dniEmpleado && Objects.equals(fechaFin, other.fechaFin)
				&& Objects.equals(fechaInicio, other.fechaInicio);
	}
	
	
	
	
	
	
	
	
}
