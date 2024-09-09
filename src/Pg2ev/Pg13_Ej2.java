package Pg2ev;

import java.time.LocalDate;
import java.util.ArrayList;

/*
 * Considere el siguiente modelo Entidad Relación: Empleado 1:N Periodo. 
 * Un período especifica dos fechas, fecha de Inicio y fecha de fin. 
 * Se registra los períodos de vacaciones disfrutados por los empleados.
 * Desarrolle las clases Empleado y Periodo con orientación a objetos. 
 * Desarrolle en un archivo Principal.java el método ArrayList<Empleado> seleccion
 * (ArrayList<Empleado> empleados); que a partir de una colección de empleados devuelve 
 * aquellos de categoría 2 ordenados de mayor a menor número de días de vacaciones 
 * disfrutadas. 
 * ArrayList<Empleado> seleccion (ArrayList<Empleado> empleados);
 */
public class Pg13_Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Vamos a usar esta clase Pg13_Ej2 como el main y a parte vamos a crear
		 * las otras clases PEmpleado y PPeriodo.
		 */
		
		//Creamos algunos empleados:
		PEmpleado jose=new PEmpleado("José", "Calle Los Apóstoles", 1);
		PEmpleado alberto=new PEmpleado("Alberto", "Calle Carnaval", 1);
		PEmpleado juan=new PEmpleado("Juan", "Avenida de Jesucristo", 1);
		
		PEmpleado pedro=new PEmpleado("Pedro", "Calle del Sol", 2);
		PEmpleado maria=new PEmpleado("Maria", "Avenida de la Luna", 2);
		PEmpleado ana=new PEmpleado("Ana", "Plaza de la Paz", 2);
		
		//Creamos el ArrayList y metemos a los empleados.
		ArrayList<PEmpleado> ALempleados=new ArrayList();
		ALempleados.add(jose);
		ALempleados.add(alberto);
		ALempleados.add(juan);
		ALempleados.add(pedro);
		ALempleados.add(maria);
		ALempleados.add(ana);
		
		//Creamos varios periodos de vacaciones:
		PPeriodo p1=new PPeriodo(LocalDate.of(2022, 12, 1), LocalDate.of(2022, 12, 30));
		PPeriodo p2=new PPeriodo(LocalDate.of(2021, 6, 14), LocalDate.of(2022, 9, 28));
		PPeriodo p3=new PPeriodo(LocalDate.of(2023, 5, 1), LocalDate.of(2022, 7, 13));
		PPeriodo p4 = new PPeriodo(LocalDate.of(2023, 3, 10), LocalDate.of(2023, 4, 20));
		PPeriodo p5 = new PPeriodo(LocalDate.of(2022, 8, 15), LocalDate.of(2022, 10, 25));
		PPeriodo p6 = new PPeriodo(LocalDate.of(2023, 1, 5), LocalDate.of(2023, 2, 15));
		PPeriodo p7 = new PPeriodo(LocalDate.of(2022, 5, 20), LocalDate.of(2022, 7, 1));
		PPeriodo p8 = new PPeriodo(LocalDate.of(2022, 11, 8), LocalDate.of(2023, 1, 18));
		PPeriodo p9 = new PPeriodo(LocalDate.of(2023, 6, 25), LocalDate.of(2023, 8, 5));
		PPeriodo p10 = new PPeriodo(LocalDate.of(2022, 3, 1), LocalDate.of(2022, 4, 10));
		PPeriodo p11 = new PPeriodo(LocalDate.of(2023, 9, 12), LocalDate.of(2023, 10, 22));
		PPeriodo p12 = new PPeriodo(LocalDate.of(2022, 12, 5), LocalDate.of(2023, 1, 15));
		PPeriodo p13 = new PPeriodo(LocalDate.of(2023, 4, 18), LocalDate.of(2023, 5, 28));
		PPeriodo p14 = new PPeriodo(LocalDate.of(2022, 6, 8), LocalDate.of(2022, 7, 18));
		PPeriodo p15 = new PPeriodo(LocalDate.of(2023, 2, 28), LocalDate.of(2023, 4, 9));
		
		//Vamos a asignar los 5 primeros a Pedro, los 5 intermedios a Maria y los últimos a Ana.
		pedro.getPeriodos().add(p1); maria.getPeriodos().add(p6); ana.getPeriodos().add(p11);
		pedro.getPeriodos().add(p2); maria.getPeriodos().add(p7); ana.getPeriodos().add(p12);
		pedro.getPeriodos().add(p3); maria.getPeriodos().add(p8); ana.getPeriodos().add(p13);
		pedro.getPeriodos().add(p4); maria.getPeriodos().add(p9); ana.getPeriodos().add(p14);
		pedro.getPeriodos().add(p5); maria.getPeriodos().add(p10); ana.getPeriodos().add(p15);
		
		/*
		 * Ahora creamos el método y vemos quién ha 
		 * disfrutado más días de vacaciones.
		 * El método lo desarrollamos en la clase PEmpleado.
		 */
		
		ArrayList<PEmpleado> arrayejercicio=PEmpleado.seleccion(ALempleados);
		//Esto crea el array con los empleados ordenados y tal, lo imprimimos.
		for (PEmpleado e:arrayejercicio) {
			System.out.println(e.toString()+"\n");
		}
		System.out.println(ana.calcularDiasdevacaciones());
		System.out.println(maria.calcularDiasdevacaciones());
		System.out.println(pedro.calcularDiasdevacaciones());
		//Estas últimas sentencias nos han impreso de menor a mayor.
	}

}

