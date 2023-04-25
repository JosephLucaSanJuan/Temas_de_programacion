/**
 * Tema06
 * 26º Crea una tableta de turrón con un vocado.
 * 
 * @author Joseph Luca San Juan Thompson
 */

import java.util.Scanner;

public class Tema06Ej26 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Inntroduce la anchura de la tableta: ");
    int anchura = sc.nextInt();
    System.out.print("Introduce la altura de la tableta: ");
    int altura = sc.nextInt();
    int cuentaNivel = 0;
    int linea = 0;
    int mordisco = (int)(Math.random()*(anchura*2+(altura-2)*2));

    while (cuentaNivel < altura) {
      for (int i = 0; i < anchura; i++) {
        boolean borde = (cuentaNivel==0 || cuentaNivel==altura-1 || i==0 || i==anchura-1);
        if (linea==mordisco && borde) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }

        if (borde) {
          linea++;
        }
      }
      System.out.println();
      cuentaNivel++;
    }
    sc.close();
  }
}
