package DAM2;

import java.time.LocalDate;
import java.util.ArrayList;

public class AAD_1Ev_Ej02Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Realmente no hace falta poner el DNI del empleado como parámetro al crear
		 * los ArrayList de Periodo, con poner el propio ArrayList como parámetro del
		 * Empleado ya vale, así el método compareTo, getSumaDiasDisfrutados, y diasDisf
		 * pueden trabajar.
		 */
		ArrayList<AAD_1Ev_Ej02Empleado> emp=new ArrayList();
		
		//1
		ArrayList<AAD_1Ev_Ej02Periodo> ALJOS=new ArrayList();
		emp.add(new AAD_1Ev_Ej02Empleado("Jesús Olmos Soler", 49338225, 2, ALJOS));
		ALJOS.add(new AAD_1Ev_Ej02Periodo(49338225,LocalDate.of(2024,8,20), LocalDate.of(2024, 9, 18)));
		ALJOS.add(new AAD_1Ev_Ej02Periodo(49338225,LocalDate.of(2024,10,1), LocalDate.of(2024, 10, 15)));
		//La suma de días disfrutados de Jesús es 
		
		System.out.println(ALJOS.get(0).getDiasDePeriodo()+"+"+ALJOS.get(1).getDiasDePeriodo()+"="+(ALJOS.get(0).getDiasDePeriodo()+ALJOS.get(1).getDiasDePeriodo()));
		
		//2
		ArrayList<AAD_1Ev_Ej02Periodo> ALARG=new ArrayList();
		emp.add(new AAD_1Ev_Ej02Empleado("Alberto Rodriguez González", 87654321, 2, ALARG));
		ALARG.add(new AAD_1Ev_Ej02Periodo(49338225,LocalDate.of(2024,8,5), LocalDate.of(2024, 8, 20)));
		ALARG.add(new AAD_1Ev_Ej02Periodo(49338225,LocalDate.of(2024,10,1), LocalDate.of(2024, 10, 28)));
		
		System.out.println(ALARG.get(0).getDiasDePeriodo()+"+"+ALARG.get(1).getDiasDePeriodo()+"="+(ALARG.get(0).getDiasDePeriodo()+ALARG.get(1).getDiasDePeriodo()));

		//3
		ArrayList<AAD_1Ev_Ej02Periodo> ALRNR=new ArrayList();
		emp.add(new AAD_1Ev_Ej02Empleado("Ramón Norgueras Recuenco", 12345678, 2, ALRNR));
		ALRNR.add(new AAD_1Ev_Ej02Periodo(49338225,LocalDate.of(2024,1,1), LocalDate.of(2024, 1, 28)));
		ALRNR.add(new AAD_1Ev_Ej02Periodo(49338225,LocalDate.of(2024,2,1), LocalDate.of(2024, 10, 28)));
		
		System.out.println(ALRNR.get(0).getDiasDePeriodo()+"+"+ALRNR.get(1).getDiasDePeriodo()+"="+(ALRNR.get(0).getDiasDePeriodo()+ALRNR.get(1).getDiasDePeriodo()));
		
		//4
		ArrayList<AAD_1Ev_Ej02Periodo> ALART=new ArrayList();
		emp.add(new AAD_1Ev_Ej02Empleado("Ana Ruiz Torralba", 12345678, 1, ALART));
		ALART.add(new AAD_1Ev_Ej02Periodo(49338225,LocalDate.of(2024,1,1), LocalDate.of(2024, 1, 5)));
		ALART.add(new AAD_1Ev_Ej02Periodo(49338225,LocalDate.of(2024,2,1), LocalDate.of(2024, 2, 15)));
		
		System.out.println(ALART.get(0).getDiasDePeriodo()+"+"+ALART.get(1).getDiasDePeriodo()+"="+(ALART.get(0).getDiasDePeriodo()+ALART.get(1).getDiasDePeriodo()));
		for (int i=0;i<emp.size();i++) {
			System.err.println((i+1)+". "+emp.get(i).getNombreCompleto()+", "+emp.get(i).getSumaDiasDisfrutados()+".");
		}
		
		ArrayList<AAD_1Ev_Ej02Empleado> empOrdenados=AAD_1Ev_Ej02Main.seleccion(emp);
		for (int i=0;i<empOrdenados.size();i++) {
			System.out.println((i+1)+". "+empOrdenados.get(i).getNombreCompleto()+", "+empOrdenados.get(i).getSumaDiasDisfrutados()+".");

		}
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static ArrayList<AAD_1Ev_Ej02Empleado> seleccion(ArrayList<AAD_1Ev_Ej02Empleado> empleados){
		ArrayList<AAD_1Ev_Ej02Empleado> empOrdenados=new ArrayList();
		for (int i=0;i<empleados.size();i++) {
			if (empleados.get(i).getCategoria()==2) empOrdenados.add(empleados.get(i));
		}
		
		for (int i=0;i<empOrdenados.size();i++) {
			for (int a=0;a<empOrdenados.size();a++) {
				if (empOrdenados.get(a).compareTo(empOrdenados.get(i))<0) {
					AAD_1Ev_Ej02Empleado aux=empOrdenados.get(a);
					empOrdenados.set(a, empOrdenados.get(i));
					empOrdenados.set(i, aux);
				}
			}
		}
		return empOrdenados;
	}
}
