package Pg3ev;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Rehaga Ejercicio09.java. No lance Exception 
 * sino una excepción más concreta. Observe 
 * que la trata al capturar Exception.
 */
public class Pg15_Ej11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Creo que esto se refiere a lo que he hecho
		 * exactamente en el código de Pg15_Ej9, es decir, 
		 * añadir dos catch a parte del que ya había (Exception).
		 * 
		 * He añadido el NumberFormatException como primer catch y IOException
		 * como segundo, dejando Exception como tercero.
		 * 
		 * Lo paso aquí y dejo el 9 tal cual para dejarlo todo más limpio.
		 */
		 try {
		     copiaFichero("original.txt","copia.txt");
		   }
		   catch (NumberFormatException e) {
				 e.printStackTrace();  
			     System.out.println();
			     System.out.println("Parece que algunas excepcioes hay que tratarlas por fuerza.");
			     System.out.println("El compilador obliga.");
			     System.out.println("Luego hace falta un try{} catch{}.");
			     System.out.println("Algo ha pasado. Puede que el archivo original.txt no se encuentre.");
		   } catch (IOException e) {
				 e.printStackTrace();  
			     System.out.println();
			     System.out.println("Parece que algunas excepcioes hay que tratarlas por fuerza.");
			     System.out.println("El compilador obliga.");
			     System.out.println("Luego hace falta un try{} catch{}.");
			     System.out.println("Algo ha pasado. Puede que el archivo original.txt no se encuentre.");
		   }
		   catch (Exception ex) {
			 ex.printStackTrace();  
		     System.out.println();
		     System.out.println("Parece que algunas excepcioes hay que tratarlas por fuerza.");
		     System.out.println("El compilador obliga.");
		     System.out.println("Luego hace falta un try{} catch{}.");
		     System.out.println("Algo ha pasado. Puede que el archivo original.txt no se encuentre.");
		   }
		   finally {
			   
		   }
		}
		
		public static void copiaFichero(String f1, String f2) throws Exception {

			FileReader fr = new FileReader(f1);
			FileWriter fw = new FileWriter(f2);

			int c = fr.read();
			while (c != -1) {
				fw.write(c);
				c = fr.read();
			}

			fw.close();
			fr.close();
		}
	}


