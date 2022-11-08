/**
 * Tema 5
 * 61º Dibuja una V.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej61 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("introduce la altura de la V: ");
    int alt = sc.nextInt();
    int altura=0;
    int espacios = 2*alt-2;

    if (alt<3) {
      System.out.println("Lo siento, esa no es una altura válida.");
    } else {
      while (altura<alt) {
        for (int i = 0; i < altura; i++) {
          System.out.print(" ");
        }
        System.out.print("***");
        for (int i = 0; i < espacios-2*altura; i++) {
          System.out.print(" ");
        }
        System.out.print("***");
        System.out.println();
        altura++;
      }
    }
    sc.close();
  }
}
