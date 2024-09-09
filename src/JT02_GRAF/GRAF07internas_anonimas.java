package JT02_GRAF;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GRAF07internas_anonimas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco07 marco=new Marco07();
	}

}

class Marco07 extends JFrame{
	
	Marco07(){
		
		setTitle("Escritura en JFrame.");
		setSize(400,400);
		setLocationRelativeTo(null); 
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
		/*Panel1 panel=new Panel1();
		add(panel);*/
		add(new JPanel(){ //Lo hacemos como una clase interna anónima.
			public void paintComponent(Graphics g) {
				
				super.paintComponents(g);
				//Aquí volvemos a reducir código haciendo las instancias internas y anónimas.
				g.setColor(new Color(255,0,0));
				//En vez de 3 podría ser Font.BOLD etc.
				g.setFont(new Font("VERDANA",3,20)); //Fuente, (1 negrita, 2 cursiva, 3 ambas), tamaño.
				
				g.drawString("Palabras de ejemplo 07.", 25, 25);
			}
		});
	}
	
}

/*
class Panel1 extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponents(g);
		
		Color color1=new Color(255,0,0);
		g.setColor(color1);
		Font font1=new Font("VERDANA",3,20); //En vez de 3 podría ser Font.BOLD etc.
		g.setFont(font1); //Fuente, (1 negrita, 2 cursiva, 3 ambas), tamaño.
		
		g.drawString("Palabras de ejemplo.", 25, 25);
	}
}
*/