/**
 * Tema 4
 * 16º 
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_4;

import java.util.Scanner;

public class Tema04Ej14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce un número para ver si es par o divisible entre 5: ");
    int n = sc.nextInt();

    if (n%2==0) {
      System.out.printf("El %d es par ", n);
    } else {
      System.out.printf("El %d no es par ", n);
    }

    if (n%5==0) {
      System.out.println("y es divisible entre 5");
    } else {
      System.out.println("y no es divisible entre 5");
    }
    sc.close();
  }
}
