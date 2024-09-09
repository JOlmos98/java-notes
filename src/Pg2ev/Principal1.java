package Pg2ev;

import java.util.ArrayList;

public class Principal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	}
	
	ArrayList<Contacto> filtrar(ArrayList<Contacto> contactos){
		ArrayList<Contacto> ALfiltrado=new ArrayList();
		
		for (int i=0;i<contactos.size();i++) {
			for (int a=0;a<contactos.size();a++) {
				if (contactos.get(i).getDni().equals(contactos.get(a).getDni())) {
					contactos.get(a).setEdad(0);
				}
			}
		}
		for (int b=0;b<contactos.size();b++) {
			if (contactos.get(b).getEdad()==0) contactos.remove(b);
			else ALfiltrado.add(contactos.get(b));
		}
		
		return ALfiltrado;
	}
}

