package JT01_POO;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class POO11internasyanonimas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reloj tal=new Reloj(); 
		//Cambiamos las variables del constructor al método.
		tal.ejecutarTemporizador(3000, true);
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar par terminar el programa.");
	
	}
}

//////////////////////////////////////////////////////////////////////////////////

class Reloj{
	//Clase interna: Hemos llevado la clase interna al método ejecutarTemporizador.
	
	
	//Constructor: No hace falta constructor con los cambios que hemos hecho
	//con la clase interna y con las variables.
		/*public Reloj(int intervalo, boolean sonido) {
			this.intervalo=intervalo;
			this.sonido=sonido;
		}*/
		
	//Variables: Hemos llevado las variables al método ejecutarTemporizador, como parámetros.
	
	//Métodos:
	
	public void ejecutarTemporizador(int intervalo, boolean sonido) {
		//Metemos la clase quee staba fuera, dentro del método.
		/*class DameLaHora implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				LocalDateTime Ahora=LocalDateTime.now();
				System.out.println("La fecha y hora actual es: "+Ahora);
				if (sonido) Toolkit.getDefaultToolkit().beep();
			}
			
		}
		
		ActionListener oyente=new DameLaHora();*/
		
		/*
		 * Ahora inhabilitamos el método y hacemos que oyente 
		 * se convierta en una clase interna anónima.
		 */
		Timer miTemporizador=new Timer(intervalo, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				LocalDateTime Ahora=LocalDateTime.now();
				System.out.println("La fecha y hora actual es: "+Ahora);
				if (sonido) Toolkit.getDefaultToolkit().beep();
			}
			
		});
		miTemporizador.start();
	}
	
}