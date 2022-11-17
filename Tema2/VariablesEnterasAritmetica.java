/*
 * VariablesEnterasAritmetica.java 
 * Este programa realiza la suma, resta, multiplicación y división entre dos números enteros, siendo estos 144 y 999
 * @autoria CDM
 */

public class VariablesEnterasAritmetica{
	public static void main(String[]args){
		int x;
		x = 144;

		int y;
		y = 999;

		int suma;
		suma = x + y;
		int resta;
		resta = x - y;
		int mult;
		mult = x * y;
		int div;
		div = y / x;

		System.out.println("Los números enteros con los que vamos a hacer operaciones aritméticas son " + x + " y " + y );
		System.out.println(x + " + " + y + " = " + suma);
    System.out.println(x + " - " + y + " = " + resta);
		System.out.println(x + " * " + y + " = " + mult);
		System.out.println(y + " / " + x + " = " + div + "\n");
		System.out.println("Nota: todos los resultados están representados como números enteros, sin decimales.");
	}


}
