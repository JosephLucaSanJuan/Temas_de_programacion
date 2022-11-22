/**
 * Tema07
 * 2º Escribe un array String de 12 elementos.
 * 
 * @author Joseph Luca san Juan Thomspson
 */
package java_capitulo_7;

public class Tema06Ej02 {
  public static void main(String[] args) {
    String simbolo[] = new String[10];

    simbolo[0] = "a";
    simbolo[1] = "x";
    simbolo[4] = "@";
    simbolo[6] = " ";
    simbolo[7] = "+";
    simbolo[8] = "Q";

    System.out.println("Los elementos del array son: ");
    for (int i = 0; i < 10; i++) {
      System.out.println(simbolo[i]+" ");
    }
  }
}
