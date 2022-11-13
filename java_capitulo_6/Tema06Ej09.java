/**
 * Tema 6
 * Ejercicio 9.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_6;

public class Tema06Ej09 {
  public static void main(String[] args) {
    System.out.println("Genera números entre 0 y 100 pares hasta que salga el 24");
    int n = 0;

    while (n!=24) {
      n = (int)(Math.random()*51)*2;
      System.out.print(n+" ");
    }
  }
}
