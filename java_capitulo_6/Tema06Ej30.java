/**
 * Tema06
 * 30º Dibuja una pecera para Roberto.
 * Incluye un pez(&), una caraacola(@) y un caballito de mar($).
 * 
 * @author Joseph Luca san Juan Thomspson
 */
package java_capitulo_6;

import java.util.Scanner;

public class Tema06Ej30 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la altura de la pecera (mínimo 4): ");
    int alto = sc.nextInt();
    System.out.print("Ahora introduce la anchura (mínimo 4): ");
    int ancho = sc.nextInt();
    int nivel = 0;
    int pez;
    int caracola;
    int caballitoMar;
    
    do {
      pez = (int)(Math.random()*(ancho-2)*(alto-2));
      caracola = (int)(Math.random()*(ancho-2)*(alto-2));
      caballitoMar = (int)(Math.random()*(ancho-2)*(alto-2));
    } while (pez==caracola || pez==caballitoMar || caracola==caballitoMar);
    
    for (int i = 0; i < ancho; i++) {
      System.out.print("* ");
    }
    System.out.println();

    for (int j = 0; j < alto-2; j++) {
      System.out.print("* ");
      for (int i = 0; i < ancho-2; i++) {
        if (nivel==pez) {
          System.out.print("& ");
        } else if (nivel==caracola) {
          System.out.print("@ ");
        } else if (nivel==caballitoMar) {
          System.out.print("$ ");
        } else {
          System.out.print("  ");
        }
        nivel++;
      }
      System.out.println("*");
    }

    for (int i = 0; i < ancho; i++) {
      System.out.print("* ");
    }
    System.out.println();
    sc.close();
  }
}
