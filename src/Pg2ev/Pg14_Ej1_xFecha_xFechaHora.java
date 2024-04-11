package Pg2ev;

import java.util.GregorianCalendar;

/*
 * Atienda a los comentarios acerca de la 
 * clase FechaHora que hereda las características 
 * de Fecha y, además, sobrescribe el método 
 * equals(). Desarrolle en FechaHora el constructor 
 * public FechaHora(String fh ); donde fh podrá tener 
 * el formato d(d)/m(m)/aaaa (h)h:(m)m:(s)s, por 
 * ejemplo 7/3/2021 12:40:23. Desarrolle también 
 * los métodos public String toString(); y public 
 * int compareTo (FechaHora fh);
 */
public class Pg14_Ej1_xFecha_xFechaHora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		xFechaHora fecha1=new xFechaHora(12, 12, 23, 12, 53, 43);
		System.out.println(fecha1.toString());
		
		xFechaHora fecha2=new xFechaHora("10/10/24 11:59:59");
		System.out.println(fecha2.toString());
		
		System.out.println(fecha1.compareTo(fecha2)); 
		//Devuelve -1, funciona bien.
		
		xFechaHora fecha3=new xFechaHora("10/10/24 11:59:59");
		xFechaHora fecha4=new xFechaHora("10/10/24 11:59:58");
		System.out.println(fecha3.compareTo(fecha4)); //1
		
		
		
	}
}

//////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////

class xFechaHora extends xFecha {
	
	  private int hora;
	  private int minuto;
	  private int segundo;


	  public xFechaHora() {}
	  

	  public xFechaHora(int dia, int mes, int anyo, int hora, int minuto, int segundo) {
	    super(dia,mes,anyo);
		this.hora = hora;
	    this.minuto = minuto;
	    this.segundo = segundo; 
	  }
	  
	  /*
	   * Hay que hacer un constructor que reciba un String como este:
	   * "12/4/22 12:23:43" y se cree ese objeto de la clase xFecha
	   * con esa fecha y hora.
	   */
	  
	  public xFechaHora(String fyh) {
		  
		  //En el String meteríamos "2/4/23 12:43:32"
		  int dia;
		  int mes;
		  int anyo;
		  int hora=0, minuto=0, segundo=0;
	
		  int barra1=fyh.indexOf('/');
		  int barra2=fyh.lastIndexOf('/');
		  int puntos1=fyh.indexOf(':');
		  int puntos2=fyh.lastIndexOf(':');
		  
		  dia=Integer.parseInt(fyh.substring(0, barra1));
		  mes=Integer.parseInt(fyh.substring(barra1+1, barra2));
		  anyo=Integer.parseInt(fyh.substring(barra2+1, barra2+3));
		  hora=Integer.parseInt(fyh.substring(puntos1-2, puntos1));
		  minuto=Integer.parseInt(fyh.substring(puntos1+1, puntos2));
		  segundo=Integer.parseInt(fyh.substring(puntos2+1));

		  this.hora=hora; 
		  this.minuto=minuto;
		  this.segundo=segundo;
		  super.setDia(dia);
		  super.setMes(mes);
		  super.setAnyo(anyo);

	  }
	   /* BORRAR ESTO DESPUES, SON APUNTES Codigo alternativo
	    *
	    *
	    *  int barra1 = f.indexOf('/');
	    *  int barra2 = f.lastIndexOf('/');
	    *
	    *  dia  = Integer.parseInt(f.substring(0,barra1));          // barra1 no inclusive
	    *  mes  = Integer.parseInt(f.substring(barra1+1,barra2));   // barra2 no inclusive
	    *  anio = Integer.parseInt(f.substring(barra2+1));  
	    *
	    */
	  // ...
	  
	  public boolean equals(xFechaHora fh) {

		 xFecha f = fh;
		 if (!super.equals(f)) return false;
	     
	     if (this.hora  == fh.hora && this.minuto  == fh.minuto && this.segundo == fh.segundo) return true;
	     return false;

	  }
	  /*
	  	public FechaHora(String f ) {}
	  	public String toString() {}
	 	public int compareTo (FechaHora f)
	  */
	  
