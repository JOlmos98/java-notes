package Examen2Ev;

import java.util.ArrayList;
import java.util.Objects;

public class Informe {
	
	//Variables:
	
	Empresa empresa;
	ArrayList<Cita> citasproximomes;
	ArrayList<Cita> citasobservaciones3años;
	
	//Constructor:
	
	public Informe() {}
	
	public Informe(Empresa empresa, ArrayList<Cita> citasproximomes, ArrayList<Cita> citasobservaciones3años) {
		this.empresa=empresa;
		this.citasproximomes=citasproximomes;
		this.citasobservaciones3años=citasobservaciones3años;
	}
	
	//Métodos:
	
	
	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public ArrayList<Cita> getCitasproximomes() {
		return citasproximomes;
	}

	public void setCitasproximomes(ArrayList<Cita> citasproximomes) {
		this.citasproximomes = citasproximomes;
	}

	public ArrayList<Cita> getCitasobservaciones3años() {
		return citasobservaciones3años;
	}

	public void setCitasobservaciones3años(ArrayList<Cita> citasobservaciones3años) {
		this.citasobservaciones3años = citasobservaciones3años;
	}
	
}
