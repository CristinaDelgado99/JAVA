/*
 * AreaTrianguloLeerTeclado.java
 * Este programa pide al usuario la altura y la base de un triángulo, lo lee por teclado y calcula su área.
 * @autoria CDM
 * 
 */

public class AreaTrianguloLeerTeclado{

  public static void main(String[]args){
	
    String linea;
		
    System.out.println("¿Cuál es la altura de tu triángulo?");
    linea = System.console().readLine();
		
    int altura;
    altura = Integer.parseInt(linea);
		
    System.out.println("¿Cuál es la base de tu triángulo?");
    linea = System.console().readLine();
		
    int base;
    base = Integer.parseInt(linea);
		
    int area;
    area = (base * altura) / 2;
		
    System.out.println("El área de tu triángulo, de " + altura + "cm de altura y " + base + "cm de base es: " + area + "cm.");
		
	
  }
	
}
