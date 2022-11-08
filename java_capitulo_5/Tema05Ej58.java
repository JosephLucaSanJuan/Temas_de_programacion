/**
 * Tema 5
 * 58º Calcula la media de los dígitos de un número.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej58 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    long n = sc.nextLong();
    int longNum=0;
    long num = n;
    int suma=0;
    int dig = 0;
    double media = 0;

    System.out.print("Dígitos: ");
    while (num>0) {
      num/=10;
      dig = (int)num%10;
      if (num>0) {
        System.out.print(dig+" ");
        suma+=dig;
      }
      longNum++;
    }
    media = (double)(suma/longNum);
    System.out.println("\n"+longNum+"\n"+suma);
    System.out.println("Media: "+media);
    System.out.printf("Media: %f", media);
  }
}
