/**
 * Tema07
 * 
 * Arrays de una dimensión
 * 17º Escribe un array de numeros aleatorios.
 * Luego introduce un número que este dentro del array.
 * Y rota el array hasta que el número este en la posición 0.
 * 
 * @author Joseph Luca San Juan Thompson
 */

import java.util.Scanner;

public class Tema07ArrayUniEj17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] array = new int[10];

    for (int i = 0; i < array.length; i++) {
      array[i] = (int)(Math.random()*101);
    }

    System.out.println("\nArray Original: ");
    System.out.println("\n┌──────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
    System.out.print("| Posición ");
    for (int j = 0; j < array.length; j++) {
      System.out.printf("|%3d ",j);
    }
    System.out.println("│\n├──────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
    System.out.print("| Número   ");
    for (int j = 0; j < array.length; j++) {
      System.out.printf("|%3d ",array[j]);
    }
    System.out.println("│\n└──────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");

    int n = 0;
    boolean contiene = false;
    do {
      System.out.print("\nIntroduce un número que contenga el array: ");
      n = sc.nextInt();

      for (int num : array) {
        if (num == n) {
          contiene = true;
        }
      }

      if (!contiene) {
        System.out.println("Lo siento ese número no existe dentro del array");
      }
    } while (!contiene);

    while (array[0] != n) {
      int num = array[9];
      for (int i = 9; i > 0; i--) {
        array[i] = array[i-1];
      }
      array[0]=num;
    }


    System.out.println("\nArray nuevo: ");
    System.out.println("\n┌──────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
    System.out.print("| Posición ");
    for (int i = 0; i < array.length; i++) {
      System.out.printf("|%3d ", i);
    }
    System.out.println("│\n├──────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
    System.out.print("| Número   ");
    for (int i = 0; i < array.length; i++) {
      System.out.printf("|%3d ", array[i]);
    }
    System.out.println("│\n└──────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");
    sc.close();
  }
}
