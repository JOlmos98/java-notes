package JT01_POO;

public class POO01uso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Acabo de borrar los apuntes de Java de mi primer año dando Java, me quiero suicidar.\nPero bueno, aquí empezamos again.");
		System.out.println();
		//Al menos empiezo subiéndolo todo a Github.
	
		POO01constructor micoche1=new POO01constructor(4, 1.5, 2.1, 250);
		
		System.out.println(micoche1.getdatosgenerales()+"\n");
		
		micoche1.setcolor("Verde");
		micoche1.setrepro(40);
		
		System.out.println(micoche1.getdatosgenerales()+"\n");
		System.out.println(micoche1.getextra());
		micoche1.setextras(true);
		System.out.println(micoche1.getextra());
		micoche1.setextras(true, true, true);
		System.out.println(micoche1.getextra());
	}
}