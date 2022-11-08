/**
 * Tema 5
 * 63º Dibuja una 2 pirámides, 1 al lado de la otra.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej63 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la altura de la primera pirámide: ");
    int alt1 = sc.nextInt();
    System.out.print("Introduce la altura de la segunda pirámide: ");
    int alt2 = sc.nextInt();
    int nivel = 0;
    
    if (alt1>alt2) {
      while (nivel<alt1) {
        for (int i = 0; i < alt1-1; i++) {
          System.out.print(" ");
        }
      }
    } else if (alt1<alt2) {
      
    } else if (alt1==alt2) {
      while (nivel<alt1) {
        for (int i = 0; i < alt1-(nivel+1); i++) {
          System.out.print(" ");
        }
  
        for (int i = 0; i < 2*nivel+1; i++) {
          System.out.print("*");
        }
        
        for (int i = 0; i < 2*alt1-2*nivel-1; i++) {
          System.out.print(" ");
        }
  
        for (int i = 0; i < 2*nivel+1; i++) {
          System.out.print("*");
        }
  
        System.out.println();
        nivel++;
      }
    }
  }
}
