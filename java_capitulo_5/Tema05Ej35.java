/**
 * Tema 5
 * 35º Crea una X hecha de asteriscos.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej35 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la altura de la X: ");
    int alt = sc.nextInt();

    int interior = alt-2;
    int nivel = 0;

    if ((alt >= 3) && (alt%2!=0)) {

      while (alt/2 > nivel) {
        for (int i = 1; i <= nivel; i++) {
          System.out.print(" ");
        }/**/

        System.out.print("*");
        for (int i = 1; i <= interior; i++) {
          System.out.print(" ");
        }
        System.out.print("*");
        
        System.out.println();

        nivel++;
        interior-=2;
      }
      //System.out.println(nivel);

      for (int i = 0; i < nivel; i++) {
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println();

      interior=0;
      while (0 < nivel) {
        for (int i = 0; i < nivel-1; i++) {
          System.out.print(" ");
        }

        System.out.print("*");
        for (int i = 0; i <= interior; i++) {
          System.out.print(" ");
        }
        System.out.print("*");

        System.out.println();

        nivel--;
        interior+=2;
      }
    } else {
      System.out.println("Esa no es una altura válida.");
    }
    sc.close();
  }
}
