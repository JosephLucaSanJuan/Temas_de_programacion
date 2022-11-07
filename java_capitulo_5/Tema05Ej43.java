/**
 * Tema 5
 * 43º Parte un número en dos.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej43 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    long n = sc.nextLong();
    System.out.print("Introduce la posición a partir de la cuál quieres partir el número: ");
    int partir = sc.nextInt();
    long num = 0;
    int longNum = 0;
    long valor1 = 0;
    long valor2 = 0;
    int pos = 0;
    int dig = 0;

    if (n==0) {
      longNum = 1;
    }

    while (n > 0) {
      num = (num*10)+(n%10);
      n/=10;
      longNum++;
    }
    System.out.println("Nª de cifras: "+ longNum);

    for (int i = 0; i < longNum; i++) {
      dig = (int)(num%10);
      num/=10;
      pos++;
      if (pos < partir) {
        //System.out.print(dig+" ");
        valor1 = valor1 + (long)dig%10*(long)Math.pow(10,partir-(pos+1));
      } else {
        //System.out.print(dig+" ");
        valor2 = valor2 + (long)dig%10*(long)Math.pow(10,longNum-pos);
      }
    }
    System.out.println("Los números partidos son " + valor1 + " y " + valor2);
    sc.close();
  }
}
