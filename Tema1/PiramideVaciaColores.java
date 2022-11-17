/*
 * PiramideVaciaColores.java
 * Este programa muestra por pantalla una pirámide de asteriscos que está vacía y que tiene cada línea de un color.
 * @autoría CDM
 */

public class PiramideVaciaColores{
	
  public static void main(String[]args){

  String rojo;
	rojo = "\033[91m";
	String blanco;
	blanco = "\033[39;49m";
	String cian;
	cian = "\033[96m";
	String verde;
	verde = "\033[92m";
	String amarillo;
	amarillo = "\033[93m";
	String morado;
	morado = "\033[95m";
	  
	  System.out.println(rojo +"     *     ");
	  System.out.println(cian +"    * *    ");
	  System.out.println(verde +"   *   *   ");
	  System.out.println(amarillo +"  *     *  ");
	  System.out.println(morado +" ********* "+ blanco);
	  
  }	
	
	
}

