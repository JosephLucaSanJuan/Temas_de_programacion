/**
 * Tema 5
 * 48ª Escribe un número y luego dí las cifras que aprecen y no aparece en el.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej48 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Escribe un número: ");
    long n = sc.nextLong();
    long num = n;
    boolean encontrado = false;

    System.out.print("Dígitos que aparecen en el número: ");
    for (int i = 0; i < 10; i++) {
      encontrado=false;
      num = n;
      while (num>0 && !encontrado) {
        if (i==num%10) {
          encontrado=true;
        }
        num/=10;
      }
      if (encontrado) {
        System.out.printf("%d ",i);
      }
    }
    System.out.println();

    System.out.print("Dígitos que no aparecen en el número: ");
    for (int i = 0; i < 10; i++) {
      num = n;
      encontrado=false;
      while (num>0 && !encontrado) {
        if (i==num%10) {
          encontrado=true;
        }
        num/=10;
      }
      if (!encontrado) {
        System.out.printf("%d ",i);
      }
      sc.close();
    }
  }
}
