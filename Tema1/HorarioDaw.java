/*
 * HorarioDaw.java
 * Este programa muestra por pantalla mi horario de clases
 * @autoría CDM
 */
 
public class HorarioDaw{
  public static void main(String[]args){
	  
	System.out.println("                              \033[92mESTE ES EL HORARIO DE DAW TARDE\033[39;49m");
	System.out.println("  Las asignaturas que aparecen son:");
	System.out.println("  FOL: Formación y orientación laboral");
	System.out.println("  BBDD: Bases de datos");
	System.out.println("  SSII: Sistemas informaticos");
	System.out.println("  LLMM: Lenguajes de marcas");
	System.out.println("  PROG: Programación\n");

	System.out.println(" --------------------------------------------------------------------------------");
	System.out.printf("| %-12s | %-10s | %-10s | %-10s | %-10s | %-10s |\n", " ", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes");  
	System.out.println(" --------------------------------------------------------------------------------");
	System.out.printf("| %-12s | %-10s | %-10s | %-10s | %-10s | %-10s |\n", "15:15-16:10", "FOL", "BBDD", "BBDD", "SSII", "LLMM");  
	System.out.println(" --------------------------------------------------------------------------------");
	System.out.printf("| %-12s | %-10s | %-10s | %-10s | %-10s | %-10s |\n", "16:15-17:10 ", "FOL", "BBDD", "BBDD", "SSII", "LLMM");  
	System.out.println(" --------------------------------------------------------------------------------");
	System.out.printf("| %-12s | %-10s | %-10s | %-10s | %-10s | %-10s |\n", "17:15-18:15", "FOL", "PROG", "BBDD", "PROG", "PROG"); 
	System.out.println(" --------------------------------------------------------------------------------");
	System.out.printf("| %-12s | %-10s   %-10s   %-10s   %-10s   %-10s |\n", "18:15-18:30", " ", " ", "RECREO", " ", " "); 
	System.out.println(" --------------------------------------------------------------------------------");
	System.out.printf("| %-12s | %-10s | %-10s | %-10s | %-10s | %-10s |\n", "18:30-19:25", "EEDD", "PROG", "BBDD", "PROG", "PROG"); 
	System.out.println(" --------------------------------------------------------------------------------");
	System.out.printf("| %-12s | %-10s | %-10s | %-10s | %-10s | %-10s |\n", "19:30-20:25", "SSII", "LLMM", "EEDD", "PROG", "SSII"); 
	System.out.println(" --------------------------------------------------------------------------------");
	System.out.printf("| %-12s | %-10s | %-10s | %-10s | %-10s | %-10s |\n", "20:30-21:30", "SSII", "LLMM", "EEDD", "PROG", "SSII"); 
	System.out.println(" --------------------------------------------------------------------------------");
	  
  }  	 
	 
}
