/**
 * Tema 5
 * 60º Dibuja un par de calcetines.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej60 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la altura de los calcetines: ");
    int alt = sc.nextInt();

    if (alt<4) {
      System.out.print("Esa no es una altura válida.");
    } else {
      for (int i = 0; i < alt-2; i++) {
        System.out.println("***     ***");
      }
  
      for (int i = 0; i < 2; i++) {
        System.out.println("******  ******");
      }
    }
    sc.close();
  }
}
