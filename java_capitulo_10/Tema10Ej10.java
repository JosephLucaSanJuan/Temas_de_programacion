/**
 * Tema 10
 * 10º Crea un HashMap con 10 palabras y su traducción
 *     Introducirás la palabra en español y te dará la traducción
 * 
 * @author Joseph Luca San Juan Thompson
 */
import java.util.HashMap;
import java.util.Scanner;

public class Tema10Ej10 {
  public static void main(String[] args) {
    HashMap<String, String> diccionario = new HashMap<String, String>();
    Scanner sc = new Scanner(System.in);
    boolean salir = false;

    diccionario.put("tiburon", "shark");
    diccionario.put("serpiente", "snake");
    diccionario.put("cocina", "kitchen");
    diccionario.put("guerra", "war");
    diccionario.put("dia", "day");
    diccionario.put("medianoche", "midnight");
    diccionario.put("manzana", "apple");
    diccionario.put("rojo", "red");
    diccionario.put("bruja", "witch");
    diccionario.put("dinosaurio", "dinosaur");
    diccionario.put("libro", "book");
    diccionario.put("ordenador", "computer");
    diccionario.put("azul", "blue");
    diccionario.put("verde", "green");
    diccionario.put("loro", "parrot");
    diccionario.put("melocoton", "peach");
    diccionario.put("trabajo", "work");
    diccionario.put("dios", "god");
    diccionario.put("casa", "house");
    diccionario.put("coche", "car");

    do {
      System.out.print("\nIntroduce una palabra: ");
      String palabra = sc.nextLine();

      if (diccionario.containsKey(palabra)) {
        System.out.format("Traducción: %s\n", diccionario.get(palabra));
      } else if (palabra.equals("")) {
        salir = true;
      } else {
        System.out.println("Lo siento esa palabra no esta almacenada");
      }
    } while (!salir);
    sc.close();
  }
}
