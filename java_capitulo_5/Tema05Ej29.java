/**
 * Tema 5
 * 29º Escribe todos los números menores a un número que no sean divisibles por otro.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej29 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int n1 = sc.nextInt();
    System.out.print("Introduce otro menor: ");
    int numMen = sc.nextInt();

    if (numMen < n1) {

      for (int i = 1; i <= n1; i++) {
        
        if (i%numMen != 0) {
          System.out.print(i + " ");
        }
        
      }
    } else {
      System.out.print("El segundo número no es válido.");
    }

    sc.close();
  }
}
