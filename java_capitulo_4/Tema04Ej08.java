/**
 * Tema 4
 * 8º Calcula la media de 3 notas y da la nota final
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_4;

import java.util.Scanner;

public class Tema04Ej08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la primera nota: ");
    int nota1 = sc.nextInt();
    System.out.print("Introduce la segunda nota: ");
    int nota2 = sc.nextInt();
    System.out.print("Introduce la tercera nota: ");
    int nota3 = sc.nextInt();

    int media = (nota1+nota2+nota3)/3;
    System.out.println("La media es " + media);

    if ((media >= 9) && (media <= 10)) {
      System.out.println("Nota:   sobresaliente");
    } else if ((media >= 7) && (media < 9)) {
      System.out.println("Nota:   notable");
    } else if ((media >= 5) && (media < 7)) {
      System.out.println("Nota:   bien");
    } else if ((media >= 0) && (media < 5)) {
      System.out.println("Nota:   suspenso");
    } else {
      System.out.println("Esa nota no es válida");
    }
  }
}
