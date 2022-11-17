public class MultiplicacionNumerosLeidos{

	public static void main(String[]args){
	
	String linea;
	
	System.out.println("A continuación, vamos a realizar una multiplicación con los dos números que usted elija");
	System.out.println("Introduzca el primer número, por favor");
	linea = System.console().readLine();
	int numero1;
	numero1 = Integer.parseInt(linea);
	
	System.out.println("Introduzca el primer número, por favor");
	linea = System.console().readLine();
	int numero2;
	numero2 = Integer.parseInt(linea);
	
	System.out.println("El primer número que ha introducido es el " + numero1 + ", el segundo es el " + numero2);
	int mult;
	mult = numero1 * numero2;
	
	System.out.println(numero1 + " * " + numero2 + " = " + mult);
	
	}
	
}
