/*
 * HorarioDawColores.java
 * Este programa muestra por pantalla mi horario de clases, mostrando cada asignatura de un color....
 * @autoría CDM
 */
 
public class HorarioDawColores{
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
	String negro;
	negro = "\033[90m";
	String azul;
	azul= "\033[94m";
	
	System.out.println("                              "+verde+"ESTE ES EL HORARIO DE DAW TARDE"+blanco);
	System.out.println("  Las asignaturas que aparecen son:");
	System.out.println("  "+morado+"FOL:"+blanco+" Formación y orientación laboral");
	System.out.println("  "+negro+"BBDD:"+blanco+" Bases de datos");
	System.out.println("  "+amarillo+"SSII:"+blanco+" Sistemas informáticos");
	System.out.println("  "+azul+"LLMM:"+blanco+" Lenguajes de marcas");
	System.out.println("  "+cian+"PROG:"+blanco+" Programación\n");
	
	System.out.println(" --------------------------------------------------------------------------------");
	System.out.printf("| %-12s |"+rojo+" %-10s"+blanco+" |"+rojo+" %-10s"+blanco+" |"+rojo+" %-10s"+blanco+" |"+rojo+" %-10s "+blanco+"|"+rojo+" %-10s "+blanco+"|\n", " ", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes");  
	System.out.println(" --------------------------------------------------------------------------------");
	System.out.printf("|"+rojo+" %-12s "+blanco+"|"+morado+" %-10s "+blanco+"|"+negro+" %-10s "+blanco+"|"+negro+" %-10s "+blanco+"|"+amarillo+" %-10s "+blanco+"|"+azul+" %-10s "+blanco+"|\n", "15:15-16:10", "FOL", "BBDD", "BBDD", "SSII", "LLMM");  
	System.out.println(" --------------------------------------------------------------------------------");
	System.out.printf("|"+rojo+" %-12s "+blanco+"|"+morado+" %-10s "+blanco+"|"+negro+" %-10s "+blanco+"|"+negro+" %-10s "+blanco+"|"+amarillo+" %-10s "+blanco+"|"+azul+" %-10s "+blanco+"|\n", "16:15-17:10 ", "FOL", "BBDD", "BBDD", "SSII", "LLMM");  
	System.out.println(" --------------------------------------------------------------------------------");
	System.out.printf("|"+rojo+" %-12s "+blanco+"|"+morado+" %-10s "+blanco+"|"+cian+" %-10s "+blanco+"|"+negro+" %-10s "+blanco+"|"+cian+" %-10s "+blanco+"|"+cian+" %-10s "+blanco+"|\n", "17:15-18:15", "FOL", "PROG", "BBDD", "PROG", "PROG"); 
	System.out.println(" --------------------------------------------------------------------------------");
	System.out.printf("|"+rojo+" %-12s "+blanco+"| %-10s   %-10s   %-10s   %-10s   %-10s "+blanco+"|\n", "18:15-18:30", " ", " ", "RECREO", " ", " "); 
	System.out.println(" --------------------------------------------------------------------------------");
	System.out.printf("|"+rojo+" %-12s "+blanco+"|"+verde+" %-10s "+blanco+"|"+cian+" %-10s "+blanco+"|"+negro+" %-10s "+blanco+"|"+cian+" %-10s "+blanco+"|"+cian+" %-10s "+blanco+"|\n", "18:30-19:25", "EEDD", "PROG", "BBDD", "PROG", "PROG"); 
	System.out.println(" --------------------------------------------------------------------------------");
	System.out.printf("|"+rojo+" %-12s "+blanco+"|"+amarillo+" %-10s "+blanco+"| "+azul+"%-10s "+blanco+"|"+verde+" %-10s "+blanco+"|"+cian+" %-10s "+blanco+"|"+amarillo+" %-10s "+blanco+"|\n", "19:30-20:25", "SSII", "LLMM", "EEDD", "PROG", "SSII"); 
	System.out.println(" --------------------------------------------------------------------------------");
	System.out.printf("|"+rojo+" %-12s "+blanco+"|"+amarillo+" %-10s "+blanco+"| "+azul+"%-10s "+blanco+"| "+verde+"%-10s "+blanco+"|"+cian+" %-10s "+blanco+"|"+amarillo+" %-10s "+blanco+"|\n", "20:30-21:30", "SSII", "LLMM", "EEDD", "PROG", "SSII"); 
	System.out.println(" --------------------------------------------------------------------------------");
	  
  }  	 
	 
}

