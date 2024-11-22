package DAM2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class AAD_Ev1_Ficheros4_Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Creamos dos paths
        Path path1 = Paths.get("/home/user/documents");
        Path path2 = Paths.get("projects/java");
        /*
         * En estas dos líneas creamos dos objetos Path y 
         * les asignamos una tura con el método .get(String ruta)
         */
        
        // Demostración de resolve()
        Path resolvedPath = path1.resolve(path2);
        System.out.println("resolve() resultado: " + resolvedPath);
        /*
         * Aqui creamos otro objeto Path que será el resultado de 
         * usar el método .resolve(Path p) con los dos primeros
         * objetos creados. Este método combina las dos rutas, poniendo
         * la que usa el método como primera y la introducida como parámetro
         * como segunda. Si una de las dos es una ruta absoluta, devolverá esa.
         */

        // Demostración de relativize()
        Path absolutePath1 = Paths.get("/home/user/documents/file1.txt");
        Path absolutePath2 = Paths.get("/home/user/pictures/image.jpg");
        Path relativePath = absolutePath1.relativize(absolutePath2);
        System.out.println("relativize() resultado: " + relativePath);
        /*
         * Aquí cogemos dos objetos Path y usamos relativice(), este 
         * método calcula la ruta relativa desde la primera ruta hasta
         * la segunda, es decir, devuelve en este caso: ../../pictures/image.jpg
         */
        
        // Casos adicionales
        Path absolutePath = Paths.get("/etc/config");
        Path relativePath2 = Paths.get("local/data");
        /*
         * 
         */

        System.out.println("resolve() con path absoluto: " + path1.resolve(absolutePath));
        /*
         * En este primer caso al ser las dos rutas
         * relativas, devuelve la segunda, es decir, el parámetro.
         */
        System.out.println("resolve() con path relativo: " + path1.resolve(relativePath2));
        /*
         * En este caso, al no ser ruta absoluta y ser relativa
         * combina las dos y devuelve 
         * path1 + relativepath2 = /home/user/documents/local/data
         */

        try {
            System.out.println("relativize() entre absoluto y relativo: " + 
                               absolutePath.relativize(relativePath2));
        } catch (IllegalArgumentException e) {
            System.out.println("No se puede relativizar entre un path absoluto y uno relativo");
        }
       /*
        * Aquí se muestra que, por lógica, no se puede relativizar
        * entre un path absoluto y uno relativo, evidentemente
        * no se sabe como llegar al relarivo desde el absoluto.
        */
	}

}
