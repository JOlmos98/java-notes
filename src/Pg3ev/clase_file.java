package Pg3ev;

import java.io.File;
import java.io.IOException;

public class clase_file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Si quieres probar el código adapta los directorios a tu PC.
		File fichero1=new File("C:\\Users\\soler\\Desktop\\fichero1.txt");
		File directorio1=new File("C:\\Users\\soler\\Desktop\\carpetita");
		fichero1.createNewFile();
		directorio1.mkdir();
		System.out.println("¿Existen o no?");
		System.out.println("Fichero: "+fichero1.exists());
		System.out.println("Directorio: "+directorio1.exists());
		
		System.out.println("///////////////////////////////////////////////////////////////////////");
		
		File directorio2=new File("C:\\Users\\soler\\Downloads");
		directorio2.createNewFile();
		System.out.println("¿Existe el fichero? "+directorio2.exists()); //Devuelve un boolean que indica si existe o no.
		System.out.println("¿Es un directorio? "+directorio2.isDirectory()); //Devuelve un boolean que indica si el objeto File es un directorio o no.
		System.out.println("¿Es un fichero? "+directorio2.isFile()); //Devuelve un boolean que indica si el objeto File es un fichero o no.
		System.out.println("¿Cuál es la ruta absoluta? "+directorio2.getAbsolutePath()); //Devuelve la ruta absoluta del objeto File.
		System.out.println("¿Puedo leerlo? "+directorio2.canRead()); //Devuelve un boolean que indica si se puede leer. También existen .canWrite y canExecute.
		System.out.println("¿Cómo se llama? "+directorio2.getName()); //Un getter de toda la vida.
		System.out.println("¿Cuál es su padre? "+directorio2.getParent()); //Un getter imagino que del directorio que lo contiene.
		//Con las siguientes 4 líneas creamos dos ficheros .txt para hacer bulto a la hora de leer los archivos del array posterior.
		File fichero3=new File("C:\\Users\\soler\\Downloads\\fichero3");
		fichero3.createNewFile();
		File fichero4=new File("C:\\Users\\soler\\Downloads\\fichero4");
		fichero4.createNewFile();
		
		//Podemos crear un array de objetos File con esta línea:
		File AFile[]=directorio2.listFiles();
		for (int i=0;i<AFile.length;i++) System.out.println(AFile[i]);

	}

}
