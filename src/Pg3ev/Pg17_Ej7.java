package Pg3ev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Pg17_Ej7 {
	
    private static String url = "jdbc:sqlite:.\\src\\ejercicio07v2\\BDiccionario";
    private static String usuario = "root";
    private static String password = "";
 	
	public static void main(String[] args) {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		try {
			Connection con = DriverManager.getConnection(url, usuario, password);
			Statement st = con.createStatement();

			ResultSet rs = st.executeQuery("SELECT * FROM TClientes");
			while (rs.next()) {
				int idCliente = rs.getInt("IdCliente");
				String password = rs.getString("Password");
				String nombre = rs.getString("Nombre");

				clientes.add(new Cliente(idCliente, password, nombre));
			}

		} catch (Exception ex) {ex.printStackTrace();}

		for (Cliente c : clientes) System.out.println(c);
	}
}
