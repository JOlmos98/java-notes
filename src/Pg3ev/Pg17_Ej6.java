package Pg3ev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * Atienda a los conceptos básicos de programación de bases de datos a través de los 
 * proyectos Ejercicio06 y Ejercicio07v1 desarrollados para trabajar con MySQL. Desarrolle 
 * Ejercicio07v2 para SQLite.
 */
public class Pg17_Ej6 { //Este es el copy paste de la v2.
	
    private static String url = "jdbc:sqlite:.\\src\\basededatos\\BClientes";
    private static String usuario = "root";
    private static String password = "";
	
 public static void main(String[] args) {
		
   try 
    {
     Connection con = DriverManager.getConnection(url,usuario,password);
     Statement st = con.createStatement(); //Esto parece ser un método que usa la conexión para interactuar con la DB ejecutando sentencias.
     st.executeUpdate("DELETE FROM TClientes"); 
     st.executeUpdate("INSERT INTO TClientes VALUES (10,'pwantonio','antonio alcaraz')");
     st.executeUpdate("INSERT INTO TClientes VALUES (20,'pwjuan','juan gomez')");
     st.executeUpdate("INSERT INTO TClientes VALUES (30,'pwjesus','Jesús Olmos')");

     ResultSet rs = st.executeQuery("SELECT * FROM TClientes");
     while(rs.next())
     {
           int idCliente = rs.getInt("IdCliente");
           String password = rs.getString("Password");
           String nombre = rs.getString("Nombre");
           System.out.println(idCliente+" "+ password + " "+nombre); 
     } 
     
  } catch (Exception ex) {ex.printStackTrace();}
		
 }

}

///////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////

class Cliente {
	
	int idCliente;
	String password;
	String nombre;
	
	// ...
	
	public Cliente(int idCliente, String password, String nombre) {
		super();
		this.idCliente = idCliente;
		this.password = password;
		this.nombre = nombre;
	}
	
	// ...
	
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// ... 
	
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", password=" + password + ", nombre=" + nombre + "]";
	}
}