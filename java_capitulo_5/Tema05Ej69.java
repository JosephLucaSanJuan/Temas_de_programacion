/**
 * Tema 5
 * 69º Dibuja una pirámide maya.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej69 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la altura de la pirámide: ");
    int alt = sc.nextInt();
    int altura = 0;

    if (alt<3) {
      System.out.println("La altura introducida no es válida.");
    } else {
      while (altura<alt) {
        for (int i = 0; i < alt-(altura+1); i++) {
          System.out.print(" ");
        }

        if (altura%2!=0) {
          for (int i = 0; i < 2+(altura-1); i++) {
            System.out.print("*");
          }
          System.out.print("    ");
          for (int i = 0; i < 2+(altura-1); i++) {
            System.out.print("*");
          }
          System.out.println();
        } else {
          if (altura<1) {
            System.out.println("******");
          } else {
            for (int i = 0; i < 6+2*altura; i++) {
              System.out.print("*");
            }
            System.out.println();
          }
        }
        altura++;
      }
    }
    sc.close();
  }
}
