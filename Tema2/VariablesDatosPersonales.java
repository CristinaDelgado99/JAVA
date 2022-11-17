/*
 * VariablesDatosPersonales
 * Este programa muestra por pantalla mis datos personales, los cuales estaban almacenados en variables.
 * @autoria CDM
 */
 
public class VariablesDatosPersonales{

	public static void main(String[]args){
		
		String cian;
		cian = "\033[96m";
		String blanco;
		blanco = "\033[39;49m";
		
		String nombre;
		nombre = "Cristina Delgado Muñoz";
		
		String direccion1;
		direccion1 = "Avenida inventada";
		String direccion2;
		direccion2 = "Num. 64";
		String direccion3;
		direccion3 = "Bloque 3";
		String direccion4;
		direccion4 = "2ºA";
		
		int telefono;
		telefono = 677777777;
		
		System.out.println(cian + "MIS DATOS PERSONALES SON:" + blanco);
		System.out.printf("%-10s %-20s \n", "Nombre:" , nombre);
		System.out.printf("%-10s %-15s \n%-10s %-15s \n%-10s %-15s \n%-10s %-15s \n", "Dirección:", direccion1, " " , direccion2, " ", direccion3, " ", direccion4);
		System.out.printf("%-10s %-10d", "Teléfono:" , telefono);
	
	
	}

}
