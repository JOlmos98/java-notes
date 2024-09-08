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
		LaminaMarcoJFrame miventana=new LaminaMarcoJFrame();
		miventana.setVisible(true);
	}
}

//////////////////////////////////////////////////////////////////////////////////

class LaminaMarcoJFrame extends JFrame{
	
	/*
	 * Creamos la clase para el marco, la clase hereda de JFrame
	 * que es la interfaz que nos permite crear el marco, la ventana.
	 */
	LaminaMarcoJFrame(){ //Con este constructor creamos la ventana, el marco.
		
		setTitle("Ventana de colores");
		setBounds(500,200,500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		/*
		 * Métodos que establecen el título, las dimensiones y que el 
		 * el programa se cierre al cerrar la ventana.
		 */
		
		//setVisible(true);
		PanelEvent mipanel=new PanelEvent();
		//Creamos un objeto de tipo PanelEvent, clase que ya hemos definido abajo.
		//Con esa clase creamos los botones y le damos el significado.
		add(mipanel);
		//Con esta última línea sencillamente añadimos el panel en sí con eventos al marco creado anteriormente
	}
}

class PanelEvent extends JPanel implements ActionListener{
	
	/*
	 * Esta clase PanelEvent hereda de la clase abstracta JPanel e implementa la interfaz ActionListener.
	 * Habiendo heredado de JPanel usamos JButton para crear los botones en las tres líneas de abajo, dándole
	 * un nombre en el String como parámetro al crear el objeto JButton.
	 */
	JButton bluebutton=new JButton("Azul");
	JButton redbutton=new JButton("Rojo");
	JButton greenbutton=new JButton("Verde");
	
	PanelEvent(){//Con este método creamos el panel donde se ejecutan los eventos.
		
		add(bluebutton);
		bluebutton.addActionListener(this); //El this hace referencia al JButton bluebutton.
		//setSize(80,50); este método no funciona con los botones. Se usa el de abajo.
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
