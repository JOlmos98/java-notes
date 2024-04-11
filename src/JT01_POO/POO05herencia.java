package JT01_POO;

import java.time.LocalDate;

public class POO05herencia { 

	public static void main(String[] args) {
		/*
		Empleados manuel=new Empleados("Manuel", 1100.5, 2008, 12, 23);
		Jefes ana=new Jefes("Ana", 1345.64, 2003, 04, 23);
		System.out.println(ana.getSueldo());
		ana.setSubirSueldo(10);
		System.out.println(ana.getSueldo());
		ana.setIncentivo(150);
		System.out.println("El sueldo de Ana con la subida del 10% más el incentivo es:\n"+ana.getSueldo());
		*/
		Jefes Isaac=new Jefes("Isaac", 1234.56, 2002, 1, 7);
		Isaac.setIncentivo(150);
		Empleados[] arrayEmpleados=new Empleados[6];
		
		arrayEmpleados[0]=new Empleados("José", 1200.34, 2007, 12, 2);
		arrayEmpleados[1]=new Empleados("Samuel", 2132, 2004, 12, 2);
		arrayEmpleados[2]=new Empleados("Alberto", 1100.34, 2004, 12, 2);
		arrayEmpleados[3]=new Empleados("Daniel", 1050.34, 2005, 1, 2);
		arrayEmpleados[4]=Isaac; //Principio de sustitución. (upcasting o casting implícito)
		arrayEmpleados[5]=new Jefes("Isabel", 2300, 2001, 1,2); // 1. Haremos un down casting con este objeto de tipo Empleados.
		// 2. No nos dejaria hacer arrayEmpleados[5].setIncentivo(); porque es de tipo Empleados.
		Jefes Isabel=(Jefes)arrayEmpleados[5]; //Down casting, un objeto de tipo Empleados lo hacemos de tipo Jefes.
		// 3. Con esta variable de tipo Jefes declarada si nos dejaria usar el método anterior.
		Isabel.setIncentivo(175);
		
		for (Empleados variable:arrayEmpleados) {
			System.out.println(variable.getDatosEmpleado()+"\nSueldo: "+variable.getSueldo()+"\n");
		}}} //El enlazado dinámico es que en este for, la "variable" identifica la naturaleza del objeto y el getSueldo actúa según su naturaleza.
		/*
		 * El polimorfismo es como el objeto Isaac puede ser usado como
		 * objeto de clase Empleados o de clase Jefes según el contexto.
		 */
		
		/* QUITAR ESTO PARA QUE FUNCIONE	
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
*/ //QUITAR ESTO PARA QUE FUNCIONE