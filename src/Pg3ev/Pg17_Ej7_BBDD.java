package Pg3ev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Pg17_Ej7_BBDD {
	
    private static String url = "jdbc:sqlite:.\\src\\basededatos\\BDiccionario";
    private static String usuario = "root";
    private static String password = "";
 	
	public static void main(String[] args) {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		//for (int i=0;i<clientes.size();i++) System.out.println(clientes.get(i));
		try {
			Connection con = DriverManager.getConnection(url, usuario, password);
			Statement st = con.createStatement();
			//st.executeUpdate("INSERT INTO TClientes (IdCliente, Password, Nombre) VALUES (88, 'pwmanolo', 'Manolo Sánchez');");
			//st.executeUpdate("INSERT INTO TClientes (IdCliente, Password, Nombre) VALUES (11, 'pwjuarez', 'Javier Juárez');");
			//Estas dos sentencias de arriba ya se han ejecutado asi que dan error al ejecutarlas de nuevo.
			ResultSet rs = st.executeQuery("SELECT * FROM TClientes");
			while (rs.next()) {
				int idCliente = rs.getInt("IdCliente");
				String password = rs.getString("Password");
				String nombre = rs.getString("Nombre");
				
				clientes.add(new Cliente(idCliente, password, nombre));
			}

		} catch (Exception ex) {ex.printStackTrace();}

		for (Cliente c : clientes) System.out.println(c); //Este es el que imprime el contenido de la DB.
	}
}
