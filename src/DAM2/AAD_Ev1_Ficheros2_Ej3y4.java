package DAM2;

import java.io.File;

/*
Ej3:
Utilizando la clase File, realice un programa que muestre información acerca de un
fichero indicado por el usuario. Considere los métodos getName(), getPath(),
getAbsolutePath(), length(), isDirectory(), isFile().
Ej4:
Aplique los mismos métodos al directorio actual del proyecto, y muestre, además, el
contenido de su directorio src.
 */
public class AAD_Ev1_Ficheros2_Ej3y4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ------------------------------ EJERCICIO 3 ------------------------------
		System.err.println("EJERCICIO 3:");
		// Ruta del archivo que queremos analizar
        String ruta = ".\\src\\DAM2\\texto.txt";

        // Creamos un objeto File para representar el archivo
        File file1 = new File(ruta);

        // Verificamos si el archivo existe
        if (file1.exists()) {
            System.out.println("Información del archivo:" +ruta);
            System.out.println("getName() - Nombre: " + file1.getName()); // Nombre del archivo
            System.out.println("getPath() - Ruta relativa: " + file1.getPath()); // Ruta relativa
            System.out.println("getAbsolutePath() - Ruta absoluta: " + file1.getAbsolutePath()); // Ruta absoluta
            System.out.println("length() - Tamaño (bytes): " + file1.length()); // Tamaño del archivo en bytes

            // Verificamos si es un directorio o un archivo
            System.out.println("\n¿Es un archivo o directorio?");
            if (file1.isDirectory()) {
                System.out.println("isDirectory()==true - Es un directorio.");
            } else if (file1.isFile()) {
                System.out.println("isFile()==true - Es un archivo.");
            }
        } else {
            System.out.println("El archivo no existe: " + ruta);
        }
		
        // ------------------------------ EJERCICIO 4 ------------------------------
        System.err.println("\nEJERCICIO 4:");
        // Representamos el directorio actual del proyecto
        File dirActual = new File("."); // El directorio actual se representa con "."

        // Verificamos si el directorio actual existe
        if (dirActual.exists()) {
            System.out.println("Información del directorio actual:");
            System.out.println("Nombre: " + dirActual.getName());
            System.out.println("Ruta relativa: " + dirActual.getPath());
            System.out.println("Ruta absoluta: " + dirActual.getAbsolutePath());
            System.out.println("Tamaño (bytes): " + dirActual.length());

            // Verificamos si es un directorio
            if (dirActual.isDirectory()) {
                System.out.println("Es un directorio.");
            } else {
                System.out.println("No es un directorio.");
            }

            // Representamos el directorio "src"
            File srcDir = new File("./src");

            // Verificamos si el directorio "src" existe
            if (srcDir.exists() && srcDir.isDirectory()) {
                System.out.println("\nContenido del directorio 'src':");

                // Listamos los archivos y subdirectorios dentro de "src"
                String[] contents = srcDir.list(); //Este método devuelve un array de Strings de los directorios y documentos que hay.
                if (contents != null) {
                    for (int i=0;i<contents.length;i++) {
                        System.out.println("- " + contents[i]);
                    }
                } else {
                    System.out.println("El directorio 'src' está vacío.");
                }
            } else {
                System.out.println("\nEl directorio 'src' no existe o no es un directorio.");
            }
        } else {
            System.out.println("El directorio actual no existe.");
        }
		
		
	}

}
