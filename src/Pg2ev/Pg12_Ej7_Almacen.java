package Pg2ev;

import java.util.ArrayList;

/*
 * Atienda a las explicaciones sobre diseño de clases 
 * orientado a objetos. Desarrolle las clases Cliente 
 * y Almacen de modo coherente el siguiente Modelo 
 * Entidad Relación. Cliente(1) disponeDe (N) Almacén 
 * Cliente(Id, Nombre, Direccion,Provincia)Almacen 
 * (Id, IdCliente, Direccion, Provincia)En un programa 
 * principal desarrolle el método private static 
 * ArrayList<Cliente> clientesConAlmacenEn(ArrayList<Cliente> 
 * clientes, String provincia);y pruébelo.
 */
public class Pg12_Ej7_Almacen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Básciamente el profesor dice que en vez de la clave foranea estar relacionada
		 * el idcliente con el id del cliente, que esté relacionada con el objeto entero
		 * de tipo Cliente.
		 */
		
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
		
		ArrayList<Almacen> ALalm=new ArrayList();
		
		ALalm.add(new Almacen(8492, "Calle España", "Murcia", 4));
		ALalm.add(new Almacen(1234, "Calle Gran Vía", "Madrid", 5));
		ALalm.add(new Almacen(5678, "Calle del Prado", "Barcelona", 7));
		ALalm.add(new Almacen(9101, "Avenida de la Constitución", "Sevilla", 4));
		ALalm.add(new Almacen(1121, "Calle Mayor", "Valencia", 2));
		ALalm.add(new Almacen(2352, "Calle Alcalá", "Madrid", 3));
		ALalm.add(new Almacen(6635, "Avenida Diagonal", "Barcelona", 1));
		ALalm.add(new Almacen(7254, "Calle Real", "Sevilla", 6));
		ALalm.add(new Almacen(1635, "Paseo de Gracia", "Barcelona", 2));
		ALalm.add(new Almacen(7357, "Calle Serrano", "Madrid", 5));
		ALalm.add(new Almacen(1356, "Gran Vía", "Madrid", 4));
		ALalm.add(new Almacen(9452, "Avenida de la Libertad", "Valencia", 7));
		ALalm.add(new Almacen(2463, "Calle Mayor", "Valencia", 3));
		ALalm.add(new Almacen(4257, "Plaza Mayor", "Madrid", 6));
		ALalm.add(new Almacen(2534, "Calle Granada", "Granada", 1));

		System.out.println(Almacen.clientesConAlmacenEn(arraydeclient, ALalm, "Madrid"));
		for (int i=0;i<Almacen.clientesConAlmacenEn(arraydeclient, ALalm, "Barcelona").size();i++) {
			System.out.println(Almacen.clientesConAlmacenEn(arraydeclient, ALalm, "Barcelona").get(i));
		}
		System.out.println();
		for (int i=0;i<Almacen.clientesConAlmacenEn(arraydeclient, ALalm, "Valencia").size();i++) {
			System.out.println(Almacen.clientesConAlmacenEn(arraydeclient, ALalm, "Valencia").get(i));
		}
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////

class Almacen implements Comparable<Almacen>{

	//Variables:
	
	private int idclient;
	private int idalmacen; //Cuatro números.
	private String direccion;
	private String provincia;

	//Constructor:
	
	public Almacen(int idalm, String dire, String prov, int idcliente) {
		
		idalmacen=idalm;
		direccion=dire;
		provincia=prov;
		idclient=idcliente;
		
	}
	
	//Métodos:
	
	@Override
	public int compareTo(Almacen o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public int getIdclient() {
		return idclient;
	}

	public void setIdclient(int idclient) {
		this.idclient = idclient;
	}

	public int getIdalmacen() {
		return idalmacen;
	}

	public void setIdalmacen(int idalmacen) {
		this.idalmacen = idalmacen;
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
	
	public static ArrayList<Cliente> clientesConAlmacenEn(ArrayList<Cliente> clientes, ArrayList<Almacen> almacen, String provincia){
		ArrayList<Cliente> clientesconprov=new ArrayList();
		for (int i=0;i<almacen.size();i++) {
			if (almacen.get(i).getProvincia().equalsIgnoreCase(provincia)) {
				for (int a=0;a<clientes.size();a++) {
					if (clientes.get(a).getIdclienteconcreto()==almacen.get(i).getIdclient()) {
						clientesconprov.add(clientes.get(a));
					}
				}
			}
		}
		return clientesconprov;
	}
}


