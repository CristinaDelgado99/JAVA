/*
 * Ej9IfEcuacionSegundoGrado.java 
 * Este programada la solución a una ecuación de segundo grado pidiendo al usuario los valores de a, b y c.
 * @autoría CDM
 */
 
import java.util.Scanner;
import java.lang.Math;

public class Ej9IfEcuacionSegundoGrado{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Vamos a calcular la solución de una ecuación de segundo grado, con la forma: \"ax^2 + bx + c = 0\".");
    System.out.println("¿Cuánto vale a?");  
	
	double a;
	a = sc.nextDouble();
	
	System.out.println("¿Cuánto vale b?");  
	
	double b;
	b = sc.nextDouble();
	
	System.out.println("¿Cuánto vale c?"); 
	
	double c;
	c = sc.nextDouble(); 
	
	double resultado1;
	
	double resultado2;
	
	double raizCuadrada;
	
	double dentroRaiz;
	dentroRaiz =(b * b)-(4* a * c);
	
	if(a == 0){
	 
	  if(b == 0){
	    System.out.println("Lo siento, esta ecuación no puede resolverse porque a = 0 y b = 0.");
	  } else {
		System.out.println("Al ser a = 0, esta ecuación no es de segundo grado, sino de primer grado.");
	    resultado1 = (-c)/b;
	    System.out.printf("Para la ecuación \"%.2fx + %.2f = 0\", el resultado es:\nx = %.2f", b, c, resultado1);
	  }
	} else {
	  if(dentroRaiz < 0){
	    System.out.printf("Lo siento, \"%.2fx^2 + %.2fx + %.2f = 0\" no tiene solución", a, b, c);
	  } else if (dentroRaiz > 0){
	    System.out.printf("Los resultados de \"%.2fx^2 + %.2fx + %.2f = 0\" son:\n", a, b, c);
	    raizCuadrada = Math.sqrt(dentroRaiz);
	    resultado1 = (-b + raizCuadrada)/(2 * a);
	    resultado2 = (-b - raizCuadrada)/(2 * a);
	    System.out.printf("x1 = %.2f;\n", resultado1);
	    System.out.printf("x2 = %.2f;", resultado2);
	  } else {
	    System.out.printf("Los resultados de \"%.2fx^2 + %.2fx + %.2f = 0\" son:\n", a, b, c);
	    resultado1 = (-b)/(2 * a);
	    System.out.printf("x1 = %.2f;\n", resultado1);
	    System.out.printf("x2 = %.2f;\n", resultado1);
	  }
	}

  }	

}
