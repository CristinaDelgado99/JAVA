/*
 * FacturaConIvaLeido.java
 * Este programa pide al usuario la base imponible de una factura y calcula el precio del producto con IVA.
 * @autoria CDM
 */
 
public class FacturaConIvaLeido{

  public static void main(String[]args){
		
    String linea;
		
    System.out.println("¿Cuál es la base imponible de su producto?");
    linea = System.console().readLine();
		
    double baseImponible;
    baseImponible = Double.parseDouble(linea);
	
    double precioIva;
    precioIva = baseImponible * 1.21;
	
    System.out.printf("El precio con IVA de un producto cuya base imponible es %.2f euros es: %.2f euros", baseImponible, precioIva);
	
  }
	
}
