package Pg3ev;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * Desarrolle la base BContactos, adecuada para 
 * gestionar información acerca de contactos personales. 
 * Actualice la base desde un fichero NuevosContactos.txt.
 */
public class Pg17_Ej8 {
	
	private static String url = "jdbc:sqlite:.\\src\\basededatos\\BContactos";
    private static String usuario = "root";
    private static String password = "";
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Contacto> contactos = new ArrayList<Contacto>();
		for (int i=0;i<contactos.size();i++) System.out.println(contactos.get(i));
		try {
			Connection con = DriverManager.getConnection(url, usuario, password);
			Statement st = con.createStatement();
			System.out.println("Conexión exitosa.");
		    /*
			st.executeUpdate("INSERT INTO TContactos (Nombre, Telefono, Info) VALUES ('Jesús', '123456789', 'Información adicional')");
		    st.executeUpdate("INSERT INTO TContactos (Nombre, Telefono, Info) VALUES ('Alberto', '968475647', 'Información adicional')");
		    st.executeUpdate("INSERT INTO TContactos (Nombre, Telefono, Info) VALUES ('José', '968473625', 'Información adicional')");
		    st.executeUpdate("INSERT INTO TContactos (Nombre, Telefono, Info) VALUES ('Kevin', '345452786', 'Información adicional')");
		    st.executeUpdate("INSERT INTO TContactos (Nombre, Telefono, Info) VALUES ('Francisco', '622345654', 'Información adicional')");
		    st.executeUpdate("INSERT INTO TContactos (Nombre, Telefono, Info) VALUES ('Nuria', '633456765', 'Información adicional')");
		    st.executeUpdate("INSERT INTO TContactos (Nombre, Telefono, Info) VALUES ('Laura', '968374637', 'Información adicional')");
		    */
			/*
			 * Aquí meteremos la lectura de un .txt que lea en cada línea
			 * nombre-telefono-info y los almacene en una variable cad parámetro
			 * y después lo use en la sentencia SQL.
			 */
			String linea;
			String nombretxt="";
			String telefonotxt="";
			String infotxt="";
			
			BufferedReader txt=new BufferedReader(new FileReader(".\\src\\basededatos\\InsertarContacto.txt"));
			String lector=txt.readLine();
			while (lector!=null) {
				linea=lector;
				nombretxt=linea.substring(0, linea.indexOf("-"));
				telefonotxt=linea.substring(linea.indexOf("-")+1, linea.lastIndexOf("-"));
				infotxt=linea.substring(linea.lastIndexOf("-")+1);
				System.out.println(nombretxt);
				System.out.println(telefonotxt);
				System.out.println(infotxt);
				st.executeUpdate("INSERT INTO TContactos (Nombre, Telefono, Info) VALUES ('"+nombretxt+"', '"+telefonotxt+"', '"+infotxt+"')");
				
				lector=txt.readLine();
			} txt.close();
			
			
			
			ResultSet rs = st.executeQuery("SELECT * FROM TContactos");
			while (rs.next()) {
				int id=rs.getInt("Id");
				String nombre=rs.getString("Nombre");
				String telefono=rs.getString("Telefono");
				String info=rs.getString("Info");
				/*
				 * Este while extrae la información de los campos con rs.getInt y .getString y señalamos
				 * el campo en cuestión en el String, para almacenar la información de ese campo en la
				 * variable declarada.
				 * 
				 * Después, con la sentencia de abajo añadimos un nuevo objeto Contacto al ArrayList
				 * con las variables como parámetros creadas extrayendo la información de la base de datos.
				 */
				contactos.add(new Contacto(id, nombre, telefono, info));
			}
		    System.out.println("Sentencias SQL ejecutadas con éxito.");
		    
		} catch (Exception ex) {ex.printStackTrace();}

		for (Contacto c : contactos) System.out.println(c);
		
		//Probamos el método del Ej9. 
		System.out.println("\nPROBAMOS EL EJ9:");
		
		ArrayList<Contacto> arraylistfiltrado=filtrar968(contactos);
		
		for (Contacto c:arraylistfiltrado) System.out.println(c);
	}
	
	/*
	 * Desarrolle un método que devuelva la 
	 * lista de contactos almacenados en BContactos 
	 * que tengan teléfono fijo de Murcia (968../868…).
	 * Devolverá el ArrayList AL968.
	 */
	
	public static ArrayList<Contacto> filtrar968(ArrayList<Contacto> al){
		ArrayList<Contacto> AL968=new ArrayList();
		for (int i=0;i<al.size();i++) {
			//if (al.get(i).getTelefono().substring(0, 2).equals("968")) AL968.add(al.get(i)); 
			if (al.get(i).getTelefono().startsWith("968")) AL968.add(al.get(i)); 
		}
		
		return AL968;
	}

}

/*
 * No sé si para hacer este ejercicio se proporciona BContactos que está ahi
 * o eso es por si quieres ver el ejercicio medio resuelto o qué,
 * pero lo voy a hacer a mi manera, añadiéndole un par de cosas y
 * ver bien como una snetencia SQL construye un objeto de tipo 
 * Contactos y lo mete en el ArrayList y tal.
 */
class Contacto {//Para la BD BContactos.
	
	//Variables:
	
	int id;
	String nombre;
	String telefono;
	String info;
	
	//Constructor:
	public Contacto(int id, String nombre, String telefono) {
		this.id=id;
		this.nombre=nombre;
		this.telefono=telefono;
	}
	
	public Contacto(int id, String nombre, String telefono, String info) {
		this.id=id;
		this.nombre=nombre;
		this.telefono=telefono;
		this.info=info;
	}

	//Métodos:
	
	
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "ID: "+id+", Nombre: "+nombre+", Teléfono: "+telefono+", Info: "+info+".";
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

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
}

//st.executeUpdate("INSERT INTO TContactos VALUES (1, 'Jesús Olmos Soler', '968475847', 'Calle Vereda de los Matas')");
//st.executeUpdate("INSERT INTO TContactos VALUES (2, '968475847', 'Alfonso Martínez Soler', 'Calle Barcelona', 1991)");
//ResultSet rs = st.executeQuery("SELECT * FROM TContactos");
//while (rs.next()) { 
	/*
	 * Vale, este While lo que hace es leer la tabla con el SELECT y meterlos como objetos
	 * en el ArrayList, por eso se crean esas variables, con rs se extrae la información
	 * y con .add se almacena la información creando el nuevo objeto en el ArrayList.
	 * 
	 * Imagino que ResultSet .next significa que mientras .next==true, es decir, mientras haya un 
	 * resultado que leer (siguiente) que siga el while.
	 */
	/*int idCliente = rs.getInt("IdCliente");
	String password = rs.getString("Password");
	String nombre = rs.getString("Nombre");*/
	
	//contactos.add(new Cliente(idCliente, password, nombre));
//}
