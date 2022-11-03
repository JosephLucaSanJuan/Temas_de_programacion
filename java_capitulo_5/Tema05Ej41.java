package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej41 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    long n = sc.nextLong();
    long numInv = 0;
    long num = n;
    int cuentaPares=0;
    int cuentaImpares=0;
    int dig = 0;

    while (num>0) {
      numInv = (numInv*10)+(num%10);
      num/=10;
    }
    System.out.println(numInv);

    while (numInv>0) {
      dig = (int)numInv%10;
      numInv/=10;
      if (dig%2==0) {
        cuentaPares++;
      } else {
        cuentaImpares++;
      }
    }
    System.out.println("El "+n+" tiene "+cuentaPares+" dígitos pares y "+cuentaImpares+" dígitos impares.");
    sc.close();
  }
}
