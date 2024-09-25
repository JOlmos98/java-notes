package DAM2;

import java.util.ArrayList;
import java.util.Objects;

public class AAD_1Ev_Ej02Empleado {
	
	//Variables:
	
	private String nombreCompleto;
	private int dni; //8 números.
	private int categoria;
	private ArrayList<AAD_1Ev_Ej02Periodo> periodos;
	
	//Constructores:
	
	AAD_1Ev_Ej02Empleado(){
		//Constructor por defecto.
	}
	
	AAD_1Ev_Ej02Empleado(String nombreCompleto, int dni, int categoria, ArrayList<AAD_1Ev_Ej02Periodo> periodos){
		this.nombreCompleto=nombreCompleto;
		this.dni=dni;
		this.categoria=categoria;
		this.periodos=periodos;
	}
	
	public int getSumaDiasDisfrutados() {
		int diasDisf=0;
		for (int i=0;i<periodos.size();i++) {
			diasDisf+=periodos.get(i).getDiasDePeriodo();
		}
		return diasDisf;
	}
	
	public int compareTo(AAD_1Ev_Ej02Empleado e) {
		if (this.getSumaDiasDisfrutados()<e.getSumaDiasDisfrutados()) return -1;
		else if (this.getSumaDiasDisfrutados()>e.getSumaDiasDisfrutados()) return 1;
		else return 0;
	}
	
	public ArrayList<AAD_1Ev_Ej02Periodo> getPeriodos() {
		return periodos;
	}

	
	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public void setPeriodos(ArrayList<AAD_1Ev_Ej02Periodo> periodos) {
		this.periodos = periodos;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni, nombreCompleto, periodos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AAD_1Ev_Ej02Empleado other = (AAD_1Ev_Ej02Empleado) obj;
		return dni == other.dni && Objects.equals(nombreCompleto, other.nombreCompleto)
				&& Objects.equals(periodos, other.periodos);
	}
	
	
	
	
	
	
}
