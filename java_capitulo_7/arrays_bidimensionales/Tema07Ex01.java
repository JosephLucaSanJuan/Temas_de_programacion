/**
 * Tema07
 * 1º Escribe un array bidimensional.
 * 
 * @author Joseph Luca san Juan Thomspson
 */
package java_capitulo_7.arrays_bidimensionales;

public class Tema07Ex01 {
  public static void main(String[] args)
    throws InterruptedException {
    int n[][] = new int[3][6];

    n[0][0] = 0;
    n[1][0] = 30;
    n[0][1] = 75;
    n[0][2] = 2;
    n[2][2] = -2;
    n[2][3] = 9;
    n[1][4] = 0;
    n[0][5] = 5;
    n[2][5] = 11;

    System.out.print("       ");
    for (int i = 0; i < 6; i++) {
      System.out.printf("  Columna %d  ",i);
    }
    System.out.println();
    for (int i = 0; i < 3; i++) {
      System.out.printf("Fila %d |",i);
      for (int j = 0; j < 6; j++) {
        System.out.printf("%7d     |",n[i][j]);
        Thread.sleep(1000);
      }
      System.out.println();
    }
  }
}
