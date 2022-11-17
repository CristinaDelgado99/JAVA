/*
 * CodigoParseintComentado.java 
 * Este código pide dos números al, los pasa a tipo int y realiza una operación con ellos. Está comentado todo el proceso paso a paso.  
 * @autoria CDM
 * 
 */

public class CodigoParseintComentado{
	public static void main(String[]args){
	
	String linea; //declaro una variable llamada linea, de tipo String, que más adelante almacenará los datos leidos en consola.
	
	System.out.println("Por favor, introduce un número"); //Pido al usuario que introduzca un número con el método 'println()'
	linea = System.console().readLine(); //Introduzco en la variable 'linea' el dato (tipo String) introducido por el usuario.
	int primerNumero; //declaro una variable llamada 'primerNumero', de tipo int.
	primerNumero = Integer.parseInt(linea); //Introduzco el valor de la variable 'linea' en la variable 'primerNumero' cambiando el tipo de valor de String a int con el método 'parseInt()' 
	
	System.out.println("Introduce otro, por favor"); //Pido al usuario que introduzca otro número con el método 'println()'
	linea = System.console().readLine(); //Introduzco en la variable 'linea' el dato (tipo String) introducido por el usuario.
	int segundoNumero; //declaro una variable llamada 'segundoNumero', de tipo int.
	segundoNumero = Integer.parseInt(linea); //Introduzco el valor de la variable 'linea' en la variable 'segundoNumero' cambiando el tipo de valor de String a int con el método 'parseInt()' 
	
	int total; //declaro una variable llamada total, de tipo int, que más adelante almacenará una operación que contiene los dos int declarados previamente.
	total = (2 * primerNumero) + segundoNumero; //Realizo una operación multiplicando por 2 el valor de primerNumero y sumando el valor del segundoNumero al resultado de esta multiplicación. Almaceno el dato resultante en la variable de tipo int 'total'
	/*
	 * Las siguientes líneas, imprimen por pantalla, en primer lugar, los números que han sido introducidos (primera y segunda línea) y más adelante el resultado del 
	 * total. Cabe destacar que, mientras que en las líneas 1, 3 y 4 se utiliza el método 'print()', en la línea 2 se utiliza el método 'println()' porque 
	 * se quiere realizar un salto de línea 
	 */
	System.out.print("El primer número introducido es " + primerNumero);
	System.out.println(" y el segundo es " + segundoNumero); 
	System.out.print("El doble del primer número más el segundo es ");
	System.out.print(total);
	}
	
}
