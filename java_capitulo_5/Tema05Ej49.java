/**
 * Tema 5
 * 49º Calcula el máximo y el mínimo de una serie de números enteros que has introducido.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej49 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 0;
    int cuentaNum = 0;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int suma = 0;
    boolean esPrimo = true;

    System.out.println("Introduce números enteros positivos. Para terminar, introduce un número primo:");
    do {
      n = sc.nextInt();
      esPrimo = true;
      for (int i = 2; i <= n/2; i++) {
        if (n%i==0) {
          esPrimo=false;
        }
        //System.out.print(i+" ");
      }

      if (n==1 || !esPrimo) {
        cuentaNum++;
        suma+=n;
        if (n>max) {
          max = n;
        } else if (n<min) {
          min=n;
        }/**/
      }
    } while (n==1 || !esPrimo);
    System.out.println("Has introducido "+cuentaNum+" números enteros.");
    System.out.println("Máximo: "+max);
    System.out.println("Mínimo: "+min);
    System.out.println("Media: " + (double)(suma/cuentaNum));
    sc.close();
  }
}
