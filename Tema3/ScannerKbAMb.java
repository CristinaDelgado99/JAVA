/*
 * ScannerKbAMb.java 
 * Este programa pide una cantidad de Kilobytes al usuario y muestra por consola cuántos Megabytes son.
 * @autoria Cristina Delgado Muñoz
 */

import java.util.Scanner;

public class ScannerKbAMb{
  public static void main(String[]args){
	  Scanner sc = new Scanner(System.in);
		
	  System.out.println("¿Cuántos Megabytes quieres convertir en Kilobytes?");
		
	  double kb;
	  kb = sc.nextDouble();
		
	  double vKb;
	  vKb = 1024;
		
	  double mb;
	  mb = kb / vKb;
		
	  System.out.printf("%.2f Kilobytes son: %.2f Megabytes.", kb, mb);
		
  }	
	
}
