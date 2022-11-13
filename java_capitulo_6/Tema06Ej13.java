/**
 * Tema 6
 * Ejercicio 13.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_6;

public class Tema06Ej13 {
  public static void main(String[] args) {
    System.out.println("Tira 2 dados hasta que ambos tengan el mismo resultado.");
    int dado1 = 0;
    int dado2 = 1;

    while (dado1!=dado2) {
      dado1 = (int)(Math.random()*6+1);
      dado2 = (int)(Math.random()*6+1);
      System.out.println("dado 1="+dado1+"; dado 2="+dado2);
    }
  }
}
