/**
 * Tema 5
 * 67º Dibuja unos escalones con asteriscos.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej67 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce cuántos escalones quieres que haya: ");
    int numEsc = sc.nextInt();
    System.out.print("Introduce la altura de cada escalon: ");
    int altEsc = sc.nextInt();
    int nivel = 0;
    int longEsc = 4;

    while (nivel < numEsc) {
      for (int i = 0; i < altEsc; i++) {
        for (int j = 0; j < longEsc*(nivel+1); j++) {
          System.out.print("*");
        }
        System.out.println();
      }
      nivel++;
    }
    sc.close();
  }
}
