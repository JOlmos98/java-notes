package Pg2ev;

import java.time.LocalDate;
import java.util.ArrayList;

/*
 * Considere la clase Pieza. La clase Pieza contendrá la especificación de los componentes que la 
componen (clase Componente) así como la cantidad de cada uno de ellos. Un objeto de la clase 
Componente incluirá datos básicos y una lista de proveedores que lo pueden proporcionar. Un 
objeto de la clase Proveedor incluirá, entre otros posibles datos, un identificador de tipo String
y un identificador de país. 
A partir de la información considerada, recicle su punto de vista y aborde el problema 
comenzando por el Modelo Entidad Relación. 
Usted debe
· Desarrollar el modelo Entidad Relación 
· Desarrollar las clases de dominio de la aplicación 
· En un programa principal desarrollar el método public static ArrayList<Componente> 
informe (ArrayList<pieza> piezas, Proveedorp ); que devuelve la lista de componentes que 
puede proporcionar el proveedor indicado para las piezas pasadas en el parámetro.
 */
public class Pg13_Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Con las clases hechas, vamos a crear 5 piezas, 
		 * 20 componentes y 10 proveedores.
		 */
		ArrayList<Proveedor> ALproveedores=new ArrayList();
		ALproveedores.add(new Proveedor("A84759382", "Acerox", "+34")); //El constructor tiene CIF, nombre y prefijo de telefono del pais.
		ALproveedores.add(new Proveedor("B57692431", "Recambios Martínez", "+34"));
		ALproveedores.add(new Proveedor("C34782159", "Repuestos Sánchez", "+34"));
		ALproveedores.add(new Proveedor("D29183467", "Automóviles López", "+34"));
		
		ArrayList<Componente> ALcomponentes=new ArrayList();
		ALcomponentes.add(new Componente("Émbolo", "Acero inoxidable", LocalDate.of(1999, 12, 12), 26.5));
		ALcomponentes.get(0).getProveedores().add(ALproveedores.get(0));
		ALcomponentes.get(0).getProveedores().add(ALproveedores.get(2));
		ALcomponentes.get(0).getProveedores().add(ALproveedores.get(3));

		ALcomponentes.add(new Componente("Cabeza pistón", "Acero inoxidable", LocalDate.of(1999, 3, 22), 48.5));
		ALcomponentes.get(1).getProveedores().add(ALproveedores.get(1));
		ALcomponentes.get(1).getProveedores().add(ALproveedores.get(2));
		ALcomponentes.get(1).getProveedores().add(ALproveedores.get(3));

		ALcomponentes.add(new Componente("Biela", "Acero inoxidable", LocalDate.of(2001, 12, 12), 17.5));
		ALcomponentes.get(2).getProveedores().add(ALproveedores.get(0));
		ALcomponentes.get(2).getProveedores().add(ALproveedores.get(3));

		ALcomponentes.add(new Componente("Junta de culata", "Goma sintética", LocalDate.of(2001, 8, 10), 12.3));
		ALcomponentes.get(3).getProveedores().add(ALproveedores.get(1));
		ALcomponentes.get(3).getProveedores().add(ALproveedores.get(2));

		ALcomponentes.add(new Componente("Bujía", "Cobre y cerámica", LocalDate.of(1999, 11, 28), 8.9));
		ALcomponentes.get(4).getProveedores().add(ALproveedores.get(0));
		ALcomponentes.get(4).getProveedores().add(ALproveedores.get(2));
		ALcomponentes.get(4).getProveedores().add(ALproveedores.get(3));
		
		ALcomponentes.add(new Componente("Árbol de levas", "Acero al carbono", LocalDate.of(2002, 7, 6), 45.6));
		ALcomponentes.get(5).getProveedores().add(ALproveedores.get(1));
		ALcomponentes.get(5).getProveedores().add(ALproveedores.get(3));
		
		ALcomponentes.add(new Componente("Cárter", "Aleación de aluminio", LocalDate.of(2003, 9, 17), 65.2));
		ALcomponentes.get(6).getProveedores().add(ALproveedores.get(0));
		ALcomponentes.get(6).getProveedores().add(ALproveedores.get(2));
		ALcomponentes.get(6).getProveedores().add(ALproveedores.get(3));
		
		ALcomponentes.add(new Componente("Válvula", "Acero inoxidable", LocalDate.of(2001, 4, 9), 5.5));
		ALcomponentes.get(7).getProveedores().add(ALproveedores.get(1));
		ALcomponentes.get(7).getProveedores().add(ALproveedores.get(2));
		ALcomponentes.get(7).getProveedores().add(ALproveedores.get(3));
		
		ALcomponentes.add(new Componente("Cilindro", "Hierro fundido", LocalDate.of(2002, 10, 30), 78.4));
		ALcomponentes.get(8).getProveedores().add(ALproveedores.get(0));
		
		ALcomponentes.add(new Componente("Tensor de la correa", "Plástico y metal", LocalDate.of(2000, 12, 25), 18.7));
		ALcomponentes.get(9).getProveedores().add(ALproveedores.get(1));
		ALcomponentes.get(9).getProveedores().add(ALproveedores.get(2));
		ALcomponentes.get(9).getProveedores().add(ALproveedores.get(3));
		
		ALcomponentes.add(new Componente("Correa de distribución", "Goma reforzada", LocalDate.of(2003, 6, 14), 22.1));
		ALcomponentes.get(10).getProveedores().add(ALproveedores.get(0));
		ALcomponentes.get(10).getProveedores().add(ALproveedores.get(2));
		ALcomponentes.get(10).getProveedores().add(ALproveedores.get(3));
		
		ALcomponentes.add(new Componente("Bomba de agua", "Aluminio", LocalDate.of(2004, 3, 7), 37.8));
		ALcomponentes.get(11).getProveedores().add(ALproveedores.get(1));
		
		ALcomponentes.add(new Componente("Radiador", "Cobre y aluminio", LocalDate.of(2005, 8, 19), 58.3));
		ALcomponentes.get(12).getProveedores().add(ALproveedores.get(0));
		ALcomponentes.get(12).getProveedores().add(ALproveedores.get(2));
		ALcomponentes.get(12).getProveedores().add(ALproveedores.get(3));
		
		ALcomponentes.add(new Componente("Filtro de aceite", "Plástico y papel", LocalDate.of(2000, 2, 10), 6.4));
		ALcomponentes.get(13).getProveedores().add(ALproveedores.get(1));
		ALcomponentes.get(13).getProveedores().add(ALproveedores.get(2));
		ALcomponentes.get(13).getProveedores().add(ALproveedores.get(3));
		
		ALcomponentes.add(new Componente("Filtro de aire", "Papel y goma", LocalDate.of(2002, 11, 4), 9.1));
		ALcomponentes.get(14).getProveedores().add(ALproveedores.get(0));
		ALcomponentes.get(14).getProveedores().add(ALproveedores.get(3));
		
		ALcomponentes.add(new Componente("Embrague", "Acero y fibra", LocalDate.of(2001, 7, 27), 42.9));
		ALcomponentes.get(15).getProveedores().add(ALproveedores.get(1));
		ALcomponentes.get(15).getProveedores().add(ALproveedores.get(2));
		ALcomponentes.get(15).getProveedores().add(ALproveedores.get(3));
		
		ALcomponentes.add(new Componente("Regulador de presión", "Aluminio", LocalDate.of(1999, 5, 12), 28.6));
		ALcomponentes.get(16).getProveedores().add(ALproveedores.get(0));
		ALcomponentes.get(16).getProveedores().add(ALproveedores.get(2));
		
		ALcomponentes.add(new Componente("Termostato", "Metal y cerámica", LocalDate.of(2003, 10, 8), 14.8));
		ALcomponentes.get(17).getProveedores().add(ALproveedores.get(1));
		ALcomponentes.get(17).getProveedores().add(ALproveedores.get(3));
		
		ALcomponentes.add(new Componente("Árbol de transmisión", "Acero al carbono", LocalDate.of(2004, 4, 3), 52.0));
		ALcomponentes.get(18).getProveedores().add(ALproveedores.get(0));
		ALcomponentes.get(18).getProveedores().add(ALproveedores.get(2));
		ALcomponentes.get(18).getProveedores().add(ALproveedores.get(3));

		
		ArrayList<Pieza> ALpiezas=new ArrayList();
		ALpiezas.add(new Pieza("Pistón", LocalDate.of(2002, 2, 21))); //El constructor tiene nombre y fecha de fabricaion,
		ALpiezas.get(0).getComponentes().add(ALcomponentes.get(0));
		ALpiezas.get(0).getComponentes().add(ALcomponentes.get(1));
		ALpiezas.get(0).getComponentes().add(ALcomponentes.get(2));
		//Añadimos los componentes de Pistón al ArrayList de los componentes de Pistón.
		ALpiezas.add(new Pieza("Culata", LocalDate.of(2001, 6, 23)));
		ALpiezas.get(1).getComponentes().add(ALcomponentes.get(3));
		ALpiezas.get(1).getComponentes().add(ALcomponentes.get(4));
		ALpiezas.get(1).getComponentes().add(ALcomponentes.get(5));
		ALpiezas.add(new Pieza("Bloque del motor", LocalDate.of(2000, 9, 12)));
		ALpiezas.get(2).getComponentes().add(ALcomponentes.get(7));
		ALpiezas.get(2).getComponentes().add(ALcomponentes.get(8));
		ALpiezas.add(new Pieza("Cárter del aceite", LocalDate.of(2002, 4, 17)));
		ALpiezas.get(3).getComponentes().add(ALcomponentes.get(6));
		ALpiezas.add(new Pieza("Polea del cigüeñal", LocalDate.of(1999, 8, 5)));
		ALpiezas.get(4).getComponentes().add(ALcomponentes.get(9));
		ALpiezas.get(4).getComponentes().add(ALcomponentes.get(10));
		ALpiezas.get(4).getComponentes().add(ALcomponentes.get(15));
		ALpiezas.add(new Pieza("Bomba de combustible", LocalDate.of(2004, 2, 19)));
		ALpiezas.get(5).getComponentes().add(ALcomponentes.get(16));
		ALpiezas.add(new Pieza("Colector de admisión", LocalDate.of(2002, 5, 28)));
		ALpiezas.get(6).getComponentes().add(ALcomponentes.get(14));
		ALpiezas.add(new Pieza("Caja de cambios", LocalDate.of(2000, 7, 8)));
		ALpiezas.get(7).getComponentes().add(ALcomponentes.get(18));
		ALpiezas.add(new Pieza("Sistema refrigeración", LocalDate.of(2001, 7, 8)));
		ALpiezas.get(8).getComponentes().add(ALcomponentes.get(11));
		ALpiezas.get(8).getComponentes().add(ALcomponentes.get(12));
		ALpiezas.get(8).getComponentes().add(ALcomponentes.get(13));
		ALpiezas.get(8).getComponentes().add(ALcomponentes.get(17));

		/*
		 * Para comprobar que todo funciona deberíamos imprimir la
		 * lista de componentes que forman una pieza y después, como
		 * dice el ejercicio, creamos aquí un arraylist con piezas, y
		 * creamos el método que funciona metiendole el arraylist de piezas
		 * y un objeto de tipo proveedor y nos dice cuantos COMPONENTES de esas 
		 * piezas es capaz de proveer dicho proveedor. Es decir, el método
		 * devuelve un arraylist de tipo COMPONENTE, por parámetro le introducimos
		 * un arraylist de tipo PIEZA y un objeto de tipo PROVEEDOR. Así que toca montar
		 * las piezas con la información de arriba, parece que chatGPT los ha creado en orden.
		 */
		//System.out.println(ALpiezas.get(0));
		/*
		 * Esta sentencia imprime por pantalla de forma muy rudimentaria 
		 * los datos de la pieza y de los componentes. Podriamos refinar
		 * la impresión de arriba pero no es el objetivo del ejercicio,
		 * vamos con el método del array de los proveedores que venden
		 * los componentes para las piezas en cuestión.
		 */
		/*for (int i=0;i<ALpiezas.get(4).getComponentes().size();i++) {
			System.out.println(ALpiezas.get(4).getComponentes().get(i));
		} //Esto nos imprime los componentes que forman la pieza 4 del AL.
		for (int i=0;i<ALpiezas.get(4).getComponentes().size();i++) {
			System.out.println(ALcomponentes.get(0).getProveedores().get(i));
		} //Esto nos imprime los proveedores que venden el componente 0 del AL.*/
		//Primero creamos el arraylist de las piezas.
		ArrayList<Pieza> piezasej=new ArrayList();
		//Ahora le metemos un par de piezas del otro array ya creado.
		piezasej.add(ALpiezas.get(0));
		piezasej.add(ALpiezas.get(4));
		piezasej.add(ALpiezas.get(8));
		//Y ahora creamos el método en la clase Componente.
		//public static ArrayList<Componente> informe (ArrayList<pieza> piezas, Proveedor p);
		
		//System.out.println(Componente.informe(piezasej, ALproveedores.get(0)));
		//Esto lo muestra en una sola línea, lo hacemos con un bucle:
		System.out.println("\nEL EJERCICIO EMPIEZA AQUI\n");
		Componente.informe(piezasej, ALproveedores.get(0));
		ArrayList<Componente> arrayejemplo=Componente.informe(piezasej, ALproveedores.get(0));
		for (int i=0;i<arrayejemplo.size();i++) {
			System.out.println(arrayejemplo.get(i));
		} //Imprime una barbaridad de información, asi que vamos a tocar el toString de Componente.
		//Funciona a la perfección.

	}

}

