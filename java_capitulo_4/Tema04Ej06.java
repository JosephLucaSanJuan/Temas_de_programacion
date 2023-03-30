/**
 * Tema 4
 * 6º Calcula el tiempo en el que tarda caer un objeto de una altura.
 * 
 * @author Joseph Luca San Juan Thompson
 * 
 * Ejercicios que hacer: 2, 3, 5, 6, 8, 9, 11, 13, 15, 16, 17, 18, 20, 21, 22, 24, 27, 28
 */

package java_capitulo_4;

import java.util.Scanner;

public class Tema04Ej06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la altura: ");
    float h = sc.nextFloat();
    float g = 9.8f;
    
    if (h >= 0) {
      System.out.printf("El objeto tarda %.2f en caer.", Math.sqrt(2*h/g));
    } else {
      System.out.println("No es posible indicar una altura.");
    }
    sc.close();
  }
}
