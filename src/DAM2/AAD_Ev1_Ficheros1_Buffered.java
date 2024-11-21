package DAM2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class AAD_Ev1_Ficheros1_Buffered {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//Vamos a copiar el fichero texto.txt que esta en nuestro propio directorio:
		BufferedReader fOrig=new BufferedReader(new FileReader(".\\src\\DAM2\\texto.txt"));
		BufferedWriter fDest=new BufferedWriter(new FileWriter(".\\src\\DAM2\\copiaTexto.txt"));
		
		String lector=fOrig.readLine(); //El string donde se guarda la línea leida.
		while (lector!=null) { //Mientras haya algo que leer, se ejcuta el código.
			fDest.write(lector); //Escribimos la línea leida en el copiaTexto.txt.
			fDest.newLine(); //Siguiente linea.
			lector=fOrig.readLine(); //Leemos esa línea.
		}
		
		//Ahora vamos a copiar el archivo imagen.png:
		BufferedInputStream aOrig=new BufferedInputStream(new FileInputStream(".\\src\\DAM2\\imagen.png"));
		BufferedOutputStream aDest=new BufferedOutputStream(new FileOutputStream(".\\src\\DAM2\\copiaImagen.png"));

		byte[] buffer=new byte[1000]; //Creamos un búfer de 1000 bytes para leer fragmentos del archivo en cada iteración.
		int bytesLeidos; //Almacena los 1000 bytes en cuestión.
		
		
		bytesLeidos=aOrig.read(buffer); //Leemos los 1000 bytes mediante el búfer y almacenamos en bytesLeidos.
		//Si no hay más datos que leer, devuelve -1.
		while(bytesLeidos>0) { //Mientras haya bytes almacenados, se ejecuta el código.
			aDest.write(buffer, 0, bytesLeidos); //Escribimos los bytes almacenamos en el búfer, el primer parámetro es de donde cogemos el contenido a escribir, el segundo, la posición del búfer desde donde empezamos a escribir, y el tercero la cantidad de bytes que escribiremos.
			bytesLeidos=aOrig.read(buffer); //Lee otro fragmento del archivo origen.
		}
		
		fOrig.close();
		fDest.close();
		aOrig.close();
		aDest.close();
		System.out.println("Programa terminado.");
	}

}
