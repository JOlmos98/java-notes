package DAM2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class AAD_Ev1_Ficheros5_Ej7 {

    public static void main(String[] args) {
        Path oldDir = Paths.get("./nuevaCarpeta");
        Path newDir = Paths.get("./carpetaCopiadaYComprobada");
        
        try {
        Path pruebaDir1=Paths.get("./pruebaDir1");
        Path pruebaFich1=Paths.get(pruebaDir1.toString(), "./fichero1.txt");
        
        System.out.println("Existe dir? "+Files.exists(pruebaDir1));
        System.out.println("Existe fich? "+Files.exists(pruebaFich1));
        
        Files.createDirectories(pruebaDir1);
        Files.createFile(pruebaFich1);
        
        System.out.println("Existe dir? "+Files.exists(pruebaDir1));
        System.out.println("Existe fich? "+Files.exists(pruebaFich1));
        //Conclusión, la mejor forma de crear ficheros y directorios son las clases Path, Paths y Files.
        
        } catch (Exception e) {e.printStackTrace();}
        //copiaDir(oldDir, newDir);
    }
	
    
    
    
    // Método:
    public static void copiaDir(Path pathOldDir, Path pathNewDir) {
        try {
            // Verificamos que el directorio de origen existe
            if (!Files.exists(pathOldDir) || !Files.isDirectory(pathOldDir)) {
                System.out.println("El directorio de origen no existe o no es un directorio válido.");
                return;
            }
            /*
             * Verifica que si NO existe el directorio de origen o NO es un directorio,
             * imprime eso y termina el programa.
             */

            // Verificar si el directorio de destino no existe o está vacío
            if (!Files.exists(pathNewDir)) {
                Files.createDirectories(pathNewDir); // Crear el directorio de destino si no existe
            } else {
                try (Stream<Path> dirStream = Files.list(pathNewDir)) {
                    if (dirStream.findAny().isPresent()) { // Comprobar si el directorio tiene contenido
                        System.out.println("El directorio de destino ya existe y no está vacío.");
                        return;
                    }
                    //Usar como parámetro del try el objeto Stream garantiza el dirStream.close(); aunque ocurra una excepción.
                }
            }
            /*
             * Verifica que si NO existe el directorio destino y lo crea y el programa continua.
             * Si existe, crea un Stream<Path>
             * que será una lista del contenido del directorio, con el
             * if (dirStream.findAny().isPresent() verificamos si hay algo dentro o no, si 
             * hay algo dentro, imprimimos eso y el programa termina.
             */
            
            
            // ------------------------------ ↓ BLOQUE CLAVE ↓ ------------------------------ 
            // Recorremos los archivos y directorios de la carpeta origen
            try (Stream<Path> paths = Files.walk(pathOldDir)) {
                paths.forEach(path -> {
                    try {
                        // Calculamos la ruta relativa dentro de pathOldDir
                        Path relativePath = pathOldDir.relativize(path);
                        // Obtenemos la ruta completa en el nuevo directorio
                        Path targetPath = pathNewDir.resolve(relativePath);

                        // Si es un directorio, lo creamos
                        if (Files.isDirectory(path)) {
                            if (!Files.exists(targetPath)) {
                                Files.createDirectories(targetPath);
                            }
                        }
                        // Si es un archivo regular, lo copiamos
                        else if (Files.isRegularFile(path)) {
                        	if (!Files.exists(targetPath)) {
                                Files.createDirectories(targetPath.getParent()); // Asegurarse de que el directorio padre existe
                                Files.copy(path, targetPath); // Copia el archivo
                        	} else System.out.println("El archivo "+path.toString()+" ya existe, no se copia.");
                        }
                    } catch (IOException e) {
                        System.out.println("Error copiando el archivo: " + path);
                        e.printStackTrace();
                    }
                });
            }
            // ------------------------------ ↑ BLOQUE CLAVE ↑ ------------------------------ 
            /*
             * Volvemos a usar como parámetro del try un Stream<Path> pero esta vez 
             * con el método walk() que nos listará TODOS LOS DIRECTORIOS POSIBLES 
             * DENTRO DE LA CARPETA y con usando el método forEach (de las listas) y 
             * la expresión lambda recorremos la lista y obtenemos la ruta relativa 
             * dentro del directorio de origen (de cualquier fichero en cuestión) con 
             * el método relativize y también obtenemos el directorio absoluto del nuevo 
             * directorio de destino con el método resolve().
             * a
             * Si es un directorio, verificamos si existe, si NO existe, lo creamos.
             * a
             * Si es un archivo regular, verificamos si existe en el destino, si 
             * NO existe, lo copiamos. Primero nos aseguramos de que el directorio padre
             * existe con Files.createDirectories(targetPath.getParent()); y lo copiamos
             * con Files.copy(path, targetPath);
             */
            
            
            System.out.println("Copia completada.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al copiar.");
        }
    }
    
}


