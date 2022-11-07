/**
 * Tema 5
 * 52º Desplaza los dígitos de un número de derecha a izquierda una posición.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej52 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    long n = sc.nextInt();
    long num = n;
    int longNum = 0;

    if (n<10) {
      System.out.println("El número resultado es "+n);
    } else {
      while (num>0) {
        num/=10;
        longNum++;
      }
      int primero = (int)(n/Math.pow(10, longNum-1));
      int resto = (int)(n%Math.pow(10, longNum-1));
      System.out.printf("El número resultado es %d.",resto*10+primero);
    }
    sc.close();
  }
}
