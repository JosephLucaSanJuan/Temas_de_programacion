/**
 * Tema 5
 * 47º Escribe un 8 formado por la letra M.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej47 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la altura: ");
    int alt = sc.nextInt();
    int nivel = 1;
    
    if ((alt>=5) && (alt%2!=0)) {
      for (int i = 0; i < 6; i++) {
        System.out.print("M");
      }
      System.out.println();

      while (nivel<alt/2) {
        System.out.print("M");
        for (int i = 0; i < 4; i++) {
          System.out.print(" ");
        }
        System.out.print("M");
        System.out.println();
        nivel++;
      }

      for (int i = 0; i < 6; i++) {
        System.out.print("M");
      }
      System.out.println();

      while (nivel<alt-2) {
        System.out.print("M");
        for (int i = 0; i < 4; i++) {
          System.out.print(" ");
        }
        System.out.print("M");
        System.out.println();
        nivel++;
      }

      for (int i = 0; i < 6; i++) {
        System.out.print("M");
      }
    } else {
      System.out.print("Esa no es una altura válida");
    }
    sc.close();
  }
}
