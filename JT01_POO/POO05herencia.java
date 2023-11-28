package JT01_POO;

import java.time.LocalDate;

public class POO05herencia {

	public static void main(String[] args) {
		
		Empleados manuel=new Empleados("Manuel", 1100.5, 2008, 12, 23);
		Jefes ana=new Jefes("Ana", 1345.64, 2003, 04, 23);
		System.out.println(ana.getSueldo());
		ana.setSubirSueldo(10);
		System.out.println(ana.getSueldo());
		ana.setIncentivo(150);
		System.out.println("El sueldo de Ana con la subida del 10% más el incentivo es:\n"+ana.getSueldo());
		
	}
}
///////////////////////////////////////////////////////////////////////////////
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

class Jefes extends Empleados{

	public Jefes(String nom, double suel, int agno, int mes, int dia) {
		super(nom, suel, agno, mes, dia);
	}
	//Variables:
	private double incentivo;
	//Setter:
	public void setIncentivo(double cifra) {
		incentivo=cifra;
	}
	//Getter:
	public double getSueldo() {
		double sueldojefe=super.getSueldo();
		return sueldojefe+incentivo;
	}
	
	
}