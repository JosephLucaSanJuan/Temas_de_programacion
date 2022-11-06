/**
 * Tema 5
 * 46º Escribe un rectángulo hueco hecho por asteriscos.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej46 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la anchura del rectángulo (min. 2): ");
    int anch = sc.nextInt();
    System.out.print("Ahora introduce la altura (min. 2): ");
    int alt = sc.nextInt();
    int planta = 1;

    if ((alt>=2) && (anch>=2)) {
      for (int i = 0; i < anch; i++) {
        System.out.print("*");
      }
      System.out.println();

      while (planta<alt-1) {
        System.out.print("*");
        for (int i = 1; i < anch-1; i++) {
          System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
        planta++;
      }

      for (int i = 0; i < anch; i++) {
        System.out.print("*");
      }
    } else {
      System.out.print("Lo siento, los datos introducidos no son correctos.");
    }
    sc.close();
  }
}
