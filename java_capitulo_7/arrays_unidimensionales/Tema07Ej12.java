/**
 * Tema07
 * 12º Escribe 15 números y muestralos rotados en un array.
 * (El elemento en pos 0 pasa a pos.1; etc.)
 * 
 * @author Joseph Luca san Juan Thomspson
 */
package java_capitulo_7.arrays_unidimensionales;

import java.util.Scanner;

public class Tema07Ej12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n[] = new int[10];

    for (int i = 0; i < 10; i++) {
      n[i] = (int)(Math.random()*100);
    }

    System.out.println("Array original");
    System.out.print("Indice|");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%3d |",i);
    }
    System.out.print("\nValor |");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%3d |", n[i]);
    }

    System.out.print("\nIntroduce la posición inicial (0-9): ");
    int posIni = sc.nextInt();
    System.out.print("Introduce la posición final (0-9): ");
    int posFinal = sc.nextInt();
    int r[] = new int[10];
    r[posFinal] = n[posIni];

    for (int i = 1; i < 10; i++) {
      r[(posFinal+i)%10]=n[(posFinal+i-1)%10];
    }

    System.out.println("\nArray resultante");
    System.out.print("Indice|");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%3d |",i);
    }
    System.out.print("\nValor |");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%3d |", r[i]);
    }
  }
}
