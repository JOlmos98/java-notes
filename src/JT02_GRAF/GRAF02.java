package JT02_GRAF;

import javax.swing.JFrame;

public class GRAF02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		miJFrame ventana=new miJFrame();
		
	}

}

class miJFrame extends JFrame{
	
	public miJFrame() {
		
		//setSize(500, 500); Establece el tamaño.
		setExtendedState(JFrame.MAXIMIZED_BOTH); //La ventana SIEMPRE está maximizada.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setLocation(500, 250); Este método establece la ventana según los pixeles.
		setLocationRelativeTo(null); //Este método SIEMPRE la coloca en el centro.
		//setBounds(); Establece el tamaño y la ubicacion con 4 parámetros.
		setVisible(true);
		setResizable(false); //Establece la capacidad de redimensionar la ventana o no.
		setTitle("Primera ventana.");
	}
}