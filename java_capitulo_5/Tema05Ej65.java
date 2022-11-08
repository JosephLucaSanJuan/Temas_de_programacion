/**
 * Tema 5
 * 65º Dibuja la letra A.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej65 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nivel = 0;
    System.out.print("Introduce la altura de la A (mayor o igual que 3): ");
    int alt = sc.nextInt();

    if (alt>=3) {
      System.out.print("Introduce la altura del palo horizontal (entre 2 y "+(alt-1)+"): ");
      int altPal = sc.nextInt();

      if ((altPal>1)&&(altPal<alt)) {
        while (nivel<alt) {
          for (int i = 0; i < alt-nivel; i++) {
            System.out.print(" ");
          }
          nivel++;
          
          if ((nivel<altPal) || (nivel>altPal)) {
            System.out.print("*");
            for (int i = 0; i < 2*nivel-3; i++) {
              System.out.print(" ");
            }
            if (nivel>1) {
              System.out.print("*");
            }
            System.out.println();
          } else if (nivel==altPal) {
            for (int i = 0; i < 2*nivel-1; i++) {
              System.out.print("*");
            }
            System.out.println();
          }
        }
      } else {
        System.out.println("La fila introducida no es correcta.");
      }
    } else {
      System.out.println("Lo siento, esa no es una altura válida.");
    }
    sc.close();
  }
}