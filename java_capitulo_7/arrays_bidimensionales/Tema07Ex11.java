/**
 * Tema07
 * 11º Escribe un array y luego escribe los números de la diagonal
 * desde la esquina izquierda superior a la derecha inferior.
 * 
 * @author Joseph Luca san Juan Thomspson
 */
package java_capitulo_7.arrays_bidimensionales;

public class Tema07Ex11 {
  public static void main(String[] args) {
    int array[][] = new int[10][10];
    int valorMax = Integer.MIN_VALUE;
    int valorMin = Integer.MAX_VALUE;
    int cuentaNum = 0;
    int suma = 0;

    System.out.println("Array:");
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        array[i][j] = (int)(Math.random()*101)+200;
        System.out.printf("%4d ",array[i][j]);
      }
      System.out.println();
    }
    System.out.println();

    System.out.println("Números de la diagonal izq(sup)-der(inf):");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%4d ",array[i][i]);
      suma += array[i][i];
      if (array[i][i]>valorMax) {
        valorMax = array[i][i];
      } else if (array[i][i]<valorMin) {
        valorMin = array[i][i];
      }
      cuentaNum++;
    }
    System.out.printf("\nValor máximo: %d", valorMax);
    System.out.printf("\nValor mínimo: %d", valorMin);
    System.out.printf("\nMedia: %d", suma/cuentaNum);
  }
}
