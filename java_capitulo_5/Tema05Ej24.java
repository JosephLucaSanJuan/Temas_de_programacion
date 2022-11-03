/**
 * Tema 5
 * 24º Crea una pirámide formada por números capicúa.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej24 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la altura de la pirámide: ");
    int alt = sc.nextInt();
    int filas = 1;

    while (filas <= alt) {
      for (int i = 1; i <= alt-filas; i++) {
        System.out.print(" ");
      }

      for (int i = 1; i <= filas; i++) {
        System.out.print(i);
      }

      for (int i = filas-1; i > 0; i--) {
        System.out.print(i);
      }/**/
      
      System.out.println();
      filas++;
    }
    sc.close();
  }
}
