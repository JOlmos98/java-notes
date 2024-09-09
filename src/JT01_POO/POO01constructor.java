package JT01_POO;

public class POO01constructor { 

	public POO01constructor (int ruedas, double ancho, double largo,int cv) { //Constructor
		
		this.ruedas=ruedas;
		this.ancho=ancho;
		this.largo=largo;
		this.cv=cv;
		color="Blanco";
		peso=150+(ancho*100+largo*100+cv/3);
		climatizador=false;
		gps=false;
		tapcuero=false;
		
	}
	
	//Métodos getter:
	public double getpeso() {
		return peso;
	}
	public String getcolor() {
		return color;
	}
	public int getcv() {
		return cv;
	}
	public String getdatosgenerales() {
		return "Datos generales del vehículo:\nPeso: "+peso+"\nColor: "+color+"\nCaballos a vapor: "+cv;
	}
	public String getextra() {
		if (climatizador&&gps==false&&tapcuero==false) return "El vehículo tiene el pack 1 de extras.";
		else if (climatizador&&gps&&tapcuero) return "El vehículo tiene el pack 2 de extras";
		else return "EL vehículo no tiene extras o tiene un pack incompatible.";
	}
	
	//Métodos setter:
	public void setcolor(String nuevocolor) {
		color=nuevocolor;
	}
	public void setrepro(int cvaum) {
		cv+=cvaum;
	}
	public void setextras(boolean clim) {
		climatizador=clim;
	} 
	// Esto es la sobrecarga de métodos, dos métodos que se llaman igual pero funcionan diferente.
	// La diferencia entre los dos métodos es que reciben diferentes argumentos.
	// Con los constructores pasa exáctamente igual, dos constructores con el mismo nombre pero reciben diferentes argumentos.
	public void setextras(boolean climatizador, boolean gps, boolean tapcuero) {
		this.climatizador=climatizador;
		this.gps=gps;
		this.tapcuero=tapcuero;
	}
	
	private int ruedas;
	private double peso;
	private double ancho;
	private double largo;
	private String color;
	private int cv;
	private boolean climatizador;
	private boolean gps;
	private boolean tapcuero;
	
}