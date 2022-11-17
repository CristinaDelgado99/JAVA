/*
 * PesetaAEuroLeido.java 
 * Este programa convierte una cantidad de pesetas,  leida por consola, a euros
 * @autoria CDM
 */
 
public class PesetaAEuroLeido{
	 
	public static void main(String[]args){
		String linea;
		System.out.println("Escribe una cantidad de pesetas para pasarlas a euros.");
		linea = System.console().readLine();
		
		int pesetas;
		pesetas = Integer.parseInt(linea);
		
		double euros;
		euros = (double) pesetas * 0.0060;
		
		System.out.printf("%d pesetas son %.2f euros", pesetas, euros);
	
		
	}

}


