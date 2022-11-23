/*
 * Ej5IfEcuacionPrimerGrado.java 
 * Este programa calcula el resultado de una ecuación de primer grado. Si a vale cero, le dice al usuario que no tiene solucion real.
 * @autoria Cristina Delgado Muñoz
 */

import java.util.Scanner;

public class Ej5IfEcuacionPrimerGrado{	
  public static void main(String[]args){
	
	Scanner sc = new Scanner(System.in);
	  
	System.out.println("A continuación, vamos a calcular el resultado de una ecuación de grado uno (ax + b = 0)");
	System.out.println("¿Cuánto vale a?");
	  
	double a;
	a = sc.nextDouble();
	  
	System.out.println("¿Cuánto vale b?");
	  
	double b;
	b = sc.nextDouble();
	  
	double x;
	
	if(a == 0){
	  if(b == 0){
		System.out.printf("Lo siento, la ecuación \"%.0fx + %.0f = 0\" no tiene solución real.", a, b);
	  } else if(b > 0) {
		System.out.printf("Lo siento, la ecuación \"%.0fx + %.2f = 0\" no tiene solución real.", a, b);			
	  } else {
	    System.out.printf("Lo siento, la ecuación \"%.0fx + (%.2f) = 0\" no tiene solución real.", a, b);
	  }
	} else {
	  x = -b/a;
	  if (b == 0){
		  System.out.printf("%.2fx + %.0f = 0;\n", a, b);
	      System.out.printf("x = %.0f/%.2f;\n", b, a);
	      System.out.print("x = 0;");
	  } else if (b > 0) {
		  System.out.printf("%.2fx + %.2f = 0;\n", a, b);
		  System.out.printf("x = -%.2f/%.2f;\n", b, a);
		  System.out.printf("x = %.2f;", x);
      } else {
		  System.out.printf("%.2fx %.2f = 0;\n", a, b);
	      System.out.printf("x = %.2f/%.2f;\n", b * (-1), a);
		  System.out.printf("x = %.2f;", x);
	  }

	} 
	
  }
}
	  

	 
		


