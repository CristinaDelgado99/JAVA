/*
 * ScannerNotaDeseada.java 
 * Este programa pide la nota que deseas sacar y la que tuviste en el primer examen y calcula la nota que necesitas sacar en el segundo. La nota del primer examen vale el 40% y la del segundo el 60%.
 * @autoria Cristina Delgado Muñoz
 */

import java.util.Scanner;

public class ScannerNotaDeseada{
  public static void main(String[]args){
	  Scanner sc = new Scanner(System.in);
		
	  System.out.println("¿Qué nota sacaste en el primer examen?");
		
	  double nota1;
	  nota1 = sc.nextDouble();
	  
	   System.out.println("¿Qué nota quieres sacar en el trimestre?");
		
	  double notaDeseada;
	  notaDeseada = sc.nextDouble();
	  
	  double nota2;
	  nota2 = (notaDeseada * 100 - nota1 * 40) / 60;
		
	  System.out.printf("Si quieres sacar un %.2f, habiendo sacado un %.2f en el primer examen, necesitas un %.2f en el segundo.", notaDeseada, nota1, nota2);
		
  }	
	
}
