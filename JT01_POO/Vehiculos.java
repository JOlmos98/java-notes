package JT01_POO;

public interface Vehiculos {

	public final static double VELOCIDAD_MAXIMA=120;
	
	public abstract String getPLAZAS();
	
	public abstract void ACELERAR(double aumento);
	public abstract void FRENAR(double disminucion);
	public abstract double getVelocidadActual();
}