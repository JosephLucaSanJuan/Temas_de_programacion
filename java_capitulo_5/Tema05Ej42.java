/**
 * Tema 5
 * 42º Escribe un número y dí si él y los 5 números que lo siguen son primos o no.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej42 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int n = sc.nextInt();
    boolean esPrimo = true;
    
    for (int i = n; i < n+5; i++) {
      esPrimo=true;
      for (int j = 2; j <= i/2; j++) {
        if ((i%j)==0) {
          esPrimo=false;
        }
      }
      if (esPrimo) {
        System.out.println(i+" es primo.");
      } else {
        System.out.println(i+" no es primo.");
      }
    }
    sc.close();
  }
}