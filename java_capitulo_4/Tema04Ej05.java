/**
 * Tema 4
 * 5º Resuelve ax + b = 0
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_4;

import java.util.Scanner;

public class Tema04Ej05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce el valor de a: ");
    double a = sc.nextDouble();
    System.out.print("Introduce el valor de b: ");
    double b = sc.nextDouble();

    if (a==0) {
      System.out.println("Esta ecuación no tiene solución.");
    } else {
      System.out.println("x = " + (-b/a));
    }
  }
}
