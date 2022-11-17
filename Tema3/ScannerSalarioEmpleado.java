/*
 * ScannerSalarioEmpleado.java 
 * Este programa pregunta al usuario cuántas horas al día trabaja y cuántos días a la semana y calcula su salario semanal.
 * @autoria Cristina Delgado Muñoz
 */

import java.util.Scanner;

public class ScannerSalarioEmpleado{

  public static void main(String[]args){
	
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("A continuación, vamos a calcular tu salario semanal");
	  System.out.println("¿Cuántas horas trabajas al día?");
	  
	  double horasDia;
	  horasDia = sc.nextDouble();
	  
	  System.out.println("¿Cuántos días trabajas a la semana?");
	  
	  double diasSemana;
	  diasSemana = sc.nextDouble();
	  
	  double salarioSemana;
	  salarioSemana = horasDia * diasSemana * 12;
	  
	  System.out.printf("En una semana, trabajando %.0f días, %.1f horas al día, cobrarás %.2f euros", diasSemana, horasDia, salarioSemana);
	 
		
	}

}
