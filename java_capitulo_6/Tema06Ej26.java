/**
 * Tema06
 * 26º Dibuja una tableta de turrón con un mordisco.
 * 
 * @author Joseph Luca san Juan Thomspson
 */
package java_capitulo_6;

import java.util.Scanner;

public class Tema06Ej26 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la anchura de la tableta: ");
    int ancho = sc.nextInt();
    System.out.print("Introduce la altura de la tableta: ");
    int alto = sc.nextInt();
    int linea = 0;
    int mordisco = (int)(Math.random()*(ancho*2+(alto-2)*2));

    for (int j = 0; j < alto; j++) {
      
      for (int i = 0; i < ancho; i++) {
        boolean Borde = (j==0 || j==alto-1 || i==0 || i==ancho-1);

        if (linea==mordisco && Borde) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }

        if (Borde) {
          linea++;
        }
      }
      System.out.println();
    }
    sc.close();
  }
}
