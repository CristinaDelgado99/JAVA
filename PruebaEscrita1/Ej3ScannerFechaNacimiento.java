/*
 * Ej3ScannerFechaNacimiento.java 
 * Este programa pide al usuario su fecha de nacimiento, separada en 3 variables (año, mes y día), y la imprime por consola en una sola línea.
 * @autoria Cristina Delgado Muñoz
 */

import java.util.Scanner;

public class Ej3ScannerFechaNacimiento{
  public static void main(String[]args){
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("¿En qué año naciste?");
	  
	  int anio;
	  anio = sc.nextInt();
	  
	  System.out.println("¿En qué mes naciste?");
	  
	  String mes;
	  mes = System.console().readLine();
	  
	  /*
	   * Si quisiera hacerse con Scanner, se haría lo siguiente (pero mi consola no lo realiza):
	   * String mes;
	   * mes = sc.nextLine();
	   */
	  
	  System.out.println("¿Qué día naciste?");
	  
	  int dia;
	  dia = sc.nextInt();
	  
	  System.out.println("Mi fecha de nacimiento es: " + dia + " de " + mes + " de " + anio + ".");
	  
	  
	}	

}

