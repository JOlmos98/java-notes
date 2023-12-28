package JT02_GRAF;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GRAF10imagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameImagenes f1=new FrameImagenes(600, 600, false, "Ventana para imágenes.");
	}

}



class FrameImagenes extends JFrame{
	
	Toolkit mikit=Toolkit.getDefaultToolkit();
	
	FrameImagenes(int ancho, int alto, boolean resizable, String título){
		
		setSize(ancho, alto);
		setLocationRelativeTo(null);
		setResizable(resizable);
		setTitle(título);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
		
		add(new PanelImagenes());
		Image icono=mikit.getImage("src/JT02_GRAF/icono.png");
		setIconImage(icono);
	}
}

class PanelImagenes extends JPanel{
	
	PanelImagenes (){
		setBackground(new Color(200,200,200));
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(new Color(20,20,20));
		g.setFont(new Font("Comic Sans MS",3,24));
		g.drawString("En este panel vamos a introducir imágenes.", 65, 25);
		
		File imagen1=new File("src/JT02_GRAF/Captura.png");
		
			try {
				imagenio1=ImageIO.read(imagen1);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("La imagen no se encuentra.");
			}
			
		g.drawImage(imagenio1, 50, 50, null);
		
		File imagen2=new File("src/JT02_GRAF/cara4.png");
		try {
			imagenio2=ImageIO.read(imagen2);
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("La imagen no se encuentra.");
		}
		
	    g.drawImage(imagenio2, 80, 80, null);
		g.copyArea(150, 200, 130, 380, 130, 130);
		
		File imagen3=new File("src/JT02_GRAF/mosaico.png");
		try {
			imagenio3=ImageIO.read(imagen3);
		} catch (IOException e3) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("La imagen no se encuentra.");
		}
		int anchuraimagen=imagenio3.getWidth(this);
		int alturaimagen=imagenio3.getHeight(this);
		
		g.drawImage(imagenio3, 0, 0, null);
		/*
		for (int i=0;i<10;i++) {
			for (int j=0;j<10;j++) {
				g.copyArea(0, 0, anchuraimagen, alturaimagen, anchuraimagen*i, alturaimagen*j);
			}
		}
		//*/
	}
	
	Image imagenio1;
	Image imagenio2;
	Image imagenio3;
	/*
	 * setIconImage: admite por parámetro 
	 * un objeto de tipo Image y lo utiliza 
	 * como icono cuando minimiza la ventana.
	 */
}