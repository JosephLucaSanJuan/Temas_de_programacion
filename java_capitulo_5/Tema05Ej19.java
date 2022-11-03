/**
 * Tema 5
 * 19º Pinta una pirámide por pantalla.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introudce la altura de la pirámide: ");
    int alt = sc.nextInt();
    System.out.print("Introduce el carácter para crear la pirámide: ");
    String pieza = System.console().readLine();
    int nivel = 1;
    
    while (nivel <= alt) {
      for (int i = 1; i <= alt-nivel; i++) {
        System.out.print(" ");
      }

      for (int i = 1; i < 2*nivel; i++) {
        System.out.print(pieza);
      }
      System.out.println();

      nivel++;
    }
    sc.close();
  }
}
