/**
 * Tema 4
 * 11º Calcula laos segundos hasta media noche
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_4;

import java.util.Scanner;

public class Tema04Ej11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la hora: ");
    int h = sc.nextInt();
    System.out.print("Introduce los minutos: ");
    int min = sc.nextInt();

    int dia = 3600*24;
    int tiempoInt = h*3600 + min*60;

    if ((h>23) || (min>=60)) {
      System.out.println("Esa no es una hora válida");
    } else {
      System.out.println(h + " horas: " + h*3600);
      System.out.println(min + " minutos: " + min*60);
      System.out.println("Faltan " + (dia-tiempoInt) + " segundos hasta medianoche");
    }
  }
}
