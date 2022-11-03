/**
 * Tema 5
 * 18º Obtiene los números de 7 en 7 entre dos numeros.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int n1 = sc.nextInt();
    System.out.print("Introduce otro: ");
    int n2 = sc.nextInt();
    //int n = 0;
    
    for (int i = n1; i < n2; i++) {
      i += 7;
      System.out.print(i+" ");
    }
    sc.close();
  }
}
