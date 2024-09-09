package Pg2ev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Empresa> ALe=new ArrayList();
		
		ALe.add(new Empresa(1234, "Hermanos Sanz SL", "973849845", "Madrid"));
		ALe.add(new Empresa(5678, "García e Hijos S.A.", "915678923", "Barcelona"));
		ALe.add(new Empresa(9876, "Martínez & Asociados", "922345678", "Sevilla"));
		ALe.add(new Empresa(3456, "Gómez y Cía.", "971234567", "Murcia"));
		ALe.add(new Empresa(7890, "López y Compañía", "936789012", "Málaga"));
		ALe.add(new Empresa(2345, "Pérez e Hijos S.L.", "954321098", "Murcia"));
		ALe.add(new Empresa(6789, "Rodríguez Hermanos", "958765432", "Murcia"));
		ALe.add(new Empresa(5432, "Fernández y Cía.", "981234567", "Bilbao"));
		ALe.add(new Empresa(8901, "Sánchez e Hijos S.A.", "911234567", "Murcia"));
		
		for (int i=0;i<ALe.size();i++) {
			System.out.println(ALe.get(i));
		}
		Principal2.ordenaProvinciaNombre(ALe);
		System.out.println();
		for (int i=0;i<ALe.size();i++) {
			System.out.println(ALe.get(i).getProvincia()+" "+ALe.get(i).getNombre());
		}
		/*
		 * Funciona perfectamente, pero si la provincia es
		 * null, que puede serlo, da error. Supongo que habría 
		 * que añadir el tema de nullsLast y tal (cosa que ya 
		 * hice en uno de los ejercicios del COMPARTIDO). Pero 
		 * el ejercicio no dice nada al respecto y no 
		 * quiero perder tiempo. 
		 */
	}
	
///////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////

	private static void ordenaProvinciaNombre(ArrayList<Empresa> empresas) {
		//Ordena las empresas por nombre de provincia;
        Collections.sort(empresas, new ComparadorProvinciaNombre());   
	}
	
    private static class ComparadorProvinciaNombre implements Comparator<Empresa> {

        public int compare(Empresa e1, Empresa e2) {
            int resultado=e1.compareToProvincia(e2);
            if (resultado==0) {
                // Si las provincias son iguales, compara por nombre de empresa.
                resultado=e1.compareToNombre(e2);
            }
            return resultado;
        }
    }

	
}
