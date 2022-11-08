/**
 * Tema 5
 * 56º Pinta un triángulo relleno de asteriscos.
 * 
 * 57º Repite el ejercicio anterior pero esta vez el triángulo es hueco.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej56y57 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la altura del triángulo: ");
    int alt = sc.nextInt();
    int nivel = 0;

    /*while (nivel<alt) {
      for (int i = 0; i < nivel; i++) {
        System.out.print(" ");
      }
      for (int i = 0; i < alt-nivel; i++) {
        System.out.print("*");
      }
      System.out.println();
      nivel++;
    }*/

    for (int i = 0; i < alt; i++) {
      System.out.print("*");
    }
    System.out.println();
    while (nivel<alt-1) {
      for (int i = 0; i <= nivel; i++) {
        System.out.print(" ");
      }

      System.out.print("*");
      for (int i = 0; i < alt-(nivel+3); i++) {
        System.out.print(" ");
      }

      if (nivel<alt-2) {
        System.out.println("*");
      }
      nivel++;
    }
    sc.close();
  }
}
