/**
 * Tema 11
 * 1º Crea un fichero y escribe en el los numero primos del 1 al 500.
 * 
 * @author Joseph Luca San Juan Thompson
 */
package java_capitulo_11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Tema11Ej01 {
  public static void main(String[] args) {
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));
      boolean esPrimo = true;

      for (int i = 2; i < 500; i++) {
        esPrimo = true;
        for (int j = 2; j < i; j++) {
          if ((i%j)==0) {
            esPrimo = false;
          }
        }
        if (esPrimo) {
          bw.write(i+" ");
          //System.out.print(i+" ");
        }
        bw.close();
      }
    } catch (IOException e) {
      System.out.println("No se puede escribir este fichero");
    }
  }
}
