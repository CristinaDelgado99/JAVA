/*
 * EuroAPeseta.java 
 * Este programa convierte una cantidad de euros, almacenada en una variable, a pesetas
 * @autoria CDM
 */
 
public class EuroAPeseta{
	 
	public static void main(String[]args){
		
	/*	Opción 1: dejo las pesetas como double pero imprimo la variable por pantalla con printf (formateada) y utilizo %.0f, indicando que no quiero que se imprima la parte decimal
	 * 
	 * 	  double euros;
	 *		euros = 10.5;
	 *
	 *		double pesetas;
	 *		pesetas = euros * 166.3860;
	 *
	 *		System.out.printf("%.2f euros son %.0f pesetas", euros, pesetas); 
	 */
	 
	// Opción 2: Realizo un casting para convertir el tipo de la variable "pesetas", que es double, a int.
	
		double euros;
		euros = 10.50;
		
		double pesetas;
		pesetas = euros * 166.386;
		
		int pesetasInt;
		pesetasInt = (int) pesetas;
		
		System.out.println(euros + " euros son " + pesetasInt + " pesetas");
	

	
	
		
	}

}
