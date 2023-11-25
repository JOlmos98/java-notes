package JT01_POO;

public class POO04ejercicio2x3alumno {
	
	//Constructor:
	POO04ejercicio2x3alumno (POO04ejercicio2x2colegio nombrecolegio, String nombre, double nota) {
		
		this.nombre=nombre;
		this.notaalumno=nota;
		this.nombrecolegio=nombrecolegio;
		numalumno=this.classnumalumno;
		this.classnumalumno++;
		
	}
	
	//Variables:
	
	private POO04ejercicio2x2colegio nombrecolegio;
	private String nombre;
	private int numalumno;
	private double notaalumno;
	private static int classnumalumno=0;
	
	//Métodos setter:
	
	public void setnotamedia(double notamedia) {
		notaalumno=notamedia;
	}
	
	//Métodos getter:
	public String getnombrealu() {
		return nombre;
	}
	public int getnumalu() {
		return numalumno;
	}
	public double getnotaalu() {
		return notaalumno;
	}
	public String getcolegioalu() {
		return this.nombrecolegio.getcolegio();
	}
	 //Otros métodos:
	public String toString() {
		return "Nombre: "+this.getnombrealu()+".\nColegio: "+this.getcolegioalu()+".\nNúmero: "+this.getnumalu()+".\nNota media: "+this.getnotaalu()+".\n";
	}
}
