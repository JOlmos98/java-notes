package JT01_POO;

public class POO04ejercicio2x1usocolegio {

	public static void main(String[] args) {
		
		POO04ejercicio2x2colegio ElRaal=new POO04ejercicio2x2colegio("El Raal", 200);
		POO04ejercicio2x2colegio Esparragal=new POO04ejercicio2x2colegio("Esparragal", 450);
		
		ElRaal.nuevoalumno("José Luís", 4);
		ElRaal.nuevoalumno("Jesusito", 8);
		Esparragal.nuevoalumno("Nuria", 10);
		//ElRaal.gettodosalumnos();
		
		ElRaal.expulsaalumno("José Luís");
		ElRaal.setnotamedia("Jesusito", 9);
		System.out.println("Actualización:\n");
		//ElRaal.gettodosalumnos();
		
		Esparragal.nuevoalumno("Sebastian", 2);
		Esparragal.nuevoalumno("Carla", 9);
		Esparragal.nuevoalumno("Antoñito", 7);
		Esparragal.setnotamedia("Nuria", 6.5);
		//Esparragal.gettodosalumnos();
		Esparragal.getdatosalumno("Antoñito");
		
	}

}
