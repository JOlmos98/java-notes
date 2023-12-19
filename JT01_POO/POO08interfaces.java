package JT01_POO;

import java.time.LocalDate;
import java.util.Arrays;

public class POO08interfaces {

	public static void main(String[] args) {
		
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
		} //El enlazado dinámico es que en este for, la "variable" identifica la naturaleza del objeto y el getSueldo actúa según su naturaleza.
		/*
		 * El polimorfismo es como el objeto Isaac puede ser usado como
		 * objeto de clase Empleados o de clase Jefes según el contexto.
		 */
		Jefes Antonio=new Jefes("Antonio", 2331, 2000, 10, 12);
		Antonio.setCargo("Director de RRHH"); 
		Antonio.getCargo(); //Métodos de interfaz.
		System.out.println(Antonio.getCargo());
		
		Empleados Empleados2[]=new Empleados[5];
		
		Empleados2[0]=new Empleados("Ramón", 2300, 2000, 12, 12);
		Empleados2[1]=new Empleados("Alejandra", 1400, 2010, 12, 12);
		Empleados2[2]=new Empleados("Sonia", 1900, 2004, 12, 12);
		Empleados2[3]=new Empleados("Berto", 4000, 2005, 12, 12);
		Empleados2[4]=new Empleados("Daniel", 1200, 2002, 12, 12);
				
		Arrays.sort(Empleados2);
/*
* El método sort de la clase Arrays ordena los empleados del array EMpleados2
* de menor sueldo a mayor porque hemos implementado la interface Comparable y
* usado el método compareTo para que devuelva -1 si el sueldo es menor que el
* argumento del método y +1 si el this.sueldo es mayor que el argumento del 
* método compareTo, si son iguales, return 0;
*/
		for (Empleados e:Empleados2) {
			System.out.println(e.getDatosEmpleado());
		}
		System.out.println("--------------------------------------------");
		
		Jefes Manolo=new Jefes("Manolo", 2500, 2002, 5, 6);
		Empleados Ariadna=new Empleados("Ariadna", 2000, 2005, 4, 12);
		
		System.out.println("El trabajador Manolo tiene un bonus de "+Manolo.setBonus(500));
		System.out.println("El trabajador Ariadna tiene un bonus de "+Ariadna.setBonus(500));
		//Cada método, según la clase, aplica un bonus u otro.
	}
}
///////////////////////////////////////////////////////////////////////////////
class Empleados implements Comparable, ParaTrabajadores{
	
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
		return "Nombre del empleado: "+nombre+"\nID del empleado: "+id+"\nSueldo: "+sueldo;
	}
	@Override
	public int compareTo(Object o) {
		
		Empleados otroEmpleado=(Empleados)o;
		
		if (this.sueldo<otroEmpleado.sueldo) return -1;
		else if (this.sueldo>otroEmpleado.sueldo) return 1;
		else return 0;
	}
	@Override
	public double setBonus(double gratificacion) {
		// TODO Auto-generated method stub
		
		return ParaTrabajadores.bonus+gratificacion;
	}
	
	
}

class Jefes extends Empleados implements ParaJefes{

	public Jefes(String nom, double suel, int agno, int mes, int dia) {
		super(nom, suel, agno, mes, dia);
	}
	//Variables:
	private double incentivo;
	private String cargo;
	//Setter:
	public void setIncentivo(double cifra) {
		incentivo=cifra;
	}
	//Getter:
	public double getSueldo() {
		double sueldojefe=super.getSueldo();
		return sueldojefe+incentivo;
	}
	@Override
	public void setCargo(String cargo) {
		// TODO Auto-generated method stub
		this.cargo=cargo;
	}
	@Override
	public String getCargo() {
		// TODO Auto-generated method stub
		return "Tiene el cargo de "+cargo;
	}
	@Override
	public double setBonus(double gratificacion) {
		// TODO Auto-generated method stub
		
		double prima=2000;
		
		return prima+gratificacion+ParaJefes.bonus; //O ParaTrabajadores.bonus
	}
}