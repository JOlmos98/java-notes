package Pg3ev.Examen2018;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class Main2 {

	private static String url="jdbc:sqlite:.\\DB\\BClientes";
	private static String user="root";
	private static String password="";
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection con=DriverManager.getConnection(url, user, password);
		Statement st=con.createStatement();
		System.out.println("Conexion exitosa.");
		
		//st.executeUpdate("INSERT INTO TClientes (IdCliente, Nombre, TotalFacturado) VALUES (1, 'Ramón', 78.25)");
		//System.out.println("Update realizada con éxito.");
		
		
		guardar();
		leer(".\\Clientes 13-5-2024.txt");
	}

	public static void guardar() throws Exception {
		BufferedWriter txt=new BufferedWriter(new FileWriter(".\\Clientes "+LocalDate.now().getDayOfMonth()+"-"+LocalDate.now().getMonthValue()+"-"+LocalDate.now().getYear()+".txt"));
		Connection con=DriverManager.getConnection(url, user, password);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("SELECT * FROM TClientes");
		while (rs.next()) {
			int idcliente=rs.getInt("IdCliente");
			String nombre=rs.getString("Nombre");
			Double totalfacturado=rs.getDouble("TotalFacturado");
			txt.write(idcliente+"-"+nombre+"-"+totalfacturado);
			txt.newLine();
		}
		txt.close();
	}
	
	public static void leer(String directorio) throws Exception {
		BufferedReader txt=new BufferedReader(new FileReader(directorio));
		
		String lector=txt.readLine();
		while (lector!=null) {
			System.out.println(lector);
			lector=txt.readLine(); //Esto lee la siguiente linea.
		}
		
		
		
	}
}
