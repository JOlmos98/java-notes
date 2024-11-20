package DAM1;

import java.util.ArrayList;

public class bucles_victor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ArrayList<Integer> arInt=new ArrayList();
				
		int aleatorio=(int)(Math.random()*(100));
		System.out.println("El número aleatorio es: "+aleatorio+"\n");
		char a='a';
		String tal="antonio";
		
		for (int i=0;i<10;i++) {
			aleatorio=(int)(Math.random()*(100));
			arInt.add(aleatorio);
			System.out.println("El número aleatorio es: "+aleatorio);
			if (tal.equals("antonio")||aleatorio==60||aleatorio==80) System.out.println("El número es el bueno.");
		}
		System.out.println("El número aleatorio es: "+aleatorio);

		System.out.println(arInt);
	}

}
