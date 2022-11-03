/**
 * Tema 5
 * 25º Escribe un número y luego devuélvelo al revés.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej25 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int n = sc.nextInt();
    int alReves = 0;

    while (n > 0) {
      alReves = (alReves*10)+(n%10);
      n /= 10;
    }
    System.out.println("Al revés: " + alReves);
    sc.close();
  }
}
