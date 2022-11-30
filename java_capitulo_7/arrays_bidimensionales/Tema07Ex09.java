/**
 * Tema07
 * 9º Escribe
 * 
 * @author Joseph Luca san Juan Thomspson
 */
package java_capitulo_7.arrays_bidimensionales;

public class Tema07Ex09 {
  public static void main(String[] args) {
    int array[][] = new int[12][12];

    System.out.println("Array original:");
    //System.out.println("---------------");
    for (int i = 0; i < 12; i++) {
      for (int j = 0; j < 12; j++) {
        array[i][j] = (int)(Math.random()*101);
        System.out.printf("%3d ",array[i][j]);
      }
      System.out.println();
    }

    int sq1, sq2, sq3, sq4;
    for (int capa = 0; capa < 6; capa++) {
      sq1 = array[capa][12-capa-1];
      sq2 = array[12-capa-1][12-capa-1];
      sq3 = array[12-capa-1][capa];
      sq4 = array[capa][capa];
      for (int j = 12-capa-1; j > capa+1; j++) {
        array[capa][j] = array[capa][j-1];
        array[j][12-capa-1] = array[j-1][12-capa-1];
        array[12-capa-1][12-j-1] = array[12-capa-1][j-1];
        array[12-j-1][capa] = array[12-j][capa];
      }
      array[capa+1][12-capa-1] = sq1;
      array[12-capa-1][12-capa-2] = sq2;
      array[12-capa-2][capa] = sq3;
      array[capa][capa+1] = sq4;
    }

    for (int i = 0; i < 12; i++) {
      for (int j = 0; j < 12; j++) {
        System.out.printf("%3d ",array[i][j]);
      }
    }
  }
}
