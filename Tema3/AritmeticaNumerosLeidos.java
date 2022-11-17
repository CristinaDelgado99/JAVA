/*
 * AritmeticaNumerosLeidos.java
 * Este programa pide al usuario unos números, los lee por consola, y realiza una suma, una resta, una multiplicación y una división con ellos.
 * @autoria CDM
 * 
 */

public class AritmeticaNumerosLeidos{
	
  public static void main(String[]args){
	
    String linea;
	
    System.out.println("A continuación, vamos a realizar unas cuantas operaciones aritméticas con los números que introduzca.");
    System.out.println("Por favor, introduzca el primer número");
    linea = System.console().readLine();
	
    int num1;
    num1 = Integer.parseInt(linea);
	
    System.out.println("Por favor, introduzca el segundo número");
    linea = System.console().readLine();
	
    int num2;
    num2 = Integer.parseInt(linea);
		
    System.out.println("Los números que ha introducido son " + num1 + " y " + num2);
		
    int suma;
    suma = num1 + num2;
    int resta;
    resta = num1 - num2;
    int mult;
    mult = num1 * num2;
    double div;
    div = (double) num1 / (double) num2;
		
    System.out.println(num1 + " + " + num2 + " = " + suma);
    System.out.println(num1 + " - " + num2 + " = " + resta);
    System.out.println(num1 + " * " + num2 + " = " + mult);
    System.out.printf("%1d / %1d = %.2f", num1, num2, div);
	
	
  }	
	
}
