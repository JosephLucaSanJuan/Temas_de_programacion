/**
 * Tema07
 * 3º Escribe 10 números y muestralos en un array.
 * 
 * @author Joseph Luca san Juan Thomspson
 */
package java_capitulo_7;

import java.util.Scanner;

public class Tema07Ej03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n[] = new int[10];
    int cuentaNum = 9;

    do {
      System.out.print("Introduce un número: ");
      n[cuentaNum] = sc.nextInt();
      cuentaNum--;
    } while (cuentaNum>=0);

    System.out.println("Los números del array son:");
    for (int i = 0; i < 10; i++) {
      System.out.print(n[i]+" ");
    }
    sc.close();
  }
}
