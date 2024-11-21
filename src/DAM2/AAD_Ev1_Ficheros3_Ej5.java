package DAM2;

import java.io.File;

public class AAD_Ev1_Ficheros3_Ej5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String newDir="./nuevaCarpeta";
		
		File carpeta=new File(newDir);
		
		//Esto también ejecuta carpeta.mkdir
		if(carpeta.mkdir()) {System.out.println("Directorio creado:\nNombre: "+carpeta.getName()+"\nRuta: "+carpeta.getAbsolutePath());}
		
		//Creamos los ficheros dentro del directorio.
		File fich1=new File(carpeta, "fichero1.txt"); 
		File fich2=new File(carpeta, "fichero2.txt");
		
		//Esto también ejecuta .createNewFile
		if (fich1.createNewFile()&&fich2.createNewFile()) {
			
			System.out.println("Hemos creado: "+ fich1.getName()+" y "+fich2.getName());
			
			fich2.renameTo(new File(carpeta, "fich2Renombrado.txt")); //Renombrado correctamente.
			System.out.println("Ahora el fichero 2 se llama: "+fich2.getName());
		}
		System.out.println("Ahora el fichero 2 se llama: "+fich2.getName()); //Sigue diciendo que se llama fichero2.txt, pero no existe ningún fichero2.txt.
	
		
		//Prueba:
		File dirPrueba=new File("./dirPrueba");
		dirPrueba.mkdir();
		
		File fichPrueba=new File(dirPrueba, "fichPrueba.txt");
		fichPrueba.createNewFile();
		//Pues sí, hay que ejecutar esos métodos que devuelven un boolean para crear los ficheros y directorios.
	}

}
