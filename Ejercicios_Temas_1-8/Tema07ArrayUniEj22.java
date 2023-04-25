/**
 * Tema07
 * 
 * Arrays de una dimensión
 * 22º Escribe un array de numeros aleatorios.
 * Luego introduce un número que este dentro del array.
 * Y rota el array hasta que el número este en la posición 0.
 * 
 * @author Joseph Luca San Juan Thompson
 */

import java.util.Scanner;

public class Tema07ArrayUniEj22 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce el tamaño del array: ");
    int t = sc.nextInt();
    int[] array = new int[t];

    for (int i = 0; i < array.length; i++) {
      array[i] = (int)(Math.random()*200);
    }

    System.out.println("\nArray Original:");
    System.out.print("Índice  ");
    for (int i = 0; i < array.length; i++) {
      System.out.printf(" %3d ", i);
    }
    System.out.print("\nValor   ");
    for (int i = 0; i < array.length; i++) {
      System.out.printf(" %3d ", array[i]);
    }

    int[] a1 = new int[t/2+1];
    int cuentArray1 = 0, cuentArray2 = 0;
    int[] a2 = new int[t/2+1];
    for (int i = 0; i< array.length; i++) {
      if (i%2==0 || i==2) {
        a1[cuentArray1] = array[i];
        cuentArray1++;
      } else {
        a2[cuentArray2] = array[i];
        cuentArray2++;
      }
    }

    System.out.println("\nArray Resultado:");
    System.out.print("Índice  ");
    for (int i = 0; i < array.length; i++) {
      System.out.printf(" %3d ", i);
    }
    System.out.print("\nValor   ");
    for (int i = 0; i < a1.length; i++) {
      System.out.printf(" %3d ", a1[i]);
    }
    for (int i = a2.length-1; i >= 0; i--) {
      System.out.printf(" %3d ", a2[i]);
    }
    sc.close();
  }
}
