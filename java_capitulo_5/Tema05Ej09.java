/**
 * Tema 5
 * 9º ¿Cuantos digitos tiene un número?
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    long n = sc.nextLong();
    long cociente = n;
    int cont = 0;

    do {
      cont++;
      cociente/=10;
    } while (cociente != 0);
    System.out.println("El número "+ n +" tiene " + cont + " dígitos.");
    sc.close();
  }
}
