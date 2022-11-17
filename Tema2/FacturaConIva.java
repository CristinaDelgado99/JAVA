/*
 * FacturaConIva.java
 * Este programa toma la base imponible de una factura y calcula el precio del producto con IVA.
 * @autoria CDM
 */
 
public class FacturaConIva{

	public static void main(String[]args){
	
	double baseImponible;
	baseImponible = 19.99;
	
	double precioIva;
	precioIva = baseImponible * 1.21;
	
	System.out.printf("El precio con IVA de un producto cuya base imponible es %.2f euros es: %.2f euros", baseImponible, precioIva);
	
	}
	
}

