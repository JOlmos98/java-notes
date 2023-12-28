package JT02_GRAF;

import javax.swing.JFrame;

public class GRAF03ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ventana ventana1=new Ventana(200,100,300,300);
		Ventana ventana2=new Ventana(400,300,300,300);
		Ventana ventana3=new Ventana(600,500,300,300);

	}
}

//////////////////////////////////////////////////////////////////////////////////

class Ventana extends JFrame{
	
	private static int num=1;
	
	public Ventana(int x, int y, int width, int height) {
		
		setBounds(x,y,width,height);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); //Establece la capacidad de redimensionar la ventana o no.
		setTitle("Ventana "+num); //Para que el titulo se de en el constructor ponemos aqui como parámetro un String puesto en el constructor.
		setVisible(true);
		num++;
	}
}