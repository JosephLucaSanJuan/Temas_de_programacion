/**
 * Tema 5
 * 22º Escribe los numeros primos entre 2 a 100 (ambos incluidos).
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

public class Tema05Ej22 {
  public static void main(String[] args) {
    boolean esPrimo = true;
    
    for (int i = 2; i <= 100; i++) {
      esPrimo = true;
      for (int j = 2; j <= i/2; j++) {
        if ((i%j)==0) {
          esPrimo = false;
        }
      }
      if (esPrimo) {
        System.out.print(i + " ");
      }
    }
  }
}
