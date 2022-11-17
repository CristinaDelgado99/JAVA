/*
 * AreaRectanguloLeerTeclado.java
 * Este programa pide al usuario la altura y la base de un rectángulo, lo lee por teclado y calcula su área.
 * @autoria CDM
 * 
 */

public class AreaRectanguloLeerTeclado{

  public static void main(String[]args){
	
    String linea;
		
    System.out.println("¿Cuál es la altura de tu rectángulo?");
    linea = System.console().readLine();
		
    int altura;
    altura = Integer.parseInt(linea);
		
    System.out.println("¿Cuál es la base de tu rectángulo?");
    linea = System.console().readLine();
		
    int base;
    base = Integer.parseInt(linea);
		
    int area;
    area = base * altura;
		
    System.out.println("El área de tu rectángulo, de " + altura + "cm de altura y " + base + "cm de base es: " + area + "cm.");
		
  }
	
}
