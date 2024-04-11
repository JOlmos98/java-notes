package Pg2ev;

import java.util.ArrayList;
import java.util.Comparator;

/*
 * Desarrolle la clase Cliente. Escriba un 
 * programa que lea información de tres 
 * clientes y los muestre por pantalla 
 * ordenados a) alfabéticamente por provincia 
 * y nombre, b) por nombre.
 */
public class Pg12_Ej6_Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Cliente> arraydeclient=new ArrayList();
		
		arraydeclient.add(new Cliente("José", "Martínez", "Almeida", "Calle José Luís", "Murcia"));
		arraydeclient.add(new Cliente("Alberto", "Sánchez", "Villabla", "Calle Barcelona", "Sevilla"));
		arraydeclient.add(new Cliente("Manuel", "Martínez", "Valverde", "Calle Francisco Franco", "Valencia"));
		arraydeclient.add(new Cliente("Soledad", "Juárez", "Alonso", "Calle Neruda", "Alicante"));
		arraydeclient.add(new Cliente("Nuria", "Olmos", "Flores", "Calle San Juan", "Murcia"));
		arraydeclient.add(new Cliente("María", "García", "Martínez", "Calle Mayor", "Madrid"));
		arraydeclient.add(new Cliente("Pedro", "López", "Fernández", "Avenida de la Constitución", "Barcelona"));
		arraydeclient.add(new Cliente("Laura", "Martínez", "Rodríguez", "Calle Alameda", "Valencia"));
		arraydeclient.add(new Cliente("Juan", "Sánchez", "González", "Plaza España", "Sevilla"));
		arraydeclient.add(new Cliente("Javier", "Concha", "de la Vega", "Plaza de las Flores", "Lugo"));
		
		/*for (int i=0;i<arraydeclient.size();i++) {
			System.out.println("Datos de cliente: "+"\nNombre: "+arraydeclient.get(i).getNombre()+" "+arraydeclient.get(i).getApe1()+" "+arraydeclient.get(i).getApe2());
			System.out.println("Dirección y provincia: "+arraydeclient.get(i).getDireccion()+", "+arraydeclient.get(i).getProvincia());
			System.out.println();
		}*/
		//Ahora imprimos en lista los datos de cada cliente en un renglón. Para ello desarrollamos toString.
		for (int i=0;i<arraydeclient.size();i++) {
			System.out.println(i+". "+arraydeclient.get(i).toString());
		}
		//Ahora los ordenamos por nombre con el siguiente método.
		Cliente.OrdenarClientesNombre(arraydeclient);
		//E imprimimos, esta vez ordenados.
		System.out.println("\nLista ordenada por nombre:");
		for (int i=0;i<arraydeclient.size();i++) {
			System.out.println(i+". "+arraydeclient.get(i).toString());
		}
		//Una vez ordenados por nombre, desarrollamos el método para odenar por provincia.
		OrdenarProvincia.sortPorProvincia(arraydeclient);
		//Ahora deberían estar ordenados primero por Provincia y segundo por Nombre.
		//Para ello vamos a poner en primer lugar la provincia y después el toString.
		System.out.println("\nLista ordenada por provincia y nombre:");
		for (int i=0;i<arraydeclient.size();i++) {
			System.out.println(i+". "+arraydeclient.get(i).getProvincia()+". "+arraydeclient.get(i).toString());
		}
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////

class Cliente implements Comparable<Cliente>{
	
	//Variables:

	@Override
	public String toString() {
		return idclient+", "+nombre+", "+ape1+", "+ape2+", "+direccion+", "+provincia+".";
	}

	private static int ids=0;
	private int idclient;
	private String nombre;
	private String ape1;
	private String ape2;
	private String direccion;
	private String provincia;
	
	//Constructor:
	
	public Cliente(String nom, String ap1, String ap2, String dire, String prov) {
		
		ids++;
		nombre=nom;
		ape1=ap1;
		ape2=ap2;
		direccion=dire;
		provincia=prov;
		idclient=ids;
		
	}
	
	//Métodos:
	
	public static int getIds() {
		return ids;
	}

	public static void setIds(int ids) {
		Cliente.ids = ids;
	}

	public int getIdclienteconcreto() {
		return idclient;
	}

	public void setIdclienteconcreto(int idclienteconcreto) {
		this.idclient = idclienteconcreto;
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
	
	@Override
	public int compareTo(Cliente c) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(c.getNombre());
	}
	
	public static void OrdenarClientesNombre(ArrayList arrayclient) {
    	for (int i=0;i<arrayclient.size();i++) {
    		for (int a=0;a<arrayclient.size()-i-1;a++) {
    			if (((Cliente)arrayclient.get(a)).getNombre().compareTo(((Cliente) arrayclient.get(a+1)).getNombre())>0){
    				Cliente aux=(Cliente) arrayclient.get(a);
    				arrayclient.set(a, arrayclient.get(a+1));
    				arrayclient.set(a+1, aux);
    			}
    		}
    	}
	}
}

class OrdenarProvincia implements Comparator<Cliente>{
	
	@Override
	public int compare(Cliente o1, Cliente o2) {
		// TODO Auto-generated method stub
		return o1.getProvincia().compareTo(o2.getProvincia());
	}
	public static void sortPorProvincia(ArrayList<Cliente> arClient) {
		OrdenarProvincia comparador=new OrdenarProvincia();
    	for (int i=0;i<arClient.size();i++) {
    		for (int a=0;a<arClient.size()-i-1;a++) {
    			if (comparador.compare(arClient.get(a), arClient.get(a+1))>0){
    				Cliente aux=(Cliente) arClient.get(a);
    				arClient.set(a, arClient.get(a+1));
    				arClient.set(a+1, aux);
    			}
    		}
    	}
	}
	
}