/**
 * Tema06
 * 21º Dibuja una serpiente.
 * 
 * @author Joseph Luca san Juan Thomspson
 */
package java_capitulo_6;

import java.util.Scanner;

public class Tema06Ej22 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la longitud de la sepriente: ");
    int longSerpent = sc.nextInt();
    int x = 13;

    System.out.println("            @");
    for (int i = 0; i < longSerpent-1; i++) {
      x += (int)(Math.random()*3-1);
      for (int j = 0; j < x-1; j++) {
        System.out.print(" ");
      }
      System.out.println("*");
    }
    sc.close();
  }
}
