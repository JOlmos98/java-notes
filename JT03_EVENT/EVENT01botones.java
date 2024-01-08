package JT03_EVENT;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EVENT01botones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameEvent miventana=new FrameEvent();
		miventana.setVisible(true);
	}
}

//////////////////////////////////////////////////////////////////////////////////

class FrameEvent extends JFrame{
	
	FrameEvent(){
		
		setTitle("Ventana de colores");
		setBounds(500,200,500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//setVisible(true);
		PanelEvent mipanel=new PanelEvent();
		add(mipanel);
	}
}

class PanelEvent extends JPanel implements ActionListener{
	
	JButton bluebutton=new JButton("Azul");
	JButton redbutton=new JButton("Rojo");
	JButton greenbutton=new JButton("Verde");
	
	PanelEvent(){
		
		add(bluebutton);
		bluebutton.addActionListener(this);
		//setSize(80,50); este método no funciona con los botones.
		bluebutton.setPreferredSize(new Dimension(80, 30)); 
		// Establecer un tamaño preferido al botón
		
		add(redbutton);
		redbutton.addActionListener(this);
		redbutton.setPreferredSize(new Dimension(80,30));
		
		add(greenbutton);
		greenbutton.addActionListener(this);
		greenbutton.setPreferredSize(new Dimension(80,30));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		//Object botonpulsador=e.getSource(); también podemos hacer esto y poner la variable en los if.
		if (e.getSource()==bluebutton) setBackground(new Color(50,50,255));
		else if (e.getSource()==redbutton) setBackground(Color.RED);
		else if (e.getSource()==greenbutton) setBackground(Color.GREEN);
	}
}

/*
 * La clase oyente es la que lleva el ActionListener, podemos hacer la
 * clase oyente independiente de la siguiente forma:
 * 
 * Creamos la clase |private class ColorDeFondo implements ActionListener| 
 * evidentemente quitando el implements ActionListener de la clase anterior.
 * 
 * Añadimos el método que implementa ActionListener y escribimos en él 
 * |setBackground(ColorDeFondo);|, para que este método funcione, la clase 
 * creada deberá ser interna de la clase anterior, en este caso, de la clase PanelEvent.
 * 
 * Entonces, en esa clase, declaramos |private Color ColorDeFondo;| que
 * almacenará el color a establecer de fondo. Entonces creamos el constructor.
 * 
 * public ColorDeFondo (Color c){
 * ColorDeFondo=c;
 * }
 * 
 * Entonces, una vez hecho todo lo anterior, cambiamos en el addActionListener el
 * this por blue, red o green y añadimos las instancias mencionadas:
 * ColorDeFondo blue=new ColorDeFondo(Color.BLUE);
 * ColorDeFondo red=new ColorDeFondo(Color.RED);
 * ColorDeFondo green=new ColorDeFondo(Color.GREEN);
 */
