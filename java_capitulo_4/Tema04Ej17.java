/**
 * Tema 4
 * 17º Cuál es la última cifra de un número.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_4;

import java.util.Scanner;

public class Tema04Ej17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int n = sc.nextInt();

    System.out.printf("La última cifra del número es %d.", (n%10));
    sc.close();
  }
}
