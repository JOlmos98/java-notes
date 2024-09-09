package JT02_GRAF;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GRAF05escribir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco ventana1=new Marco();
		
	}

}


class Marco extends JFrame{
	
	Marco(){
		
		setBounds(400,400,400,400);
		setTitle("Escritura en JFrame.");
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
		PrimerPanel lamina=new PrimerPanel();
		add(lamina);
	}
}

class PrimerPanel extends JPanel{
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		g.drawString("Este método tiene un String pro parámetro que es esto mismo que estás leyendo, y dos int que son las coordenadas donde se ubica el String.", 25, 25);
	}
}