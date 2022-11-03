/**
 * Tema 5
 * 38º Crea un reloj de arena hecho de asteriscos.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej38 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la altura del reloj: ");
    int alt = sc.nextInt();
    int nivel = 0;

    if ((alt>=3) && (alt%2!=0)) {
      while (alt/2 > nivel) {
        for (int i = 1; i <= nivel; i++) {
          System.out.print(" ");
        }

        for (int i = 1; i <= alt-2*nivel; i++) {
          System.out.print("*");
        }
        System.out.println();
        nivel++;
      }

      for (int i = 0; i < nivel; i++) {
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println();

      while (nivel > 0) {
        for (int i = 0; i < nivel-1; i++) {
          System.out.print(" ");
        }

        for (int i = 0; i <= alt-(2*nivel-1); i++) {
          System.out.print("*");
        }
        System.out.println();
        nivel--;
      }
    } else {
      System.out.println("Lo siento, esa no es una altura válida");
    }
    sc.close();
  }
}