/////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////


class Pieza { 
	
	//Variables:
	
	private static int idcontador=0;
	
	private int idpieza;
	private String nombre;
	private LocalDate fechafab;
	private ArrayList<Componente> componentes;
	
	//Contructor:
	
	public Pieza(String nombre, LocalDate fechafab) {
		
		idcontador++;
		this.idpieza=idcontador;
		this.nombre=nombre;
		this.fechafab=fechafab;
		this.componentes=new ArrayList();
		
	}

	//Métodos:

	public int getIdpieza() {
		return idpieza;
	}

	public void setIdpieza(int idpieza) {
		this.idpieza = idpieza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechafab() {
		return fechafab;
	}

	public void setFechafab(LocalDate fechafab) {
		this.fechafab = fechafab;
	}

	public ArrayList<Componente> getComponentes() {
		return componentes;
	}

	public void setComponentes(ArrayList<Componente> componentes) {
		this.componentes = componentes;
	}
	
	@Override
	public String toString() {
		return "Pieza [idpieza=" + idpieza + ", nombre=" + nombre + ", fechafab=" + fechafab + ", componentes="
				+ componentes + "]";
	}
}

class Componente { //Muchos componentes hacen una pieza
	/*
	 * Modelo E-R rápido de las clases Pieza, Componente y Proveedor.
	 * Pieza (1) se compone de (N) Componente.
	 * Componente (1) lo provee (N) Proveedor.
	 */
	
