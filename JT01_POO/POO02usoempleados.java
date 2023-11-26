package JT01_POO;

public class POO02usoempleados {

	public static void main(String[] args) {
		/*
		Empleados empleado1=new Empleados("Antonio");
		System.out.println(empleado1.getdatosempleado());
		System.out.println();
		empleado1.setseccion("RRHH");
		Empleados empleado2=new Empleados("Nuria");
		System.out.println(empleado1.getdatosempleado()+"\n"+empleado2.getdatosempleado());
		Empleados empleado3=new Empleados("Raúl");
		System.out.println("///\n///\n///");
		System.out.println("Datos de los empleados: \n"+empleado1.getdatosempleado()+"\n"+empleado2.getdatosempleado()+"\n"+empleado3.getdatosempleado());
		System.out.println(Empleados.getnextid()); //Esto sería un método static, en este caso getter.
		*/
	}
}
///////////////////////////////////////////////////////////////////////////////////////////
//Constructor y métodos:
/*
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
	public static String getnextid() {
		return "El ID del siguiente empleado será: "+nextid; 
		//Un método static no puede devolver una variable que no sea static, es decir, que no pertenezca a la clase.
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
*/