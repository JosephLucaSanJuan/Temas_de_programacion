/**
 * Tema 10
 * 3º Crea un ArrayList, añade 6 nombrrs y muéstralos.
 * 
 * @author Joseph Luca San Juan Thompson
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tema10Ej03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> numeros = new ArrayList<Integer>();

    int arrayLength = 10;

    for (int i = 0; i < arrayLength; i++) {
      try {
        System.out.print("Introduce un número: ");
        int valor = sc.nextInt();
        numeros.add(valor);
      } catch (Exception e) {
        // TODO: handle exception
      }
    }

    System.out.println("Array sin ordenar:");
    System.out.println(numeros);
    Collections.sort(numeros);
    System.out.println("Array ordenado: ");
    System.out.println(numeros);
    sc.close();
  }
}
