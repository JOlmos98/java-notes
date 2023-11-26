package JT01_POO;

import java.time.LocalDate;

public class POO05herencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Empleados{
	
	//Constructor:
	public Empleados(String nom, double suel, int agno, int mes, int dia) {
		
		nombre=nom;
		sueldo=suel;
		calendario=LocalDate.of(agno, mes, dia);
		id=idsiguiente;
		idsiguiente++;
		
		
	}
	
	//Variables: 
	private final String nombre;
	private double sueldo;
	private LocalDate calendario;
	private int id;
	private static int idsiguiente=1;
	//Setter:
	public void setSubirSueldo(double porcentajedesubida) {
		double aumento=sueldo*porcentajedesubida/100;
		sueldo+=aumento;
	}
	//Getter:
	public double getSueldo() {
		return sueldo;
	}
	public LocalDate getFechaAlta() {
		return calendario;
	}
	public String getDatosEmpleado() {
		return "Nombre del empleado: "+nombre+"\nID del empleado: "+id;
	}
	
	
}