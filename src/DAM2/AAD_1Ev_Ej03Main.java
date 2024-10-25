package DAM2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;

public class AAD_1Ev_Ej03Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<AAD_1Ev_Ej03Cliente> ALClientes=new ArrayList();
		
		ALClientes.add(new AAD_1Ev_Ej03Cliente("Jesús Olmos Soler", LocalDate.of(1998, 9, 18)));
		ALClientes.add(new AAD_1Ev_Ej03Cliente("Raúl González Blanco", LocalDate.of(1998, 10, 15)));
		ALClientes.add(new AAD_1Ev_Ej03Cliente("José Martínez Soler", LocalDate.of(1978, 9, 18)));
		ALClientes.add(new AAD_1Ev_Ej03Cliente("Luís Martínez Almeida", LocalDate.of(1987, 5, 3)));
		
		//System.out.println(ALClientes.get(3).getId());
		//System.out.println(ALClientes.get(0).getId());
		//Va perfecto el tema del Id, se va sumando sólo.
		
		ALClientes.get(0).getMembresias().add(new AAD_1Ev_Ej03Membresía(LocalDate.of(2022, 5, 23), LocalDate.of(2024, 2, 3)));
		ALClientes.get(1).getMembresias().add(new AAD_1Ev_Ej03Membresía(LocalDate.of(2015, 2, 12), LocalDate.now()));
		ALClientes.get(2).getMembresias().add(new AAD_1Ev_Ej03Membresía(LocalDate.of(2024, 5, 23), LocalDate.now()));
		ALClientes.get(3).getMembresias().add(new AAD_1Ev_Ej03Membresía(LocalDate.of(2021, 1, 2), LocalDate.of(2023, 1, 3)));

		System.out.println(ALClientes.get(0).getDiasDeFidelidad());
		System.out.println(ALClientes.get(1).getDiasDeFidelidad());
		System.out.println(ALClientes.get(2).getDiasDeFidelidad());
		System.out.println(ALClientes.get(3).getDiasDeFidelidad());
		//Va perfecto, calcula los días al dedillo.
		
		//Deberían ir Raúl 1, Luís 2, Jesús 3 y José no sale por no tener un año de membresía.
		for (int i=0;i<ALClientes.size();i++) {
			System.err.println((i+1)+". "+ALClientes.get(i).getNombre()+", "+ALClientes.get(i).getDiasDeFidelidad());
		}
		
		ArrayList<AAD_1Ev_Ej03Cliente> ALOrdenado=AAD_1Ev_Ej03Main.clientesTop(ALClientes);
		for (int i=0;i<ALOrdenado.size();i++) {
			System.out.println((i+1)+". "+ALOrdenado.get(i).getNombre()+", "+ALOrdenado.get(i).getDiasDeFidelidad());
		}
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////////	
/////////////////////////////////////////////////////////////////////////////////////////////////	
	
	private static ArrayList<AAD_1Ev_Ej03Cliente> clientesTop(ArrayList<AAD_1Ev_Ej03Cliente> clientes){
		ArrayList<AAD_1Ev_Ej03Cliente> losClientes=new ArrayList();
		
		for (int i=0;i<clientes.size();i++) {
			if (clientes.get(i).getDiasDeFidelidad()>=365) losClientes.add(clientes.get(i));
		}
		
		for (int i=0;i<losClientes.size();i++) {
			for (int a=0;a<losClientes.size();a++) {
				if (losClientes.get(a).compareTo(losClientes.get(i))<0) {
					AAD_1Ev_Ej03Cliente aux=losClientes.get(a);
					losClientes.set(a, losClientes.get(i));
					losClientes.set(i, aux);
				}
			}
		}
		
		return losClientes;
	}
}
