package DAM2;

import java.util.ArrayList;

public class AAD_1Ev_Ej01 {

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
		
		System.out.println(AAD_1Ev_Ej01.palabrasOrdenadasSinRepeticiones(pal));
	}
	
	public static ArrayList<String> palabrasOrdenadasSinRepeticiones(ArrayList<String> palabras){
		ArrayList<String> arOrdenadas=new ArrayList();
		ArrayList<Integer> contador=new ArrayList();
		
		for (int i=0;i<palabras.size();i++) {
			if (!arOrdenadas.contains(palabras.get(i))) {
				arOrdenadas.add(palabras.get(i));
				contador.add(1); //Añade un elemento nuevo establecido en 1.
			} else {
				int index=arOrdenadas.indexOf(palabras.get(i));
				contador.set(index, contador.get(index)+1);
				//Al encontrar una palabra repetida, va a su contador localizándolo con 
				//arOrdenadas.indexOf(i) y le suma uno con contador.set(index, contador.get(index)+1.
			}
		}
		
		for (int i=0;i<arOrdenadas.size();i++) {
			for (int a=0;a<arOrdenadas.size();a++) {
				if (contador.get(a)<contador.get(i)) {
					int tempI=contador.get(i);
					contador.set(i, contador.get(a));
					contador.set(a, tempI);
					
					String tempS=arOrdenadas.get(i);
					arOrdenadas.set(i, arOrdenadas.get(a));
					arOrdenadas.set(a, tempS);
				}
			}
		}
		return arOrdenadas;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////	
	
	//Ejercicio entregado a medio hacer a chatGPT y terminado por él:
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
	

	
	
}
