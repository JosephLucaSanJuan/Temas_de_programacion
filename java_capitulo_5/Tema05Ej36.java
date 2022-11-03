/**
 * Tema 5
 * 36º Averigua si un número es capicua.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej36 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    long n = sc.nextInt();
    long num = n;
    long nInv = 0;

    while (num > 0) {
      nInv = (nInv*10)+(num%10);
      num/=10;
      //cuenta++;
    }
    
    if (n==nInv) {
      System.out.println(n+" = "+nInv);
      System.out.println("El número "+n+" es capícua.");
    } else {
      System.out.println(n+" != "+nInv);
      System.out.println("El número "+n+" no es capícua.");
      sc.close();
    }
  }
}
