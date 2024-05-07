package Pg3ev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion { 

	Connection cx=null;
	
	public Connection conectar() {
		try {
		Class.forName("org.sqlite.JDBC");
		cx=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\soler\\eclipse-workspace\\Java\\TutorialSQLite.db"); //Directorio del archivo .db
		System.out.println("Conexión exitosa.");
		} catch (ClassNotFoundException | SQLException e) { //Primera noticia de que se pueden poner dos posibles excepciones así,
			e.printStackTrace();
		}
		return cx;
	}
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		Conexion cx=new Conexion();
		cx.conectar();
	}
}

class Usuario {
	
	//
	
	int id;
	String user;
	String password;
	String nombre;
	
	//
	
	public Usuario() {}
	public Usuario(String user, String password, String nombre) {
		
	}
	
	//
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
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
}