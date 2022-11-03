/**
 * Tema 5
 * 37º Convierte números a palotes.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej37 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    long n = sc.nextInt();
    long num = n;
    long numInv = 0;
    int cont = 0;
    int dig = 0;
    
    if (num==0) {
      cont=1;
    }
    
    while (num > 0) {
      numInv = (numInv*10)+(num%10);
      num/=10;
      cont++;
    }
    //System.out.println(numInv);
    //System.out.println(cont);
    
    for (int i = 0; i<cont; i++) {
      dig = (int)(numInv%10);
      numInv/=10;

      for (int j = 0; j < dig; j++) {
        System.out.print("|");
      }
      System.out.print("-");
    }
    sc.close();
  }
}
