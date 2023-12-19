package JT01_POO;

public interface Vehiculos {

	public final static double VELOCIDAD_MAXIMA=120;
	
	public abstract String getPLAZAS();
	
	public abstract void ACELERAR(double aceleramiento);
	public abstract void FRENAR(double frenado);
	public abstract double getVelocidadActual();
}