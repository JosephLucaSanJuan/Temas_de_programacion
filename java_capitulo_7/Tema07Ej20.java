/**
 * Tema07
 * 20º Escribe un array con números entre 0 y 100 con sus cuadrados y cubos.
 * 
 * @author Joseph Luca san Juan Thomspson
 */
package java_capitulo_7;

import java.util.Scanner;

public class Tema07Ej20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("¿Cuántos reyes va a introducir?: ");
    int cantidad = sc.nextInt();
    String reyes[] = new String[cantidad];
    int cuentaReyes=1;
    
    System.out.println("Vaya introduciendo los nombres de los reyes.");
    for (int i = 0; i < cantidad; i++) {
      reyes[i] = sc.nextLine();
    }

    System.out.println("\nLos reyes introducidos son:");
    for (int i = 0; i < cantidad; i++) {
      for (int j = 0; j < i; j++) {
        if (reyes[i].equals(reyes[j])) {
          cuentaReyes++;
        }
      }
      System.out.println(reyes[i]+" "+cuentaReyes+"º");
    }
    sc.close();
  }
}
