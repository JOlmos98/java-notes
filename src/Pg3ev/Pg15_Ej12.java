package Pg3ev;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

/*
 * Rehaga Ejercicio11.java. Incluya un método para 
 * leer por teclado un dato entero que identificará 
 * al archivo destino. Por ejemplo, si leemos 3 el 
 * archivo destino será copia3.txt. Haga el tratamiento 
 * de excepciones sólo en el método main(). Haga 
 * un tratamiento diferenciado de los tipos de 
 * excepciones que produce el programa incluyendo 
 * dos (o más si fuera necesario ) bloques catch{}. 
 */
public class Pg15_Ej12 {
/*
 * Creamos un método leerFichero() que reciba un int por
 * parámetro e identifique así mediante algunos if qué
 * fichero se está seleccionando y tratamos los posibles 
 * errores con las excepciones dadas anteriormente.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=Integer.parseInt(JOptionPane.showInputDialog("Introduce un int para identificar el archivo a leer: "));
			leerFichero(a);
		} catch (NumberFormatException e) {
			 e.printStackTrace();  
		     System.out.println();
		     System.out.println("Error en el formato del carácter introducido.\nProbablemente se ha introducido un carácter no interpretable como int.");
		} catch (IOException e) {
			 e.printStackTrace();  
		     System.out.println();
		     System.out.println("Error en la entrada de datos.");
		} catch (Exception e) {
			 e.printStackTrace();  
		     System.out.println();
		     System.out.println("Error general (Exception).");
		}
		
		/* try {
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
			   
		   }*/
		}
		
		///////////////////////////////////////////////////////////////////
	
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
		int a=Integer.parseInt(JOptionPane.showInputDialog("Introduce un int para seleccionar un fichero:"));
		
		///////////////////////////////////////////////////////////////////
		
		public static void leerFichero(int a) throws Exception {
			if (a==0) {
				BufferedReader br1=new BufferedReader(new FileReader("C:\\Users\\soler\\eclipse-workspace\\Java\\original.txt"));
				String leerlinea;
				while ((leerlinea=br1.readLine())!=null) {
					System.out.println(leerlinea);
				}
			} else if (a==1) {
				BufferedReader br1=new BufferedReader(new FileReader("C:\\Users\\soler\\eclipse-workspace\\Java\\copia.txt"));
				String leerlinea;
				while ((leerlinea=br1.readLine())!=null) {
					System.out.println(leerlinea);
				}
			} else if (a>1) {
				BufferedReader br1=new BufferedReader(new FileReader("C:\\Users\\soler\\eclipse-workspace\\Java\\copia"+a+".txt"));
				String leerlinea;
				while ((leerlinea=br1.readLine())!=null) {
					System.out.println(leerlinea);
				} 
			} else System.out.println("Parámetro no válido.");
		}

}

