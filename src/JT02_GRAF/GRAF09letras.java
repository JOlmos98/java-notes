package JT02_GRAF;

import java.awt.GraphicsEnvironment;

import javax.swing.JOptionPane;

public class GRAF09letras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] letrasdisponibles=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		for (String a:letrasdisponibles) System.out.println(a);
		String fuente=JOptionPane.showInputDialog("Introduce la fuente que quieras usar:");
		boolean fuentevalida=false;
		for (String element:letrasdisponibles) {
			if (element.equalsIgnoreCase(fuente)) fuentevalida=true;
		}
		if (fuentevalida) JOptionPane.showMessageDialog(null, "La fuente seleccionada está disponible.");
		else JOptionPane.showMessageDialog(null, "Fuente NO válida.");
	}
	
}
