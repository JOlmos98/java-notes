package Examen2Ev;

import java.time.LocalDate;
import java.util.ArrayList;

public class Principal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Tenemos que hacer un AL con citas sobre una empresa, después métodos
		 * que cojan ese AL con todas las citas y un método haga el AL de próximas
		 * citas el próximo mes, es decir, las pendientes, y las citas con 
		 * observaciones de hace menos de tres años.
		 * 
		 * Con esos dos métodos ya podemos crear los objetos para hacer una instancia
		 * de la clase Informe.
		 */
		
		/*
		 * Está mal planteado el ejercicio, supongo, el ejercicio quiere
		 * que se creen informes con citas que tiene el usuario con diferentes empresas,
		 * es decir, el informe DE UN USUARIO en cuestión tiene 
		 * las citas que tiene EL USUARIO con diversas empresas el próximo mes y las citas con 
		 * observaciones con una antiguedad menor a tres años.
		 */
		ArrayList<Empresa> ALE=new ArrayList();
		ALE.add(new Empresa(1234, "ACERINOX", "584738473", "Valencia"));
		ALE.add(new Empresa(4857, "IDEALISTA", "475847362", "Madrid"));
		ALE.add(new Empresa(5678, "ZARA", "384756283", "Alicante"));
		
		ArrayList<Cita> citasACERINOX=new ArrayList(); //Pendiente, Realizada o Cancelada
		citasACERINOX.add(new Cita(2142, LocalDate.of(2022, 3, 23), "Pendiente", "Cita con observaciones de ejemplo UNO."));
		citasACERINOX.add(new Cita(5234, LocalDate.of(2021, 6, 3), "Pendiente", "Cita con observaciones de ejemplo DOS."));
		citasACERINOX.add(new Cita(8753, LocalDate.of(2023, 3, 29), "Pendiente", "Cita con observaciones de ejemplo TRES."));
		citasACERINOX.add(new Cita(3123, LocalDate.of(2021, 4, 8), "Pendiente"));
		citasACERINOX.add(new Cita(2344, LocalDate.of(2024, 4, 3), "Pendiente"));
		citasACERINOX.add(new Cita(2563, LocalDate.of(2024, 4, 12), "Pendiente"));
		citasACERINOX.add(new Cita(4235, LocalDate.of(2024, 4, 1), "Pendiente"));
        citasACERINOX.add(new Cita(2142, LocalDate.of(2019, 3, 4), "Pendiente", "Cita con observaciones de ejemplo CUATRO."));
        citasACERINOX.add(new Cita(5234, LocalDate.of(2021, 6, 3), "Pendiente", "Cita con observaciones de ejemplo CINCO."));
        citasACERINOX.add(new Cita(8753, LocalDate.of(2023, 3, 29), "Pendiente", "Cita con observaciones de ejemplo SEIS."));
        citasACERINOX.add(new Cita(4243, LocalDate.of(2021, 5, 12), "Pendiente"));
        citasACERINOX.add(new Cita(1324, LocalDate.of(2022, 4, 15), "Realizada", "Cita programada con observaciones SIETE."));
        citasACERINOX.add(new Cita(4153, LocalDate.of(2023, 8, 10), "Pendiente"));
        citasACERINOX.add(new Cita(1325, LocalDate.of(2020, 9, 5), "Pendiente", "Cita con observaciones adicionales OCHO."));
        citasACERINOX.add(new Cita(6233, LocalDate.of(2023, 10, 20), "Cancelada"));
        citasACERINOX.add(new Cita(7254, LocalDate.of(2022, 7, 7), "Pendiente"));
        citasACERINOX.add(new Cita(1235, LocalDate.of(2023, 12, 12), "Realizada"));
        System.out.println("\nInforme de EMPRESAS: ");
		for (int i=0;i<ALE.size();i++) System.out.println(ALE.get(i).toString());
		
		System.out.println("\nInforme completo de citas: ");
		for (int i=0;i<citasACERINOX.size();i++) System.out.println("Cita: "+citasACERINOX.get(i).getId()+" "+citasACERINOX.get(i).getEstado());
		
		System.out.println("\nInforme citas pendientes del último mes: ");
		ArrayList<Cita> citasprox=Cita.filtrarPendientesProxMes(citasACERINOX);
		for (int i=0;i<citasprox.size();i++) System.out.println("Cita: "+citasprox.get(i).getId()+" "+citasprox.get(i).getEstado()+" "+citasprox.get(i).getFecha());
		
		System.out.println("\nInforme de citas con observaciones de los últimos tres años: ");
		ArrayList<Cita> citasobstresanyos=Cita.filtrarConObservacionesEn3Anyos(citasACERINOX);
		for (int i=0;i<citasobstresanyos.size();i++) System.out.println("Cita: "+citasobstresanyos.get(i).getId()+" "+citasobstresanyos.get(i).getEstado()+" "+citasobstresanyos.get(i).getFecha()+" "+citasobstresanyos.get(i).getObservaciones());
		
		Informe informe1=new Informe(ALE.get(0), citasprox, citasobstresanyos);
		
	}

	private static ArrayList<Informe> informeProximasCitas(ArrayList<Empresa> empresas){
		/*
		 * Cada informe es un arraylist que contiene las proximas citas
		 * de la empresa en cuestión.
		 */
		ArrayList<Informe> proximascitas=new ArrayList();
		
		
		
		return proximascitas;
	}
}
