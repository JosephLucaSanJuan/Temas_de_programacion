/**
 * Tema 4
 * 18º ¿Cuál es la primera cifra del número?
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_4;

import java.util.Scanner;

public class Tema04Ej18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    int n = sc.nextInt();
    int primCifra = 0;

    if (n<10) {
      primCifra = n;
    } else if ((n>=10) && (n<100)) {
      primCifra = n/10;
    } else if ((n>=100) && (n<1000)) {
      primCifra = n/100;
    } else if ((n>=1000) && (n<10000)) {
      primCifra = n/1000;
    } else if ((n>=10000)) {
      primCifra = n/10000;
    }
    System.out.printf("La primera cifra del %d es el %d.", n, primCifra);
    sc.close();
  }
}
