package Pg2ev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PEmpleado {

	//Variables:
	
	private static int idcontador=0;
	
	private int idempleado;
	private int categoria; //Del 1 al 3, siendo 1 la más privilegiada.
	private String nombre;
	private String direccion;
	private ArrayList<PPeriodo> periodos;
	private int diasdevacaciones=0;
	
	//Constructor:
	
	public PEmpleado(String nombre, String direccion, int categoria) {
		
		idcontador++;
		idempleado=idcontador;
		this.categoria=categoria;
		this.nombre=nombre;
		this.direccion=direccion;
		periodos=new ArrayList();
		
	}
	
	//Métodos:
	
	public int getIdempleado() {
		return idempleado;
	}

	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<PPeriodo> getPeriodos() {
		return periodos;
	}

	public void setPeriodos(ArrayList<PPeriodo> periodos) {
		this.periodos = periodos;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	
	public int calcularDiasdevacaciones() {
		diasdevacaciones=0;
		int suma=0;
		for (int i=0;i<this.getPeriodos().size();i++) {
			suma=this.getPeriodos().get(i).getDias();
			diasdevacaciones=diasdevacaciones+suma;
		}
		
		return diasdevacaciones;
	}
	
	public int getDiasdevacaciones() {
		return diasdevacaciones;
	}

	public void setDiasdevacaciones(int diasdevacaciones) {
		this.diasdevacaciones = diasdevacaciones;
	}

	@Override
	public String toString() {
		return "PEmpleado " + idempleado + "\nNombre: " + nombre + "\nDireccion: " + direccion + "\nPeriodos: "
				+ periodos;
	}
	
	public static ArrayList<PEmpleado> seleccion (ArrayList<PEmpleado> empleados){
		ArrayList<PEmpleado> seleccion=new ArrayList();
		int diassuma=0;
		for (int i=0;i<empleados.size();i++) {
			if (empleados.get(i).getCategoria()==2) {
				for (int a=0;a<empleados.get(i).getPeriodos().size();a++) {
					diassuma=empleados.get(i).getDiasdevacaciones()+empleados.get(i).getPeriodos().get(a).getDias();
					empleados.get(i).setDiasdevacaciones(diassuma);
				}
				seleccion.add(empleados.get(i));
			}
		}
		Collections.sort(seleccion, Comparator.comparingInt(PEmpleado::getDiasdevacaciones).reversed());
		
		return seleccion;
	}//Ya debería estar terminado, calcula los días, mete a los empleados en el AL y los ordena según los días.
}
