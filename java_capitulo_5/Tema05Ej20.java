/**
 * Tema 5
 * 20º Pinta una pirámide hueca.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la altura: ");
    int alt = sc.nextInt();
    System.out.print("Introduce el carácter para construir al pirámide: ");
    String pieza = System.console().readLine();
    int nivel = 1;
    int interior = 0;

    while (nivel < alt) {
      for (int i = 1; i <= alt-nivel; i++) {
        System.out.print(" ");
      }

      System.out.print(pieza);
      for (int i = 1; i < interior; i++) {
        System.out.print(" ");
      }

      if (nivel > 1) {
        System.out.print(pieza);
      }
      System.out.println();

      nivel++;
      interior+=2;
    }

    for (int i = 1; i < alt*2; i++) {
      System.out.print(pieza);
    }
    sc.close();
  }
}
