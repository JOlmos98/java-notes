package JT01_POO;

public class POO10ejercicio1interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehiculos[] array=new Vehiculos[5];
		
		array[0]=(Coche)new Coche(50);
		array[1]=(Coche)new Coche(80);
		array[2]=(Coche)new Coche(100);
		array[3]=(Moto)new Moto(15);
		array[4]=(Moto)new Moto(60);
		
		
		
		for (int i=0;i<array.length;i++) {
			if (array[i] instanceof Coche) System.out.println("Velocidad del vehículo nº "+i+"= "+array[i].getVelocidadActual());
			else System.out.println("Velocidad del vehículo nº "+i+"= "+array[i].getVelocidadActual());
		} 
		
		array[0].ACELERAR(50);
		array[1].ACELERAR(50); //Supera los 120.
		array[0].ACELERAR(25); //Supera los 120.
		
		array[4].ACELERAR(121); //Supera los 120.
		array[3].FRENAR(20); //Por debajo de 0, asi que 0.
		
		for (int i=0;i<array.length;i++) {
			if (array[i] instanceof Coche) System.out.println("Velocidad del vehículo nº "+i+"= "+array[i].getVelocidadActual());
			else System.out.println("Velocidad del vehículo nº "+i+"= "+array[i].getVelocidadActual());
		} 
		
		System.out.println(array[0].getPLAZAS());
		System.out.println(array[4].getPLAZAS());
	}
}

///////////////////////////////////////////////////////////////////////////////////

class Coche implements Vehiculos{

	public Coche(double VelInicial) {
		this.Velocidad=VelInicial;
	}
	
	//Variables:
		private double Velocidad=0;
		private static int Plazas=5;
		
	@Override
	public String getPLAZAS() {
		// TODO Auto-generated method stub
		return "Este vehículo tiene "+Plazas+" plazas.";
	}

	@Override
	public void ACELERAR(double aumento) {
		// TODO Auto-generated method stub
		Velocidad=Velocidad+aumento;
		if (Velocidad>Vehiculos.VELOCIDAD_MAXIMA) {
			String AvisoVel = "Velocidad máxima superada.\nVelocidad: ";
			System.out.println(AvisoVel+Velocidad);
		}
	}

	@Override
	public void FRENAR(double disminucion) {
		// TODO Auto-generated method stub
		Velocidad=Velocidad-disminucion;
		if (Velocidad<0) Velocidad=0;
	}

	@Override
	public double getVelocidadActual() {
		// TODO Auto-generated method stub
		return Velocidad;
	}
	/*public double getVelocidadActual() {
		return Velocidad;
	}*/
}

class Moto implements Vehiculos{

	public Moto(double VelInicial) {
		this.Velocidad=VelInicial;
	}

	//Variables:
	private double Velocidad=0;
	private static int Plazas=2;
	
	@Override
	public String getPLAZAS() {
		// TODO Auto-generated method stub
		return "Este vehículo tiene "+Plazas+" plazas.";
	}

	@Override
	public void ACELERAR(double aumento) {
		// TODO Auto-generated method stub
		Velocidad=Velocidad+aumento;
		if (Velocidad>Vehiculos.VELOCIDAD_MAXIMA) {
			String AvisoVel = "Velocidad máxima superada.\nVelocidad: ";
			System.out.println(AvisoVel+Velocidad);
		}
	}

	@Override
	public void FRENAR(double disminucion) {
		// TODO Auto-generated method stub
		Velocidad=Velocidad-disminucion;
		if (Velocidad<0) Velocidad=0;
	}

	@Override
	public double getVelocidadActual() {
		// TODO Auto-generated method stub
		return Velocidad;
	}
	
}