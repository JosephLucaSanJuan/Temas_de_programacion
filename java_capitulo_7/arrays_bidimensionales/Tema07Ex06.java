/**
 * Tema07
 * 3º Escribe un array bidimensional (sin repetir valores)
 * y averigua sus valores máximos y mínimos.
 * 
 * @author Joseph Luca san Juan Thomspson
 */
package java_capitulo_7.arrays_bidimensionales;

public class Tema07Ex06 {
  public static void main(String[] args) {
    int array[][] = new int[6][10];
    int maxValor = Integer.MIN_VALUE;
    int minValor = Integer.MAX_VALUE;
    int filMax = 0;
    int colMax = 0;
    int filMin = 0;
    int colMin = 0;

    System.out.println("         ┌───────┬───────┬───────┬───────┬───────┬───────┬───────┬───────┬───────┬───────┐");
    System.out.print("         |");
    for (int i = 0; i < 10; i++) {
      System.out.printf(" Col %d |",i);
    }
    System.out.println("\n┌────────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┤");
    for (int i = 0; i < 6; i++) {
      System.out.printf("| Fila %d |",i);
      for (int j = 0; j < 10; j++) {
        array[i][j] = (int)(Math.random()*1001);
        System.out.printf("%5d  |",array[i][j]);

        if (array[i][j]>maxValor) {
          maxValor = array[i][j];
          filMax = i;
          colMax = j;
        } else if (array[i][j]<minValor) {
          minValor = array[i][j];
          filMin = i;
          colMin = j;
        }

        int pos = 0;
        boolean repetido = false;
        int valor = 0;
        do {
          repetido = false;
          valor = (int)(Math.random()*(maxValor-minValor+1)+minValor);
          for (int k = 0; k < pos; k++) {
            if (array[k/10][k%10]==valor) {
              repetido = true;
              break;
            }
          }
        } while (repetido);
      }
      System.out.println("\n├────────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┤");
    }

    System.out.printf("\nEl valor máximo es %d, fila %d, columna %d", maxValor, filMax, colMax);
    System.out.printf("\nEl valor mínimo es %d, fila %d, columna %d", minValor, filMin, colMin);
  }
}
