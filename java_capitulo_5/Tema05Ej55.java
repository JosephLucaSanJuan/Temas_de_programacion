/**
 * Tema 5
 * 55º Desplaza los dígitos de un número de izquierda a derecha una posición.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej55 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    long n = sc.nextLong();
    long num = n;
    int dig = 0;
    int longNum=0;
    
    if (n<10) {
      System.out.println("El número resultado es "+n);
    } else {
      while (num>0) {
        num/=10;
        longNum++;
      }
      /*System.out.println(longNum);*/
      int resto = (int)n/10;
      dig = (int)n%10;
      long resultado = (long)(resto+dig*Math.pow(10, longNum-1));
      System.out.println(resto+" "+dig);
      System.out.printf("El número resultado es %d.",resultado);
    }
    sc.close();
  }
}
