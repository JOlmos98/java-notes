package Pg1ev;
//Desarrolle de nuevo el ejercicio anterior, utilizando ahora como recurso el intercambio de valores entre dos variables x e y (aux = x; x=y; y=aux;).
public class Pg02_Ej7 {

	public static void main(String[] args) {
		
		/*
		 * aux=x;
		 * x=y;
		 * y=aux;
		 */
		int a=123;
		int b=452;
		int c=122;
		int aux;
		int mayor=0;
		int medio=0;
		int menor=0;
		
		if (a>b&&a>c) {
			aux=a;
			a=mayor;
			mayor=aux;
		}
		if (b>a&&b>c) {
			aux=b;
			b=mayor;
			mayor=aux;
		}
		if (c>a&&c>b) {
			aux=c;
			c=mayor;
			mayor=aux;
		}
		if (a>b&&a<c||a>c&&a<b) {
			aux=a;
			a=medio;
			medio=aux;
		}
		if (b>a&&b<c||b>c&&b<a) {
			aux=b;
			b=medio;
			medio=aux;
		}
		if (c>b&&c<a||c>a&&c<b) {
			aux=c;
			c=medio;
			medio=aux;
		}
		if (a<b&&a<c) {
			aux=a;
			a=menor;
			menor=aux;
		}
		if (b<a&&b<c) {
			aux=b;
			b=menor;
			menor=aux;
		}
		if (c<b&&c<a) {
			aux=c;
			c=menor;
			menor=aux;
		}
		System.out.println("Los números ordenados de mayor a menor son: \n"+mayor+"\n"+medio+"\n"+menor);
	}

}
