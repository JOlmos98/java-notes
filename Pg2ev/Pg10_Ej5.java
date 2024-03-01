package Pg2ev;
/*
 * Utilizando la clase Fecha, desarrolle la clase 
 * Persona para albergar nombre y fecha de nacimiento 
 * de una persona. Incorpórele getters, setters, 
 * constructores, y toString(). En un programa Principal 
 * declare un vector para albergar tres objetos de la clase 
 * Persona, introduzca valores y muéstrelos por pantalla.
 */
public class Pg10_Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona [] personas1=new Persona[3];
		personas1[0]=new Persona("Jesús", "Olmos", "Soler", 18, 9, 1998);
		personas1[1]=new Persona("María", "Inorato", "Egea", 29, 12, 1998);
		personas1[2]=new Persona("Noelia", "Gambín", "Baños", 12, 7, 2001);
		
		System.out.println(personas1[1].toString()+"\n");
		System.out.println(personas1[1].toString1());
		
	}
}

/////////////////////////////////////////////////////////////////////////////////////////

class Persona{
	
	public Persona(String nom, String apei, String apeii, int dianac, int mesnac, int anyonac) {
		nombre=nom;
		ape1=apei;
		ape2=apeii;
		fechanac=new Fecha(dianac, mesnac, anyonac);
	}
	
	//Variables:
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", ape1=" + ape1 + ", ape2=" + ape2 + ", fechanac=" + fechanac + "]";
	}

	public String toString1() {
		return "Nombre: "+nombre+"\nApellidos: "+ape1+" "+ape2+"\nFecha de nacimiento: "+fechanac.getDia()+"/"+fechanac.getMes()+"/"+fechanac.getAnyo();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApe1() {
		return ape1;
	}
	public void setApe1(String ape1) {
		this.ape1 = ape1;
	}
	public String getApe2() {
		return ape2;
	}
	public void setApe2(String ape2) {
		this.ape2 = ape2;
	}
	public Fecha getFechanac() {
		return fechanac;
	}
	public void setFechanac(Fecha fechanac) {
		this.fechanac = fechanac;
	}

	private String nombre;
	private String ape1;
	private String ape2;
	private Fecha fechanac;
}