package Pg2ev;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

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
	   
	   
	   public String diaSemana() {
		   
		   LocalDate fecha=LocalDate.of(this.getAnyo(), this.getMes(), this.getDia());
		   DayOfWeek dia=fecha.getDayOfWeek();
		   dia.toString();
		   String [] diasemana= {"LUNES","MARTES","MIÉRCOLES","JUEVES","VIERNES","SÁBADO","DOMINGO"};
		   if (dia.toString().equals("MONDAY")) return diasemana[0];
		   else if (dia.toString().equals("TUESDAY")) return diasemana[1];
		   else if (dia.toString().equals("WEDNESDAY")) return diasemana[2];
		   else if (dia.toString().equals("THURSDAY")) return diasemana[3];
		   else if (dia.toString().equals("FRIDAY")) return diasemana[4];
		   else if (dia.toString().equals("SATURDAY")) return diasemana[5];
		   else return diasemana[6];
		   
	   }
	   
	   public int diasHastav1(Fecha f) {
		   //if (this.getAnyo()!=f.getAnyo()||this.getDia()!=f.getDia()||this.getMes()!=f.getMes())
		   int diashasta=(int)ChronoUnit.DAYS.between(LocalDate.of(this.getAnyo(), this.getMes(), this.getDia()), LocalDate.of(f.getAnyo(), f.getMes(), f.getDia()));
		   return diashasta;
		    }
	   
	   private boolean bisiesto(int year) {
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) return true;
			return false;
		}

	   public int getDiaDelAnyo() {
		   int diasPorMes[]={0,31,59,90,120,151,181,212,243,273,304,334};
		   int diadelanyo=this.getDia()+diasPorMes[this.getMes()-1];
		   
		   if (this.bisiesto(this.getAnyo())==true&&this.getMes()>1) diadelanyo++;
			   
		   return diadelanyo;
		   
	   }
	   
	   public int diasHastav2(Fecha f) {
		   int diashasta=0;
		   
		   if (this.getAnyo()!=f.getAnyo()) {
	            if (this.getAnyo()<f.getAnyo()) {
	                diashasta=f.getDiaDelAnyo()-this.getDiaDelAnyo();
	                for (int i=this.getAnyo()+1;i<f.getAnyo();i++) {
	                    if (this.bisiesto(i)) {
	                        diashasta+=366;
	                    } else {
	                        diashasta+=365;
	                    }
	                }
	            } else {
	                diashasta=f.getDiaDelAnyo()-this.getDiaDelAnyo();
	                for (int i=f.getAnyo();i<this.getAnyo();i++) {
	                    if (this.bisiesto(i)) {
	                        diashasta-=366;
	                    } else { //Por aqui esta el error.
	                        diashasta-=365;
	                    }
	                }
	            }
		   }
		   else diashasta=f.getDiaDelAnyo()-this.getDiaDelAnyo(); //Asi debe ser la fórmula.
		   
		   return diashasta;
	   }
	   
	   public String plusDias(int dias) {
		   return "Fecha [dia=" + (dia+dias) + ", mes=" + mes + ", anyo=" + anyo + "]";
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