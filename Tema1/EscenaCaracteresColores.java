/*
 * EscenaCaracteresColores.java
 * Este programa enseña una escena que ha sido creada con caracteres y además tiene colores.
 * @autoría CDM
 */

public class EscenaCaracteresColores{
					
  public static void main (String[]args){

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
  String amarilloOscuro;
	amarilloOscuro = "\033[33m";

  System.out.println("Nota: Estos símbolos: "+negro+"|\\ "+blanco+"representan notas musicales.");
	System.out.println("                   "+negro+"  @                                "+blanco);
	System.out.println("Desgraciadamente, no he sido capaz de añadir unicode porque mi consola no lo lee.\n");
	
	System.out.println("  "+negro+"   ±     "+cian+"    **                *"); 
	System.out.println(" "+rojo+"   / \\   "+cian+"    ****     *        ***    ");  
	System.out.println(" "+rojo+"  /"+azul+" o "+rojo+"\\    "+cian+"          ***                      * ");    
	System.out.println(" "+rojo+" /"+amarillo+"-----"+rojo+"\\  "+cian+"                  **               ***");  
	System.out.println(" "+amarillo+" |"+negro+"#"+rojo+" [] "+amarillo+"|  "+cian+"                 **** " );  
	System.out.println(verde+"----------------------------------"+negro+"|\\"+verde+"--------------------");  
	System.out.println("   "+blanco+" * "+rojo+" *          "+negro+"  |\\ "+amarillo+" ___   "+negro+"   @   "+amarilloOscuro+"    °"+verde);
	System.out.println("     \\/ "+amarilloOscuro+" °  "+negro+"       @  "+amarillo+" ("+blanco+"^"+rojo+"o"+blanco+"^"+amarillo+")            "+morado+"   * "+azul+" *");  
	System.out.println("          "+amarilloOscuro+"    °   "+morado+"   --"+amarillo+"/"+rojo+"|_|"+amarillo+"\\"+morado+"--   "+amarilloOscuro+"     ° "+verde+"    \\/");  
	System.out.println("     "+rojo+"    * "+morado+" *       /  "+azul+" / \\ "+morado+"  \\"+verde);  
	System.out.println("          \\/   "+morado+"    /           \\     "+blanco+"  * "+amarilloOscuro+" *"+morado);   
	System.out.println("                  /_____________\\   "+verde+"    \\/");  
	System.out.println("-------------------------------------------------------"+blanco); 
  }
	
}

