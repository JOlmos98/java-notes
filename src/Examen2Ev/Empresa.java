package Examen2Ev;

import java.util.Objects;

public class Empresa {
	
	//Variables:
		
	int id;
	String nombre;
	String telefono;
	String provincia;
	
	//Constructor:
	
	public Empresa() {}
	
	public Empresa(int id, String nombre, String telefono, String provincia) {
		this.id=id;
		this.nombre=nombre;
		this.telefono=telefono;
		this.provincia=provincia;
	}
	
	public Empresa(int id, String nombre, String telefono) {
		this.id=id;
		this.nombre=nombre;
		this.telefono=telefono;
	}


	
	//Métodos:
	
	@Override
	public String toString() {
		return "Empresa [id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + ", provincia=" + provincia + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, nombre, provincia, telefono);
	}
	
	public boolean equals(Empresa e) {
		if (this.getId()==e.getId()) return true;
		else return false;
	}
	
	public int compareTo(Empresa e) {
		return this.getNombre().compareTo(e.getNombre());
	}
	
	public int compareToProvincia(Empresa e) {
		return this.getProvincia().compareTo(e.getProvincia());
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
}
