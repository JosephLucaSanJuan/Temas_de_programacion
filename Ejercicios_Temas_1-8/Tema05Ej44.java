/**
 * Tema05
 * 44º Indica una posición de un número e inserta un dígito
 * 
 * @author Joseph Luca San Juan Thompson
 */

import java.util.Scanner;

public class Tema05Ej44 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    long n = sc.nextLong();
    long num = n;
    long numInv = 0;
    int longNum = 0;
    System.out.print("Introduce la posición dónde quieres insertar: ");
    int pos = sc.nextInt();
    System.out.print("Introduce el dígito que quieres insertar: ");
    int dig = sc.nextInt();
    int cuentaDig = 0;
    int cifra = 0;
    long n1 = 0, n2 = 0, n3 = 0;

    while (num > 0) {
      numInv = (numInv*10)+(num%10); 
      num /= 10;
      longNum++;
    }
    System.out.println(numInv);
    System.out.println(longNum);

    while (cuentaDig <= longNum) {
      cifra = (int)(numInv%10);
      numInv/=10;
      cuentaDig++;
      if (cuentaDig < pos) {
        n1 = n1+(long)(cifra*Math.pow(10, (longNum+1)-cuentaDig));
      }
      if (cuentaDig == pos) {
        n2 = (long)(dig*Math.pow(10, (longNum+1)-pos));
      }
      if (cuentaDig >= pos) {
        n3 = n3+(long)(cifra*Math.pow(10, longNum-cuentaDig));
      }
    }
    System.out.println(n1+n2+n3);
    sc.close();
  }
}
