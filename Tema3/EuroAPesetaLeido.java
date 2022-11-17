/*
 * EuroAPesetaLeido.java 
 * Este programa convierte una cantidad de euros, leida por consola, a pesetas
 * @autoria CDM
 */
 
public class EuroAPesetaLeido{
	 
	public static void main(String[]args){
		
		String linea;
		System.out.println("Por favor, indica la cantidad de euros que quieres pasar a pesetas. Debes escribirlo con el formato: x.yy (Poniendo un punto entre la parte entera y la decimal)");
		linea = System.console().readLine();
		
		double euros;
		euros = Double.parseDouble(linea);
	
		double pesetas;
		pesetas = euros * 166.386;
		
		int pesetasInt;
		pesetasInt = (int) pesetas;
		
		System.out.println(euros + " euros son " + pesetasInt + " pesetas");
		
	}

}
