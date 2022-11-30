/**
 * Tema07
 * 13º Escribe un array con las estaturas
 * máximas, mínimas, y media de diferentes países.
 * 
 * @author Joseph Luca san Juan Thomspson
 */
package java_capitulo_7.arrays_bidimensionales;

public class Tema07Ex13 {
  public static void main(String[] args) {
    String pais[] = {"España", "Rusia", "Japón", "Australia"};
    int estatura[][] = new int[4][10];
    int estatMax = Integer.MIN_VALUE;
    int estatMin = Integer.MAX_VALUE;
    int cuentaEst = 0;
    int suma = 0;

    System.out.printf("%56s %s %s", "MED", "MIN", "MAX");
    for (int i = 0; i < 4; i++) {
      suma = 0;
      cuentaEst = 0;
      estatMax = Integer.MIN_VALUE;
      estatMin = Integer.MAX_VALUE;

      System.out.printf("\n%9s: ", pais[i]);
      for (int j = 0; j < 10; j++) {
        estatura[i][j] = (int)(Math.random()*71)+140;
        System.out.printf("%3d ", estatura[i][j]);
        suma += estatura[i][j];
        
        if (estatura[i][j] > estatMax) {
          estatMax = estatura[i][j];
        } else if (estatura[i][j] < estatMin) {
          estatMin = estatura[i][j];
        }
        cuentaEst++;
      }
      System.out.printf("| %d %d %d", suma/cuentaEst, estatMin, estatMax);
    }
  }
}
