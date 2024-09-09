package JuanviCurso;

public class Car {    
	
    public final static double GALLON_LITRE = 3.785;
    private String color;
    
    public Car(String c){
    	this.color = c;
    }
    
    public String getColor(){
    	return this.color;
    }

}