package Pg2ev;

import java.util.ArrayList;

/*
 * Se le proporciona la clase Persona. Desarrolle 
 * un programa que construya un array de 10 
 * elementos de la clase Persona. Asigne valor a 
 * tres de ellos.
 */
public class Pg11_Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Personaej5 [] arrayp=new Personaej5[10];
		
		Fecha [] fechas1=new Fecha[3];
		fechas1[0]=new Fecha("12/12/1998");
		fechas1[1]=new Fecha("14/7/2024");
		fechas1[2]=new Fecha("23/1/2016");
		arrayp[0]=new Personaej5("Manolo", fechas1);
		Fecha[] fechas2= {new Fecha("12/6/2000"), new Fecha("27/3/2045"), new Fecha("18/12/2019")};
		arrayp[1]=new Personaej5("José", fechas2);
		arrayp[2]=new Personaej5("Antonio", new Fecha[3]);
		arrayp[2].setFechas(fechas1); //De esta forma Manolo y Antonio coinciden en las tres fechas.
		
		System.out.println(arrayp[0].getFechas()[1]);
		
	}
}

/////////////////////////////////////////////////////////////////////////////////////////

class Personaej5 {
	
	public static final int FNacimiento = 0;
	public static final int FBoda = 1;
	public static final int FTrabajo = 2;
	
	// ...
		
    String nombre;
    Fecha[]  fechas = new Fecha[3];
    
    // ...
    
    public Personaej5(String nombre, Fecha[] fechas) {
    	this.nombre = nombre;
    	this.fechas[FNacimiento] = fechas[FNacimiento];
    	this.fechas[FBoda] = fechas[FBoda];    	
    	this.fechas[FTrabajo] = fechas[FTrabajo];
    }
    
    // ...

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Fecha[] getFechas() {
		return fechas;
	}

	public void setFechas(Fecha[] fechas) {
		this.fechas = fechas;
	}
    
    // ...
    
    public static void sortAL(ArrayList<Personaej5> arraydepersonas) {
    	for (int i=0;i<arraydepersonas.size();i++) {
    		for (int a=0;a<arraydepersonas.size()-i-1;a++) {
    			if (arraydepersonas.get(a).getNombre().compareTo(arraydepersonas.get(a+1).getNombre())>0){
    				Personaej5 aux=arraydepersonas.get(a);
    				arraydepersonas.set(a, arraydepersonas.get(a+1));
    				arraydepersonas.set(a+1, aux);
    			}
    		//String nombre=arraydepersonas.get(i).getNombre();
    		//if (nombre.charAt(0)==('A')) {
    		}
    	}
    }
 }