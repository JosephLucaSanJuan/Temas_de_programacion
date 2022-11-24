/**
 * Tema07
 * 7º Escribe 10 números y muestralos en un array.
 * 
 * @author Joseph Luca san Juan Thomspson
 */
package java_capitulo_7;

import java.util.Scanner;

public class Tema07Ej07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n[] = new int[100];

    for (int i = 0; i < 100; i++) {
      n[i] = (int)(Math.random()*21);
      System.out.print(n[i]+" ");
    }

    System.out.print("\nIntroduce un valor: ");
    int n1 = sc.nextInt();
    System.out.print("Introduce un valor de reemplazo: ");
    int n2 = sc.nextInt();

    for (int i = 0; i < 100; i++) {
      if (n[i]==n1) {
        n[i] = n2;
        System.out.printf("\"%d\" ", n[i]);
      } else {
        System.out.printf("%d ", n[i]);
      }
    }
    sc.close();
  }
}
