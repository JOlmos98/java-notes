package Examen2Ev;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class EmpresaTrabajo {

	//Variables:
	
	String nombre;
	double trabajoshechos;
	double tasacumulada;
	double tasacumplimiento;
	ArrayList<Trabajo> trabajos=new ArrayList();
	
	/*
	 * El cumplimiento debe ser un porcentaje que mida el cumplimiento 
	 * medido en tiempo total empleado en los trabajos sobre tiempo 
	 * total estimado.
	 */
	
	//Constructores:
	
	public EmpresaTrabajo() {}
	
	public EmpresaTrabajo(String nombre, double tasacumplimiento, ArrayList<Trabajo> trabajos) {
		this.nombre=nombre;
		this.tasacumplimiento=tasacumplimiento;
		this.trabajos=trabajos;
	}
	
	//Métodos:
	
	public void calcularTasa() {
		/*
		 * Hacer que coja los dias de la fecha prevista hasta la fecha real
		 * y que los sume (dias entregado antes de tiempo) o reste 
		 * (dias entregado tarde).
		 */
		int contpositivos=0;
		int contnegativos=0;
		for (int i=0;i<this.getTrabajos().size();i++) {
			if ((ChronoUnit.DAYS.between(this.getTrabajos().get(i).getFechafinreal(), this.getTrabajos().get(i).getFechafinprevista()))>0) {
				contpositivos=contpositivos+(int)(ChronoUnit.DAYS.between(this.getTrabajos().get(i).getFechafinreal(), this.getTrabajos().get(i).getFechafinprevista()));
			} else if ((ChronoUnit.DAYS.between(this.getTrabajos().get(i).getFechafinreal(), this.getTrabajos().get(i).getFechafinprevista()))<0) {
				contnegativos=contnegativos+(int)(ChronoUnit.DAYS.between(this.getTrabajos().get(i).getFechafinreal(), this.getTrabajos().get(i).getFechafinprevista()));
			}
		}
		tasacumplimiento=0;
		tasacumplimiento=(contpositivos/contnegativos)*100;
	}
	
	public double compareTo(EmpresaTrabajo e) {
		if (this.getTasacumplimiento()<e.getTasacumplimiento()) return -1;
		else if (this.getTasacumplimiento()>e.getTasacumplimiento()) return 1;
		else return 0;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getTasacumplimiento() {
		return tasacumplimiento;
	}

	public void setTasacumplimiento(double tasacumplimiento) {
		this.tasacumplimiento = tasacumplimiento;
	}

	public double getTrabajoshechos() {
		return trabajoshechos;
	}

	public void setTrabajoshechos(double trabajoshechos) {
		this.trabajoshechos = trabajoshechos;
	}

	public double getTasacumulada() {
		return tasacumulada;
	}

	public void setTasacumulada(double tasacumulada) {
		this.tasacumulada = tasacumulada;
	}

	public ArrayList<Trabajo> getTrabajos() {
		return trabajos;
	}

	public void setTrabajos(ArrayList<Trabajo> trabajos) {
		this.trabajos = trabajos;
	}
	
	
	
}
