/**
 * Tema06
 * 17º Crea una programa tragaperras.
 * 
 * @author Joseph Luca san Juan Thomspson
 */
package java_capitulo_6;

import java.util.Scanner;

public class Tema06Ej17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la altura de la pecera (mínimo 4): ");
    int alto = sc.nextInt();
    System.out.print("Introduce la anchura de la pecera (mínimo 4): ");
    int ancho = sc.nextInt();
    int pez = 0;

    for (int i = 0; i < ancho; i++) {
      System.out.print("*");
    }
    System.out.println();

    for (int i = 0; i < alto-2; i++) {
      System.out.print("*");
      for (int j = 0; j < ancho-2; j++) {
        pez = (int)(Math.random()*(ancho-2));
        if (i==pez) {
          System.out.print("&");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println("*");
    }

    for (int i = 0; i < ancho; i++) {
      System.out.print("*");
    }
  }
}
