package JT01_POO;
//Interfaz para la clase Trabajadores.
public interface ParaTrabajadores {

	double setBonus(double gratificacion);
	//En las interfaces está implicito el "public abstract" antes del double.
	
	double bonus=200;
	//Y en este caso está implícito el "public final static".
	
}
