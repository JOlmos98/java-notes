package JT02_GRAF;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class GRAF04icono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		frame ventanaconicono=new frame();
	}

}

class frame extends JFrame{
	
	public frame() {
		
		setExtendedState(JFrame.MAXIMIZED_BOTH); //La ventana SIEMPRE está maximizada.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); 
		setResizable(true); 
		setTitle("Primera ventana."); 
		//Con la clase Toolkit accedemos a los archivos del sistema.
		Toolkit misistema=Toolkit.getDefaultToolkit();
		//Con la clase Image seleccionamos el archivo en misistema con .getImage
		Image iconoapp=misistema.getImage("src/JT02_GRAF/cara4.png");
		//Con el método setIconImage de JFrame establecemos la imagen como icono.
		setIconImage(iconoapp);
		
		setVisible(true);
	}
}