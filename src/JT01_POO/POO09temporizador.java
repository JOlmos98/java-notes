package JT01_POO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

import javax.swing.JOptionPane;
import javax.swing.Timer;
/*
 * Creamos objeto de la clase Timer que nos pide introducir como parámetro
 * un argumento de tipo ActionListener, para eso creamos otra clase que herede
 * de la interfaz action listener y creamos un objeto de esa clase que hereda
 * la interfaz (en este caso la clase es Temporizador) y ya podemos introducir 
 * el parámetro. Ponemos el método miTemporizador.start y la aplicación 
 * comienza a funcionar, y para detener el flujo del programa usamos el JOP.
 */
public class POO09temporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Temporizador oyente=new Temporizador();
		Timer miTemporizador=new Timer(5000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println(LocalDateTime.now());
			}
		//Esto es una clase interna y anónima.
			
		});
	
		miTemporizador.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para terminar la ejecución.\nCada 5 segundos se imprimirá por consola el mensaje" );
	}
}


/*class Temporizador implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Aquí pasa algo.");
	}
	
}*/