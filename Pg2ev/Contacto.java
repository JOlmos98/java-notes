package Pg2ev;

public class Contacto {
	
	public Contacto(String nombre, String  ape1, String  ape2, String  telefono, String  direccion, int edad, String dni) {
		this.nombre=nombre;
		this.ape1=ape1;
		this.ape2=ape2;
		this.telefono=telefono;
		this.direccion=direccion;
		this.edad=edad;
		this.dni=dni;
	}
	
	private String nombre;
	private String ape1;
	private String ape2;
	private String telefono;
	private String direccion;
	private int edad;
	private String dni;
	
	public int compareTo(Contacto c) {
		if (this.edad>c.getEdad()) return 1;
		else if(this.edad<c.getEdad()) return -1;
		else return 0;
	}
	
	public boolean equals(Contacto c) {
		if (this.nombre.equals(c.getNombre())&&this.ape1.equals(c.getApe1())&&this.ape2.equals(c.getApe2())&&this.dni.equals(c.getDni())) return true;
		else return false;
	}
	
	public String toString() {
		return "Nombre: "+nombre+" "+ape1+" "+ape2+"\nTeléfono: "+telefono+"\nDirección: "+direccion;
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
}
