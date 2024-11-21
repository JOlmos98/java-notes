package DAM2;

public class AAD_1Ev_Lambda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//En el ejemplo del profesor tenemos una interfaz y una clase que implementa la interfaz:
		
/*
 * ------------------
 * public interface If {
 * 		public void saludo(String nombre);
 * }
 * ------------------
 * 
 * La interfaz solo obliga a sobreescribir el método saludo que recibe un String como parámetro.
 * 
 * ------------------
 * public class MisMensajes implements If {
 * 		public void saludo(String nombre){
 * 			System.out.println("Hola "+nombre);
 * 		}
 * }
 * ------------------
 * 
 * Ahora haremos esto con una expresión lambda ahorrándonos el fichero MisMensajes.java
 * 
 */
		If misMensajes =(x) -> {System.out.println("Hola "+x);};
		
		//Lo que hemos hecho es declarar la funcionalidad del único método de la interfaz If con una expresión lambda.
		
		/*
		 * Hay expresiones lambda de tipo:
		 * - Consumidor: Acepta un argumento y no devuelve ningún valor (por ejemplo, `Consumer<T>`).
		 * - Proveedor: No acepta argumentos y devuelve un valor (por ejemplo, `Supplier<T>`).
		 * - Función: Acepta un argumento y devuelve un valor (por ejemplo, `Function<T, R>`).
		 * - Predicado: Acepta un argumento y devuelve un valor booleano (por ejemplo, `Predicate<T>`).
		 */
	}

}
