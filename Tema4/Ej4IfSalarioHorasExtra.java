/*
 * Ej4IfSalarioHorasExtra.java 
 * Este programa pregunta al usuario cuántas horas al día trabaja y cuántos días a la semana y calcula su salario semanal. Si trabaja 40 o menos horas, su salario por hora es 12; si trabaja más de 40 horas, las horas extras tienen un salario de 16.
 * @autoria Cristina Delgado Muñoz
 */

import java.util.Scanner;

public class Ej4IfSalarioHorasExtra{

  public static void main(String[]args){
	
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("A continuación, vamos a calcular tu salario semanal");
	  System.out.println("¿Cuántas horas trabajas al día?");
	  
	  int horasDia;
	  horasDia = sc.nextInt();
	  
	  System.out.println("¿Cuántos días trabajas a la semana?");
	  
	  int diasSemana;
	  diasSemana = sc.nextInt();
	  
	  int horasSemana;
	  horasSemana = horasDia * diasSemana;
	  
	  int salarioSemana;
	  int horasExtra;
	  
	  if(horasSemana <= 40){
		salarioSemana = horasSemana * 12;
      } else {
	    horasExtra = horasSemana - 40;
	    salarioSemana = (40 * 12) + (horasExtra * 16);
	  }
	  
	  System.out.printf("En una semana, trabajando %d días, %d horas al día, cobrarás %d euros. El total de horas que trabajas es de %d horas.", diasSemana, horasDia, salarioSemana, horasSemana);
	 
		
	}

}
