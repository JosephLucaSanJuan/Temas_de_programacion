/**
 * Tema 5
 * 64º Dibuja un rectángulo y modifícalo.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej64 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcion = 0;
    int alt = 3;
    int anch = 6;

    while (opcion!=4) {
      for (int i = 0; i < anch; i++) {
        System.out.print("*");
      }
      System.out.println();
      
      for (int index = 0; index < alt-2; index++) {
        System.out.print("*");
        for (int i = 0; i < anch-2; i++) {
          System.out.print(" ");
        }
        System.out.println("*");
      }
      
      for (int i = 0; i < anch; i++) {
        System.out.print("*");
      }
      System.out.println();

      System.out.println("1. Agrandarlo\n2. Achicarlo\n3. Cambiar la orientación\n4. Salir");
      System.out.print("Indica que quieres hacer con el rectángulo: ");
      opcion = sc.nextInt();
      
      switch (opcion) {
        case 1:
          alt++;
          anch++;
          break;
        case 2:
          if ((alt > 2) && (anch < 2)) {
            alt--;
            anch--;
          } else {
            System.out.println("\nEl rectángulo no se puede achicar más.");
          }
          break;
        case 3:
        int alter = anch;
          anch = alt;
          alt = alter;
          break;
        default:
          break;
      }
    }
    sc.close();
  }
}
