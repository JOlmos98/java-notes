package JT01_POO;

public class POO02usoempleados {

	public static void main(String[] args) {
		
		Empleados empleado1=new Empleados("Antonio");
		System.out.println(empleado1.getdatosempleado());
		System.out.println();
		empleado1.setseccion("RRHH");
		Empleados empleado2=new Empleados("Nuria");
		System.out.println(empleado1.getdatosempleado()+"\n"+empleado2.getdatosempleado());
		Empleados empleado3=new Empleados("Raúl");
		System.out.println("///\n///\n///");
		System.out.println("Datos de los empleados: \n"+empleado1.getdatosempleado()+"\n"+empleado2.getdatosempleado()+"\n"+empleado3.getdatosempleado());
		
	}
}

//Constructor y métodos:
class Empleados {
	
	public Empleados (String nombre) {
		
		this.nombre=nombre;
		seccion="Administración";
		id=nextid;
		nextid++;
		
	}
	
	//Getters:
	public String getdatosempleado() {
		return "Datos del empleado:\nNombre: "+nombre+"\nSección: "+seccion+"\nID: "+id;
	}
	//Setters:
	public void setseccion(String seccion) {
		this.seccion=seccion;
	}
	//Variables:
	private final String nombre;
	private String seccion;
	private int id;
	private static int nextid=1; //Al ser static, el ++ si afecta y se guarda.
}