package Tarea3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	private static String url="jdbc:sqlite:.\\src\\basededatos\\BDiccionario";
	private static String user="root";
	private static String password="";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hacemos ArrayList para almacenar como objetos los registros de la DB.
		ArrayList<Palabra> palabras=new ArrayList();
		try {
			Connection con=DriverManager.getConnection(url, user, password);
			Statement st=con.createStatement();
			System.out.println("Conexión establecida.");
			//st.executeUpdate("INSERT INTO TPalabras (PalAleman, PalEspanyol, PalIngles) VALUES ('Bleistift', 'Lápiz', 'Pencil')");
			//st.executeUpdate("INSERT INTO TPalabras (PalAleman, PalEspanyol, PalIngles) VALUES ('Bildschirm', 'Pantalla', 'Screen')");
			//st.executeUpdate("INSERT INTO TPalabras (PalAleman, PalEspanyol, PalIngles) VALUES ('Tier', 'Animal', 'Animal')");
			//st.executeUpdate("INSERT INTO TPalabras (PalAleman, PalEspanyol, PalIngles) VALUES ('Essen', 'Comida', 'Food')");
			//st.executeUpdate("INSERT INTO TPalabras (PalAleman, PalEspanyol, PalIngles) VALUES ('Arm', 'Brazo', 'Arm')");
			ResultSet rs=st.executeQuery("SELECT * FROM TPalabras");
			
			while (rs.next()) {
				int id=rs.getInt("Id");
				String palaleman=rs.getString("PalAleman");
				String palespanyol=rs.getString("PalEspanyol");
				String palingles=rs.getString("PalIngles");

				palabras.add(new Palabra(id, palaleman, palespanyol, palingles));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//for (Palabra p:palabras) System.out.println(p);
		try {
			seleccionPalabra(palabras);
		} catch (Exception e) {e.printStackTrace();}
		
	}

	public static void seleccionPalabra(ArrayList<Palabra> palabras) throws IOException {
		String introducida="";
		/*
		 * Le añado horas y minutos al nombre del archivo 
		 * para que genere más archivos mientras pruebo el programa.
		 */
		BufferedWriter archivo=new BufferedWriter(new FileWriter(".\\RegistroTraducciones\\"+LocalDate.now().getYear()+"-"+LocalDate.now().getMonthValue()+"-"+LocalDate.now().getDayOfMonth()+" "+LocalDateTime.now().getHour()+"-"+LocalDateTime.now().getMinute()+".txt"));
		Scanner sc=new Scanner(System.in);
		while (!introducida.equalsIgnoreCase("exit")) {
			boolean valida=false;
			System.out.println("Escriba en consola una palabra de las expuestas para traducir o escriba EXIT para terminar el programa: ");
			for (Palabra p:palabras) System.out.println("- "+p.getPalaleman());
			introducida=sc.nextLine();
			for (int i=0;i<palabras.size();i++) {
				if (introducida.equalsIgnoreCase(palabras.get(i).getPalaleman())) {
					valida=true;
					System.out.println("Palabra elegida: "+palabras.get(i).getPalaleman()+", en Español: "+palabras.get(i).getPalespanyol()+", en Inglés: "+palabras.get(i).getPalingles()+".");
					archivo.write("Palabra elegida: "+palabras.get(i).getPalaleman()+", en Español: "+palabras.get(i).getPalespanyol()+", en Inglés: "+palabras.get(i).getPalingles()+".");
					archivo.newLine();
				} 
			}
			if (introducida.equalsIgnoreCase("exit")) {System.out.println("Ha introducido EXIT para terminar el programa.");}
			if (valida==false&&!introducida.equalsIgnoreCase("exit")) System.out.println("Palabra NO válida.");
		}
		sc.close();
		archivo.close();
		System.out.println("El programa ha terminado.");
	}
	
}
