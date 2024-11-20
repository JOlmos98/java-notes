package DAM2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class ADD_1Ev_Lambda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void copiaDir(Path pathOldDir, Path pathNewDir) throws IOException {
		 List<Path> elementos = Files.walk(pathOldDir).collect(Collectors.toList());
	     
		 //OPCION 1:
		 //for (Path elemento: elementos) 
		 //Files.copy(elemento, pathNewDir.resolve(pathOldDir.relativize(elemento)));
		 
		 /*
		  * ¿Cómo llegamos del código de arriba al de abajo?
		  * Pues realmente tiene menos líneas la parte de arriba, pero
		  * básicamente al usar el forEach, el "ele" declarado se usa
		  * como i, entonces ya ponemos exactamente la misma 
		  * línea de código dentro del bucle que copia el archivo.
		  */
		 
		 //OPCION 2:
		 elementos.forEach(ele -> {
			 try{
				 Files.copy(ele, pathNewDir.resolve(pathOldDir.relativize(ele)));
			 }catch(IOException e){e.printStackTrace();}
		 });
	}
}
