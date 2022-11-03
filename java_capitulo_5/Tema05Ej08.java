/**
 * Tema 5
 * 8º Muestra la tabla de multiplicar de un número introducido.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int n = sc.nextInt();

    for (int i = 1; i <= 10; i++) {
      System.out.println(n + "x" + i + " = " + n*i);
    }
    sc.close();
  }
}
