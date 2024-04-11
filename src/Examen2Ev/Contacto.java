package Examen2Ev;

public class Contacto {
	//COMENTARIO DE CONFIRMACION DEL PUTO EXITO
	/*
	 * PULL PARA ACTUALIZAR EL LOCAL TENIENDO COMO REFERENCIA EL ONLINE Y
	 * PUSH PARA ACTUALIZAR EL ONLINE TENIENDO COMO REFERENCIA EL LOCAL.
	 */
	//PEEEEEEEEEEEEEEERFECTO
	private String ape1;
	private String ape2;
	private String nombre;
	private String dni;
	
	public Contacto() {}
	
	public Contacto (String ape1, String ape2, String  nombre, String dni) {
		this.ape1=ape1;
		this.ape2=ape2;
		this.nombre=nombre;
		this.dni=dni;
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return ape1 + " " + ape2 + ", " + nombre + ", DNI: " + dni;
	}

}
