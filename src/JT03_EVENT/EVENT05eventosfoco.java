package JT03_EVENT;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EVENT05eventosfoco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoFoco marco1=new MarcoFoco();
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco1.setVisible(true);
		marco1.addWindowFocusListener(new EventosFocoVentana());
	}

}

class MarcoFoco extends JFrame{
	
	public MarcoFoco() {
		setBounds(500,300,400,250);
		add(new LaminaMarcoFoco());
	}
}

class LaminaMarcoFoco extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		campoTexto1=new JTextField();
		campoTexto2=new JTextField();
		
		campoTexto1.setBounds(100, 75, 100, 20);
		campoTexto2.setBounds(100, 100, 100, 20);
		
		add(campoTexto1);
		add(campoTexto2);
		
		campoTexto1.addFocusListener(new EventosFocoComponente1());
	}
	
	private JTextField campoTexto1, campoTexto2;
}

class EventosFocoComponente1 implements FocusListener{

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		System.out.println("El campo 1 ha GANADO el foco.");
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		System.out.println("El campo 1 ha PERDIDO el foco.");
	}
	
}

class EventosFocoVentana implements WindowFocusListener{

	@Override
	public void windowGainedFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("La ventana de la app ha GANADO el foco.");
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("La ventana de la app ha PERDIDO el foco.");
	}
	
}