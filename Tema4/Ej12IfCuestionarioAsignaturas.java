/*
 * Ej12IfCuestionarioAsignaturas.java 
 * Este programa es un cuestionario sobre asignaturas de DAM. si el usuario responde de forma correcta, se le añade un punto a su nota. Tiene 10 preguntas.
 * @autoría CDM
 */
 
import java.util.Scanner;

public class Ej12IfCuestionarioAsignaturas{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    String verde;
    verde = "\u001B[32m";
    
    String rojo;
    rojo = "\u001B[31m";
    
    String blanco;
    blanco = "\u001B[37m";
    
    //pregunta 1
    
    System.out.println("Vamos a realizar un cuestionario con preguntas de 1º de DAW.\nAl final de cada pregunta, escribe \"a\", \"b\" o \"c\"");
    System.out.println("  1. ¿Qué es DDR?");
    System.out.println("\ta) Un tipo de procesador.");
    System.out.println("\tb) Un tipo de memoria.");
    System.out.println("\tc) Un tipo de tarjeta gráfica.");
    System.out.println("\td) a y b son correctas.");
    System.out.print("   Tu respuesta es: ");
    
    String respuesta;
    respuesta = sc.next();
    respuesta = respuesta.toLowerCase();
    
    int nota;
    nota = 0;
    
    if (respuesta.equals("b")){
	  System.out.println("   Muy bien," + verde +" ¡Has acertado!" + blanco);
	  nota++;
	} else {
	  System.out.println("   Lo siento, tu respuesta "+ rojo +"es errónea" + blanco);	
	}
	
	//pregunta 2

    System.out.println("  2. ¿Qué es un monitor?");
    System.out.println("\ta) Un dispositivo software.");
    System.out.println("\tb) Un dispositivo de entrada y salida.");
    System.out.println("\tc) Un dispositivo de entrada.");
    System.out.println("\td) Un dispositivo de salida.");
    System.out.print("   Tu respuesta es: ");
    respuesta = sc.next();
    respuesta = respuesta.toLowerCase();
    
    
    if (respuesta.equals("d")){
	  System.out.println("   Muy bien," + verde +" ¡Has acertado!" + blanco);
	  nota++;
	} else {
	  System.out.println("   Lo siento, tu respuesta "+ rojo +"es errónea" + blanco);	
	}
	
	//pregunta 3

    System.out.println("  3. ¿Cuál es la ley de prevención de riesgos laborales?");
    System.out.println("\ta) LPRL 31/95.");
    System.out.println("\tb) LPRL 31/91.");
    System.out.println("\tc) LPRL 89/95.");
    System.out.println("\td) LPRL 33/97.");
    System.out.print("   Tu respuesta es: ");
    
    respuesta = sc.next();
    respuesta = respuesta.toLowerCase();
    
    
    if (respuesta.equals("a")){
	  System.out.println("   Muy bien," + verde +" ¡Has acertado!" + blanco);
	  nota++;
	} else {
	  System.out.println("   Lo siento, tu respuesta "+ rojo +"es errónea" + blanco);	
	}
	
	//pregunta 4

    System.out.println("  4. ¿Qué es un IDE?");
    System.out.println("\ta) Entorno de desastre integrado.");
    System.out.println("\tb) Entorno de desarrollo integrado.");
    System.out.println("\tc) Entorno de desastre interesante.");
    System.out.println("\td) Entorno de desarrollo de interpretaciones.");
    System.out.print("   Tu respuesta es: ");
    
    respuesta = sc.next();
    respuesta = respuesta.toLowerCase();
    
    
    if (respuesta.equals("b")){
	  System.out.println("   Muy bien," + verde +" ¡Has acertado!" + blanco);
	  nota++;
	} else {
	  System.out.println("   Lo siento, tu respuesta "+ rojo +"es errónea" + blanco);	
	}
	
	//pregunta 5

    System.out.println("  5. ¿Qué es una constante?");
    System.out.println("\ta) Un objeto que en java se expresa como final tipo (int, String...).");
    System.out.println("\tb) Una relación entre dos tipos.");
    System.out.println("\tc) Un objeto cuyo valor no va a cambiar en el desarrollo del código.");
    System.out.println("\td) a y c son correctas.");
    System.out.print("   Tu respuesta es: ");
    
