/*
 * Ej2IfSaludoHoras.java 
 * Este programa pregunta la hora al usuario y le saluda de forma diferente 
 * @autoria Cristina Delgado Muñoz
 */

import java.util.Scanner;

public class Ej2IfSaludoHoras{
  public static void main(String[]args){
	Scanner sc = new Scanner(System.in);  
	  
	System.out.println("Introduce la hora que es (Sin minutos)");
	
	int hora;
	hora = sc.nextInt();
	
	if(0 <= hora && hora <= 5){
	  System.out.println("Buenas noches");
	} else if(6 <= hora && hora <= 12){
	  System.out.println("Buenos días");
	} else if(13 <= hora && hora <= 20) {
	  System.out.println("Buenas tardes");
	} else if(21 <= hora && hora <=23){
	  System.out.println("Buenas noches");
    } else {
	  System.out.println("Esa no es una hora válida");
	}
		
  }


}
