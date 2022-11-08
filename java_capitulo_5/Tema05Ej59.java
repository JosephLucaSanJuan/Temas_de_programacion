/**
 * Tema 5
 * 59º Pinta un árbol de Navidad.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej59 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la altura del árbol: ");
    int alt = sc.nextInt();
    int nivel = 0;

    if (alt<4) {
      System.out.println("Lo siento, esa no es una altura válida.");
    } else {
      for (int i = 0; i < (alt-3); i++) {
        System.out.print(" ");
      }
      System.out.println("*");
      
      while (nivel<alt-3) {
        for (int i = 0; i < (alt-3)-nivel; i++) {
          System.out.print(" ");
        }

        System.out.print("^");
        for (int i = 0; i < 2*nivel-1; i++) {
          System.out.print(" ");
        }

        if (nivel>0) {
          System.out.print("^");
        }
        System.out.println();

        nivel++;
      }

      for (int i = 0; i <= 2*nivel; i++) {
        System.out.print("^");
      }
      System.out.println();

      for (int i = 0; i < (alt-3); i++) {
        System.out.print(" ");
      }
      System.out.println("Y");
    }
    sc.close();
  }
}
