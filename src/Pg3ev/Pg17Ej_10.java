package Pg3ev;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/*
 * A semejanza del ejercicio 5, y utilizando su estructura, desarrolle un juego que pruebe 
 * la destreza del usuario en inglés. El programa gestionará una base BDiccionario con 
 * una única tabla TTraducciones. En cada ejecución el programa indicará palabras en 
 * español al usuario y éste deberá indicar su traducción en inglés, hasta en un máximo 
 * de diez ocasiones. El usuario gana el juego si acierta cuatro palabras consecutivas, 
 * pierde si comete tres errores o bien no alcanza su objetivo. 
 * 
 * Tras cada partida, el programa debe
 * generar un fichero informativo con nombre según el formato “Informe 
 * YYYY·MM·DD HH.MM” con las preguntas, respuestas correctas y respuestas del 
 * usuario.
 */
public class Pg17Ej_10 {

	public static void main(String[] args) throws Exception {
		
		bienvenidaInglesEspanol();
		juegoInglesEspanol();
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void bienvenidaInglesEspanol() {
		JOptionPane.showMessageDialog(null, "Bienvenido al juego Inglés-Español.\n\nLas reglas son las siguientes:"
				+"\n1. Debes escribir la traducción correcta al inglés de la palabra que se te muestra."
				+"\n2. Debes realizar cuatro aciertos consecutivos."
				+"\n3. Perderás si cometes tres errores o no alcanzas tu objetivo de cuatro aciertos consecutivos."
				+"\n4. El juego contiene un total de veintidos palabras.\n\n¡SUERTE!");
	}
	
	private static String url="jdbc:sqlite:.\\src\\basededatos\\BDiccionario";
	private static String user="root";
	private static String password="";
	//Datos usados para el logging en la DB en el método juegoInglesEspanol.
	
	public static void juegoInglesEspanol() throws Exception{
		int vidas=3;
		int aciertosconsecutivos=0;
		int palrest=22;
		int historialaciertos=0;
		/*
		 * Hay que hacer que lea el archivo con bufferedreader y exponga la palabra en español y reciba la palabra en inglés
		 * manejando el hecho de que tiene que leer desde el inicio de la linea hasta el = para la palabra en inglés y a partir 
		 * del = hasta el final para la palabra en Español.
		 * 
		 * Hay que hacer también que cuando cometa un error, si aciertosconsecutivos>historialaciertos, guardará el valor en
		 * historialaciertos y establecerá aciertosconsecutivos en 0 otra vez.
		 */
			
			//Creamos un string donde se guarde la palabra en español leida y otro donde se guarde la de ingles leida y salto de linea.
			
			String palabraESP="";
			String palabraING="";
			BufferedWriter txtpartida=new BufferedWriter(new FileWriter(".\\RegistroPartidasEspIng\\"+LocalDate.now().getYear()+"-"+LocalDate.now().getMonth()+"-"+LocalDate.now().getDayOfMonth()+" "+LocalDateTime.now().getHour()+"-"+LocalDateTime.now().getMinute()+".txt"));
			
			try {
			Connection con=DriverManager.getConnection(url, user, password);
			Statement st=con.createStatement();
			System.out.println("Conexión exitosa. \nNo hay error, o sea que estamos conectados a la DB.");
			ResultSet rs = st.executeQuery("SELECT * FROM TTraducciones");
			
			/*
			 * Aqui creamos el arraylist y almacenamos los registros como objetos para poder acceder a ellos.
			 */
			
			ArrayList<Palabra> palabras=new ArrayList();
			while (rs.next()&&vidas!=0&&aciertosconsecutivos!=4&&palrest!=0) {
				int id=rs.getInt("Id");
				String esp=rs.getString("Esp");
				String ing=rs.getString("Ing");
				
				/*
				 * Este while extrae la información de los campos con rs.getInt y .getString y señalamos
				 * el campo en cuestión en el String, para almacenar la información de ese campo en la
				 * variable declarada.
				 * 
				 * Después, con la sentencia de abajo añadimos un nuevo objeto Contacto al ArrayList
				 * con las variables como parámetros creadas extrayendo la información de la base de datos.
				 */
				palabras.add(new Palabra(id, esp, ing));
			}
			for (int i=0;i<palabras.size();i++) System.out.println(palabras.get(i));
			int i=0;
			while (vidas!=0&&aciertosconsecutivos!=4&&palrest!=0) {
				
				String escritor="";
				
				palabraING=palabras.get(i).getIng();
				palabraESP=palabras.get(i).getEsp();
				String palabraintroducida=JOptionPane.showInputDialog("Vidas: "+vidas+"\nAciertos consecutivos: "+aciertosconsecutivos+"\nPalabras restantes: "+palrest+"\n\nLa palabra es: "+palabraESP+"\nEscribe su traducción al inglés: ");
				if (palabraintroducida.equalsIgnoreCase(palabraING)) {
					aciertosconsecutivos++;
					escritor="ACIERTO, palabra preguntada: "+palabraESP+", Respuesta correcta: "+palabraING+", Respuesta del usuario: "+palabraintroducida+".";
				}
				if (!palabraintroducida.equalsIgnoreCase(palabraING)) {
					vidas--;
					escritor="ERROR, palabra preguntada: "+palabraESP+", Respuesta correcta: "+palabraING+", Respuesta del usuario: "+palabraintroducida+".";
					if (aciertosconsecutivos>historialaciertos) historialaciertos=aciertosconsecutivos;
					aciertosconsecutivos=0;
				}
				txtpartida.write(escritor);
				txtpartida.newLine();
				palrest--;
				i++;
			}
			
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Probablemente se ha cerrado el Stream, es decir, se ha ejecutado .close().");
			}
		if (aciertosconsecutivos==4) {
			JOptionPane.showMessageDialog(null, "¡FELICIDADES!\nHas ganado al conseguir cuatro aciertos consecutivos.\n\nQuedaban:\nVidas: "+vidas+"\nPalabras restantes: "+palrest);
			txtpartida.write("WIN");
		}
		if (vidas==0) {
			JOptionPane.showMessageDialog(null, "¡HAS PERDIDO!\nTe has quedado sin vidas.\n\nQuedaban:\nPalabras restantes: "+palrest+"\nAciertos consecutivos conseguidos: "+historialaciertos);
			txtpartida.write("LOSE");
		}
		if (palrest==0) {
			JOptionPane.showMessageDialog(null, "¡HAS PERDIDO!\nSe han acabado las palabras.\n\nQuedaban:\nVidas: "+vidas+"\nAciertos consecutivos conseguidos: "+historialaciertos);
			txtpartida.write("LOSE");
		}
		txtpartida.close();
		System.out.println("El programa ha terminado.");
	}
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Palabra{
	
	//Variables:
	
	private int id;
	private String esp;
	private String ing;
	
	//Constructor:
	
	public Palabra(int id, String esp, String ing) {
		this.id=id;
		this.esp=esp;
		this.ing=ing;
	}

	//Métodos:
	
	@Override
	public String toString() {
		return "ID palabra: " + id + ", Esp: " + esp + ", Ing: " + ing + ".";
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEsp() {
		return esp;
	}

	public void setEsp(String esp) {
		this.esp = esp;
	}

	public String getIng() {
		return ing;
	}

	public void setIng(String ing) {
		this.ing = ing;
	}
}
