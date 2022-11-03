/**
 * Tema 5
 * 1º Escribe los múltiplos de 5 de 0 hasta 100.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

public class Tema05Ej01 {
  public static void main(String[] args) {
    /**for (int i = 0; i <= 100/5; i++) {
      System.out.println(5 + "x" + i + " = " + 5*i);
    }**/

    int n = 0;
    while (n <= 100/5) {
      System.out.println(5+"x"+n+" = "+n*5);
      n++;
    }
  }
}
