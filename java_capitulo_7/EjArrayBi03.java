package java_capitulo_7;

import java.util.Scanner;

public class EjArrayBi03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce un valor: ");
    int fila = sc.nextInt();
    System.out.print("Introduce otro valor: ");
    int columna = sc.nextInt();
    int n[][] = new int[fila][columna];

    for (int i = 0; i < fila; i++) {
      for (int j = 0; j < columna; j++) {
        if (j%2==0) {
          n[i][j] = 1;
        } else {
          n[i][j] = 0;
        }
        System.out.print(n[i][j]+" ");
      }
      System.out.println();
    }
    sc.close();
  }
}
