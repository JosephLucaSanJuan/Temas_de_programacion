/**
 * Tema 4
 * 9º Resuelve ax2 + bx + c = 0
 * 
 * @author Joseph Luca San Juan Thompson
 */

package java_capitulo_4;

import java.util.Scanner;

public class Tema04Ej09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce el valor a: ");
    int a = sc.nextInt();
    System.out.print("Introduce el valor b: ");
    int b = sc.nextInt();
    System.out.print("Introduce el valor c: ");
    int c = sc.nextInt();

    int raiz = b*b-4*a*c;
    String ecuacion = a + "x^2 + " + b + "x + " + c + " = 0";
    
    if (raiz>=0) {
      System.out.printf("Las soluciones de la ecuación %s son:\n", ecuacion);
      System.out.println("x = " + ((double)((-b)+Math.sqrt(raiz)/2*a)));
      System.out.println("x = " + ((double)((-b)-Math.sqrt(raiz)/2*a)));
    } else {
      System.out.println("Esta ecuación no tiene solución.");
    }
  }
}
