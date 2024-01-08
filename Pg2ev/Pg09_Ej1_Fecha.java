package Pg2ev;
/*
 * Se le proporciona la clase Fecha. Atienda a la 
 * introducción en vídeo y a continuación incorpore 
 * getters, setters, método toString() y constructores 
 * a la clase Fecha. Haga uso de todo ello desde un 
 * programa principal.
 */
public class Pg09_Ej1_Fecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fecha fecha1=new Fecha(12,2,1995);
		
		fecha1.setDia(12);
		fecha1.setMes(2);
		fecha1.setAnyo(1998);
		
		System.out.println(fecha1.getAnyo());
		System.out.println(fecha1); //Es lo mismo que toString.
	}

}

class Fecha {
	  
	   private int dia;
	   private int mes;
	   private int anyo;
	   
	   // ...
	   
	   public Fecha(int dia, int mes, int anyo) {
		   this.dia=dia;
		   this.mes=mes;
		   this.anyo=anyo;
		   
		   
	   }
	   
	   // ...
	   
	   public String Equals(Fecha a) {
		   
		   if (this.getDia()==a.getDia()&&this.getMes()==a.getMes()&&this.getAnyo()==a.getAnyo()) return "Las fechas son iguales.";
		   else return "Las fechas NO son iguales.";
	   }
	   
	   public boolean isposterior(Fecha f) {
		   //Dice si la fecha construida es posterior a f.
		   if (this.getAnyo()!=f.getAnyo()) {
		        return this.getAnyo()>f.getAnyo();
		    } else if (this.getMes()!=f.getMes()) {
		        return this.getMes()>f.getMes();
		    } else {
		        return this.getDia()>f.getDia();
		    }
	   }
	   
	   public int compareTo(Fecha f) {
	    
		   if (this.getAnyo()!=f.getAnyo()) {
		        return (this.getAnyo()-f.getAnyo());
		    } else if (this.getMes()!=f.getMes()) {
		        return this.getMes()-f.getMes();
		    } else {
		        if (this.getDia()!=f.getDia()) return this.getDia()-f.getDia();
		        else return 0;
		    }
		   
	   }
	   
	   private boolean bisiesto(int year) {
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) return true;
			return false;
		}

		@Override
		public String toString() {
			return "Fecha [dia=" + dia + ", mes=" + mes + ", anyo=" + anyo + "]";
		}

		public int getDia() {
			return dia;
		}

		public void setDia(int dia) {
			this.dia = dia;
		}

		public int getMes() {
			return mes;
		}

		public void setMes(int mes) {
			this.mes = mes;
		}

		public int getAnyo() {
			return anyo;
		}

		public void setAnyo(int anyo) {
			this.anyo = anyo;
		}
	}