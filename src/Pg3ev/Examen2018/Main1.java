package Pg3ev.Examen2018;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Candidato> candidatos1=new ArrayList();
		
		/*0*/candidatos1.add(new Candidato("OLMOS", "SOLER", "JESUS", LocalDate.of(2024, 1, 23)));
		candidatos1.add(new Candidato("JUAREZ", "SANCHEZ", "JAVIER", LocalDate.of(2023, 11, 16)));
        candidatos1.add(new Candidato("GARCIA", "MARTINEZ", "MARIA", LocalDate.of(2023, 12, 5)));
        candidatos1.add(new Candidato("LOPEZ", "GOMEZ", "CARLOS", LocalDate.of(2024, 2, 8)));
        candidatos1.add(new Candidato("RODRIGUEZ", "HERNANDEZ", "LAURA", LocalDate.of(2024, 3, 12)));
        /*5*/candidatos1.add(new Candidato("MARTIN", "PEREZ", "DAVID", LocalDate.of(2023, 11, 30)));
        candidatos1.add(new Candidato("SANCHEZ", "GONZALEZ", "ANA", LocalDate.of(2024, 4, 18)));
        candidatos1.add(new Candidato("PEREZ", "RODRIGUEZ", "MIGUEL", LocalDate.of(2023, 12, 20)));
        candidatos1.add(new Candidato("GOMEZ", "SANCHEZ", "SOFIA", LocalDate.of(2024, 5, 5)));
        candidatos1.add(new Candidato("FERNANDEZ", "MARTINEZ", "JULIA", LocalDate.of(2024, 6, 7)));
        /*10*/candidatos1.add(new Candidato("DIAZ", "LOPEZ", "ALBERTO", LocalDate.of(2023, 12, 10)));
        candidatos1.add(new Candidato("MUÑOZ", "RODRIGUEZ", "ELENA", LocalDate.of(2024, 7, 15)));
        candidatos1.add(new Candidato("MORENO", "GARCIA", "PEDRO", LocalDate.of(2023, 10, 25)));
        candidatos1.add(new Candidato("ALVAREZ", "MARTIN", "PAULA", LocalDate.of(2024, 8, 23)));
        candidatos1.add(new Candidato("ROMERO", "PEREZ", "JUAN", LocalDate.of(2023, 10, 5)));
        candidatos1.add(new Candidato("NAVARRO", "SANCHEZ", "IRENE", LocalDate.of(2024, 9, 19)));
        candidatos1.add(new Candidato("GUTIERREZ", "DIAZ", "RICARDO", LocalDate.of(2023, 9, 12)));
        candidatos1.add(new Candidato("TORRES", "LOPEZ", "NATALIA", LocalDate.of(2024, 10, 8)));
        candidatos1.add(new Candidato("DOMINGUEZ", "MARTINEZ", "ANDREA", LocalDate.of(2023, 8, 28)));
        candidatos1.add(new Candidato("VAZQUEZ", "GOMEZ", "SERGIO", LocalDate.of(2024, 11, 14)));
        /*20*/candidatos1.add(new Candidato("RAMIREZ", "PEREZ", "ROSA", LocalDate.of(2023, 8, 10)));
        /*NEWEST*/candidatos1.add(new Candidato("SUAREZ", "SANCHEZ", "LUIS", LocalDate.of(2024, 12, 3)));
        /*OLDEST*/candidatos1.add(new Candidato("CORTES", "GONZALEZ", "MARTA", LocalDate.of(2023, 7, 20)));
        candidatos1.add(new Candidato("ALVAREZ", null, "ALBERTO", LocalDate.of(2023, 8, 28)));
        candidatos1.add(new Candidato("GOMEZ", null, "JOAO", LocalDate.of(2024, 11, 14)));
        candidatos1.add(new Candidato("PEREZ", null, "KEVIN", LocalDate.of(2023, 12, 20)));
        
        //for (Candidato c:candidatos1) System.out.println(c);
        //ArrayList<Candidato> alord=ordenar(candidatos1); 
        //for (int i=0;i<alord.size();i++) System.out.println(alord.get(i));
        
		ArrayList<Candidato> admitidos1=new ArrayList();
		ArrayList<Candidato> descartados1=new ArrayList();
		
		admitidos1=admitidos(candidatos1, descartados1);
		
		System.err.println("==ADMITIDOS==");
		for (Candidato c:admitidos1) System.out.println(c);
		
		System.err.println("\n==DESCARTADOS==");
		for (Candidato c:descartados1) System.out.println(c);
		
	}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//admitidos() funciona.
	public static ArrayList<Candidato> admitidos(ArrayList<Candidato> candidatos, ArrayList<Candidato> descartados){
		ArrayList<Candidato> ordenadosporfecha=new ArrayList();
		ArrayList<Candidato> ALadmitidos=new ArrayList();
		
		for (int i=0;i<candidatos.size();i++) ordenadosporfecha.add(candidatos.get(i));
		for (int i=0;i<ordenadosporfecha.size();i++) {
			for (int a=0;a<ordenadosporfecha.size();a++) {
				if (ordenadosporfecha.get(a).compareToFechasolicitud(ordenadosporfecha.get(i))>0) {
					Candidato aux=ordenadosporfecha.get(i);
					ordenadosporfecha.set(i, ordenadosporfecha.get(a));
					ordenadosporfecha.set(a, aux);
				}
			}
		}
		
		if (ordenadosporfecha.size()>=20) {
			for (int i=0;i<20;i++) {
				ALadmitidos.add(ordenadosporfecha.get(i));
			}
			for (int i=ALadmitidos.size();i<ordenadosporfecha.size();i++) descartados.add(ordenadosporfecha.get(i));
		} else {
			for (int i=0;i<ordenadosporfecha.size();i++) ALadmitidos.add(ordenadosporfecha.get(i));
		}
		
		return ALadmitidos;
	}
	
	//ordenar() funciona.
	public static ArrayList<Candidato> ordenar(ArrayList<Candidato> candidatos){
		ArrayList<Candidato> ALordenado=new ArrayList();
		
		for (int i=0;i<candidatos.size();i++) ALordenado.add(candidatos.get(i));
		
		for (int i=0;i<ALordenado.size();i++) {
			for (int a=0;a<ALordenado.size();a++) {
				if (ALordenado.get(a).compareToApe1(ALordenado.get(i))>0) {
					Candidato aux=ALordenado.get(i);
					ALordenado.set(i, ALordenado.get(a));
					ALordenado.set(a, aux);
				}
			}
		}
		
		return ALordenado;
	}
}
