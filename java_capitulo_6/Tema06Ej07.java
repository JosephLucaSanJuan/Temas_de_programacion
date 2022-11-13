/**
 * Tema 6
 * 7º.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_6;

public class Tema06Ej07 {
  public static void main(String[] args) {
    System.out.println("Muestra 3 apuestas en 3 columnas de 14 partidos y el pleno al final.");
    int n = 0;

    for (int i = 1; i <= 14; i++) {
      System.out.print(i+". ");
      for (int j = 1; j <= 3; j++) {
        n = (int)(Math.random()*3);
        if (n==0) {
          System.out.print("| X |");
        } else {
          System.out.print("| "+n+" |");  
        }
      }
      System.out.println();
    }
    n = (int)(Math.random());
    
    System.out.println("PLENO AL 15 - Local..."+n+" Visitante..."+n);
    if (n<2) {
      System.out.println("M");
    }
  }
}
