package Examen2Ev;

public class ContactoProfesional extends Contacto{
	
	private String email;
	
	public ContactoProfesional() {}
	
	public ContactoProfesional(String ape1, String ape2, String nombre, String dni, String email) {
		
		super(ape1, ape2, nombre, dni);
		this.email=email;
		
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return super.getApe1() + " " + super.getApe2() + ", " + super.getNombre() + ", DNI: " + super.getDni()+ ", Email: "+email;
	}
	
}
