/**
 * Tema 5
 * 11º muestra el cuadrado y el cubo de 5 números.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

public class Tema05Ej11 {
  public static void main(String[] args) {
    System.out.print("Escribe un número: ");
    int n = Integer.parseInt(System.console().readLine());

    for (int i = n; i <= n+5; i++) {
      System.out.println("| "+i+" | "+ (i*i) +" | "+ (i*i*i) +" |");
    }
  }
}
