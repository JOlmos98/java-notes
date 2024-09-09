package Examen2Ev;

import java.util.ArrayList;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Empresa> ALE=new ArrayList();
		
		ALE.add(new Empresa(1234, "ACERINOX", "584738473", "Valencia"));
		ALE.add(new Empresa(4857, "IDEALISTA", "475847362", "Madrid"));
		ALE.add(new Empresa(5678, "ZARA", "384756283", "Alicante"));
		ALE.add(new Empresa(9876, "MANGO", "283746523", "Barcelona"));
		ALE.add(new Empresa(6543, "SEAT", "837465123", "Madrid"));
		ALE.add(new Empresa(3456, "REPSOL", "573829461", "Valencia"));
		ALE.add(new Empresa(7890, "INDITEX", "492837465", "Galicia"));
		ALE.add(new Empresa(2345, "BBVA", "638475920", "Madrid"));
		ALE.add(new Empresa(8901, "TELEFÓNICA", "283746591", "Madrid"));
		ALE.add(new Empresa(4567, "SANTANDER", "574839201", "Cantabria"));
		
		System.err.println("Imprimimos las provincias en crudo.");
		for (int i=0;i<ALE.size();i++) System.out.println(ALE.get(i).getProvincia()); System.out.println();
		
		System.err.println("Imprimimos las provincias ordenadas.");
		Principal2.ordenaProvinciaNombre(ALE);
		for (int i=0;i<ALE.size();i++) System.out.println(ALE.get(i).getProvincia());
	}

	private static void ordenaProvinciaNombre(ArrayList<Empresa> empresas) {
		
		for (int i=0;i<empresas.size();i++) {
			for (int a=0;a<empresas.size();a++) {
				
				if (empresas.get(a).compareToProvincia(empresas.get(i))>0) {
					Empresa aux=empresas.get(i);
					empresas.set(i, empresas.get(a));
					empresas.set(a,  aux);
					/*
					 * Para ordenar un arraylist primero hacemos el respectivo
					 * método compareTo que compare la variable según la cual queremos
					 * ordenar las instancias, después hacemos un método ordenar() que
					 * incluya dos bucles y dentro de ambos, un if que compare con nuestro
					 * compareTo la instancia del segundo bucle (a) con la del primero (i)
					 * y evalue si esa comparación es mayor que 0, o al revés, puede ser 
					 * i.compareTo(a)<0, haría lo mismo. Debajo de ese if, creamos el 
					 * intercambio con la variable aux y el método set.
					 */
				}
			}
		}
	}
}
