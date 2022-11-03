/**
 * Tema 5
 * 44º Añade una cifra a un número.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej44 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    long n = sc.nextLong();
    System.out.print("Introduce la posición dónde quieres insertar: ");
    int pos = sc.nextInt();
    System.out.print("Introduce el dígito que quieres insertar: ");
    int dig = sc.nextInt();
    long numInv = 0;
    long num=n;
    int longNum=0;
    int cuentaDig=0;
    long valor = 0;
    int cifra = 0;
    
    while (num>0) {
      numInv=(numInv*10)+(numInv%10);
      num/=10;
      longNum++;
    }
    System.out.println(longNum);
    for (int i = 0; i<=longNum; i++) {
      cifra = (int)(num%10);
      num/=10;
      cuentaDig++;
      /*if (cuentaDig<pos) {
        valor += (long)cifra%10*(long)Math.pow(10, longNum-(cuentaDig+1));
      } else if (cuentaDig == pos) {
        valor += (long)dig%10*(long)Math.pow(10, longNum-pos);
      } else if (cuentaDig>pos) {
        valor += (long)cifra%10*(long)Math.pow(10, longNum-cuentaDig);
      }*/
    } 
    System.out.println(cuentaDig);
  }
}
