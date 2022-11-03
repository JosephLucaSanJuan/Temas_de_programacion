/**
 * Tema 5
 * 14º Calcula la potencia de una base y exponente.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce una base: ");
    int b = sc.nextInt();
    System.out.print("Introduce un exponente: ");
    int exp = sc.nextInt();
    int cont=2;
    int pot = b;
    do {
      pot *= b;
      cont++;
    } while (cont <= exp);
    System.out.println(b+"^"+exp+" = "+pot);
    sc.close();
  }
}
