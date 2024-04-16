package Examen2Ev;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Principal4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Trabajo> trabajosE1=new ArrayList();
		EmpresaTrabajo INDITEX=new EmpresaTrabajo("INDITEX", 0/*, trabajosE1*/);
		
		ArrayList<Trabajo> trabajosvarios=new ArrayList();
		trabajosvarios.add(new Trabajo(INDITEX, LocalDate.of(2023, 4, 24), LocalDate.of(2023, 5, 26), LocalDate.of(2023, 6, 12), 231.45, "Descripción de ejemplo."));
		trabajosvarios.add(new Trabajo(INDITEX, LocalDate.of(2023, 4, 24), LocalDate.of(2023, 5, 26), LocalDate.of(2023, 6, 12), 231.45, "Descripción de ejemplo 1"));
		trabajosvarios.add(new Trabajo(INDITEX, LocalDate.of(2023, 5, 10), LocalDate.of(2023, 6, 15), LocalDate.of(2023, 7, 2), 320.75, "Descripción de ejemplo 2"));
		trabajosvarios.add(new Trabajo(INDITEX, LocalDate.of(2023, 6, 1), LocalDate.of(2023, 9, 5), LocalDate.of(2023, 8, 10), 450.0, "Descripción de ejemplo 3"));
		trabajosvarios.add(new Trabajo(INDITEX, LocalDate.of(2023, 7, 15), LocalDate.of(2023, 8, 20), LocalDate.of(2023, 9, 5), 550.0, "Descripción de ejemplo 4"));
		trabajosvarios.add(new Trabajo(INDITEX, LocalDate.of(2023, 8, 5), LocalDate.of(2023, 9, 10), LocalDate.of(2023, 10, 15), 750.0, "Descripción de ejemplo 5"));
		trabajosvarios.add(new Trabajo(INDITEX, LocalDate.of(2023, 9, 1), LocalDate.of(2023, 10, 5), LocalDate.of(2023, 11, 8), 620.0, "Descripción de ejemplo 6"));
		trabajosvarios.add(new Trabajo(INDITEX, LocalDate.of(2023, 10, 10), LocalDate.of(2023, 11, 15), LocalDate.of(2023, 12, 20), 830.0, "Descripción de ejemplo 7"));
		trabajosvarios.add(new Trabajo(INDITEX, LocalDate.of(2023, 11, 5), LocalDate.of(2023, 1, 10), LocalDate.of(2023, 2, 15), 950.0, "Descripción de ejemplo 8"));
		trabajosvarios.add(new Trabajo(INDITEX, LocalDate.of(2023, 1, 20), LocalDate.of(2023, 2, 25), LocalDate.of(2023, 3, 30), 1020.0, "Descripción de ejemplo 9"));
		trabajosvarios.add(new Trabajo(INDITEX, LocalDate.of(2023, 2, 10), LocalDate.of(2023, 3, 15), LocalDate.of(2023, 4, 20), 880.0, "Descripción de ejemplo 10"));
		
		trabajosvarios.add(new Trabajo(INDITEX, LocalDate.of(2023, 6, 20), LocalDate.of(2023, 7, 15), LocalDate.of(2023, 6, 22), 300.0, "Trabajo entregado a tiempo"));
		trabajosvarios.add(new Trabajo(INDITEX, LocalDate.of(2023, 7, 5), LocalDate.of(2023, 8, 10), LocalDate.of(2023, 7, 25), 420.0, "Trabajo entregado a tiempo"));
		trabajosvarios.add(new Trabajo(INDITEX, LocalDate.of(2023, 8, 15), LocalDate.of(2023, 9, 20), LocalDate.of(2023, 8, 20), 550.0, "Trabajo entregado a tiempo"));
		trabajosvarios.add(new Trabajo(INDITEX, LocalDate.of(2023, 9, 25), LocalDate.of(2023, 10, 30), LocalDate.of(2023, 9, 27), 700.0, "Trabajo entregado a tiempo"));
		trabajosvarios.add(new Trabajo(INDITEX, LocalDate.of(2023, 10, 5), LocalDate.of(2023, 11, 10), LocalDate.of(2023, 11, 5), 850.0, "Trabajo entregado a tiempo"));
		
		//trabajosE1=trabajosvarios;
		INDITEX.setTrabajos(trabajosvarios);
		System.out.println(ChronoUnit.DAYS.between(trabajosvarios.get(0).getFechafinreal(), trabajosvarios.get(0).getFechafinprevista()));
		//Funciona bien porque lo entregan 17 días tarde e imprime -17.
		for (int i=0;i<INDITEX.getTrabajos().size();i++) {
			if (ChronoUnit.DAYS.between(trabajosvarios.get(i).getFechafinreal(), trabajosvarios.get(i).getFechafinprevista())>0) System.out.println(INDITEX.getTrabajos().get(i));
		} //Funciona bien porque imprime el toString de los 5 trabajos que entregan antes de tiempo.
		double contpositivos=0;
		double contnegativos=0;
		INDITEX.calcularTasa();
		DecimalFormat df=new DecimalFormat("#.##");
		String tasacondosdecimales=df.format(INDITEX.getTasacumplimiento());
		//Otra forma de hacerlo sería:
		//String tasaformateada=String.format("&.2f", INDITEX.getTasacumplimiento()); 
		System.out.println(INDITEX.getTasacumplimiento());
		System.out.println(tasacondosdecimales);
		
		/*
		 * Podriamos hacer que el método getTasacumplimiento, dentro de él,
		 * invoque primero al método .calcularTasa() y después formatease como
		 * acabamos de hacer y asi funcionaría a la perfección, pero bueno,
		 * hasta aquí.
		 */
		
		//FUNCIONA TODO PERFECTO.
		//Lo de abajo es básicamente el método .calcularTasa hecho de forma manual.
		
		
		
		/*for (int i=0;i<INDITEX.getTrabajos().size();i++) {
			if ((ChronoUnit.DAYS.between(INDITEX.getTrabajos().get(i).getFechafinreal(), INDITEX.getTrabajos().get(i).getFechafinprevista()))>0) {
				contpositivos=contpositivos+(int)(ChronoUnit.DAYS.between(INDITEX.getTrabajos().get(i).getFechafinreal(), INDITEX.getTrabajos().get(i).getFechafinprevista()));
			} else if ((ChronoUnit.DAYS.between(INDITEX.getTrabajos().get(i).getFechafinreal(), INDITEX.getTrabajos().get(i).getFechafinprevista()))<0) {
				contnegativos=contnegativos+(int)(ChronoUnit.DAYS.between(INDITEX.getTrabajos().get(i).getFechafinreal(), INDITEX.getTrabajos().get(i).getFechafinprevista()));
			}
		}
		System.out.println(INDITEX.getTasacumplimiento());
		System.out.println(contpositivos);
		System.out.println(contnegativos);
		double tasacumplimientomain=(contpositivos)/(contnegativos);
		System.out.println(tasacumplimientomain);*/
		
		///////////////////////////////////////////////////////////////////
		/*
		 * Hacemos un ArrayList de EmpresaTrabajo y le establecemos a todas una
		 * tasa de cumplimiento, la que sea, después ponemos en práctica el 
		 * método del ejercicio que está más abajo.
		 */
		ArrayList<EmpresaTrabajo> ALET=new ArrayList();
		ALET.add(INDITEX);
		ALET.add(new EmpresaTrabajo("IDEALISTA", 123.24));
		ALET.add(new EmpresaTrabajo("FERROVIAL", 189.23));
		ALET.add(new EmpresaTrabajo("ACERINOX", -11.24));
		ALET.add(new EmpresaTrabajo("NATURGY", -89.13));
		ALET.add(new EmpresaTrabajo("CAIXA", 90.0));
		ALET.add(new EmpresaTrabajo("BBVA", 75.5));
		ALET.add(new EmpresaTrabajo("SANTANDER", -62.8));
		ALET.add(new EmpresaTrabajo("IBERDROLA", 85.3));
		ALET.add(new EmpresaTrabajo("TELEFÓNICA", 70.2));
		
		for (int i=0;i<ALET.size();i++) System.out.println(ALET.get(i).getNombre()+" "+ALET.get(i).getTasacumplimiento());
		//Ordenamos por tasa de cumplimiento con el método .ordenarPorCumplimiento.
		System.err.println("\n LISTA ORDENADA:");
		Principal4.ordenarPorCumplimiento(ALET);
		for (int i=0;i<ALET.size();i++) System.out.println(ALET.get(i).getNombre()+" "+ALET.get(i).getTasacumplimiento());
		
	}
	//Funciona todo perfecto.
	private static void ordenarPorCumplimiento(ArrayList<EmpresaTrabajo> empresas) {
		for (int i=0;i<empresas.size();i++) {
			for (int a=0;a<empresas.size();a++) {
				if (empresas.get(a).compareTo(empresas.get(i))<0) {
					EmpresaTrabajo aux=empresas.get(i);
					empresas.set(i, empresas.get(a));
					empresas.set(a,  aux);
				}
			}
		}
	}
}