	 public String toString() {
		 return super.getDia()+"/"+super.getMes()+"/"+super.getAnyo()+" "+this.getHora()+
				 ":"+this.getMinuto()+":"+this.getSegundo();
	 }
	 
	 public int compareTo(xFechaHora fyh) {
		  if (this.getAnyo()>fyh.getAnyo()) return  1;
		  if (this.getAnyo()<fyh.getAnyo()) return -1;
		  if (this.getMes()>fyh.getMes())return     1;
		  if (this.getMes()<fyh.getMes()) return   -1;
		  if (this.getDia()>fyh.getDia()) return    1;
		  if (this.getDia()<fyh.getDia()) return   -1;
		  
		  if (this.getHora()>fyh.getHora()) return 1;
		  if (this.getHora()<fyh.getHora()) return -1;
		  if (this.getMinuto()>fyh.getMinuto()) return 1;
		  if (this.getMinuto()<fyh.getMinuto()) return -1;
		  if (this.getSegundo()>fyh.getSegundo()) return 1;
		  if (this.getSegundo()<fyh.getSegundo()) return -1;
		  return 0;
	 }
	 /* BORRAR ESTO DESPUES, SON APUNTES public int compareTo (xFecha y)
	 {
	  if (this.anyo>y.anyo) return  1;
	  if (this.anyo<y.anyo) return -1;
	  if (this.mes>y.mes) return    1;
	  if (this.mes<y.mes) return   -1;
	  if (this.dia>y.dia) return    1;
	  if (this.dia<y.dia) return   -1;
	  return 0;
	 }*/
	 public int getHora() {return hora;}
	 public void setHora(int hora) {this.hora = hora;}
	 public int getMinuto() {return minuto;}
	 public void setMinuto(int minuto) {this.minuto = minuto;}
	 public int getSegundo() {return segundo;}
	 public void setSegundo(int segundo) {this.segundo = segundo;}
	 
	}


//////////////////////////////////////////////////////////////////////////////////////////

class xFecha {
	
	  private int dia;
	  private int mes;
	  private int anyo;

	  public xFecha() {}
	  

	  public xFecha(int d, int m, int a) {
	    dia=d;
	    mes=m;
	    anyo=a;
	  }


	  public xFecha(String f ) {
	 
	   // formatos supuestos (d)d/(m)m/aaaa

	   int i=0;
	   while (f.charAt(i)!='/') i++;
	   int barra1 =i;
	   i++;
	   while (f.charAt(i)!='/') i++;
	   int barra2 =i;

	   dia=0; mes=0; anyo=0;
	   for (i=0;       i<barra1;    i++) dia=dia*10+f.charAt(i)-48;
	   for (i=barra1+1;i<barra2;    i++) mes=mes*10+f.charAt(i)-48;
	   for (i=barra2+1;i<f.length();i++) anyo= anyo*10+f.charAt(i)-48; 

	   /* Codigo alternativo
	    *
	    *
	    *  int barra1 = f.indexOf('/');
	    *  int barra2 = f.lastIndexOf('/');
	    *
	    *  dia  = Integer.parseInt(f.substring(0,barra1));          // barra1 no inclusive
	    *  mes  = Integer.parseInt(f.substring(barra1+1,barra2));   // barra2 no inclusive
	    *  anio = Integer.parseInt(f.substring(barra2+1));  
	    *
	    */
	  }



	 public String toString()
	 {
	   return dia+"/"+mes+"/"+anyo;
	 }


	 public int compareTo (xFecha y)
	 {
	  if (this.anyo>y.anyo) return  1;
	  if (this.anyo<y.anyo) return -1;
	  if (this.mes>y.mes) return    1;
	  if (this.mes<y.mes) return   -1;
	  if (this.dia>y.dia) return    1;
	  if (this.dia<y.dia) return   -1;
	  return 0;
	 }
	 

