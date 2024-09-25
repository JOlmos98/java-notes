package DAM2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Objects;

public class AAD_1Ev_Ej03Cliente {
	
	//Variables:
	
	private int id;
	private String nombre;
	private LocalDate fechaNacimiento;
	private static int idContador=0;
	private ArrayList<AAD_1Ev_Ej03Membresía> membresias;
	
	//Constructores:
	
	AAD_1Ev_Ej03Cliente(String nombre, LocalDate fechaNacimiento){
		idContador+=1;
		this.id=idContador;
		this.nombre=nombre;
		this.fechaNacimiento=fechaNacimiento;
		this.membresias=new ArrayList();
	}

	//Métodos:
	
	public int getDiasDeFidelidad() {
		long dias=0;
		dias=ChronoUnit.DAYS.between(this.membresias.get(0).getFechaInicio(), this.membresias.get(0).getFechaFin());
		return (int)dias;
	}
	
	public int compareTo(AAD_1Ev_Ej03Cliente c) {
		if (this.getDiasDeFidelidad()<c.getDiasDeFidelidad()) return -1;
		else if (this.getDiasDeFidelidad()>c.getDiasDeFidelidad()) return 1;
		else return 0;
	}
	
	public ArrayList<AAD_1Ev_Ej03Membresía> getMembresias() {
		return membresias;
	}

	public void setMembresias(ArrayList<AAD_1Ev_Ej03Membresía> membresias) {
		this.membresias = membresias;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public static int getIdContador() {
		return idContador;
	}

	public static void setIdContador(int idContador) {
		AAD_1Ev_Ej03Cliente.idContador = idContador;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fechaNacimiento, id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AAD_1Ev_Ej03Cliente other = (AAD_1Ev_Ej03Cliente) obj;
		return Objects.equals(fechaNacimiento, other.fechaNacimiento) && id == other.id
				&& Objects.equals(nombre, other.nombre);
	}
	
}
