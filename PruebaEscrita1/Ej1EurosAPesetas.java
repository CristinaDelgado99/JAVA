/*
 * Ej1EurosAPesetas.java 
 * Este programa convierte 564.25 euros a pesetas y lo muestra en consola con una salida formateada.
 * @autoria Cristina Delgado Muñoz
 */

public class Ej1EurosAPesetas{
  public static void main(String[]args){
	  double euros;
	  euros = 564.25;
	  
	  double pesetas;
	  pesetas = euros * 166.386;
	  
	  int pesetasInt;
	  pesetasInt = (int) pesetas;
	  
	  System.out.printf("%.2f euros son %1d pesetas.", euros, pesetasInt);	
	
	}	

}
