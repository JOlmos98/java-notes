package Pg2ev;

import java.util.Comparator;

public class Empresa {

	private int id;
	private String nombre;
	private String telefono;
	private String provincia; //null
	//Número de trabajos que han completado en la fecha fechafinprevista o antes.
	private int trabajosatiempo=0;
	//Número de trabajos que han completado después de fechafinprevista.
	private int trabajostarde=0;
	private int porcentajecumplimiento=0;
	
	//Constructor con provincia:
	public Empresa(int id, String nombre, String telefono, String provincia) {	
		this.id=id;
		this.nombre=nombre;
		this.telefono=telefono;
		this.provincia=provincia;
	}
	//Constructor sin provincia:
	public Empresa(int id, String nombre, String telefono) {	
		this.id=id;
		this.nombre=nombre;
		this.telefono=telefono;
	}
	
	public void addTrabajoATiempo() {
		this.trabajosatiempo++;
	}
	public void addTrabajoTarde() {
		this.trabajostarde++;
	}
	public void CalcularPorcentajeCumplimiento() {
		this.setPorcentajeCumplimiento(((this.getTrabajosatiempo()-this.getTrabajostarde())/this.getTrabajosatiempo()+this.getTrabajostarde())*100);
	}
	public int compareToNombre(Empresa e) {
		return this.getNombre().compareTo(e.getNombre());
	}
	public int compareToProvincia(Empresa e) {
	    return this.provincia.compareTo(e.getProvincia());
	}
	public int compareTo(Empresa e) { //Dice si this es más antigua que e.
		if (this.id<e.getId()) return 1;
		else return -1;
	}
	public String toString() {
		return "Empresa: " + id + ", Nombre: " + nombre + ", Telefono: " + telefono + ", Provincia: " + provincia + ".";
	}
	public boolean equals(Empresa e) {
		if (this.id==e.getId()) return true;
		else return false;
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
	public int getTrabajosatiempo() {
		return trabajosatiempo;
	}
	public void setTrabajosatiempo(int trabajosatiempo) {
		this.trabajosatiempo = trabajosatiempo;
	}
	public int getTrabajostarde() {
		return trabajostarde;
	}
	public void setTrabajostarde(int trabajostarde) {
		this.trabajostarde = trabajostarde;
	}
	public int getPorcentajeCumplimiento() {
		return porcentajecumplimiento;
	}
	public void setPorcentajeCumplimiento(int porcentajecumplimiento) {
		this.porcentajecumplimiento = porcentajecumplimiento;
	}
	
}
