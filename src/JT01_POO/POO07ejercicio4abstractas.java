package JT01_POO;

import java.time.LocalDate;

public class POO07ejercicio4abstractas {

	public static void main(String[] args) {
		
		Empleado [] Empleados=new Empleado[4];
		
		Empleados[0]=new EmpleadoAsalariado("6546546Z", "Antonio López", 2014, 2, 10, 1125);
		Empleados[1]=new EmpleadoComision("7879879S", "Sandra Nieto", 2011, 4, 23, 169, 7.1);
		Empleados[2]=new EmpleadoComision();
		Empleados[3]=new EmpleadoAsalariado();
		
		((EmpleadoComision)Empleados[2]).setDatosGenerales("4654654D", "Manuel Ruíz", 2010, 1, 23);
		((EmpleadoComision)Empleados[2]).setClientesYComision(35, 6.9);
		
		((EmpleadoAsalariado)Empleados[3]).setDatosGenerales("77879878F", "María Ramos", 2011, 7, 24);
		((EmpleadoAsalariado)Empleados[3]).setSalario(1055);
		
		Empleado.sueldoMayor(Empleados);
		
		System.out.println("El salario del segundo empleado a comisión es: "+((EmpleadoComision)Empleados[2]).getSalario()+"\n");
		
		Empleado.mostrarTodos(Empleados);
	}
}

////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////

abstract class Empleado { //LA CLASE ABSTRACTA.
	
	public Empleado () { //Constructor por defecto.
	}
	
	public Empleado (String dniin, String nombreapellidosin, int agnoalta, int mesalta, int diaalta) {
		dni=dniin;
		nombreapellidos=nombreapellidosin;
		fechaalta=LocalDate.of(agnoalta, mesalta, diaalta);
	}
	
	//Variables:
	protected String dni;
	protected String nombreapellidos;
	protected LocalDate fechaalta;
	
	//Métodos setters:
	
	//Métodos getters:
	public void imprimir() { //Supongo que imprime los datos generales del empleado.
		System.out.println("Datos generales del empleado.\nDNI: "+dni+".\nNombre: "+nombreapellidos+".\nFecha de alta: "+fechaalta+".\n");
	}
	abstract public double getSalario();
	abstract public String getNombre();
	abstract public String getDNI();
	abstract public LocalDate getFechaAlta();
	public static void sueldoMayor(Empleado[] arrayempleados) {
		Empleado mayor=arrayempleados[0];
		for (int i=0;i<arrayempleados.length;i++) {
			if (arrayempleados[i].getSalario()>mayor.getSalario()) mayor=arrayempleados[i];
		} System.out.println("El empleado que más cobra es "+mayor.getNombre()+" con un salario de "+mayor.getSalario());
	}
	public static void mostrarTodos(Empleado[] arrayempleados) {
		for (int i=0;i<arrayempleados.length;i++) {
			System.out.println("Datos del empleado "+(i+1)+":\nNombre: "+arrayempleados[i].getNombre()+".\nDNI: "+arrayempleados[i].getDNI()+".\nFecha de alta: "+arrayempleados[i].getFechaAlta()+".\nSalario: "+arrayempleados[i].getSalario()+".\n");
		}
	}
}

//////////

class EmpleadoAsalariado extends Empleado {
	
	public EmpleadoAsalariado() {//Constructor por defecto.
	}
	public EmpleadoAsalariado(String dniin, String nombreapellidosin, int agnoalta, int mesalta, int diaalta, int salario) {
		super(dniin, nombreapellidosin, agnoalta, mesalta, diaalta);
		// TODO Auto-generated constructor stub
		salariofijo=salario;
		antiguedad=fechaalta.getYear()-fecha.getYear();
	}
	
	//Variables: 
	private double salariofijo;
	private LocalDate fecha=LocalDate.now();
	private int antiguedad;
	
	//Métodos setters:
	public void setDatosGenerales(String dniin, String nombreyapellidos, int agnoalta, int mesalta, int diaalta) {
		this.dni=dniin;
		this.nombreapellidos=nombreyapellidos;
		this.fechaalta=LocalDate.of(agnoalta, mesalta, diaalta);
	}
	public void setSalario(double establecesalario) {
		salariofijo=establecesalario;
	}
	
	//Métodos getters:
	@Override
	public double getSalario() {
		if (antiguedad<2) return (int)salariofijo;
		else if (antiguedad==2||antiguedad==3) return (int)(salariofijo*1.07);
		else if (antiguedad>=4||antiguedad<=8) return (int)(salariofijo*1.11);
		else if (antiguedad>=9||antiguedad<=15) return (int)(salariofijo*1.17);
		else return (int)(salariofijo*1.2);
	}
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombreapellidos;
	}
	@Override
	public String getDNI() {
		// TODO Auto-generated method stub
		return dni;
	}
	@Override
	public LocalDate getFechaAlta() {
		// TODO Auto-generated method stub
		return fechaalta;
	}
}

//////////

class EmpleadoComision extends Empleado {

	public EmpleadoComision() {
	}
	public EmpleadoComision(String dniin, String nombreapellidosin, int agnoalta, int mesalta, int diaalta, double clientes, double comision) {
		super(dniin, nombreapellidosin, agnoalta, mesalta, diaalta);
		// TODO Auto-generated constructor stub
		this.clientes=clientes;
		this.comision=comision;
	}
	
	//Variables:
	private double clientes;
	private double comision;
	private double salariobase=950;
	
	//Métodos setters:
	public void setDatosGenerales(String dniin, String nombreyapellidos, int agnoalta, int mesalta, int diaalta) {
		this.dni=dniin;
		this.nombreapellidos=nombreyapellidos;
		this.fechaalta=LocalDate.of(agnoalta, mesalta, diaalta);
	}
	public void setClientesYComision(double clientes, double comision) {
		this.clientes=clientes;
		this.comision=comision;
	}
	
	//Métodos getters:
	@Override
	public double getSalario() {
		// TODO Auto-generated method stub
		if (clientes*comision>salariobase) return (int)(clientes*comision);
		else return (int)salariobase;
	}
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombreapellidos;
	}
	@Override
	public String getDNI() {
		// TODO Auto-generated method stub
		return dni;
	}
	@Override
	public LocalDate getFechaAlta() {
		// TODO Auto-generated method stub
		return fechaalta;
	}
}


