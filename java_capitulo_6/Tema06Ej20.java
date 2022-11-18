/**
 * Tema06
 * 20º Dibuja una cuba y el agua que contiene.
 * 
 * @author Joseph Luca san Juan Thomspson
 */
package java_capitulo_6;

import java.util.Scanner;

public class Tema06Ej20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Indica la capacidad de la cuba en litros: ");
    int capacidad = sc.nextInt();
    int cantidad = 0;
    int nivel = 0;

    for (int i = 0; i<capacidad; i++) {
      cantidad = (int)(Math.random()*capacidad)+1;
      if (i<(capacidad-cantidad)) {
        System.out.println("*====*");
      } else {
        System.out.println("*    *");
      }
    }
    System.out.println("******");
    System.out.println(nivel);
    System.out.printf("La cuba tiene una capacidad de %d litros y contiene %d litros de agua.",capacidad,cantidad);
    sc.close();
  }
}
