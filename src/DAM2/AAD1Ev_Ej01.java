package DAM2;

import java.util.ArrayList;

public class AAD1Ev_Ej01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> pal=new ArrayList();
		
        pal.add("Pedro");
        pal.add("Antonio");
        pal.add("Pedro");
        pal.add("Alberto");
        pal.add("Paula");
        pal.add("José");
        pal.add("Samuel");
        pal.add("José");
        pal.add("Raúl");
        pal.add("José");
        pal.add("José");
        pal.add("Antonio");
        pal.add("Samuel");
        pal.add("Samuel");
        pal.add("Samuel");
        pal.add("Pedro");
        pal.add("José");
        
		//5 José, 4 Samuel, 3 Pedro, 2 Antonio.
		System.out.println(pal);
	}
	
	public static ArrayList<String> palabrasOrdenadasSinRepeticiones(ArrayList<String> palabras){
		ArrayList<String> arOrdenadas=new ArrayList();
		ArrayList<Integer> contador=new ArrayList();
		
		for (int i=0;i<palabras.size();i++) {
			if (!arOrdenadas.contains(palabras.get(i))) {
				arOrdenadas.add(palabras.get(i));
				contador.add(1); //Añade un elemento nuevo establecido en 1.
			} else {
				int index=arOrdenadas.indexOf(i);
				contador.set(index, contador.get(index)+1);
				//Al encontrar una palabra repetida, va a su contador localizándolo con 
				//arOrdenadas.indexOf(i) y le suma uno con contador.set(index, contador.get(index)+1.
			}
			for (int a=0;a<palabras.size();a++) {
				
			}
		}
		
		return arOrdenadas;
	}
	
	//////////////////////////////////////
	
	
    public static ArrayList<String> palabrasOrdenadasSinRepeticionesGPT(ArrayList<String> palabras) {
        // Crear una lista donde almacenamos palabras sin repetir
        ArrayList<String> palabrasUnicas = new ArrayList<>();
        ArrayList<Integer> conteo = new ArrayList<>();
        
        // Recorremos la lista original
        for (String palabra : palabras) {
            // Si la palabra no está en la lista única, la añadimos
            if (!palabrasUnicas.contains(palabra)) {
                palabrasUnicas.add(palabra);
                conteo.add(1); // Comenzamos a contar la primera ocurrencia
            } else {
                // Si la palabra ya está, actualizamos su conteo
                int index = palabrasUnicas.indexOf(palabra);
                conteo.set(index, conteo.get(index) + 1);
            }
        }

        // Ahora ordenamos las palabras según sus conteos
        for (int i = 0; i < palabrasUnicas.size(); i++) {
            for (int j = i + 1; j < palabrasUnicas.size(); j++) {
                // Si el conteo de la palabra en j es mayor que en i, intercambiamos
                if (conteo.get(j) > conteo.get(i)) {
                    // Intercambiamos palabras
                    String tempPalabra = palabrasUnicas.get(i);
                    palabrasUnicas.set(i, palabrasUnicas.get(j));
                    palabrasUnicas.set(j, tempPalabra);
                    
                    // Intercambiamos también los conteos
                    int tempConteo = conteo.get(i);
                    conteo.set(i, conteo.get(j));
                    conteo.set(j, tempConteo);
                }
            }
        }

        return palabrasUnicas;
    }
	
    /*public static ArrayList<String> palabrasOrdenadasSinRepeticiones(ArrayList<String> palabras) {
        // Mapa para contar las apariciones de cada palabra
        HashMap<String, Integer> conteoPalabras = new HashMap<>();

        // Contamos las apariciones de cada palabra
        for (String palabra : palabras) {
            conteoPalabras.put(palabra, conteoPalabras.getOrDefault(palabra, 0) + 1);
        }

        // Creamos un ArrayList con las palabras únicas (sin repeticiones)
        ArrayList<String> palabrasUnicas = new ArrayList<>(conteoPalabras.keySet());

        // Ordenamos las palabras según el número de apariciones
        Collections.sort(palabrasUnicas, new Comparator<String>() {
            @Override
            public int compare(String palabra1, String palabra2) {
                // Comparamos las palabras según el número de apariciones (de menor a mayor)
                return conteoPalabras.get(palabra2).compareTo(conteoPalabras.get(palabra1));
            }
        });

        // Devolvemos la lista de palabras ordenadas por el número de apariciones
        return palabrasUnicas;
    }*/
	
	
}
