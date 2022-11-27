/**
 * Tema07
 * 13º Escribe 15 números y muestralos rotados en un array.
 * 
 * @author Joseph Luca san Juan Thomspson
 */
package java_capitulo_7.arrays_unidimensionales;

import java.util.Scanner;

public class Tema07Ej13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int array[] = new int[100];
    int maxValor = Integer.MIN_VALUE;
    int minValor = Integer.MAX_VALUE;

    for (int i = 0; i < 100; i++) {
      array[i] = (int)(Math.random()*501);
      System.out.print(array[i]+" ");
      if (array[i]>maxValor) {
        maxValor = array[i];
      } else if (array[i]<minValor) {
        minValor = array[i];
      }
    }
    System.out.println();

    System.out.print("\n¿Qué numero quieres destacar? (1-máximo 2-mínimo):");
    int valor = sc.nextInt();

    for (int i = 0; i < 100; i++) {
      if (valor == 1) {
        if (array[i]==maxValor) {
          System.out.print("**"+array[i]+"** ");
        } else {
          System.out.print(array[i]+" ");
        }
      } else if (valor==2) {
        if (array[i]==minValor) {
          System.out.print("**"+array[i]+"** ");
        } else {
          System.out.print(array[i]+" ");
        }
      }
    }
    sc.close();
  }
}