	//Variables:
	
	private static int idcontador=0;
	
	private int idcomponente;
	private String nombre;
	private String material;
	private LocalDate fechafab;
	private double precio;
	private ArrayList<Proveedor> proveedores;
	
	//Constructor:
	
	public Componente(String nombre, String material, LocalDate fechafab, double precio) {
		
		idcontador++;
		this.idcomponente=idcontador;
		this.nombre=nombre;
		this.material=material;
		this.fechafab=fechafab;
		this.precio=precio;
		this.proveedores=new ArrayList();
		
	}

	//Métodos:
	//Este es el método del ejercicio. Funciona perfecto.
	public static ArrayList<Componente> informe (ArrayList<Pieza> piezas, Proveedor p){
		ArrayList<Componente> componentesaportados=new ArrayList();
		
		for (int i=0;i<piezas.size();i++) {
			for (int a=0;a<piezas.get(i).getComponentes().size();a++) {
				for (int b=0;b<piezas.get(i).getComponentes().get(a).getProveedores().size();b++) {
					if (piezas.get(i).getComponentes().get(a).getProveedores().get(b)==p) {
						componentesaportados.add(piezas.get(i).getComponentes().get(a));
					}
				}
			}
		}
		return componentesaportados;
	}
	
	public boolean equals(Componente c) {
		if (this.idcomponente == c.idcomponente) return true;
		return false;
	}
	
