/**
 * Tema07
 * 8º Escribe en qué direcciones puede ir un alfil sobre un tablero de ajedrez.
 * 
 * @author Joseph Luca san Juan Thomspson
 */
package java_capitulo_7.arrays_bidimensionales;

import java.util.Scanner;

public class Tema07Ex08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduzca la posición del alfil: ");
    String pos = sc.nextLine();
    int filAlfil = (int)(pos.charAt(1))-48;
    int colAlfil = (int)(pos.charAt(0))-96;

    System.out.println("El alfil puede moverse a las siguientes posiciones:");
    for (int i = 8; i >= 1; i--) {
      for (int j = 1; j <= 8; j++) {
        if ((Math.abs(filAlfil-i) == Math.abs(colAlfil-j)) && (!(filAlfil==i && colAlfil==j))) {
          System.out.print((char)(j+96)+""+i+" ");
        }
      }
    }
    sc.close();
  }
}
