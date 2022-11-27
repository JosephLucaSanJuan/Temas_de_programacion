/**
 * Tema07
 * 4º Escribe un array con números entre 0 y 100 con sus cuadrados y cubos.
 * 
 * @author Joseph Luca san Juan Thomspson
 */
package java_capitulo_7.arrays_unidimensionales;

public class Tema07Ej04 {
  public static void main(String[] args) {
    int numero[] = new int[20];
    int cuadrado[] = new int[20];
    int cubo[] = new int[20];

    System.out.println("|  n  |  n^2  |   n^3   |");
    System.out.println("-------------------------");
    for (int i = 0; i < 20; i++) {
      numero[i] = (int)(Math.random()*101);
      cuadrado[i] = numero[i]*numero[i];
      cubo[i] = cuadrado[i]*numero[i];
      System.out.printf("| %3d | %5d | %7d |\n",numero[i],cuadrado[i],cubo[i]);
    }
  }
}
