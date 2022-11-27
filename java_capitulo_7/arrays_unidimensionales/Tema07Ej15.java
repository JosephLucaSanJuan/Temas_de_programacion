/**
 * Tema07
 * 15º Escribe un array con mesas y cunántas personas hay en cada una.
 * 
 * @author Joseph Luca san Juan Thomspson
 */
package java_capitulo_7.arrays_unidimensionales;

import java.util.Scanner;

public class Tema07Ej15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ocupantes[] = new int[10];
    int personas = 0;

    for (int i = 0; i < 10; i++) {
      ocupantes[i] = (int)(Math.random()*5);
    }

    do {
      System.out.println("┌─────────┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┐");
      System.out.print("|Mesas nº |");
      for (int i = 1; i <= 10; i++) {
        System.out.printf("%2d |",i);
      }
      System.out.println("\n├─────────┼───┼───┼───┼───┼───┼───┼───┼───┼───┼───┤");
      System.out.print("|Ocupación|");
      for (int i = 0; i < 10; i++) {
        System.out.printf("%2d |",ocupantes[i]);
      }
      System.out.println("\n└─────────┴───┴───┴───┴───┴───┴───┴───┴───┴───┴───┘");

      System.out.print("\n¿Cuántos son? (Introduce -1 para salir): ");
      personas = sc.nextInt();

      if (personas>4) {
        System.out.println("Lo siento no admitimos grupos mayores de 4. Intenta de nuevo.");
      } else {
        int mesaLibre = 0;
        boolean mesaVacia = false;
        for (int i = 9; i >= 0; i--) {
          if (ocupantes[i] == 0) {
            mesaLibre=i;
            mesaVacia = true;
          }
        }

        if (mesaVacia) {
          ocupantes[mesaLibre] = personas;
          System.out.println("Por favor, sientense en la mesa múmero "+(mesaLibre+1)+"."); 
        } else {
          int espacioLibre = 0;
          boolean hayEspacio = false;
          for (int i = 9; i >= 0; i--) {
            if (personas <= (4-ocupantes[i])) {
              espacioLibre = i;
              hayEspacio = true;
            }
          }

          if (hayEspacio) {
            ocupantes[espacioLibre] += personas;
            System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa número "+(espacioLibre+1)+".");
          } else {
            System.out.println("Lo siento, ahora mismo no hay sitio.");
          }
        }
      }
    } while (personas!=-1);
    sc.close();
  }
}
