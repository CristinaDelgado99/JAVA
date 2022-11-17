/*
 * CincoCharAString.java
 * Este programa declara 5 variables tipo char, las concatena dentro de una variable tipo String e imprime este String resultante por pantalla
 * @autoria CDM
 */
 
public class CincoCharAString{

	public static void main(String[]args){
	
	char letra1;
	letra1 = 'a';
	char letra2;
	letra2 = 'b';
	char letra3;
	letra3 = 'c';
	char letra4;
	letra4 = 'd';
	char letra5;
	letra5 = 'e';
	
	String cadenaLetras;
	cadenaLetras = "" + letra1 + letra2 + letra3 + letra4 + letra5;
	
	System.out.println(cadenaLetras);
	
	}
	
}



