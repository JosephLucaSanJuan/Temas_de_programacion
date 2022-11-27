/**
 * Tema07
 * 8º Escribe la temperatura media de cada mes y muestralo en un gráfico.
 * 
 * @author Joseph Luca san Juan Thomspson
 */
package java_capitulo_7.arrays_unidimensionales;

import java.util.Scanner;

public class Tema07Ej08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int tempMed[] = new int[12];
    String mes[] = {
      "enero", "febrero", "marzo", "abril", "mayo", "junio",
      "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
    };

    String azul = "\033[0;34m";
    String morado = "\033[0;35m";
    String verde = "\033[0;32m";
    String naranja = "\033[0;33m";

    for (int i = 0; i < 12; i++) {
      System.out.print("Introduce la temperatura media de "+mes[i]+": ");
      tempMed[i] = sc.nextInt();
    }

    for (int i = 0; i < 12; i++) {
      System.out.printf(azul+"%10s "+verde+"| ", mes[i]);
      for (int j = 0; j < tempMed[i]; j++) {
        System.out.print(morado+"▄");
      }
      System.out.printf(naranja+" %dºC\n", tempMed[i]);
    }
    sc.close();
  }
}
