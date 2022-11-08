/**
 * Tema 5
 * 68º Disloca un número (si su dígito es par, le sumas 1; si es impar; le restas 1).
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej68 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    long n = sc.nextLong();
    long num = n;
    long numInv = 0;
    int longNum = 0;
    int dig = 0;
    int rep = 0;
    long valor=0;

    while (num>0) {
      numInv = (numInv*10)+(num%10);
      num/=10;
      longNum++;
    }
    System.out.println(numInv);
    for (int i = 0; i<longNum; i++) {
      dig=(int)(numInv%10);
      numInv/=10;
      rep++;
      if (dig%2==0) {
        dig += 1;
      } else {
        dig -= 1;
      }
      valor = valor + (long)(dig*Math.pow(10, longNum-rep));
    }
    System.out.printf("Si dislocamos el %d, obtenemos el %d",n,valor);
    sc.close();
  }
}
