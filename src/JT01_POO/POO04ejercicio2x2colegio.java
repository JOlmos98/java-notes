package JT01_POO;

public class POO04ejercicio2x2colegio {

	//Constructor:
	POO04ejercicio2x2colegio (String nombre, int capacidad){
		
		this.nombrecolegio=nombre;
		arrayalumnos=new POO04ejercicio2x3alumno[capacidad];
		
	}

	//Variables:
	
	private String nombrecolegio;
	private int capacidad;
	private POO04ejercicio2x3alumno arrayalumnos[];
	private int posicionarray=0;
	
	//Métodos setter:
	public void nuevoalumno(String nombre, double notamedia) {
		POO04ejercicio2x3alumno nuevoalumno=new POO04ejercicio2x3alumno(this, nombre, notamedia);
		arrayalumnos[posicionarray]=nuevoalumno;
		posicionarray++;
	}
	public void expulsaalumno(String alumno) {
		for (int i=0;i<arrayalumnos.length;i++) {
			if (this.getalumno(i)!=null) {
				if (arrayalumnos[i].getnombrealu().equals(alumno)) {
					arrayalumnos[i]=null;
				}
			}
		}
	}
	public void gettodosalumnos() {
		for (int i=0;i<arrayalumnos.length;i++) {
			if (this.getalumno(i)!=null) {
				System.out.println(this.getalumno(i));
				System.out.println();
			}
		}
	}
	public void getdatosalumno(String alumno) {
		for (int i=0;i<arrayalumnos.length;i++) {
			if (this.getalumno(i)!=null) {
				if (arrayalumnos[i].getnombrealu().equals(alumno)) {
				System.out.println(this.getalumno(i));
				System.out.println();
				}
			}
		}
	}
	public void setnotamedia(String alumno, double notamedia) {
		for (int i=0;i<arrayalumnos.length;i++) {
			if (this.getalumno(i)!=null) {
				if (arrayalumnos[i].getnombrealu().equals(alumno)) {
					arrayalumnos[i].setnotamedia(notamedia);
				}
			}
		}
	}
	
	//Métodos getter:
	private POO04ejercicio2x3alumno getalumno(int nalumno) {
		return arrayalumnos[nalumno];
	}
	public String getcolegio() {
		return nombrecolegio;
	}
	
}
