/**
 * Tema 6
 * 4º Muestra 20 números entre 0 y 10.
 * 
 * 5º Muestra 50 números entre 100 y 199
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_6;

public class Tema06Ej04y05 {
  public static void main(String[] args) {
    System.out.println("Ejercicio 4\nMuestra 20 números aleatorios entre 0 y 10.");
    
    for (int i = 1; i <= 20; i++) {
      System.out.print((int)(Math.random()*11)+" ");
    }

    System.out.println("\nEjercicio 5\nAhora muestra 50 números entre 100 y 199.");
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int n = 0;

    for (int i = 1; i <= 50; i++) {
      n = (int)(Math.random()*100)+100;
      System.out.print(n+" ");
      if (n>max) {
        max = n;
      } else if (n<min) {
        min = n;
      }
    }
    System.out.println("\nMáximo: "+max);
    System.out.println("Mínimo: "+min);
  }
}
