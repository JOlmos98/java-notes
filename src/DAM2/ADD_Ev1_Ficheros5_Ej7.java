package DAM2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ADD_Ev1_Ficheros5_Ej7 {

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

            // Verificar si el directorio de destino no existe o está vacío
            if (!Files.exists(pathNewDir)) {
                Files.createDirectories(pathNewDir); // Crear el directorio de destino si no existe
            } else {
                try (Stream<Path> dirStream = Files.list(pathNewDir)) {
                    if (dirStream.findAny().isPresent()) { // Comprobar si el directorio tiene contenido
                        System.out.println("El directorio de destino ya existe y no está vacío.");
                        return;
                    }
                }
            }

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
                            Files.createDirectories(targetPath.getParent()); // Asegurarse de que el directorio padre existe
                            Files.copy(path, targetPath); // Copia el archivo
                        }
                    } catch (IOException e) {
                        System.out.println("Error copiando el archivo: " + path);
                        e.printStackTrace();
                    }
                });
            }

            System.out.println("Copia completada.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al copiar.");
        }
    }
    
}


