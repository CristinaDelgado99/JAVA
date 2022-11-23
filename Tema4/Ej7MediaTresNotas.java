/*
 * Ej7MediaTresNotas.java 
 * Este programa calcula la nota media de 3 notas introducidas por el usuario.
 * @autoría CDM
 */
 
import java.util.Scanner;

public class Ej7MediaTresNotas{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Vamos a calcular la media de 3 notas.");
    System.out.println("¿Cuál fue la primera nota?");  
	
	double nota1;
	nota1 = sc.nextDouble();
	
	System.out.println("¿Cuál fue la segunda nota?");  
	
	double nota2;
	nota2 = sc.nextDouble();
	
	System.out.println("¿Cuál fue la tercera nota?"); 
	
	double nota3;
	nota3 = sc.nextDouble(); 
	
	double media;
	media = (nota1 + nota2 + nota3)/3;
	
	System.out.printf("La nota media de las tres notas es %.2f.", media);
  }	



}
