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
    int div = 0;

    if (n >= 10) {
      for (int i = 0; i <= 10; i++) {
        
      }
    } else {
      System.out.println("La última cifra del número es " + n);
    }
  }
}
