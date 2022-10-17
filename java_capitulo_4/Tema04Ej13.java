/**
 * Tema 4
 * 13º Ordena los números de mayor a menor
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_4;

import java.util.Scanner;

public class Tema04Ej13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int n1 = sc.nextInt();
    System.out.print("Introduce un número: ");
    int n2 = sc.nextInt();
    System.out.print("Introduce un número: ");
    int n3 = sc.nextInt();

    if ((n1 < n2) && (n2<n3)) {
      System.out.println(n1 + " < " + n2 + " < " + n3);
    } else if ((n2 < n3) && (n3 < n1)) {
      System.out.println(n2 + " < " + n3 + " < " + n1);
    } else if ((n3 < n1) && (n1 < n2)) {
      System.out.println(n3 + " < " + n1 + " < " + n2);
    } else if ((n1 >n2) && (n2 > n3)) {
      System.out.println(n3 + " < " + n2 + " < " + n1);
    } else if ((n1 < n2) && (n2<n3)) {
      System.out.println(n1 + " < " + n3 + " < " + n2);
    }
  }
}
