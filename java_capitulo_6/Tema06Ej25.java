/**
 * Tema06
 * 25º Muestra 100 números aleatorios entre 10 y 200.
 *     Marca los primos y los multiplos de 5.
 * 
 * @author Joseph Luca san Juan Thomspson
 */
package java_capitulo_6;

public class Tema06Ej25 {
  public static void main(String[] args) {
    int n = 0;
    boolean esPrimo = true;

    for (int i = 0; i < 100; i++) {
      esPrimo = true;
      n = (int)(Math.random()*190)+10;

      if (n%5==0) {
        System.out.print("["+n+"] ");
      } else {
        for (int j = 2; j <= n/2; j++) {
          if (n%j==0) {
            esPrimo = false;
          }
        }

        if (esPrimo) {
          System.out.print("#"+n+"# ");
        } else {
          System.out.print(n+" ");
        }
      }
    }
  }
}
