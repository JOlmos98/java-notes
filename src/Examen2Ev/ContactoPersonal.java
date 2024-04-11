package Examen2Ev;

public class ContactoPersonal extends Contacto{

	private String numtelf;
	
	public ContactoPersonal(String ape1, String ape2, String nombre, String dni, String numtelf) {
		super(ape1, ape2, nombre, dni);
		this.numtelf=numtelf;
	}

	public String getNumtelf() {
		return numtelf;
	}

	public void setNumtelf(String numtelf) {
		this.numtelf = numtelf;
	}

	@Override
	public String toString() {
		return super.getApe1() + " " + super.getApe2() + ", " + super.getNombre() + ", DNI: " + super.getDni()+ ", Telf: "+numtelf;
	}
	
	
}
