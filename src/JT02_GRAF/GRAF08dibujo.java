package JT02_GRAF;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GRAF08dibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoDibujo marco1=new MarcoDibujo();
		
	}

}



class MarcoDibujo extends JFrame{
	
	MarcoDibujo(){
		setTitle("Dibujos");
		setSize(500,500);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		add(new PanelDibujo());
		
	}
	
	
}

class PanelDibujo extends JPanel{
	
	PanelDibujo(){
		setBackground(new Color(50,50,50));
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.setColor(new Color(222,222,222));
		g.setFont(new Font("VERDANA",3,24));
		g.drawString("Ejemplo de dibujos con Graphics:", 10, 25);
		g.drawRect(40, 40, 50, 20);
		g.drawOval(80, 80, 45, 10);
		g.drawLine(-50, 500, 500, 0);
		g.fillRoundRect(120, 120, 50, 120, 45, 45);
		
		Graphics2D g2D1=(Graphics2D)g;
		g2D1.setFont(new Font("CURIER",2,12));
		//g2.setStroke(new BasicStroke(6.5f)); Aumenta el grosor con la interfaz Stroke.
		float[] arrayf= {4.32f};
		g2D1.setStroke(new BasicStroke(3, 1, 2, 3, arrayf, 2));
		g2D1.setPaint(Color.CYAN);
		g2D1.drawString("Ejemplo dibujos con Graphics2D:", 305, 190);
		g2D1.draw(new Rectangle2D.Double(300.5, 300.5, 30.5, 60.13243514513));
		
		Graphics2D g2D2=(Graphics2D)g;
		g2D2.setPaint(Color.ORANGE);
		g2D2.setStroke(new BasicStroke(8f));
		g2D1.drawRoundRect(350, 350, 80, 70, 20, 150);
		
		g2D2.setColor(Color.GREEN);
		Rectangle2D rect=new Rectangle2D.Double(200, 300, 80, 140);
		g2D2.draw(rect);
		g2D2.setColor(Color.RED);
		g2D1.fill(rect);
		
	}
	
}