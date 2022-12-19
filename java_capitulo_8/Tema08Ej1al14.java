/**
 * Tema08
 * Ej 1º-14º
 */
package java_capitulo_8;

import java_capitulo_8.matematicas.Varias;

import java.util.Scanner;

public class Tema08Ej1al14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número: ");
    long n = sc.nextInt();

    /* 1º Volteame este número */
    System.out.print(Varias.voltea(n));
    if (Varias.esCapicua(n)) {
      System.out.println(n+" es capicúa.");
    } else {
      System.out.println(n+" no es capicúa.");
    }

    /* 2º Di si un número es primo o no 
    if (Varias.esPrimo(n)) {
      System.out.println(n+" es primo");
    } else {
      System.out.println(n+" no es primo.");
    }*/

    /* 3º Muestra el siguiente número primo */
    for (long i = Integer.MAX_VALUE; i < Integer.MIN_VALUE*100; i++) {
      i = Varias.siguientePrimo(i);
      System.out.println(i);
    }

    /* 4º Devuelve la potencia de los exponentes */
    System.out.println(Varias.potencia(16, 6));
    System.out.println(Varias.potencia(36, 4));

    /* 5º ¿Cuántos dígitos tiene un número? */
    System.out.println("El "+n+" tiene "+Varias.digitos(n)+" dígitos");

    /* 7º Devuelve el dígito en la posición n */
    System.out.print("\nIntroduce un posición: ");
    int pos = sc.nextInt();
    System.out.println(Varias.digitoN(n, pos));

    /* 8º */
    System.out.println(Varias.posicionDeDigito(n, pos));

    /* 10º */
    System.out.println(Varias.quitaPorDelante(n, pos));
    System.out.println(Varias.pegaPorDetras(n, pos));
    System.out.println(Varias.pegaPorDelante(n, pos));

    System.out.println(Varias.trozoDeNumero(n, 0, pos));

    System.out.print("\nIntroduce un número: ");
    int n1 = sc.nextInt();
    System.out.print("Introdcue otro: ");
    int n2 = sc.nextInt();

    System.out.println(Varias.juntaNumeros(n1, n2));
  }
}
