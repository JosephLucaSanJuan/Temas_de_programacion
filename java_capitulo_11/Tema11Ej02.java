/**
 * Tema 11
 * 2º Muestra el contenido del fichero anterior.
 * 
 * @author Joseph Luca San Juan Thompson
 */
package java_capitulo_11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Tema11Ej02 {
  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new FileReader("primos.dat"));
      String linea = "";

      while (linea != null) {
        System.out.println(linea);
        linea = br.readLine();
      }

      br.close();
    } catch (FileNotFoundException nf) {
      System.out.println("No se ha podido encontrar el fichero primos.dat");
    } catch (Exception e) {
      System.out.println("No se ha podido leer el fichero primos.dat");
    }
  }
}
