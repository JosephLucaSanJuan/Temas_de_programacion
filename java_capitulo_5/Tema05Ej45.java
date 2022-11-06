/**
 * Tema 5
 * 44º Añade una cifra a un número.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej45 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    long n = sc.nextLong();
    System.out.print("Introduce la posición dónde quieres intercambiar: ");
    int pos = sc.nextInt();
    System.out.print("Introduce el nuevo dígito: ");
    int dig = sc.nextInt();
    long numInv = 0;
    long num=n;
    int longNum=0;
    int cuentaDig=0;
    long valor1 = 0;
    long valor2 = 0;
    long valor3 = 0;
    int cifra = 0;
    
    while (num>0) {
      numInv=(numInv*10)+(num%10);
      num/=10;
      longNum++;
    }
    System.out.println(longNum+"\n"+numInv);
    while (cuentaDig<=longNum) {
      cifra = (int)(numInv%10);
      numInv/=10;
      cuentaDig++;
      if (cuentaDig<pos) {
        valor1 = valor1 + (long)(cifra*Math.pow(10, longNum-cuentaDig));
      }
      if (cuentaDig == pos) {
        valor2 = valor2 + (long)(dig*Math.pow(10, longNum-pos));
      }
      if (cuentaDig>pos) {
        valor3 = valor3 + (long)(cifra*Math.pow(10, longNum-cuentaDig));
      }
    }
    System.out.println("El número resultante es "+ (valor1+valor2+valor3));
    sc.close();
  }
}
