package JT03_EVENT;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EVENT02eventoventana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoVentana marco1=new MarcoVentana();
		//Creamos el marco o lámina de la aplicación.
		
		marco1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//Establecemos la forma de cerrarse del programa.
		
		marco1.addWindowListener(new EventoVentana());
		/*
		 * Añadimos la clase como interna y anónima EventoVentana que
		 * hereda de la interfaz WindowListener y hace todo lo especificado
		 * en la reescritura de los métodos heredados.
		 */
	}
}

//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////

class MarcoVentana extends JFrame{
	
	public MarcoVentana() {
		setBounds(750,300,300,300);
		//Eje X, Eje Y, Ancho, Alto
		
		setVisible(true);
	}
}

class EventoVentana implements WindowListener{

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		//Al abrir la ventana.
		System.out.println("Has abierto la ventana.");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		//Cerrando ventana.
		JOptionPane.showMessageDialog(null, "La ventana se está cerrando.");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		//Ventana cerrada.
		JOptionPane.showMessageDialog(null, "La ventana SE HA CERRADO.");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		//Evento al minimizar la ventana.
		System.out.println("Has minimizado la ventana.");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		//Evento al abrir la ventana estando minimizada.
		System.out.println("Has vuelto a abrir la ventana una vez minimizada.");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		//Evento al poner la ventana en primer plano.
		System.out.println("Has puesto la ventana en primer plano.");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		//Evento al dejar la ventana en segundo plano, ya sea mnimizandola, cerrandola o dando click en otra ventana.
		System.out.println("Has dejado la ventana en segundo plano o la has minimizado o cerrado.");
	}
	
}