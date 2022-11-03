/**
 * Tema 5
 * 7º Averigua el cófigo de una caja fuerte.
 * 
 * @author Joseph Luca San Juan Thompson
 * 
 * Ejercicios de bucles: todos.
 */

package java_capitulo_5;

import java.util.Scanner;

public class Tema05Ej07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = 1;
    int b = 2;
    int c = 3;
    int d = 4;
    int _a = 0;
    int _b = 0;
    int _c = 0;
    int _d = 0;
    int intentos = 1;
    boolean salir = false;
    while (intentos<=4 && !salir) {

      //leer combinacion
      System.out.print("Introduce un número de hasta 4 cifras: ");
      int valor = sc.nextInt();

      if (valor < 10000) {
        _a = 0;
        _b = 0;
        _c = 0;
        _d = 0;
        if (valor < 10) {
          _d = valor%10;
        } else if (valor < 100) {
          _c = valor / 10;
          _d = valor % 10;
        } else if (valor < 1000) {
          _b = valor / 100;
          _c = (valor % 10) / 10;
          _d = valor % 10;
        } else {
          _a = valor / 1000;
          _b = (valor / 100) % 10;
          _c = (valor / 10) % 10;
          _d = valor % 10;
        }

        if (a==_a && b==_b && c==_c && d==_d) {
          System.out.println("La caja fuerte se ha abierto");
          salir = true;
        }
      } else {
        System.out.println("El número tiene que ser de 4 cifras.");
      }
      //comprobamos combinación

      if (!salir) {
        System.out.println("Lo siento eso no es la combinación.");
      }
    }
    sc.close();
  }
}