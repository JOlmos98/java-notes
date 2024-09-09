package JT02_GRAF;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GRAF06color_fuente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco06 marco=new Marco06();
		
	}

}

class Marco06 extends JFrame{
	
	Marco06(){
		
		setTitle("Escritura en JFrame.");
		setSize(400,400);
		setLocationRelativeTo(null); 
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
		Panel1 panel=new Panel1();
		add(panel);
	}
	
}

class Panel1 extends JPanel{
	
	Panel1 (){
		setBackground(new Color(195,255,234));
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Color color1=new Color(255,0,0);
		g.setColor(color1);
		Font font1=new Font("VERDANA",3,20); //En vez de 3 podría ser Font.BOLD etc.
		g.setFont(font1); //Fuente, (1 negrita, 2 cursiva, 3 ambas), tamaño.
		
		g.drawString("Palabras de ejemplo 06.", 25, 25);
	}
}
