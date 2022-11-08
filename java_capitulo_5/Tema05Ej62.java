/**
 * Tema 5
 * 62º Averigua si un número es afortunado o no.
 * Los números de la suerte son el 3, el 7, el 8 y el 9
 * y el resto (0, 1, 2, 4, 5 y 6) son de la mala suerte.
 * Un número es afortunado si tiene más dígitos
 * de la suerte que de la mala suerte.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej62 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int n = sc.nextInt();
    int num = n;
    int dig = 0;
    int contaSuerte = 0;
    int contaMalSuerte = 0;

    while (num>0) {
      num/=10;
      dig = num%10;
      if (num>0) {
        if ((dig==3)||(dig==7)||(dig==8)||(dig==9)) {
          contaSuerte++;
        } else {
          contaMalSuerte++;
        }
      }
    }

    if (contaSuerte>contaMalSuerte) {
      System.out.println("El "+n+" es un número afortunado.");
    } else {
      System.out.println("El "+n+" no es un número afortunado.");
    }
    sc.close();
  }
}
