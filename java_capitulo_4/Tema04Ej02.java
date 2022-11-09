/**
 * Tema 4
 * 2º Pide una hora y muestra "buenos día/tardes/noches" según la hora
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_4;

import java.util.Scanner;

public class Tema04Ej02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce una hora: ");
    int hora = sc.nextInt();

    if ((hora >= 6) && (hora <= 12)) {
      System.out.println("Buenos días.");
    } else if ((hora >= 13) && (hora <=20)) {
      System.out.println("Buenas tardes.");
    } else if ((hora >= 21) && (hora <=23)) {
      System.out.println("Buenas noches.");
    } else if ((hora >= 0) && (hora <= 5)) {
      System.out.println("Buenas noches.");
    } else {
      System.out.println("Pupi");
    }
    sc.close();
  }
}