	public int getIdcomponente() {
		return idcomponente;
	}

	public void setIdcomponente(int idcomponente) {
		this.idcomponente = idcomponente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public LocalDate getFechafab() {
		return fechafab;
	}

	public void setFechafab(LocalDate fechafab) {
		this.fechafab = fechafab;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public ArrayList<Proveedor> getProveedores() {
		return proveedores;
	}

	public void setProveedores(ArrayList<Proveedor> proveedores) {
		this.proveedores = proveedores;
	}

	@Override
	public String toString() {
		return "Componente " + idcomponente + "\nNombre: " + nombre + "\nMaterial: " + material
				+ "\nFecha fabricación: " + fechafab + "\nPrecio: " + precio + " euros\n";//Proveedores: \" + proveedores + \"]\"
	}
	
	
}

class Proveedor {
	
	//Variables:
	
	private String cif; //8 numeros
	private String nombre;
	private String prefpais;
	
	//Constructor:
	
	public Proveedor(String cif, String nombre, String prefpais) {
		
		this.cif=cif; 
		this.nombre=nombre;
		this.prefpais=prefpais;
		
	}
	
	//Métodos:
	
	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrefpais() {
		return prefpais;
	}

	public void setPrefpais(String prefpais) {
		this.prefpais = prefpais;
	}

	@Override
	public String toString() {
		return "Proveedor [cif=" + cif + ", nombre=" + nombre + ", prefpais=" + prefpais + "]";
	}
		
}