    respuesta = sc.next();
    respuesta = respuesta.toLowerCase();
    
    
    if (respuesta.equals("d")){
	  System.out.println("   Muy bien," + verde +" ¡Has acertado!" + blanco);
	  nota++;
	} else {
	  System.out.println("   Lo siento, tu respuesta "+ rojo +"es errónea" + blanco);	
	}
	
	//pregunta 6

    System.out.println("  6. ¿Qué es un algoritmo?");
    System.out.println("\ta) Un lenguaje de programación.");
    System.out.println("\tb) La documentación de cómo se ha hecho un programa.");
    System.out.println("\tc) Una serie ordenada de pasos finitos que resuelven un problema.");
    System.out.println("\td) Un tipo de pseudocódigo.");
    System.out.print("   Tu respuesta es: ");
    
    respuesta = sc.next();
    respuesta = respuesta.toLowerCase();
    
    
    if (respuesta.equals("c")){
	  System.out.println("   Muy bien," + verde +" ¡Has acertado!" + blanco);
	  nota++;
	} else {
	  System.out.println("   Lo siento, tu respuesta "+ rojo +"es errónea" + blanco);	
	}
	
	//pregunta 7

    System.out.println("  7. ¿Qué es la Programación Orientada a Objetos?");
    System.out.println("\ta) Un lenguaje de programación.");
    System.out.println("\tb) Un estilo de programación que se desarrolla por medio de bloques que se arrastran juntos.");
    System.out.println("\tc) Un estilo de programación que organiza el diseño de software en torno a objetos.");
    System.out.println("\td) Un tipo de IDE.");
    System.out.print("   Tu respuesta es: ");
    
    respuesta = sc.next();
    respuesta = respuesta.toLowerCase();
    
    
    if (respuesta.equals("c")){
	  System.out.println("   Muy bien," + verde +" ¡Has acertado!" + blanco);
	  nota++;
	} else {
	  System.out.println("   Lo siento, tu respuesta "+ rojo +"es errónea" + blanco);	
	}
	
	//pregunta 8

    System.out.println("  8. ¿Qué es la vRAM?");
    System.out.println("\ta) Vertical RAM.");
    System.out.println("\tb) RAM del GPU.");
    System.out.println("\tc) RAM veloz.");
    System.out.println("\td) RAM volatil.");
    System.out.print("   Tu respuesta es: ");
    
    respuesta = sc.next();
    respuesta = respuesta.toLowerCase();
    
    
    if (respuesta.equals("b")){
	  System.out.println("   Muy bien," + verde +" ¡Has acertado!" + blanco);
	  nota++;
	} else {
	  System.out.println("   Lo siento, tu respuesta "+ rojo +"es errónea" + blanco);	
	}
	
	//pregunta 9

    System.out.println("  9. ¿Para qué sirve la etiqueta <p><\\p> en HTML?");
    System.out.println("\ta) Para crear un parpadeo de luz.");
    System.out.println("\tb) Para crear un paquete.");
    System.out.println("\tc) Para crear un párrafo.");
    System.out.println("\td) Para crear un encabezado.");
    System.out.print("   Tu respuesta es: ");
    
    respuesta = sc.next();
    respuesta = respuesta.toLowerCase();
    
    
    if (respuesta.equals("c")){
	  System.out.println("   Muy bien," + verde +" ¡Has acertado!" + blanco);
	  nota++;
	} else {
	  System.out.println("   Lo siento, tu respuesta "+ rojo +"es errónea" + blanco);	
	}
	
	//pregunta 10

    System.out.println("  10. ¿Para qué se utiliza el atributo 'color' en CSS?");
    System.out.println("\ta) Para cambiar el color del texto.");
    System.out.println("\tb) Para cambiar el color del fondo.");
    System.out.println("\tc) Para cambiar los colores de una imagen.");
    System.out.println("\td) Para cambiar el color de un borde.");
    System.out.print("   Tu respuesta es: ");
    
    respuesta = sc.next();
    respuesta = respuesta.toLowerCase();
    
    
    if (respuesta.equals("a")){
	  System.out.println("   Muy bien," + verde +" ¡Has acertado!" + blanco);
	  nota++;
	} else {
	  System.out.println("   Lo siento, tu respuesta "+ rojo +"es errónea" + blanco);	
	}
	
	System.out.println("Tu nota ha sido: " + nota);
	
	if(nota <5 ){
	  System.out.println("Lo siento, "+rojo+"has suspendido."+blanco+" Debes estudiar más.");	
	} else {
	  System.out.println("Enhorabuena,"+verde+" has aprobado." +blanco);
	}
	
	

  }	

}
