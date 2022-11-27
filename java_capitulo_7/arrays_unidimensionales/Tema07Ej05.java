/**
 * Tema07
 * 5º Escribe un 10 números y señala el máximo y el mínimo.
 * 
 * @author Joseph Luca san Juan Thomspson
 */
package java_capitulo_7.arrays_unidimensionales;

import java.util.Scanner;

public class Tema07Ej05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n[] = new int[10];
    int valorMax = Integer.MIN_VALUE;
    int valorMin = Integer.MAX_VALUE;

    System.out.print("Introduce los números del array: ");
    for (int i = 0; i < 10; i++) {
      n[i] = sc.nextInt();
      if (n[i]>valorMax) {
        valorMax = n[i];
      } else if (n[i]<valorMin) {
        valorMin = n[i];;
      }
    }

    System.out.println("Los números del array son: ");
    for (int i = 0; i < 10; i++) {
      System.out.print(n[i]+", ");
      if (n[i]==valorMax) {
        System.out.print(n[i]+"(máximo), ");
      } else if (n[i]==valorMin) {
        System.out.print(n[i]+"(mínimo),");
      }
    }
    sc.close();
  }
}
