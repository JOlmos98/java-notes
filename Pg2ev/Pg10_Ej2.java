package Pg2ev;
/*
 * Desarrolle e incorpore a la clase Fecha 
 * el método public void next() {…} . 
 * Considere bisiestos. 
 */
public class Pg10_Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Imagino que este método tiene que hacer avanzar un día la fecha.
		Fecha ejemplonext=new Fecha(21, 3, 1999);
		System.out.println(ejemplonext);
		ejemplonext.next();
		//System.out.println(ejemplonext);
		ejemplonext.next();
		ejemplonext.next();
		ejemplonext.next();
		ejemplonext.next();
		ejemplonext.next();
		//System.out.println(ejemplonext);
		ejemplonext.next();
		ejemplonext.next();
		ejemplonext.next();
		ejemplonext.next();
		System.out.println(ejemplonext);
		ejemplonext.next();
		System.out.println(ejemplonext);
		ejemplonext.next();
		System.out.println(ejemplonext);
		System.out.println();
		ejemplonext=new Fecha(31,12,1999);
		System.out.println(ejemplonext);
		ejemplonext.next();
		System.out.println(ejemplonext);
		
	}
}
