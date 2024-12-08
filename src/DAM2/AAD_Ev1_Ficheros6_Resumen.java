package DAM2;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;

public class AAD_Ev1_Ficheros6_Resumen {

    public static void main(String[] args) {
        try {
            // Crear Path a un archivo o directorio
            Path archivo = Paths.get("archivo.txt");
            Path directorio = Paths.get("directorio");

            // Crear un archivo
            if (!Files.exists(archivo)) {
                Files.createFile(archivo);
                System.out.println("Archivo creado: " + archivo.toAbsolutePath());
            }

            // Crear un directorio
            if (!Files.exists(directorio)) {
                Files.createDirectory(directorio);
                System.out.println("Directorio creado: " + directorio.toAbsolutePath());
            }

            // Escribir texto en un archivo
            Files.writeString(archivo, "Hola, este es un resumen de gestión de ficheros en Java.\n", StandardOpenOption.APPEND);
            System.out.println("Texto escrito en el archivo.");

            // Leer el contenido de un archivo
            List<String> lineas = Files.readAllLines(archivo);
            System.out.println("Contenido del archivo:");
            lineas.forEach(System.out::println);

            // Copiar un archivo
            Path archivoCopia = Paths.get("archivo_copia.txt");
            Files.copy(archivo, archivoCopia, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Archivo copiado a: " + archivoCopia.toAbsolutePath());

            // Mover un archivo
            Path archivoMovido = Paths.get("directorio/archivo_movido.txt");
            Files.move(archivoCopia, archivoMovido, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Archivo movido a: " + archivoMovido.toAbsolutePath());

            // Comprobar si un archivo o directorio existe
            System.out.println("¿Existe el archivo original? " + Files.exists(archivo));
            System.out.println("¿Existe el directorio? " + Files.exists(directorio));

            // Obtener información básica de un archivo
            BasicFileAttributes atributos = Files.readAttributes(archivo, BasicFileAttributes.class);
            System.out.println("Tamaño del archivo: " + atributos.size() + " bytes");
            System.out.println("Fecha de creación: " + atributos.creationTime());
            System.out.println("Última modificación: " + atributos.lastModifiedTime());

            // Comparar archivos
            if (Files.isSameFile(archivo, archivo)) {
                System.out.println("El archivo es igual a sí mismo (evidentemente).");
            }

            // Eliminar un archivo
            Files.deleteIfExists(archivoMovido);
            System.out.println("Archivo movido eliminado.");

            // Listar contenido de un directorio
            System.out.println("Contenido del directorio:");
            try (DirectoryStream<Path> stream = Files.newDirectoryStream(directorio)) {
                for (Path entrada : stream) {
                    System.out.println(" - " + entrada.getFileName());
                }
            }

            // Eliminar el directorio (debe estar vacío)
            Files.delete(directorio);
            System.out.println("Directorio eliminado.");

        } catch (IOException e) {
            System.err.println("Error gestionando ficheros: " + e.getMessage());
        }
    }
}
