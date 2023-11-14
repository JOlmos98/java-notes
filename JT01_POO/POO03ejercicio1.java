package JT01_POO;

public class POO03ejercicio1 {

	public static void main(String[] args) {
		
		CC cuenta1=new CC("Jesús Olmos Soler", 300);
		System.out.println(cuenta1.getdatosgeneralesCC()+"\n");
		CC cuenta2=new CC("Nuria Zambudio Mora", 5);
		System.out.println(cuenta2.getdatosgeneralesCC()+"\n");
		CC cuenta3=new CC("Paco Martínez Soria", 8000);
		System.out.println(cuenta3.getdatosgeneralesCC()+"\n");
		CC cuenta4=new CC("José Augusto López", 3.5);
		System.out.println(cuenta4.getdatosgeneralesCC()+"\n");
		
		CC.settransferencia(cuenta3, cuenta4, 7900);
		CC.settransferencia(cuenta2, cuenta4, 4);
		CC.settransferencia(cuenta1, cuenta4, 150);
		
		System.out.println("Después de transferencias:\n"+cuenta4.getdatosgeneralesCC()+"\n");
		
	}
}
//Constructor y métodos:
class CC {
	
	public CC (String nombretitular, double saldoinicial) {
		
		this.nombretitular=nombretitular;
		this.saldo=saldoinicial;
		this.iban="ES"+mitad1numerocuenta+mitad2numerocuenta;
		mitad1numerocuenta+=123456789;
		mitad2numerocuenta+=123456789;
		//También se puede usar:
		//this.iban="ES"+Math.abs(rnd.nextLong()); de la clase rnd, la famosa clase Random.
	}



//Getters:
public String getdatosgeneralesCC() {
	return "Datos de la CC de "+nombretitular+":\nIBAN: "+iban+"\nSaldo: "+saldo;
}
//Setters:
public void setingreso(double ingreso) {
	saldo+=ingreso;
}
public void setretiro(double retiro) {
	saldo-=retiro;
}
public static void settransferencia(CC origen, CC destino, double transferencia) {
	origen.saldo-=transferencia;
	destino.saldo+=transferencia;
}
//Variables:

	private String nombretitular;
	private double saldo;
	private String iban;
	private static int mitad1numerocuenta=374839275;
	private static int mitad2numerocuenta=483722485;
}