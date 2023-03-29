/**
 * Tema 10
 * 3º Crea un ArrayList, añade 6 nombrrs y muéstralos.
 * 
 * @author Joseph Luca San Juan Thompson
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tema10Ej04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> palabras = new ArrayList<String>();

    int arrayLength = 10;

    for (int i = 0; i < arrayLength; i++) {
      try {
        System.out.print("Introduce una palabra: ");
        String palabra = sc.nextLine();
        palabras.add(palabra);
      } catch (Exception e) {
        // TODO: handle exception
      }
    }

    System.out.println("Array sin ordenar:");
    System.out.println(palabras);
    Collections.sort(palabras);
    System.out.println("Array ordenado: ");
    System.out.println(palabras);
    sc.close();
  }
}
