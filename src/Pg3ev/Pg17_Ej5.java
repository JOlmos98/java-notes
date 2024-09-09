package Pg3ev;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

/*
 * Desarrolle un juego que pruebe la destreza del usuario en inglés. El programa leerá de 
 * un fichero de texto diez palabras en español y su traducción en inglés. El programa 
 * indicará palabras en español al usuario y éste deberá indicar su traducción en inglés. El 
 * usuario gana el juego si acierta cuatro palabras consecutivas, pierde si comete tres 
 * errores o bien no alcanza su objetivo. 
 */
public class Pg17_Ej5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader archivo1=new FileReader(".\\InglesEspanol.txt");
		bienvenidaInglesEspanol();
		juegoInglesEspanol(archivo1);
		
		/* - - - - - Esto sólo leerá el txt por consola.
		BufferedReader ejemplo=new BufferedReader(archivo1);
		String lector=ejemplo.readLine();
		while (lector!=null) {
			System.out.println(lector);
			lector=ejemplo.readLine();
		}
		// - - - - - */
	}

	////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////

	public static void bienvenidaInglesEspanol() {
		JOptionPane.showMessageDialog(null, "Bienvenido al juego Inglés-Español.\n\nLas reglas son las siguientes:"
				+"\n1. Debes escribir la traducción correcta al inglés de la palabra que se te muestra."
				+"\n2. Debes realizar cuatro aciertos consecutivos."
				+"\n3. Perderás si cometes tres errores o no alcanzas tu objetivo de cuatro aciertos consecutivos."
				+"\n4. El juego contiene un total de diez palabras.\n\n¡SUERTE!");
	}
	
	public static void juegoInglesEspanol(FileReader txtConPalabras) throws Exception{
		int vidas=3;
		int aciertosconsecutivos=0;
		int palrest=10;
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
			String linea="";
			String palabraESP="";
			String palabraING="";
			BufferedReader archivo=new BufferedReader(txtConPalabras);
			//try {
			String lector=archivo.readLine();
			while (lector!=null&&vidas!=0&&aciertosconsecutivos!=4&&palrest!=0) {
				linea=lector;
				
				palabraING=linea.substring(0, linea.indexOf("="));
				palabraESP=linea.substring(linea.indexOf("=")+1);
				String palabraintroducida=JOptionPane.showInputDialog("Vidas: "+vidas+"\nAciertos consecutivos: "+aciertosconsecutivos+"\nPalabras restantes: "+palrest+"\n\nLa palabra es: "+palabraESP+"\nEscribe su traducción al inglés: ");
				if (palabraintroducida.equalsIgnoreCase(palabraING)) {
					aciertosconsecutivos++;
				}
				if (!palabraintroducida.equalsIgnoreCase(palabraING)) {
					vidas--;
					if (aciertosconsecutivos>historialaciertos) historialaciertos=aciertosconsecutivos;
					aciertosconsecutivos=0;
				}
				lector=archivo.readLine(); //Esto lee la siguiente línea. Y repetimos el while, si no ponemos esto al final el while leería siempre la misma línea.
				palrest--;
			}
			archivo.close();
			//} catch (IOException e) {
				//System.out.println("Probablemente se ha cerrado el Stream, es decir, se ha ejecutado .close().");
			//}
		if (aciertosconsecutivos==4) JOptionPane.showMessageDialog(null, "¡FELICIDADES!\nHas ganado al conseguir cuatro aciertos consecutivos.\n\nQuedaban:\nVidas: "+vidas+"\nPalabras restantes: "+palrest);
		if (vidas==0) JOptionPane.showMessageDialog(null, "¡HAS PERDIDO!\nTe has quedado sin vidas.\n\nQuedaban:\nPalabras restantes: "+palrest+"\nAciertos consecutivos conseguidos: "+historialaciertos);
		if (palrest==0) JOptionPane.showMessageDialog(null, "¡HAS PERDIDO!\nSe han acabado las palabras.\n\nQuedaban:\nVidas: "+vidas+"\nAciertos consecutivos conseguidos: "+historialaciertos);
		System.out.println("El programa ha terminado.");
	}
}
