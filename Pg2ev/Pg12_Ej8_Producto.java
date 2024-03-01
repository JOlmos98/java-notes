package Pg2ev;

import java.time.LocalDate;
import java.util.ArrayList;

/*
 * Desarrolle con orientación a objetos las clases Java de dominio 
 * de una aplicación (más comúnmente llamadas clases de negocio) 
 * coherentes con los siguientes modelos ER. Incluya método equals().
a) Cliente (1) titularDe (N) Vehículo 
b) Producto (N) formadoPor (N) Componente (unidades)
c) Producto (N) VendidoA (N) Cliente (fecha,precio,unidades)
 */
public class Pg12_Ej8_Producto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Para no entrar en conflicto con las clases anteriores añadiremos una V
		 * al final del nombre de cada clase en este ejercicio.
		 * 
		 * No entiendo que relación puede haber entre Producto y lo del tema
		 * vehículos, así que he desarrollado cliente y vehículos que supongo
		 * que va todo el ejercicio en la misma línea.
		 */
		
		ArrayList<ClienteV> clientes=new ArrayList<>();
		clientes.add(new ClienteV("José Antonio Rodríguez" , "Calle de los Matías", "Mucia"));
		clientes.add(new ClienteV("María García", "Avenida de la Libertad", "Madrid"));
		clientes.add(new ClienteV("Juan Pérez", "Calle Mayor", "Barcelona"));
		clientes.add(new ClienteV("Sara Martínez", "Plaza del Sol", "Valencia"));
		clientes.add(new ClienteV("Antonio López", "Paseo de la Castellana", "Madrid"));
		
		ArrayList<VehiculoV> vehiculos=new ArrayList<>();
		vehiculos.add(new VehiculoV("Peugeot", "306", 120, 41322, LocalDate.of(1999, 2, 12)));
		vehiculos.add(new VehiculoV("Renault", "Clio", 110, 54321, LocalDate.of(2001, 6, 23)));
		vehiculos.add(new VehiculoV("Ford", "Fiesta", 100, 98765, LocalDate.of(2003, 9, 15)));
		vehiculos.add(new VehiculoV("Volkswagen", "Polo", 95, 12345, LocalDate.of(2005, 11, 27)));
		vehiculos.add(new VehiculoV("Seat", "Ibiza", 115, 67890, LocalDate.of(2007, 4, 8)));
		vehiculos.add(new VehiculoV("Opel", "Corsa", 105, 23456, LocalDate.of(2009, 8, 18)));
		vehiculos.add(new VehiculoV("Toyota", "Yaris", 110, 87654, LocalDate.of(2011, 10, 30)));
		vehiculos.add(new VehiculoV("Hyundai", "i20", 95, 34567, LocalDate.of(2013, 12, 5)));
		vehiculos.add(new VehiculoV("Kia", "Rio", 100, 67891, LocalDate.of(2015, 3, 17)));
		
		System.out.println(clientes.get(4).getVEnPropiedad()+"Esto no debería imprimir nada porque el ArrayList está vacío.");
		
		clientes.get(4).setVEnPropiedad(new ArrayList());
		clientes.get(4).addVEnPropiedad(vehiculos, 23456);
		System.out.println(clientes.get(4).getVEnPropiedad().get(0).toString());
		clientes.get(4).addVEnPropiedad(vehiculos, 12345);
		clientes.get(4).addVEnPropiedad(vehiculos, 41322);
		System.out.println();
		for (int i=0;i<clientes.get(4).getVEnPropiedad().size();i++) {
			System.out.println(clientes.get(4).getVEnPropiedad().get(i).toString());
		}
		
		/*clientes.get(4).addVEnPropiedad(vehiculos, 41322);
		clientes.get(4).addVEnPropiedad(vehiculos, 23456);
		System.out.println("\nAhora si debería imprimir dos vehículos.");
		System.out.println(clientes.get(4).getVEnPropiedad());*/
		
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////


class ClienteV{
	
	//Variables:
	
	private String nombre;
	private String direccion;
	private String provincia;
	private LocalDate fechanac;
	private ArrayList<VehiculoV> VEnPropiedad;
	
	//Constructor:
	
	ClienteV(String nom, String dire, String prov){
		nombre=nom;
		direccion=dire;
		provincia=prov;
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

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public LocalDate getFechanac() {
		return fechanac;
	}

	public void setFechanac(LocalDate fechanac) {
		this.fechanac = fechanac;
	}

	public ArrayList<VehiculoV> getVEnPropiedad() {
		return VEnPropiedad;
	}

	public void setVEnPropiedad(ArrayList<VehiculoV> vEnPropiedad) {
		VEnPropiedad = vEnPropiedad;
	}
	public void addVEnPropiedad(ArrayList<VehiculoV> avehiculos, int numserie) {
		for (int i=0;i<avehiculos.size();i++) {
			if (avehiculos.get(i).getNumserie()==numserie) this.VEnPropiedad.add(avehiculos.get(i));
		}
	}
	
	//Métodos:
	
	
}

class VehiculoV{
	
	//Variables:
	
	private String marca;
	private String modelo;
	private int cv;
	private int numserie;
	private LocalDate fechafabr;
	
	//Constructor:
	
	VehiculoV(String marc, String model, int cvs, int nums, LocalDate fechaf){
		marca=marc;
		modelo=model;
		cv=cvs;
		numserie=nums;
		fechafabr=fechaf;
	}

	//Métodos:
	
	@Override
	public String toString() {
		return "VehiculoV [marca=" + marca + ", modelo=" + modelo + ", cv=" + cv + ", numserie=" + numserie
				+ ", fechafabr=" + fechafabr + "]";
	}

	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCv() {
		return cv;
	}

	public void setCv(int cv) {
		this.cv = cv;
	}

	public int getNumserie() {
		return numserie;
	}

	public void setNumserie(int numserie) {
		this.numserie = numserie;
	}

	public LocalDate getFechafabr() {
		return fechafabr;
	}

	public void setFechafabr(LocalDate fechafabr) {
		this.fechafabr = fechafabr;
	}
}

class ProductoV{
	
	//Variables:
	
	//Constructor:
	
	//Métodos:
}

class ComponenteV{
	
	//Variables:
	
	//Constructor:

	//Métodos:
}