	 public boolean equals(xFecha otraFecha )
	 {
	    
	    if ( this.dia  == otraFecha.dia    &&
	         this.mes  == otraFecha.mes    &&
	         this.anyo == otraFecha.anyo ) return true;
	    else                               return false;
	 } 


	// m�todos d�as de la semana ******************   

	 public boolean domingo()
	 {
	   int dia;
	   GregorianCalendar fecha=new GregorianCalendar(this.anyo,this.mes-1,this.dia);

	   dia=fecha.get(fecha.DAY_OF_WEEK);/** domingo 1 , lunes 2, .., s�bado 6 **/ 
	   if (dia==1) return true;
	   else        return false;
	 }

	 public boolean sabado()
	 {
	   int dia;
	   GregorianCalendar fecha=new GregorianCalendar(this.anyo,this.mes-1,this.dia);

	   dia=fecha.get(fecha.DAY_OF_WEEK);/** domingo 1 , lunes 2, .., s�bado 7 **/ 
	   if (dia==7) return true;
	   else        return false;
	 }


	// m�todos operativos con fechas ***************


	 public boolean bisiesto()
	 {
	   return ( this.anyo%100!= 0  || this.anyo%400==0 ) && this.anyo%4==0; 
	 }

	 public xFecha siguiente () {
	   int diasMes;
	   xFecha f=new xFecha(); 

	   f.dia=this.dia;
	   f.mes=this.mes;
	   f.anyo=this.anyo;

	   switch (f.mes)
	   {
	     case 4 : diasMes=30;break;
	     case 6 : diasMes=30;break;     
	     case 9 : diasMes=30;break;
	     case 10: diasMes=30;break;

	     case 2 : if (f.bisiesto()) diasMes=29; else diasMes=28; break;

	     default: diasMes=31;
	   }   

	   f.dia++;
	   if (f.dia>diasMes)
	   {
	     f.dia=1;
	     f.mes++;
	     if (f.mes>12) 
	     {
	       f.mes=1;
	       f.anyo++;
	     }
	   }
	   return f;
	 }

	 public xFecha next() {return(this.siguiente());}


	 public int diasHasta(xFecha f){

	   xFecha fMovil = new xFecha();

	   fMovil.dia  = this.dia;
	   fMovil.mes  = this.mes;
	   fMovil.anyo = this.anyo;
	  
	   int contadorDias = -fMovil.dia+1;
	   fMovil.dia = 1;

	   int mesVirtual = fMovil.anyo*12+fMovil.mes;
	   int mesFinal= f.anyo*12+f.mes;


	   while ( mesVirtual != mesFinal)
	   {
	     contadorDias=contadorDias+fMovil.diasdelmes();
	     fMovil.mes=fMovil.mes+1;
	     if ( fMovil.mes == 13 ) { fMovil.mes=1; fMovil.anyo++; }
	     mesVirtual++;
	     // saldr�a lo mismo con... mesVirtual = fMovil.anio*12+fMovil.mes; 
	   }
	   
	   // El algoritmo es m�s r�pido
	   // sumando dias de a�os y controlando a�os bisiestos
	   // H�galo usted as�

	   contadorDias=contadorDias+f.dia-1;

	   return contadorDias;
	 }


	 public int diasdelmes()
	 {
	   int dias;

	   switch (this.mes)
	   {
	    case 2:  dias=28;if (this.bisiesto()) dias++;break;

	    case 4:  dias=30;break;
	    case 6:  dias=30;break;
	    case 9:  dias=30;break;
	    case 11: dias=30;break;

	    default: dias=31;break;
	   }

	   return dias;
	 }
	 
	 // ...

	 public int getDia() {return dia;}
	 public void setDia(int dia) {this.dia=dia;}
	 public int getMes() {return mes;}
	 public void setMes(int mes) {this.mes=mes;}
	 public int getAnyo() {return anyo;}
	 public void setAnyo(int anyo) {this.anyo=anyo;}

	}

