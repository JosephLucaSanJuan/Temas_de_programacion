/**
 * Tema08
 * 
 * 45º Crea una función para escribir una figura basándote en la altura
 * 
 * @author Joseph Luca San Juan Thompson
 */

import java.util.Scanner;

public class Tema08Ej45 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la altura de la figura: ");
    int alt = sc.nextInt();
    figura(alt);
    sc.close();
  }

  private static void figura(int alt) {
    int repeticiones = 0;
    char dollar = '*';
    int espacios = 2*alt-2;

    do {
      for (int i = 0; i < repeticiones+1; i++) {
        System.out.print(dollar);
      }

      for (int i = 0; i < espacios; i++) {
        System.out.print(" ");
      }

      if (repeticiones == alt-1) {
        for (int i = 0; i < repeticiones; i++) {
          System.out.print(dollar);
        }
      } else {
        for (int i = 0; i <= repeticiones; i++) {
          System.out.print(dollar);
        }
      }
      System.out.println();
      repeticiones++;
      espacios-=2;
    } while (repeticiones < alt);
  }
}
