/*
 * Ej4ScannerNombreEdad.java 
 * Este programa pide al usuario su nombre y su edad y los muestra por consola.
 * @autoria Cristina Delgado Muñoz
 */
 
import java.util.Scanner;

public class Ej4ScannerNombreEdad{
  public static void main(String[]args){
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("¿Cómo te llamas?");
	  
	  String nombre;
	  nombre = System.console().readLine();
	  
	  /*
	   * Si quisiera hacerse con Scanner, se haría lo siguiente (pero mi consola no lo realiza):
	   * String nombre;
	   * nombre = sc.nextLine();
	   */
	  
	  System.out.println("¿Cuántos años tienes?");
	  
	  int edad;
	  edad = sc.nextInt();
	  
	  System.out.println("Mi nombre es: " + nombre + " y tengo " + edad + " años.");
	  
	  
	}	

}

