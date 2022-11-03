/**
 * Tema 5
 * 13º Escribe 10 números y dí cuáles son positivos y cuáles negativos
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

public class Tema05Ej13 {
  public static void main(String[] args) {
    int n = 0;
    int numPos = 0;
    int numNeg = 0;
    for (int i = 1; i <= 10; i++) {
      System.out.print("Introduce un número: ");
      n = Integer.parseInt(System.console().readLine());
      if (n>=0) {
        numPos++;
      } else {
        numNeg++;
      }
    }
    System.out.println("De los 10 número introducidos, " +numPos+" son positivos y " + numNeg + " son negativos.");
  }
}
