package Pg3ev;

public class generandoNumeritos {

    public static void main(String[] args) {
        int numerosAGenerar=30;
        for (int i=0;i<numerosAGenerar;i++){
            System.out.print(generandoNumeritos.generarNumero(50, 90)+" ");
        }
    }
    
    /**
     * 
     * @param min Indica el mínimo num generado
     * @param max Indica el máximo num generado
     * @return Devuelve el número generado
     */
    private static int generarNumero(int min, int max){
        int num;
        do {num=(int)(Math.random()*100);} while (num<min||num>max);
        return num;
    }
}
