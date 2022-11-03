/**
 * Tema 5
 * 16º Di si un número es primo o no.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int n = sc.nextInt();
    int cont = 0;
    //int div = 0;

    for (int i = 2; i <= n/2; i++) {
      //div = n/i;
      if (n%i == 0) {
        cont++;
      }
    }

    if (cont == 0) {
      System.out.println("El "+n+" es primo.");
    } else {
      System.out.println("El "+n+" no es primo");
    }
    sc.close();
  }
}
