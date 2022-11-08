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
    long num = n;
    long numInv = 0;
    int longNum=0;
    int dig = 0;
    double suma=0;
    double media = 0;

    while (num>0) {
      numInv = (numInv*10)+(num%10);
      num/=10;
      longNum++;
    }

    System.out.print("Dígitos: ");
    for (int i = 0; i < longNum; i++) {
      dig = (int)numInv%10;
      numInv/=10;
      System.out.print(dig+" ");
      suma+=(double)dig;
    }
    
    media = (double)(suma/longNum);
    System.out.println("\n"+longNum+"\n"+suma);
    System.out.println("Media: "+media);
    System.out.printf("Media: %.3f", media);
    sc.close();
  }
}
