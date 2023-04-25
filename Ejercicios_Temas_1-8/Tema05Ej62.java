/**
 * Tema05
 * 62º Averigua si un número es afortunado o no.
 * Números afortunados = 3, 7, 8, 9
 * 
 * @author Joseph Luca San Juan Thompson
 */

import java.util.Scanner;

public class Tema05Ej62 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int n = sc.nextInt();
    int num = n;
    int numAfort = 0;
    int numDesfort = 0;

    while (num > 0) {
      num /= 10;
      if (num%10==3 || num%10==7 || num%10==8 || num%10==9) {
        numAfort++;
      } else {
        numDesfort++;
      }
    }
    if (numAfort>numDesfort) {
      System.out.println("El "+n+" es un número afortunado.");
    } else {
      System.out.println("El "+n+" no es un número afortunado.");
    }
    sc.close();
  }
}
