/**
 * Tema07
 * 12º Escribe un array y luego escribe los números de la diagonal
 * desde la esquina izquierda inferior a la derecha superior.
 * 
 * @author Joseph Luca san Juan Thomspson
 */
package java_capitulo_7.arrays_bidimensionales;

public class Tema07EX12 {
  public static void main(String[] args) {
    int array[][] = new int[10][10];
    int valorMax = Integer.MIN_VALUE;
    int valorMin = Integer.MAX_VALUE;
    int cuentaNum = 0;
    int suma = 0;

    System.out.println("Array:");
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        array[i][j] = (int)(Math.random()*401)+500;
        System.out.printf("%4d ",array[i][j]);
      }
      System.out.println();
    }
    System.out.println();

    System.out.println("Números de la diagonal izq(inf)-der(sup):");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%4d ",array[10-i-1][i]);
      suma += array[10-i-1][i];
      if (array[10-i-1][i]>valorMax) {
        valorMax = array[10-i-1][i];
      } else if (array[10-i-1][i]<valorMin) {
        valorMin = array[10-i-1][i];
      }
      cuentaNum++;
    }
    System.out.printf("\nValor máximo: %d", valorMax);
    System.out.printf("\nValor mínimo: %d", valorMin);
    System.out.printf("\nMedia: %d", suma/cuentaNum);
  }
}
