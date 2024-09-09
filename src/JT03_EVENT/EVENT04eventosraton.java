package JT03_EVENT;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class EVENT04eventosraton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoVentana marco1=new MarcoVentana();
		
		marco1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		marco1.addWindowStateListener(new EventosVentana());
		marco1.addMouseListener(new EventosRaton());
		marco1.addMouseMotionListener(new EventosRaton());
	}

}

class EventosRaton implements MouseListener, MouseMotionListener{

	/*
	 * Podemos usar "extends MouseAdapter" para sobreescribir sólo
	 * uno de estos métodos y no tener que implementarlos todos.
	 */
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("3. Has CLICKADO (recorrido completo) en las coordenadas X: "+e.getX()+" Y: "+e.getY()+".");

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("1. Has PRESIONADO  el botón izquierdo o derecho del ratón.");
		System.out.println("La constante es del botón clickado es: "+e.getModifiersEx());
		//El método getModifiersEx no funciona con Clicked y Released.
		//Podríamos hacer un if(e.getModifiersEx()==1024) y así comprobar si se ha pulsado ese botón, pero es mejor así:
		if (e.getModifiersEx()==e.BUTTON1_DOWN_MASK) System.out.println("Has pulsado el botón 1 (izquierdo).");
		else if (e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK) System.out.println("Has pulsado el botón 2 (rueda).");
		else System.out.println("Has pulsado el botón 3 (derecho).");
		//Podemos usar para representar las constantes e., MouseEvent. o InputEvent.BUTTON1_DOWN_MASK
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("2. Has SOLTADO el botón izquierdo o derecho del ratón.");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("El ratón ha ENTRADO en el área.");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("El ratón ha SALIDO del área.");
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Estás arrastrando el ratón pulsado.");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Estás moviendo el ratón.");
	}
}