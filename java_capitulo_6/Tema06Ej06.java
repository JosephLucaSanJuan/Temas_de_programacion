/**
 * Tema 6
 * 6º Adivina un número.
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_6;

import java.util.Scanner;

public class Tema06Ej06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Adivina un número entre 0 y 100. Tienes 5 intentos.");
    int n = (int)(Math.random()*101);
    int numInt = 0;
    int intentos = 5;

    while (intentos!=0) {
      System.out.print("Introduce un número: ");
      numInt = sc.nextInt();

      if (numInt==n) {
        System.out.println("Enhorabuena. Has adivinado el número.");
        intentos=1;
      } else if ((numInt<n) && (intentos!=1)) {
        System.out.println("Intenta un número más grande. Te quedan "+(intentos-1)+" intentos.");
      } else if ((numInt>n) && (intentos!=1)) {
        System.out.println("Intenta un número más pequeño. Te quedan "+(intentos-1)+" intentos");
      }

      if ((intentos==0) && (numInt!=n)) {
        System.out.println("Lo siento, se te han agotado los intentos");
        System.out.println("El número correcto era "+n);
      }
      intentos--;
    }
    sc.close();
  }
}
