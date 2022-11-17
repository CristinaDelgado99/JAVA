/*
 * ScannerMbAKb.java 
 * Este programa pide una cantidad de Megabytes al usuario y muestra por consola cuántos Kilobytes son.
 * @autoria Cristina Delgado Muñoz
 */

import java.util.Scanner;

public class ScannerMbAKb{
  public static void main(String[]args){
	  Scanner sc = new Scanner(System.in);
		
	  System.out.println("¿Cuántos Megabytes quieres convertir en Kilobytes?");
		
	  double mb;
	  mb = sc.nextDouble();
		
	  double vKb;
	  vKb = 1024;
		
	  double kb;
	  kb = mb * vKb;
		
	  System.out.println(mb + " Megabytes son: " + kb + " Kilobytes.");
		
  }	
	
}

