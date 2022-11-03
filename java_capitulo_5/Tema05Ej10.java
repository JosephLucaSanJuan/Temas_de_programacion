/**
 * Tema 5
 * 10º Calcula la media de varios números
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 0;
    int cuenta = 0;
    int suma = 0;
    while (n >= 0) {
      System.out.print("Introduce un número: ");
      n = sc.nextInt();
      if (n >= 0) {
        suma += n;
        cuenta++;
      }
    }
    System.out.printf("La media de la suma es %.2f.", (double)suma/(double)cuenta);
    sc.close();
  }
}
