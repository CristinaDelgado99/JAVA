public class PruebaLeerTeclado{

 public static void main(String[]args){
	String nombre;
	
	System.out.println("Escribe tu nombre a continuación, por favor");
	
	nombre = System.console().readLine();
	System.out.println("Hola, " + nombre + ", ¡Encantada de conocerte!");
	
	String numero1;
	String numero2;
	
	System.out.println("Por favor, escribe un número");
	numero1 = System.console().readLine();
	System.out.println("Por favor, escribe otro número");
	numero2 = System.console().readLine();
	
	int numero1Int;
	numero1Int = Integer.parseInt(numero1);
	int numero2Int;
	numero2Int = Integer.parseInt(numero2);
	
	int suma;
	suma = numero1Int + numero2Int;
	
	System.out.println("El resultado de sumar " + numero1Int + " y " + numero2Int + " es: " + suma);
	
	}	
	
}
