/**
 * Tema 5
 * 66º Dibuja una flecha doble.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej66 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la altura de las flechas: ");
    int alt = sc.nextInt();
    int nivel = 0;

    if ((alt>3) && (alt%2!=0)) {
      while (nivel < alt/2+1) {
        for (int i = 0; i < nivel; i++) {
          System.out.print(" ");
        }
        System.out.println("*    *");
        nivel++;
      }

      while (nivel>1) {
        for (int i = 0; i < nivel-2; i++) {
          System.out.print(" ");
        }
        System.out.println("*    *");
        nivel--;
      }
    } else {
      System.out.println("La altura no es correcta. Debe ser un impar mayor que 3.");
    }
    sc.close();
  }
}
