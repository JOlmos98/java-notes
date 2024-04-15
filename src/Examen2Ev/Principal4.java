package Examen2Ev;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Principal4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Trabajo> trabajosE1=new ArrayList();
		EmpresaTrabajo INDITEX=new EmpresaTrabajo("INDITEX", 0, trabajosE1);
		
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
		
		trabajosE1=trabajosvarios;
		System.out.println(ChronoUnit.DAYS.between(trabajosvarios.get(0).getFechafinreal(), trabajosvarios.get(0).getFechafinprevista()));
		int contpositivos=0;
		int contnegativos=0;
		//INDITEX.calcularTasa();
		for (int i=0;i<INDITEX.getTrabajos().size();i++) {
			if ((ChronoUnit.DAYS.between(INDITEX.getTrabajos().get(i).getFechafinreal(), INDITEX.getTrabajos().get(i).getFechafinprevista()))>0) {
				contpositivos=contpositivos+(int)(ChronoUnit.DAYS.between(INDITEX.getTrabajos().get(i).getFechafinreal(), INDITEX.getTrabajos().get(i).getFechafinprevista()));
			} else if ((ChronoUnit.DAYS.between(INDITEX.getTrabajos().get(i).getFechafinreal(), INDITEX.getTrabajos().get(i).getFechafinprevista()))<0) {
				contnegativos=contnegativos+(int)(ChronoUnit.DAYS.between(INDITEX.getTrabajos().get(i).getFechafinreal(), INDITEX.getTrabajos().get(i).getFechafinprevista()));
			}
		//System.out.println(INDITEX.getTasacumplimiento());

		}
		System.out.println(contpositivos);
		System.out.println(contnegativos);
	}
}
