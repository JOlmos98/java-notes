package Pg3ev.Cliente1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements ClienteDAOInterface {
	
	private String url = "jdbc:sqlite:.\\src\\basededatos\\BClientes";
	private String usuario = "root";
	private String password = "";

	public ClienteDAO() {}

	public boolean alta(Cliente c) {

		try {
			Connection con = DriverManager.getConnection(url,usuario,password); 
			try {
				String sql = "INSERT INTO TClientes VALUES (?,?,?)";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, c.getIdCliente());
				ps.setString(2, c.getPassword());
				ps.setString(3, c.getNombre());
				ps.executeUpdate();
			} 
			finally {con.close();}
		} 
		catch (SQLException ex) 
		{
			System.err.println("Error en el proceso de alta");
			return false;
		}

		return true;
	}

	public void baja(String idCliente) {

		try 
		{
			Connection con = DriverManager.getConnection(url,usuario,password); 
			try
			{
				String sql = "DELETE FROM TClientes where IdCliente = ?";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, idCliente);
				ps.executeUpdate();
			} 
			finally {con.close();}
		}
		catch (SQLException ex) {System.err.println("Error en el proceso de baja");}
	}

	public void modificacion(Cliente c) {

		try 
		{
			Connection con = DriverManager.getConnection(url,usuario,password); 
			try 
			{
				String sql = "UPDATE TClientes SET Password = ?, Nombre= ? WHERE IdCliente = ?";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, c.getPassword());
				ps.setString(2, c.getNombre());
				ps.setString(3, c.getIdCliente());
				ps.executeUpdate();
			} 
			finally {con.close();}
		}
		catch (SQLException ex) {System.err.println("Error en el proceso de modificaci�n");
		}
	}

	public Cliente consulta(String idCliente) {

		Cliente cliente = new Cliente();

		try 
		{
			Connection con = DriverManager.getConnection(url,usuario,password); 
			try 
			{
				String sql = "SELECT * FROM TClientes WHERE IdCliente = ?";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, idCliente);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					cliente.setIdCliente(rs.getString(1));
					cliente.setPassword(rs.getString(2));
					cliente.setNombre(rs.getString(3));
				}
			} 
			finally {con.close();}
		} 
		catch (SQLException ex) 
		{
			System.err.println("Error en el proceso de consulta");
			return null;
		}
		return cliente;
	}

	public List<Cliente> consulta() {

		Cliente cliente;
		List<Cliente> todoslosClientes = new ArrayList<Cliente>();

		try 
		{
			Connection con = DriverManager.getConnection(url,usuario,password); 
			try 
			{
				Statement s = con.createStatement();
				String sql = "SELECT * FROM TClientes";
				ResultSet rs = s.executeQuery(sql);
				while (rs.next()) {
					cliente = new Cliente();
					cliente.setIdCliente(rs.getString(1));
					cliente.setPassword(rs.getString(2));
					cliente.setNombre(rs.getString(3));
					todoslosClientes.add(cliente);
				}
			} finally {con.close();}
		} 
		catch (SQLException ex) 
		{
			System.err.println("Error en el proceso de consulta global");
			return null;
		}

		return todoslosClientes;
	}
}
