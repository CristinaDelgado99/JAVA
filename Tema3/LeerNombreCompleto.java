/*
 * LeerNombreCompleto.java 
 * Este programa lee por consola el nombre del usuario.
 * @autoria CDM
 */
 
public class LeerNombreCompleto{
	 
	public static void main(String[]args){
		String nombre;
		System.out.println("Por favor, ¿Puedes introducir tu nombre completo?");
		nombre = System.console().readLine();
		
		System.out.printf("Hola, " + nombre + ", ¡Encantada de conocerte!");
	
		
	}

}



