/**
 * Tema07
 * 14º Escribe un array de palabras y muestra los colores primero.
 * 
 * @author Joseph Luca san Juan Thomspson
 */
package java_capitulo_7.arrays_unidimensionales;

import java.util.Scanner;

public class Tema07Ej14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] colores = {"rojo", "azul", "amarillo", "verde", "morado", "naranja", "rosa", "blanco", "negro"};
    String[] palabras = new String[8];
    String[] color = new String[8];
    String[] loDemas = new String[8];
    int cuentaColores = 0;
    int resto = 0;
;
    System.out.println("Introduce ocho palabras:");
    for (int i = 0; i < 8; i++) {
      palabras[i] = sc.nextLine();
      for (String c : colores) {
        if (palabras[i].equals(c)) {
          color[cuentaColores++] = c;
        }
      }
    }

    for (int i = 0; i < 8; i++) {
      boolean esColor = false;
      for (String c : colores) {
        if (palabras[i].equals(c)) {
          esColor = true;
        }
      }
      if (!esColor) {
        loDemas[resto++] = palabras[i];
      }
    }

    System.out.println("Array original:");
    System.out.println("┌─────────┬─────────┬─────────┬─────────┬─────────┬─────────┬─────────┬─────────┐");
    System.out.print("|");
    for (int i = 0; i < 8; i++) {
      System.out.printf("    %d    |", i);
    }
    System.out.print("\n├─────────┼─────────┼─────────┼─────────┼─────────┼─────────┼─────────┼─────────┤\n|");
    for (int i = 0; i < 8; i++) {
      System.out.printf("%-9s|", palabras[i]);
    }
    System.out.println("\n└─────────┴─────────┴─────────┴─────────┴─────────┴─────────┴─────────┴─────────┘");


    System.out.println("\nArray nuevo:");
    System.out.println("┌─────────┬─────────┬─────────┬─────────┬─────────┬─────────┬─────────┬─────────┐");
    System.out.print("|");
    for (int i = 0; i < 8; i++) {
      System.out.printf("    %d    |", i);
    }
    System.out.print("\n├─────────┼─────────┼─────────┼─────────┼─────────┼─────────┼─────────┼─────────┤\n|");
    for (int i = 0; i < cuentaColores; i++) {
      System.out.printf("%-9s|",color[i]);
    }
    for (int i = 0; i < resto; i++) {
      System.out.printf("%-9s|", loDemas[i]);
    }
    System.out.println("\n└─────────┴─────────┴─────────┴─────────┴─────────┴─────────┴─────────┴─────────┘");
    sc.close();
  }
}
