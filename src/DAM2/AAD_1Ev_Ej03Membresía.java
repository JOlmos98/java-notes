package DAM2;

import java.time.LocalDate;

public class AAD_1Ev_Ej03Membresía {
	
	//Variables:
	
	private int id;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private static int contadorId=0;
	
	//Constructor:
	
	AAD_1Ev_Ej03Membresía(LocalDate fechaInicio, LocalDate fechaFin){
		contadorId+=1;
		this.id=contadorId;
		this.fechaInicio=fechaInicio;
		this.fechaFin=fechaFin;
	}

	//Métodos:
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public static int getContadorId() {
		return contadorId;
	}

	public static void setContadorId(int contadorId) {
		AAD_1Ev_Ej03Membresía.contadorId = contadorId;
	}
	

	
	
}
