package JT02_GRAF;

import javax.swing.JFrame;

public class GRAF01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame PrimeraVentana=new JFrame();
		PrimeraVentana.setSize(500, 500);
		PrimeraVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		 * HIDE_ON_CLOSE en vez de cerrar la ventana y la aplicación
		 * definitivamente, cierra solo la ventana actual, por si el
		 * programa se compone de varias ventanas, que no se cierre todo.
		 */
		
		PrimeraVentana.setLocation(500, 250);
		
		PrimeraVentana.setVisible(true); //Poner siempre este método al final.
		
	}
}