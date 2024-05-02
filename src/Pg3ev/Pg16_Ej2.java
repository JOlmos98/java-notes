package Pg3ev;
/*
 * En el desarrollo de un juego similar al buscaminas se desea desarrollar el método 
public static int celdasSeguras(char[][] zonaJuego) {} donde zonaJuego es un espacio en 
el que cada celda representa una mina (‘*’), una zona libre (‘ ‘) o una zona ocupada. Se 
considera una celda segura a aquella celda libre que no es vecina (en cualquier 
dirección) de una mina. Desarrolle el método celdasSeguras(). 
 */
public class Pg16_Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] tablero = { //Tablero de ejemplo.
			    {' ', ' ', '1', '1', '1'},
			    {'1', '2', '3', '*', '1'},
			    {'1', '*', '*', '2', '1'},
			    {'1', '2', '2', '1', ' '},
			    {' ', ' ', ' ', ' ', ' '}
			};
		/*
		 * Las casillas seguras serían la 0.0/0.1/3.4/4.0/4.1/4.2/4.3;
		 */
		if (tablero[2][2]!='1') System.out.println("El valor de las coordenadas 2.2 es distinto de 1.");
		//celdasSeguras(tablero);
		System.out.println(celdasSeguras(tablero));
	}
	
	public static int celdasSeguras(char[][] zonaJuego) {
		//El zonaJuego es básicamente el tablero. Un array bidimensional de las casillas.
		int a=0;
		for (int i=0;i<zonaJuego.length;i++) {
			for (int b=0;b<zonaJuego.length;b++) {
				if (zonaJuego[i][b]==' ') {
					System.out.println("La casilla ["+i+"]["+b+"] es una casilla segura.");
					a++;
				}
			}
		}
		return a;
	}

}
