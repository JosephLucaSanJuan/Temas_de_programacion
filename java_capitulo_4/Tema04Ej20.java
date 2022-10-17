/**
 * Tema 4
 * 20º Averigua si el número introducido es capicúa.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_4;

import java.util.Scanner;

public class Tema04Ej20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número (hasta 5 cifras): ");
    int n = sc.nextInt();

    if ((n>=0) && (n < 10)) {
      System.out.println(n + " es capicúa.");
    } else if ((n >= 10) && (n < 100) && (n/10==n%10)) {
      System.out.println(n + " es capicúa");
    } else if ((n >= 100) && (n < 1000) && (n/100==n%100)) {
      System.out.println(n + " es capicúa");
    } else if ((n >= 1000) && (n < 10000) && ((n/100)%10==(n%100)/10)) {
      System.out.println(n + " es capicúa");
    } else if ((n >= 10000) && (n < 10000) && ((n/1000)%10==(n%100)/10)) {
      System.out.println(n + " es capicúa");
    } else {
      System.out.println(n + " no es capicúa.");
    }
  }
}
