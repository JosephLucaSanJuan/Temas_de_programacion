/**
 * Tema 5
 * 27º Escribe los multiplos de 3 entre 1 y n.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej27 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int n = sc.nextInt();
    int num = 1;
    boolean multiplo3 = true;

    for (int i = 0; i <= n; i++) {
      num = 3*i;
      multiplo3 = true;
      
      if (num > n) {
        multiplo3 = false;
      }

      if (multiplo3) {
        System.out.print(num+" ");
      }
    }
    sc.close();
  }
}
