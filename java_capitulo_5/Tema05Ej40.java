/**
 * Tema 5
 * 40º Crea un rombo hecho de asteriscos.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej40 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Intreoduce la altura del rombo: ");
    int alt = sc.nextInt();
    int espIntern = 0;
    int fila = 0;
    
    if ((alt>=3) && (alt%2!=0)) {
      while (fila < alt/2+1) {
        for (int i = 1; i <= alt/2-fila; i++) {
          System.out.print(" ");
        }

        System.out.print("*");
        for (int i = 1; i < espIntern; i++) {
          System.out.print(" ");
        }
        if (fila>=1) {
          System.out.print("*");
        }

        System.out.println();
        espIntern+=2;
        fila++;
      }
      
      fila = alt/2;
      espIntern = alt-2;
      while (fila >= 1) {
        for (int i = 0; i <= alt/2-fila; i++) {
          System.out.print(" ");
        }
        
        System.out.print("*");
        for (int i = 1; i < espIntern-1; i++) {
          System.out.print(" ");
        }
        if (fila>1) {
          System.out.print("*");
        }
        System.out.println();

        fila--;
        espIntern-=2;
      }/**/
    } else {
      System.out.println("Lo siento esa altura no es válida.");
    }
    sc.close();
  }
}
