/**
 * Tema07
 * 2º Escribe un array bidimensional y la suma de sus filas/columnas.
 * 
 * @author Joseph Luca san Juan Thomspson
 */
package java_capitulo_7.arrays_bidimensionales;

import java.util.Scanner;

public class Tema07Ex02y03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int array[][] = new int[4][5];
    int sumaH, sumaV;
    int sumaTotal = 0;

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 5; j++) {
        //System.out.print("Introduce el número para la fila "+i+", columna "+j+": ");
        array[i][j] = (int)(Math.random()*889)+100;//sc.nextInt();
      }
    }

    for (int i = 0; i < 4; i++) {
      sumaH = 0;
      for (int j = 0; j < 5; j++) {
        System.out.printf("%6d    ", array[i][j]);
        sumaH += array[i][j];
      }
      System.out.printf("|%6d\n", sumaH);
    }
    
    System.out.println("---------------------------------------------------------");

    for (int j = 0; j < 5; j++) {
      sumaV = 0;
      for (int i = 0; i < 4; i++) {
        sumaV += array[i][j];
      }
      System.out.printf("%6d    ", sumaV);
      sumaTotal += sumaV;
    }
    System.out.printf("|%6d",sumaTotal);
    sc.close();
  }
}
