/*
 * Ej13IfOrden3Int.java 
 * Este programa pide 3 números al usuario y los ordena de menor a mayor.
 * @autoría CDM
 */
 
import java.util.Scanner;

public class Ej13IfOrden3Int{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Vamos a ordenar los 3 números enteros que usted desee de menor a mayor.");
    System.out.println("Inserte el primer número");
    
    int num1;
    num1 = sc.nextInt();
    
    System.out.println("Inserte el segundo número");
    
    int num2;
    num2 = sc.nextInt();
    
    System.out.println("Inserte el tercer número");
    
    int num3;
    num3 = sc.nextInt();
    
    if(num1 < num2 && num1 < num3){
	  if(num2 < num3){
		System.out.println("Los números introducidos, en orden, son: " + num1 + ", " + num2 + ", " + num3 + ".");  
	  } else {
	    System.out.println("Los números introducidos, en orden, son: " + num1 + ", " + num3 + ", " + num2 + ".");
	  }
	} else if(num2 < num1 && num2 < num3){
	  if(num1 < num3){
        System.out.println("Los números introducidos, en orden, son: " + num2 + ", " + num1 + ", " + num3 + ".");
      } else {
	    System.out.println("Los números introducidos, en orden, son: " + num2 + ", " + num3 + ", " + num1 + ".");
	  }
	} else {
	  if(num1 < num2){
	    System.out.println("Los números introducidos, en orden, son: " + num3 + ", " + num1 + ", " + num2 + ".");
	  } else {
		System.out.println("Los números introducidos, en orden, son: " + num3 + ", " + num2 + ", " + num1 + ".");  
	  }
	}

  }	

}
