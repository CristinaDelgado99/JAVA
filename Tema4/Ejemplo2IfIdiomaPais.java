/*
 * Ejemplo2IfIdiomaPais.java 
 * Este programa utiliza una condicional simple para comprobar si tu respuesta a una pregunta es correcta o no.
 * @autoria Cristina Delgado Muñoz
 */

import java.util.Scanner;

public class Ejemplo2IfIdiomaPais{
  public static void main(String[]args){
	Scanner sc = new Scanner(System.in);  
	  
	System.out.println("¿Cuál es el idioma oficial de Japón?");
	
	String respuesta;
	respuesta = sc.next();
	respuesta = respuesta.toLowerCase();
	
	if(respuesta.equals("japones")){
	  System.out.println("¡Enhorabuena, tu respuesta es correcta!");
	} else {
	  System.out.println("Lo siento, esa no es la respuesta correcta");
	}
		
  }


}
