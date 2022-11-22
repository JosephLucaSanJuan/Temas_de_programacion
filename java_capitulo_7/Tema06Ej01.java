/**
 * Tema07
 * 1º Escribe un array int de 12 elementos.
 * 
 * @author Joseph Luca san Juan Thomspson
 */
package java_capitulo_7;

public class Tema06Ej01 {
  public static void main(String[] args) {
    int [] num = new int[12];

    num[0] = 39;
    num[1] = -2;
    num[4] = 0;
    num[6] = 14;
    num[8] = 5;
    num[9] = 120;

    System.out.print("Los elementos del array son: ");
    for (int i = 0; i < 12; i++) {
      System.out.print(num[i]+" ");
    }
  }
}
