/**
 * Tema 4
 * 3º Asocia l día de la semana con el número introducido.
 * 
 * @author Joseph Luca San Juan Thompson
 */
package java_capitulo_4;

import java.util.Scanner;

public class Tema04Ej03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Escribe un número ddel 1 al 7: ");
    int n = sc.nextInt();

    switch (n) {
      case 1:
        System.out.println("Lunes");
        break;
      case 2:
        System.out.println("Martes");
        break;
      case 3:
        System.out.println("Miércoles");
        break;
      case 4:
        System.out.println("Jueves");
        break;
      case 5:
        System.out.println("Viernes");
        break;
      case 6:
        System.out.println("Sábado");
        break;
      case 7:
        System.out.println("Domingo");
        break;
      default:
        System.out.println("Lo siento ese número no es válido");
        break;
    }
    sc.close();
  }
}