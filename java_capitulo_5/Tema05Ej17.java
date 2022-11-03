/**
 * Tema 5
 * 17º Suma los 100 sigueintes números.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número positivo: ");
    int n = sc.nextInt();
    int suma = 0;

    if (n<0) {
      System.out.println("Ese número no es positivo.");
    } else {
      for (int i = n; i <= n+100; i++) {
        suma += i;
        System.out.print(i+" + ");
      }
    }
    System.out.println("= "+suma);
    sc.close();
  }
}
