/**
 * Tema07
 * 6º Escribe 15 números y muestralos rotados en un array.
 * (El elemento en pos 0 pasa a pos.1; etc.)
 * 
 * @author Joseph Luca san Juan Thomspson
 */
package java_capitulo_7;

public class Tema07Ej06 {
  public static void main(String[] args) {
    int n[] = new int[15];

    for (int i = 0; i < 15; i++) {
      n[i] = (int)(Math.random()*100);
    }

    System.out.println("Array original");
    System.out.print("Indice|");
    for (int i = 0; i < 15; i++) {
      System.out.printf("%3d |",i);
    }
    System.out.print("\nValor |");
    for (int i = 0; i < 15; i++) {
      System.out.printf("%3d |", n[i]);
    }

    int ultimo = n[14];

    for (int i = 14; i >= 1; i--) {
      n[i]=n[i-1];
    }
    n[0] = ultimo;

    System.out.println("\nArray rotado");
    System.out.print("Indice|");
    for (int i = 0; i < 15; i++) {
      System.out.printf("%3d |",i);
    }
    System.out.print("\nValor |");
    for (int i = 0; i < 15; i++) {
      System.out.printf("%3d |", n[i]);
    }
  }
}
