package JT03_EVENT;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EVENT03estadoYteclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoVentana marco1=new MarcoVentana();
		
		marco1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		marco1.addWindowStateListener(new EventosVentana());
		marco1.addKeyListener(new EventosTeclado());
	}

}
 
/*class MarcoVentana extends JFrame{
	
	public MarcoVentana() {
		setBounds(300,300,300,300);
		setVisible(true);
	}

}*/

class EventosVentana implements WindowStateListener{

	@Override
	public void windowStateChanged(WindowEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "La ventana ha cambiado de estado.");
		
		System.out.println(e.getNewState());
		if(e.getNewState()==Frame.MAXIMIZED_BOTH) System.out.println("La ventana está maximizada.");
	} 
	
}

class EventosTeclado implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("3. Has pulsado y soltado, es decir, usado la tecla "+e.getKeyChar());
	} //Por algún motivo los eventos getKeyText y algunos más no funcionan con este método pero getKeyChar funciona perfecto y viceversa.

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("1. Has pulsado la tecla "+e.getKeyText(e.getKeyCode()));
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("2. Has soltado la tecla "+e.getKeyText(e.getKeyCode()));
	}
	
}