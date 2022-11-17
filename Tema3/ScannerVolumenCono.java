/*
 * ScannerVolumenCono.java 
 * Este programa calcula el volumen de un cono a partir de la altura y el radio que inserta el usuario.
 * @autoria Cristina Delgado Muñoz
 */

import java.util.Scanner;

public class ScannerVolumenCono{
  public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		final double pi;
		pi = 3.14;
		
	  System.out.println("A continuación, vamos a calcular el volúmen de un cono.");
	  System.out.println("¿Cuál es la altura del cono?");
	  
	  double altura;
	  altura = sc.nextDouble();
	  
	  System.out.println("¿Cuál es el radio de la base del cono?");
	  
	  double radio;
	  radio = sc.nextDouble();
	  
	  double volumen;
	  volumen =pi * radio * radio * altura/3;
	  
	  System.out.printf("El volumen de un cono de %.2fcm de altura y %.2fcm de radio es: %.2fcm3", altura, radio, volumen);
	  
		
  }	
	
}
