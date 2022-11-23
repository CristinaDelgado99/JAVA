/*
 * Ej8IfNotaBoletin.java 
 * Este programa calcula la nota media de 3 notas introducidas por el usuario y escribe por consola la nota que aparecerá en el boletín.
 * @autoría CDM
 */
 
import java.util.Scanner;

public class Ej8IfNotaBoletin{
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
	
	System.out.printf("La nota media de las tres notas es %.2f.\n", media);
	
	if(media >= 0 && media < 5){
	  System.out.println("Has sacado: Insuficiente");	
	} else if(media >= 5 && media < 6){
	  System.out.println("Has sacado: Suficiente");	
	} else if(media >= 6 && media < 7){
	  System.out.println("Has sacado: Bien");
	} else if(media >= 7 && media < 9){
	  System.out.println("Has sacado: Notable");
	} else if(media >= 9 && media <= 10){
	  System.out.println("Has sacado: Sobresaliente");
	}

  }	

}

